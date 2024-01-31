/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.servlet;

import com.DAO.CartDAOImpl;
import com.DB.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "RemoveBookCart", urlPatterns = {"/RemoveBookCart"})
public class RemoveBookCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int bid=Integer.parseInt(req.getParameter("bid"));
        int uid=Integer.parseInt(req.getParameter("uid"));
        int cid=Integer.parseInt(req.getParameter("cid"));
        CartDAOImpl dao=new CartDAOImpl(DBConnect.getConnection());
        boolean f=dao.deleteBook(bid,uid,cid);
        
        HttpSession session=req.getSession();
        if(f)
        {
            session.setAttribute("succMsg", "Book Removed from Cart");
            resp.sendRedirect("cart.jsp");
        }
        else{
            session.setAttribute("failedMsg", "Something went wrong on server");
            resp.sendRedirect("cart.jsp"); 
        }
    }

    
}
