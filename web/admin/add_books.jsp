<%-- 
    Document   : add_books
    Created on : 12 Oct, 2023, 12:54:19 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin:Add Books</title>
        <%@include file="allCss.jsp" %>
    </head>
    <body style="background-color: #f0f1f2">
        <%@include file="navbar.jsp" %>
        <c:if test="${empty userobj}">
            <c:redirect url="../login.jsp"/>
        </c:if>
        <div class="container">
            <div class="row">
                <div class="col-md-4 offset-md-4 mt-1">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">Add Books</h4>
                            
                            <c:if test="${not empty succMsg}">
                                <p class="text-center text-success">${succMsg}</p> 
                                <c:remove var="succMsg" scope="session"/>
                            </c:if>
                                
                            <c:if test="${not empty failedMsg}">
                                <p class="text-center text-danger">${failedMsg}</p> 
                                <c:remove var="failedMsg" scope="session"/>
                            </c:if>    
                            
                                <form action="../BooksAdd" method="Post" enctype="multipart/form-data">
                                
                                <div class="form-group">
                                  <label for="book_name">Book Name:</label>
                                  <input type="text" class="form-control" name="name" id="book_name" placeholder="Enter book name">
                                </div>
                                <div class="form-group">
                                  <label for="author_name">Author Name:</label>
                                  <input type="text" class="form-control" name="author" id="author_name" placeholder="Enter author name">
                                </div>
                                <div class="form-group">
                                  <label for="price">Price:</label>
                                  <input type="text" class="form-control" name="price" id="price" placeholder="Enter price">
                                </div>
                                <div class="form-group">
                                    <label for="book_categories">Book Categories:</label>
                                    <select class="form-control" name="categories" id="book_categories">
                                        <option selected>--select--</option>
                                        <option value="New">New Book</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="book_status">Book Status:</label>
                                    <select class="form-control" name="status" id="book_status">
                                        <option selected>--select--</option>                                       
                                        <option value="Active">Active</option>
                                        <option value="Inactive">Inactive</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="book_photo">Upload Photo:</label>
                                    <input type="file" name="img" class="form-control-file" id="book_photo">
                                </div>
                                <button type="submit" class="btn btn-primary">Add</button>
                            </form> 
                        </div>
                    </div> 
                </div>
            </div>
        </div>
        <div style="margin-top: 40px">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
