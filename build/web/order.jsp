<%-- 
    Document   : order
    Created on : 17 Oct, 2023, 3:02:48 AM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Book</title>
        <%@include file="all_component/allCss.jsp" %>
    </head>
    <body style="background-color:#d9d9d9">
        <%@include file="all_component/navbar.jsp" %>
        <div class="container p-1">
            <h3 class="text-center text-primary">Your Order</h3>
            <table class="table table-dark mt-3">
                <thead class="bg-primary text-white">
                <tr>
                  <th scope="col">Order Id</th>
                  <th scope="col">Name</th>
                  <th scope="col">Book Name</th>
                  <th scope="col">Author</th>
                  <th scope="col">Price</th>
                  <th scope="col">Payment Type</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <th scope="row">1</th>
                  <td>Mark</td>
                  <td>Otto</td>
                  <td>@mdo</td>
                  <td>Otto</td>
                  <td>@mdo</td>
                </tr>
                
              </tbody>
            </table> 
        </div>
    </body>
</html>
