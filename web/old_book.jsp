<%-- 
    Document   : old_book
    Created on : 17 Oct, 2023, 12:04:34 PM
    Author     : ASUS
--%>

<%@page import="java.util.List"%>
<%@page import="com.entity.BookDetails"%>
<%@page import="com.entity.User"%>
<%@page import="com.DAO.BookDAOImpl"%>
<%@page import="com.DB.DBConnect"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User:Old Book</title>
        <%@include file="all_component/allCss.jsp"%>
    </head>
    <body style="background-color:#d9d9d9">
        <%@include file="all_component/navbar.jsp" %>

        <c:if test="${not empty succMsg}">
            <p class="text-center text-success">${succMsg }</p>
            <c:remove var="succMsg" scope="session"/>                           
        </c:if>
                
        <div class="container p-5">
            <table class="table table-striped">
                <thead class="bg-primary text-white">
                  <tr>
                    <th scope="col">Book Name</th>
                    <th scope="col">Author</th>
                    <th scope="col">Price</th>
                    <th scope="col">Category</th>
                    <th scope="col">Action</th>
                  </tr>
                </thead>
                <tbody>
                   
                  <%
                     User u=(User)session.getAttribute("userobj");
                     String email=u.getEmail();                  
                     BookDAOImpl dao=new BookDAOImpl(DBConnect.getConnection());
                     List<BookDetails> list=dao.getBookByOld(email, "old" );
                     for(BookDetails b:list)
                     {
                      %>
                      <tr>
                        <td><%=b.getBookName() %></td>
                        <td><%=b.getAuthor() %></td>
                        <td><%=b.getPrice() %></td>
                        <td><%=b.getBookCategory()%></td>
                        <td><a href="DeleteOldBookServlet?email=<%=email%>&id=<%=b.getBookId()%>" class="btn btn-sm btn-danger">Delete</a>
</td>
                      </tr>
                      <%
                     }
                  %>
                  
                </tbody>
          </table>
        </div>
    </body>
</html>
