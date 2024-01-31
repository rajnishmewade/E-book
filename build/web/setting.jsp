<%-- 
    Document   : setting
    Created on : 17 Oct, 2023, 2:01:44 AM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="all_component/allCss.jsp"%>
        <style type="text/css">
            a{
                text-decoration: none;
                color: black;
            }
            a:hover{
                text-decoration: none;
            }
        </style>
    </head>
    <body style="background-color:#d9d9d9">
        
        <c:if test="${empty userobj}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        
        <%@include file="all_component/navbar.jsp" %>
        <div class="container">
            <h3 class="text-center">Hello ,${userobj.name}</h3> 
            <div class="row p-5">
                <div class="col-md-4">
                    <a href="sell_book.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-primary ">
                                    <i class="fa-solid fa-book-open fa-3x"></i>
                                </div>
                                <h4>Sell Old Books</h4>
                            </div>
                        </div>
                    </a>
                </div>
                
                <div class="col-md-4">
                    <a href="old_book.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-primary ">
                                    <i class="fa-solid fa-book-open fa-3x"></i>
                                </div>
                                <h4> Old Books</h4>
                            </div>
                        </div>
                    </a>
                </div>
                
                <div class="col-md-4">
                    <a href="edit_profile.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-primary ">
                                    <i class="fa-regular fa-pen-to-square fa-3x"></i>
                                </div>
                                <h4>Login and Security(Edit Profile)</h4>
                            </div>
                        </div>
                    </a>
                </div>
                
                <div class="col-md-4 mt-3">
                    <a href="user_address.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-warning ">
                                    <i class="fa-solid fa-location-dot fa-3x"></i>
                                </div>
                                <h4>Your Address</h4>
                                <p>Edit Address</p>
                            </div>
                        </div>
                    </a>
                </div>
                
                <div class="col-md-4 mt-3">
                    <a href="order.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-warning ">
                                    <i class="fa-solid fa-gift fa-3x"></i>
                                </div>
                                <h4>My Orders</h4>
                                <p>Track Your Order</p>
                            </div>
                        </div>
                    </a>
                </div>
                
                <div class="col-md-4 mt-3">
                    <a href="helpline.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <div class="text-warning ">
                                    <i class="fa-solid fa-user fa-3x"></i>
                                </div>
                                <h4>Help Center</h4>
                                <p>24*7 Service</p>
                            </div>
                        </div>
                    </a>
                </div>
                
            </div>
        </div>
    </body>
    <%@include file="all_component/footer.jsp" %>
</html>
