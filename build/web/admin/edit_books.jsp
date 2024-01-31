<%-- 
    Document   : add_books
    Created on : 12 Oct, 2023, 12:54:19 PM
    Author     : ASUS
--%>

<%@page import="com.entity.BookDetails"%>
<%@page import="com.DAO.BookDAOImpl"%>
<%@page import="com.DB.DBConnect"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin:Edit Books</title>
        <%@include file="allCss.jsp" %>
    </head>
    <body style="background-color: #f0f1f2">
        <%@include file="navbar.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-4 offset-md-4 mt-1">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">Edit Books</h4>
                            
                            <c:if test="${not empty succMsg}">
                                <p class="text-center text-success">${succMsg}</p> 
                                <c:remove var="succMsg" scope="session"/>
                            </c:if>
                                
                            <c:if test="${not empty failedMsg}">
                                <p class="text-center text-danger">${failedMsg}</p> 
                                <c:remove var="failedMsg" scope="session"/>
                            </c:if>    

                                
                                <%
                                   // int id=Integer.parseInt(request.getParameter("id"));
                                   int id = Integer.parseInt(request.getParameter("id"));
                                    BookDAOImpl dao=new BookDAOImpl(DBConnect.getConnection());
                                    BookDetails b=dao.getBookById(id);
                                %>
                            
                                <form action="../EditBooksServlet" method="Post">
                                
                                <input type="hidden" name="id" value="<%=b.getBookId() %>">
                                <div class="form-group">
                                  <label for="book_name">Book Name:</label>
                                  <input type="text" class="form-control" name="name" id="book_name" required="required" placeholder="Enter book name" value="<%=b.getBookName() %>">
                                </div>
                                <div class="form-group">
                                  <label for="author_name">Author Name:</label>
                                  <input type="text" class="form-control" name="author" id="author_name" required="required" placeholder="Enter author name" value="<%=b.getAuthor() %>">
                                </div>
                                <div class="form-group">
                                  <label for="price">Price:</label>
                                  <input type="text" class="form-control" name="price" id="price"  required="required" placeholder="Enter price" value="<%=b.getPrice() %>">
                                </div>
                                
                                <div class="form-group">
                                    <label for="book_status">Book Status:</label>
                                    <select class="form-control" required="required" name="status" id="book_status">
                                        <% 
                                        if("Acitve".equals(b.getStatus()))
                                        {
                                        %> 
                                        <option value="Active">Active</option>                                        
                                        <option value="Inactive">Inactive</option>
                                        <%
                                        }
                                        else{
                                        %>
                                        <option value="Active">Active</option>                                        
                                        <option value="Inactive">Inactive</option>                                       
                                        <%
                                        }
                                        %>  
                                    </select>
                                </div>
                                
                                    <button type="submit" class="btn btn-primary">Update</button>
                            </form> 
                        </div>
                    </div> 
                </div>
            </div>
        </div>
        <div style="margin-top: 50px">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>

