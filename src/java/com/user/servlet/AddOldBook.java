/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.servlet;

import com.DAO.BookDAOImpl;
import com.DB.DBConnect;
import com.entity.BookDetails;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AddOldBook", urlPatterns = {"/AddOldBook"})
@MultipartConfig
public class AddOldBook extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String bookId=req.getParameter("id");
            String bookName=req.getParameter("name");
            String author=req.getParameter("author");
            String price=req.getParameter("price");
            String categories="Old";
            String status="Active";
            Part part = req.getPart("img");
            String fileName=part.getSubmittedFileName();
            
            String useremail=req.getParameter("user");
            
            BookDetails b=new BookDetails(bookName,author,price,categories,status,fileName,useremail);
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
                resp.sendRedirect("sell_book.jsp");
            }
            else{
                session.setAttribute("failedMsg","Something Wrong On Server");
                resp.sendRedirect("sell_book.jsp");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}