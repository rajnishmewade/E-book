<%-- 
    Document   : all_books
    Created on : 12 Oct, 2023, 2:09:22 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="com.entity.BookDetails"%>
<%@page import="com.DAO.BookDAOImpl"%>
<%@page import="com.DB.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin: All Books</title>
        <%@include file="allCss.jsp" %>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <c:if test="${empty userobj}">
            <c:redirect url="../login.jsp"/>
        </c:if>
        <h3 class="text-center">Hello Admin</h3>
        
        <c:if test="${not empty succMsg}">
            <h5 class="text-center text-success">${succMsg}</h5>
            <c:remove var="succMsg" scope="session"/>
        </c:if>
            
        <c:if test="${not empty failedMsg}">
            <h5 class="text-center text-success">${failedMsg}</h5>
            <c:remove var="failedMsg" scope="session"/>
        </c:if>    
            <table class="table table-striped ">
                <thead class="bg-primary text-white">
                <tr>
                  <th scope="col">ID</th>
                  <th scope="col">Image</th>
                  <th scope="col">Book Name</th>
                  <th scope="col">Author</th>
                  <th scope="col">Price</th>
                  <th scope="col">Categories</th>
                  <th scope="col">Status</th>
                  <th scope="col">Action</th>
                </tr>
              </thead>
              <tbody>
              <%
                  BookDAOImpl dao=new BookDAOImpl(DBConnect.getConnection());
                  List<BookDetails> list=dao.getAllBooks();
                  for(BookDetails b:list){
              %>
              <tr>
                  <td><%=b.getBookId() %></td>
                  <td><img src="../book/<%=b.getPhotoName() %>" style="width:50px; height:50px" ></td>
                  <td><%=b.getBookName() %></td>
                  <td><%=b.getAuthor() %></td>
                  <td><%=b.getPrice() %></td>
                  <td><%=b.getBookCategory() %></td>
                  <td><%=b.getStatus()%></td>
                  
                  <td>
                      <a href="../admin/edit_books.jsp?id=<%=b.getBookId()%>" class="btn btn-sm btn-primary"><i class="fa-solid fa-pen-to-square"></i>Edit</a>
                      <a href="../DeleteBooksServlet?id=<%=b.getBookId()%>" class="btn btn-sm btn-danger"><i class="fa-solid fa-trash"></i>Delete</a>
                  </td>
              </tr>
              <%
              }
              %>
<!--                <tr>
                  <th scope="row">1</th>
                  <td>Mark</td>
                  <td>Otto</td>
                  <td>@mdo</td>
                  <td>Jacob</td>
                  <td>Thornton</td>
                  <td>
                      <a href="#" class="btn btn-sm btn-primary">Edit</a>
                      <a href="#" class="btn btn-sm btn-danger">Delete</a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">2</th>
                  <td>Jacob</td>
                  <td>Thornton</td>
                  <td>@fat</td>
                  <td>Jacob</td>
                  <td>Thornton</td>
                  <td>
                      <a href="#" class="btn btn-sm btn-primary">Edit</a>
                      <a href="#" class="btn btn-sm btn-danger">Delete</a>
                  </td>
                </tr>
                <tr>
                  <th scope="row">3</th>
                  <td>Larry</td>
                  <td>the Bird</td>
                  <td>@twitter</td>
                  <td>Jacob</td>
                  <td>Thornton</td>
                  <td>
                      <a href="#" class="btn btn-sm btn-primary">Edit</a>
                      <a href="#" class="btn btn-sm btn-danger">Delete</a>
                  </td>
                </tr>-->
              </tbody>
            </table>
        <div style="margin-top: 130px">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
