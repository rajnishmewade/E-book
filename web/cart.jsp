<%-- 
    Document   : cart
    Created on : 16 Oct, 2023, 8:54:12 PM
    Author     : ASUS
--%>

<%@page import="java.util.List"%>
<%@page import="com.entity.Cart"%>
<%@page import="com.entity.User"%>
<%@page import="com.DAO.CartDAOImpl"%>
<%@page import="com.DB.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cart Page</title>
        <%@include file="all_component/allCss.jsp"%>
    </head>
    <body style="background-color:#d9d9d9">
        <%@include file="all_component/navbar.jsp" %>
        
        <c:if test="${empty userobj}">
            <c:redirect url="login.jsp"></c:redirect>
        </c:if>
        
        <c:if test="${not empty succMsg}">
            <div class="alert alert-success" role="alert">
                ${succMsg}
            </div>
            <c:remove var="succMsg" scope="session"/>
        </c:if>
        
        <c:if test="${empty failedMsg}">
            <div class="alert alert-danger" role="alert">
                ${failedMsg}
            </div>
            <c:remove var="failedMsg" scope="session"/>
        </c:if>
        <div class="container">
            <div class="row p-2">
                <div class="col-md-6">
                    <div class="card bg-white">
                        <div class="card-body">
                            <h3 class="text-center text-success">Your Selected Item</h3>
                             <table class="table">
                                <thead>
                                  <tr>
                                    <th scope="col">Book Name</th>
                                    <th scope="col">Author</th>
                                    <th scope="col">Price</th>
                                    <th scope="col">Action</th>
                                  </tr>
                                </thead>
                                <tbody>
                                    <%
                                    User u=(User)session.getAttribute("userobj");
                                    CartDAOImpl dao=new CartDAOImpl(DBConnect.getConnection());
                                    List<Cart> cart=dao.getBookByUser(u.getId());
                                    Double totalPrice=0.00;
                                    for(Cart c:cart)
                                    {
                                        totalPrice=c.getTotalPrice();
                                    %>
                                    <tr>
                                        <th scope="row"><%=c.getBookName() %></th>
                                        <td><%=c.getAuthor() %></td>
                                        <td><%=c.getPrice() %></td>
                                        <td>
                                            <a href="RemoveBookCart?bid=<%=c.getBid()%>&uid=<%=c.getUserId()%>&cid=<%=c.getCid()%>" class="btn btn-sm btn-danger">Remove</a>
                                        </td>
                                    </tr>
                                    <%}
                                    %>
                                    
                                    <tr>
                                        <td>Total Price</td>
                                        <td></td>
                                        <td></td>
                                        <td><%=totalPrice %></td>
                                    </tr>
                                </tbody>
                              </table>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-body">
                            <h3 class="text-center text-success">Your Order Details</h3>
                            <form>
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4" >Name</label> <input type="text" class="form-control" id="inputEmail4" value="<%=u.getName() %>" readonly="readonly">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4" >Email</label> <input type="email" class="form-control" id="inputEmail4" value="<%=u.getEmail() %>" readonly="readonly">
                                    </div>
                                </div>
                                
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4" >Phone No</label> <input type="number" class="form-control" id="inputEmail4" value="<%=u.getPhono() %>">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4" >Address</label> <input type="text" class="form-control" id="inputEmail4">
                                    </div>
                                </div>
                                
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4" >Landmark</label> <input type="text" class="form-control" id="inputEmail4">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4" >City</label> <input type="text" class="form-control" id="inputEmail4">
                                    </div>
                                </div>                                
                                
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4" >State</label> <input type="text" class="form-control" id="inputEmail4">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4" >PinCode</label> <input type="text" class="form-control" id="inputEmail4">
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <label>Payment Mode</label>
                                    <select class="form-control">
                                        <option>--Select--</option>
                                        <option>Cash On Delivery</option>
                                    </select>
                                </div>
                                
                                <div class="text-center">
                                    <button class="btn btn-warning">Order Now</button>
                                    <a href="index.jsp" class="btn btn-success">Continue Shopping</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>