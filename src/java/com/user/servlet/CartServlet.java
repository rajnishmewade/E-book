/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.servlet;

import com.DAO.BookDAOImpl;
import com.DAO.CartDAOImpl;
import com.DB.DBConnect;
import com.entity.BookDetails;
import com.entity.Cart;
import java.io.IOException;
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
@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
public class CartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            int bid =Integer.parseInt(req.getParameter("bid"));
            int uid=Integer.parseInt(req.getParameter("uid"));
            
            BookDAOImpl dao=new BookDAOImpl(DBConnect.getConnection());
            BookDetails b=dao.getBookById(bid);
            
            Cart c=new Cart();
            c.setBid(bid);
          //c.setUserId(cid);
            c.setUserId(uid);
            c.setBookName(b.getBookName());
            c.setAuthor(b.getAuthor());
            c.setPrice(Double.parseDouble(b.getPrice()));
            c.setTotalPrice(Double.parseDouble(b.getPrice()));
            
            CartDAOImpl dao2= new CartDAOImpl(DBConnect.getConnection());
            boolean f=dao2.addCart(c);
            
            HttpSession session =req.getSession();
            if(f)
            {   
                session.setAttribute("addCart", "Book Added to Cart");
                resp.sendRedirect("all_new_book.jsp");
                //System.out.println("Added To Cart Successfully...");
            }
            else{
                session.setAttribute("failed", "Something Wrong on Server");
                resp.sendRedirect("all_new_book.jsp");
                //System.out.println("Not Added To Cart...");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
