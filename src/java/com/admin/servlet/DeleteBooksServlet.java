/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.servlet;

import com.DAO.BookDAOImpl;
import com.DB.DBConnect;
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
@WebServlet(name = "DeleteBooksServlet", urlPatterns = {"/DeleteBooksServlet"})
public class DeleteBooksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            int id=Integer.parseInt(req.getParameter("id"));
            BookDAOImpl dao=new BookDAOImpl(DBConnect.getConnection());
            boolean f=dao.deleteBooks(id);
            HttpSession session =req.getSession();
            if(f)
            {
                session.setAttribute("succMsg", "Book Delete Successfully...");
                resp.sendRedirect("admin/all_books.jsp");
            }
            else
            {
                session.setAttribute("failedMsg", "Something went wrong on server...");
                resp.sendRedirect("admin/all_books.jsp");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
}
