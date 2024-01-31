/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.servlet;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.entity.User;
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
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String name=req.getParameter("name");
            String email=req.getParameter("email");
            String phono=req.getParameter("phono");
            String password=req.getParameter("password");
            String check=req.getParameter("check");
            
            //System.out.println(name+" "+email+" "+phono+" "+password+" "+check);
            
            User us= new User();
            us.setName(name);
            us.setEmail(email);
            us.setPhono(phono);
            us.setPassword(password);
            
            HttpSession session=req.getSession();
            if(check!=null)
            {
                UserDAOImpl dao=new UserDAOImpl(DBConnect.getConnection());
                boolean f=dao.userRegister(us);

                if(f)
                {
//                    System.out.println("User Register Success...");
                    session.setAttribute("succMsg", "Registration Successfully...");
                    resp.sendRedirect("register.jsp");
                }
                else
                {
//                    System.out.println("Something wrong on server...");
                    session.setAttribute("failedMsg", "Something wrong on server...");
                    resp.sendRedirect("register.jsp");                
            }
            }    
            else
            {
//                System.out.println("Please Check Agree & Terms Condition ");
                session.setAttribute("failedMsg", "Please Check Agree & Terms Condition...");
                resp.sendRedirect("register.jsp");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
}
