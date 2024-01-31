<%-- 
    Document   : home
    Created on : 11 Oct, 2023, 11:28:03 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin:Home</title>
        <%@include file="allCss.jsp" %>
        <style type="text/css">
            a{
                text-decoration: none;
                color: black;
            }
            
            a:hover{
                text-decoration: none;
                color: black;
            }
        </style>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <c:if test="${empty userobj}">
            <c:redirect url="../login.jsp"/>
        </c:if>
        <div class="container">
            <div class="row p-5">
                <div class="col-md-3">
                    <a href="add_books.jsp">
                        <div class="card">
                        <div class="card-body text-center">
                            <i class="fa-solid fa-square-plus fa-3x text-primary"></i><br>
                            <h4>Add Books</h4>
                                ----------
                        </div>
                    </div>
                    </a>
                </div>
                
                <div class="col-md-3">
                    <a href="all_books.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fa-solid fa-book-open fa-3x text-danger"></i><br>
                                <h4>All Books</h4>
                                    ----------
                            </div>
                        </div>
                    </a>
                </div>
                
                <div class="col-md-3">
                    <a href="orders.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fa-solid fa-cart-shopping fa-3x text-warning"></i></i><br>
                                <h4>Orders</h4>
                                    ----------
                            </div>
                        </div>
                    <a/>    
                </div>
                
                <div class="col-md-3">
                    <a href="data-toggle="modal" data-target="#exampleModalLong"">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fa-solid fa-right-from-bracket fa-3x text-primary"></i><br>
                                <h4>Logout</h4>
                                    ----------
                            </div>
                        </div>
                    </a>    
                </div>
            </div>
        </div>
        <div style="margin-top: 150px">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
