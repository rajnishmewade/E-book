<%-- 
    Document   : sell_book
    Created on : 17 Oct, 2023, 2:29:06 AM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sell Books</title>
        <%@include file="all_component/allCss.jsp" %>
    </head>
    <body style="background-color:#d9d9d9">
        <c:if test="${empty userobj}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        <%@include file="all_component/navbar.jsp" %>
        <div class="container mt-2">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="text-center text-primary p-1">Sell Old Book</h5>
                            
                            <c:if test="${not empty succMsg}">
                                <p class="text-center text-success">${succMsg}</p> 
                                <c:remove var="succMsg" scope="session"/>
                            </c:if>
                                
                            <c:if test="${not empty failedMsg}">
                                <p class="text-center text-danger">${failedMsg}</p> 
                                <c:remove var="failedMsg" scope="session"/>
                            </c:if>
                                
                                <form action="AddOldBook" method="Post" enctype="multipart/form-data">
                                    
                                    <input type="hidden" value="${userobj.email}" name="user">
                                    
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
                                        <label for="book_photo">Upload Photo:</label>
                                        <input type="file" name="img" class="form-control-file" id="book_photo">
                                    </div>
                                    <button type="submit" class="btn btn-primary">Sell</button>
                                </form>                       
                        </div>
                    </div>
                </div>
            </div>    
        </div>
    </body>
</html>
