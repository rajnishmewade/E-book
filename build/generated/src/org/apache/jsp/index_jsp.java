package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.User;
import java.util.List;
import com.entity.BookDetails;
import com.DAO.BookDAOImpl;
import java.sql.Connection;
import com.DB.DBConnect;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/all_component/allCss.jsp");
    _jspx_dependants.add("/all_component/navbar.jsp");
    _jspx_dependants.add("/all_component/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ebook:Index</title>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" \n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" \n");
      out.write("      integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" \n");
      out.write("      crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<script\n");
      out.write("    src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" \n");
      out.write("    integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" \n");
      out.write("    crossorigin=\"anonymous\">  \n");
      out.write("</script>\n");
      out.write("<script \n");
      out.write("    src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" \n");
      out.write("    integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" \n");
      out.write("    crossorigin=\"anonymous\">\n");
      out.write("</script>\n");
      out.write("<script \n");
      out.write("    src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" \n");
      out.write("    integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" \n");
      out.write("    crossorigin=\"anonymous\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" \n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" \n");
      out.write("      integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" \n");
      out.write("      crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("<!--<link rel=\"stylesheet\" href=\"all_component/style.css\">-->\n");
      out.write("<link rel=\"stylesheet\" href=\"all_component/style.css\">");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .back-img{\n");
      out.write("                background: url(img/book.jpg);\n");
      out.write("                height: 50vh;\n");
      out.write("                width: 100%;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            .crd-ho:hover{\n");
      out.write("                background: #ff704d;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:#d9d9d9\">\n");
      out.write("        \n");
      out.write("        ");

        User u=(User)session.getAttribute("userobj");
        
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"container-fluid\" style=\"height: 10px; background-color: #303f9f\"</div>\n");
      out.write("<div class=\"container-fluid p-3 bg-light\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-3 text-success\">\n");
      out.write("            <h3><i class=\"fa-solid fa-bookmark\"></i>Ebooks</h3>    \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                <button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <a href=\"login.jsp\" class=\"btn btn-success\"><i class=\"fa-solid fa-right-to-bracket\"></i>Login</a>\n");
      out.write("            <a href=\"register.jsp\" class=\"btn btn-primary text-white\"><i class=\"fa-regular fa-user\"></i>Register</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\"><i class=\"fa-solid fa-house\"></i></a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"all_recent_book.jsp\"><i class=\"fa-solid fa-book-open\"></i>Recent Book</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"all_new_book.jsp\"><i class=\"fa-solid fa-book-open\"></i>New Book</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"all_old_book.jsp\"><i class=\"fa-solid fa-book-open\"></i>Old Book</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <button class=\"btn btn-light my-2 my-sm-0 ml-1\" type=\"submit\"><i class=\"fa-solid fa-gear\"></i>Setting</button>\n");
      out.write("      <button class=\"btn btn-light my-2 my-sm-0 ml-1\" type=\"submit\"><i class=\"fa-solid fa-phone\"></i>Contact Us</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid back-img\">\n");
      out.write("            <h2 class=\"text-center text-danger\">Ebook Management System</h2>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <!--Start Recent Book -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-center\">Recent Book</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("            ");
 
            BookDAOImpl dao2=new BookDAOImpl(DBConnect.getConnection());
            List<BookDetails> list2 =dao2.getRecentBooks();
            for(BookDetails b:list2)
            {
            
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"book/");
      out.print(b.getPhotoName() );
      out.write("\" style=\"width:150px ;height:200px \"\n");
      out.write("                                 class=\"img-thumblin\">\n");
      out.write("                            <p>");
      out.print(b.getBookName() );
      out.write("</p>\n");
      out.write("                            <p>");
      out.print(b.getAuthor() );
      out.write("</p>\n");
      out.write("                            <p>\n");
      out.write("                                ");

                                    if(b.getBookCategory().equals("Old"))
                                    {
                                    
      out.write("\n");
      out.write("                                    Category:");
      out.print(b.getBookCategory());
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                    <a href=\"view_books.jsp?bid=");
      out.print(b.getBookId());
      out.write("\" class=\"btn btn-success btn-sm ml-5\">View Details</a>\n");
      out.write("                                    <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice() );
      out.write("<i class=\"fa-solid fa-indian-rupee-sign\"></i></a>                            \n");
      out.write("                                    </div>\n");
      out.write("                                    ");
   
                                    }
                                    else
                                    {   
                                    
      out.write("\n");
      out.write("                                    Category:");
      out.print(b.getBookCategory());
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        ");

                                        if(u==null)
                                        {
                                        
      out.write("\n");
      out.write("                                        <a href=\"login.jsp\" class=\"btn btn-danger btn-sm ml-1\"><i class=\"fa-solid fa-cart-shopping\"></i>Add Cart</a>\n");
      out.write("                                        ");

                                        }   
                                        else{
                                        
      out.write("\n");
      out.write("                                        <a href=\"CartServlet?bid=");
      out.print(b.getBookId());
      out.write("&uid=");
      out.print(u.getId());
      out.write("\" class=\"btn btn-danger btn-sm ml-1\"><i class=\"fa-solid fa-cart-shopping\"></i>Add Cart</a>                                        \n");
      out.write("                                        ");

                                        }
                                        
      out.write("\n");
      out.write("                                        <a href=\"view_books.jsp?bid=");
      out.print(b.getBookId());
      out.write("\" class=\"btn btn-success btn-sm ml-1\">View Details</a>\n");
      out.write("                                        <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice() );
      out.write("<i class=\"fa-solid fa-indian-rupee-sign\"></i></a>                            \n");
      out.write("                                    </div>\n");
      out.write("                                    ");
  
                                    }
                                    
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            ");

            }
            
      out.write("   \n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mt-1\">\n");
      out.write("                <a href=\"all_recent_book.jsp\" class=\"btn btn-danger btn-sm text-white\">View All</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--End Recent Book -->\n");
      out.write("        <hr>\n");
      out.write("        <!--Start New Book -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-center\">New Book</h3>\n");
      out.write("            <div class=\"row\">   \n");
      out.write("                    ");

                    
                    BookDAOImpl dao=new BookDAOImpl (DBConnect.getConnection());
                    List<BookDetails> list=dao.getNewBooks();
                    for(BookDetails b:list)
                    {
                      
      out.write("\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"book/");
      out.print(b.getPhotoName() );
      out.write("\" style=\"width:150px ;height:200px \"\n");
      out.write("                                 class=\"img-thumblin\">\n");
      out.write("                            <p>");
      out.print(b.getBookName());
      out.write("</p>\n");
      out.write("                            <p>");
      out.print(b.getAuthor() );
      out.write("</p>\n");
      out.write("                            <p>Category:");
      out.print(b.getBookCategory() );
      out.write("</p>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                ");

                                if(u==null)
                                {
                                
      out.write("\n");
      out.write("                                <a href=\"login.jsp\" class=\"btn btn-danger btn-sm ml-1\"><i class=\"fa-solid fa-cart-shopping\"></i>Add Cart</a>\n");
      out.write("                                ");

                                }   
                                else{
                                
      out.write("\n");
      out.write("                                <a href=\"CartServlet?bid=");
      out.print(b.getBookId());
      out.write("&uid=");
      out.print(u.getId());
      out.write("\" class=\"btn btn-danger btn-sm ml-1\"><i class=\"fa-solid fa-cart-shopping\"></i>Add Cart</a>                                        \n");
      out.write("                                ");

                                }
                                
      out.write("\n");
      out.write("                                <a href=\"view_books.jsp?bid=");
      out.print(b.getBookId());
      out.write("\" class=\"btn btn-success btn-sm ml-1\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice() );
      out.write("<i class=\"fa-solid fa-indian-rupee-sign\"></i></a>                            \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>     \n");
      out.write("                    ");

                    }
                    
      out.write(" \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mt-1\">\n");
      out.write("                <a href=\"all_new_book.jsp\" class=\"btn btn-danger btn-sm text-white\">View All</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--End New Book -->     \n");
      out.write("        <hr>\n");
      out.write("        <!--Start Old Book -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-center\">Old Book</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");
 
            BookDAOImpl dao3=new BookDAOImpl(DBConnect.getConnection());
            List<BookDetails> list3 =dao3.getOldBooks();
            for(BookDetails b:list3)
            {
            
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"book/");
      out.print(b.getPhotoName() );
      out.write("\" style=\"width:150px ;height:200px \"\n");
      out.write("                                 class=\"img-thumblin\">\n");
      out.write("                            <p>");
      out.print(b.getBookName() );
      out.write("</p>\n");
      out.write("                            <p>");
      out.print(b.getAuthor() );
      out.write("</p>\n");
      out.write("                            <p>Category:");
      out.print(b.getBookCategory() );
      out.write("</p>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a href=\"view_books.jsp?bid=");
      out.print(b.getBookId());
      out.write("\" class=\"btn btn-success btn-sm ml-5\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice() );
      out.write("<i class=\"fa-solid fa-indian-rupee-sign\"></i></a>                            \n");
      out.write("                            </div>   \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mt-1\">\n");
      out.write("                <a href=\"all_old_book.jsp\" class=\"btn btn-danger btn-sm text-white\">View All</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--End Old Book -->\n");
      out.write("        \n");
      out.write("        ");
      out.write("<div class=\"container-fluid text-center text-white p-3 mt-2\" \n");
      out.write("    style=\"background-color: #303f9f;\">\n");
      out.write("    <h5>Design and Developed by Rajnish Mewade</h5>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
