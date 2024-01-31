<%-- 
    Document   : index
    Created on : 9 Oct, 2023, 10:59:49 PM
    Author     : ASUS
--%>

<%@page import="com.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.BookDetails"%>
<%@page import="com.DAO.BookDAOImpl"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.DB.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ebook:Index</title>
        <%@include file="all_component/allCss.jsp"%>
        <style type="text/css">
            .back-img{
                background: url(img/book.jpg);
                height: 50vh;
                width: 100%;
                background-repeat: no-repeat;
                background-size: cover;
            }
            .crd-ho:hover{
                background: #ff704d;
                
            }
        </style>
    </head>
    <body style="background-color:#d9d9d9">
        
        <%
        User u=(User)session.getAttribute("userobj");
        %>
        <%@include file="all_component/navbar.jsp" %>
        <div class="container-fluid back-img">
            <h2 class="text-center text-danger">Ebook Management System</h2>
        </div>
        
        <!--Start Recent Book -->
        <div class="container">
            <h3 class="text-center">Recent Book</h3>
            <div class="row">
            <% 
            BookDAOImpl dao2=new BookDAOImpl(DBConnect.getConnection());
            List<BookDetails> list2 =dao2.getRecentBooks();
            for(BookDetails b:list2)
            {
            %>
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhotoName() %>" style="width:150px ;height:200px "
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
                                    <a href="view_books.jsp?bid=<%=b.getBookId()%>" class="btn btn-success btn-sm ml-5">View Details</a>
                                    <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice() %><i class="fa-solid fa-indian-rupee-sign"></i></a>                            
                                    </div>
                                    <%   
                                    }
                                    else
                                    {   
                                    %>
                                    Category:<%=b.getBookCategory()%>
                            </p>
                                    <div class="row">
                                        <%
                                        if(u==null)
                                        {
                                        %>
                                        <a href="login.jsp" class="btn btn-danger btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                                        <%
                                        }   
                                        else{
                                        %>
                                        <a href="CartServlet?bid=<%=b.getBookId()%>&uid=<%=u.getId()%>" class="btn btn-danger btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>                                        
                                        <%
                                        }
                                        %>
                                        <a href="view_books.jsp?bid=<%=b.getBookId()%>" class="btn btn-success btn-sm ml-1">View Details</a>
                                        <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice() %><i class="fa-solid fa-indian-rupee-sign"></i></a>                            
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
            <div class="text-center mt-1">
                <a href="all_recent_book.jsp" class="btn btn-danger btn-sm text-white">View All</a>
            </div>
        </div>
        <!--End Recent Book -->
        <hr>
        <!--Start New Book -->
        <div class="container">
            <h3 class="text-center">New Book</h3>
            <div class="row">   
                    <%
                    
                    BookDAOImpl dao=new BookDAOImpl (DBConnect.getConnection());
                    List<BookDetails> list=dao.getNewBooks();
                    for(BookDetails b:list)
                    {
                      %>
                    <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhotoName() %>" style="width:150px ;height:200px "
                                 class="img-thumblin">
                            <p><%=b.getBookName()%></p>
                            <p><%=b.getAuthor() %></p>
                            <p>Category:<%=b.getBookCategory() %></p>
                            <div class="row">
                                <%
                                if(u==null)
                                {
                                %>
                                <a href="login.jsp" class="btn btn-danger btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>
                                <%
                                }   
                                else{
                                %>
                                <a href="CartServlet?bid=<%=b.getBookId()%>&uid=<%=u.getId()%>" class="btn btn-danger btn-sm ml-1"><i class="fa-solid fa-cart-shopping"></i>Add Cart</a>                                        
                                <%
                                }
                                %>
                                <a href="view_books.jsp?bid=<%=b.getBookId()%>" class="btn btn-success btn-sm ml-1">View Details</a>
                                <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice() %><i class="fa-solid fa-indian-rupee-sign"></i></a>                            
                            </div>
                        </div>
                    </div>
                </div>     
                    <%
                    }
                    %> 
               
            </div>
            <div class="text-center mt-1">
                <a href="all_new_book.jsp" class="btn btn-danger btn-sm text-white">View All</a>
            </div>
        </div>
        <!--End New Book -->     
        <hr>
        <!--Start Old Book -->
        <div class="container">
            <h3 class="text-center">Old Book</h3>
            <div class="row">
                <% 
            BookDAOImpl dao3=new BookDAOImpl(DBConnect.getConnection());
            List<BookDetails> list3 =dao3.getOldBooks();
            for(BookDetails b:list3)
            {
            %>
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhotoName() %>" style="width:150px ;height:200px "
                                 class="img-thumblin">
                            <p><%=b.getBookName() %></p>
                            <p><%=b.getAuthor() %></p>
                            <p>Category:<%=b.getBookCategory() %></p>
                            <div class="row">
                                <a href="view_books.jsp?bid=<%=b.getBookId()%>" class="btn btn-success btn-sm ml-5">View Details</a>
                                <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice() %><i class="fa-solid fa-indian-rupee-sign"></i></a>                            
                            </div>   
                        </div>
                    </div>
                </div>
            <%
            }
            %>
            </div>
            <div class="text-center mt-1">
                <a href="all_old_book.jsp" class="btn btn-danger btn-sm text-white">View All</a>
            </div>
        </div>
        <!--End Old Book -->
        
        <%@include file="all_component/footer.jsp" %>
    </body>
</html>
