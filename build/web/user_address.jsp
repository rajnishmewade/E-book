<%-- 
    Document   : user_address
    Created on : 17 Oct, 2023, 2:50:05 AM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Address</title>
        <%@include file="all_component/allCss.jsp" %>
    </head>
    <body style="background-color:#d9d9d9">
        <%@include file="all_component/navbar.jsp" %>
        <div class="container mt-2">
            <div class="row p-3">
                <div class="col-md-6 offset-md-3">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="text-center text-success">Add Address</h3>
                            <form>
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4" >Address</label> <input type="number" class="form-control" id="inputEmail4" value="">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4" >Landmark</label> <input type="text" class="form-control" id="inputEmail4">
                                    </div>
                                </div>
                                
                                <div class="form-row">
                                    <div class="form-group col-md-4">
                                        <label for="inputEmail4" >City</label> <input type="text" class="form-control" id="inputEmail4">
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="inputPassword4" >State</label> <input type="text" class="form-control" id="inputEmail4">
                                    </div>
                                    <div class="form-group col-md-4">
                                        <label for="inputEmail4" >Zip</label> <input type="text" class="form-control" id="inputEmail4">
                                    </div>
                                </div>
                                <div class="text-center">
                                    <button class="btn btn-warning text-white">Add Address</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>    
    </body>
</html>
