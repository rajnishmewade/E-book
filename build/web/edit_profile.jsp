<%-- 
    Document   : edit_profile
    Created on : 17 Oct, 2023, 2:43:13 AM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
        <%@include file="all_component/allCss.jsp" %>
    </head>
    <body  style="background-color:#d9d9d9">
        <%@include file="all_component/navbar.jsp" %>
        <div class="container mt-2">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center text-primary">Edit Profile</h4>
                            
                            <c:if test="${not empty failMsg}">
                                <h5 class="text-center text-danger">${failMsg}</h5>
                                <c:remove var="failMsg" scope="session"/>
                            </c:if>
                            
                            <c:if test="${not empty succMsg}">
                                <h5 class="text-center text-success">${succMsg}</h5>
                                <c:remove var="succMsg" scope="session"/>
                            </c:if>                           
                            <form action="UpdateProfileServlet" method="post">
                                <input type="hidden" value="${userobj.id}" name="id" />
                                <div class="form-group">
                                    <label for="exampleFormControlInput1">Enter Full Name</label>
                                    <input type="text" class="form-control" required="required" name="name" value="${userobj.name}">
                                </div>
                                <div class="form-group">
                                    <label for="exampleFormControlInput1">Email address</label>
                                    <input type="email" class="form-control" required="required" name="email" value="${userobj.email}">
                                </div>
                                <div class="form-group">
                                    <label for="exampleFormControlInput1">Phone No</label>
                                    <input type="number" class="form-control" required="required" name="phono" value="${userobj.phono}">
                                </div>
                                <div class="form-group">
                                    <label for="exampleFormControlInput1">Password</label>
                                    <input type="password" class="form-control" required="required" name="password">
                                </div>
                                
                                <button type="submit" class="btn btn-primary">Update</button>
                            </form>                             
                        </div>
                    </div>
                </div>
            </div>
        </div>    
    </body>
</html>
