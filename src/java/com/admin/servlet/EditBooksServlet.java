/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.servlet;

import com.DAO.BookDAOImpl;
import com.DB.DBConnect;
import com.entity.BookDetails;
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
@WebServlet(name = "EditBooksServlet", urlPatterns = {"/EditBooksServlet"})
public class EditBooksServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        resp.sendRedirect("./admin/all_books.jsp");    
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try{
            int id=Integer.parseInt(req.getParameter("id"));
            String bookName=req.getParameter("name");
            String author=req.getParameter("author");
            String price=req.getParameter("price");
            String status=req.getParameter("status");
            
            BookDetails b=new BookDetails();
            b.setBookId(id);
            b.setBookName(bookName);
            b.setAuthor(author);
            b.setPrice(price);
            b.setStatus(status);
            
            BookDAOImpl dao=new BookDAOImpl(DBConnect.getConnection());
            boolean f=dao.updateEditBooks(b);
            HttpSession session = req.getSession();
       if (f) {
//           session.setAttribute("succMsg","Book update");
          session.setAttribute("succMsg", "Book Update Successfully...");
         resp.sendRedirect("admin/all_books.jsp");
         } else {
//           session.setAttribute("failedMsg","fail");
         session.setAttribute("failedMsg", "Something  wrong on server...");
         resp.sendRedirect("admin/edit_books.jsp");
}

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
}
