<%-- 
    Document   : all_recent_book
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
        <title>All Recent Book</title>
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
            BookDAOImpl dao2=new BookDAOImpl(DBConnect.getConnection());
            List<BookDetails> list6=dao2.getAllRecentBooks();
            for(BookDetails b:list6)
            {
            %>
                <div class="col-md-3">
                    <div class="card crd-ho mt-2">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhotoName() %>" style="width:100px ;height:150px "
                                 class="img-thumblin">
                            <p><%=b.getBookName() %></p>
                            <p><%=b.getAuthor() %></p>
                            <p>
                                <%
                                    if(b.getBookCategory().equals("Old"))
                                    {
                                    %>
                                    Category:<%=b.getBookCategory()%>
                                    <div class="row">
                                    <a href="" class="btn btn-success btn-sm ml-5">View Details</a>
                                    <a href="" class="btn btn-danger btn-sm ml-5"><%=b.getPrice() %><i class="fa-solid fa-indian-rupee-sign"></i></a>                            
                                    </div>
                                    <%   
                                    }
                                    else
                                    {   
                                    %>
                                    Category:<%=b.getBookCategory()%>
                            </p>
                                    <div class="row">
                                        <a href="" class="btn btn-danger btn-sm ml-4"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                                        <a href="" class="btn btn-success btn-sm ml-3">View Details</a>
                                        <a href="" class="btn btn-danger btn-sm ml-3"><%=b.getPrice() %><i class="fa-solid fa-indian-rupee-sign"></i></a>                            
                                    </div>
                                    <%  
                                    }
                                    %>
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
