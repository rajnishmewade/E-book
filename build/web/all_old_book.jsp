<%-- 
    Document   : all_olg_book
    Created on : 15 Oct, 2023, 8:01:08 PM
    Author     : ASUS
--%>

<%@page import="java.util.List"%>
<%@page import="com.entity.BookDetails"%>
<%@page import="com.DAO.BookDAOImpl"%>
<%@page import="com.DB.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Old Book</title>
        <%@include file="all_component/allCss.jsp"%>
        <style type="text/css">
            
            .crd-ho:hover{
                background: #ff704d; 
            }
        </style>
    </head>
    <body>
        <%@include file="all_component/navbar.jsp" %>
        <div class="container-fluid">
            <div class="row p-3">
                <%
                    
                    BookDAOImpl dao=new BookDAOImpl (DBConnect.getConnection());
                    List<BookDetails> list5=dao.getAllOldBooks();
                    for(BookDetails b:list5)
                    {
                      %>
                    <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhotoName() %>" style="width:100px ;height:150px "
                                 class="img-thumblin">
                            <p><%=b.getBookName()%></p>
                            <p><%=b.getAuthor() %></p>
                            <p>Category:<%=b.getBookCategory() %></p>
                            <div class="row">
                                <a href="view_books.jsp?bid=<%=b.getBookId()%>" class="btn btn-success btn-sm ml-5">View Details</a>
                                <a href="" class="btn btn-danger btn-sm ml-3"><%=b.getPrice() %><i class="fa-solid fa-indian-rupee-sign"></i></a>                            
                            </div>
                        </div>
                    </div>
                </div>     
                    <%
                    }
                    %>
            </div>
        </div>
    </body>
</html>

