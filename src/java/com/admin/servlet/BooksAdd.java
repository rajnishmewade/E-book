/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.servlet;

import com.DAO.BookDAOImpl;
import com.DB.DBConnect;
import com.entity.BookDetails;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


/**
 *
 * @author ASUS
 */
@MultipartConfig
@WebServlet(name = "BooksAdd", urlPatterns = {"/BooksAdd"})
public class BooksAdd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("./admin/add_books.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String bookId=req.getParameter("id");
            String bookName=req.getParameter("name");
            String author=req.getParameter("author");
            String price=req.getParameter("price");
            String categories=req.getParameter("categories");
            String status=req.getParameter("status");
            Part part = req.getPart("img");
            String fileName=part.getSubmittedFileName();
            
            BookDetails b=new BookDetails(bookName,author,price,categories,status,fileName,"admin");
            //System.out.println(bookId+" "+bookName+" "+author+" "+price+" "+categories+" "+status+" "+part);
            
            BookDAOImpl dao=new BookDAOImpl(DBConnect.getConnection());
            
            //String path=getServletContext().getRealPath("")+"book";
            
            //System.out.println(path);
            
            //File file=new File(path);
            
            //part.write(path+File.separator + fileName);        
            boolean f=dao.addBooks(b);
            
            HttpSession session=req.getSession();
            if(f)
            {
                String path=getServletContext().getRealPath("")+"book";
                System.out.println(path);
                    
                File file=new File(path);
                
                part.write(path+File.separator + fileName);
                
                session.setAttribute("succMsg","Book And Successfully");
                resp.sendRedirect("admin/add_books.jsp");
            }
            else{
                session.setAttribute("failedMsg","Something Wrong On Server");
                resp.sendRedirect("admin/add_books.jsp");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}