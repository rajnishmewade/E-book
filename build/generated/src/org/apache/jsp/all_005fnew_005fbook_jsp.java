package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.User;
import java.util.List;
import com.entity.BookDetails;
import com.DAO.BookDAOImpl;
import com.DB.DBConnect;

public final class all_005fnew_005fbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/all_component/allCss.jsp");
    _jspx_dependants.add("/all_component/navbar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_remove_var_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>All New Book</title>\n");
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
      out.write("            \n");
      out.write("            .crd-ho:hover{\n");
      out.write("                background: #ff704d; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #toast {\n");
      out.write("                    min-width: 300px;\n");
      out.write("                    position: fixed;\n");
      out.write("                    bottom: 30px;\n");
      out.write("                    left: 50%;\n");
      out.write("                    margin-left: -125px;\n");
      out.write("                    background: #333;\n");
      out.write("                    padding: 10px;\n");
      out.write("                    color: white;\n");
      out.write("                    text-align: center;\n");
      out.write("                    z-index: 1;\n");
      out.write("                    font-size: 18px;\n");
      out.write("                    visibility: hidden;\n");
      out.write("                    box-shadow: 0px 0px 100px #000;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #toast.display {\n");
      out.write("                    visibility: visible;\n");
      out.write("                    animation: fadeIn 0.5, fadeOut 0.5s 2.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @keyframes fadeIn {from { bottom:0;\n");
      out.write("                    opacity: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            to {\n");
      out.write("                    bottom: 30px;\n");
      out.write("                    opacity: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            @keyframes fadeOut {form { bottom:30px;\n");
      out.write("                    opacity: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            to {\n");
      out.write("                    bottom: 0;\n");
      out.write("                    opacity: 0;\n");
      out.write("            }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        User u=(User)session.getAttribute("userobj");
        
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("        \n");
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
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row p-3\">\n");
      out.write("                ");

                    
                    BookDAOImpl dao=new BookDAOImpl (DBConnect.getConnection());
                    List<BookDetails> list=dao.getAllNewBooks();
                    for(BookDetails b:list)
                    {
                      
      out.write("\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"book/");
      out.print(b.getPhotoName() );
      out.write("\" style=\"width:100px ;height:150px \"\n");
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
      out.write("                                <a href=\"view_books.jsp\" class=\"btn btn-success btn-sm ml-3\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm ml-3\">");
      out.print(b.getPrice() );
      out.write("<i class=\"fa-solid fa-indian-rupee-sign\"></i></a>                            \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>     \n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty addCart}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("          <div id=\"toast\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addCart}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </div>\n");
        out.write("            <script type=\"text/javascript\">\n");
        out.write("                showToast();\n");
        out.write("                function showToast(content)\n");
        out.write("                {\n");
        out.write("                $('#toast').addClass(\"display\");\n");
        out.write("                $('#toast').html(content);\n");
        out.write("                setTimeout(()=>{\n");
        out.write("                $(\"#toast\").removeClass(\"display\");\n");
        out.write("                },2000)\n");
        out.write("                }\t\n");
        out.write("            </script>\n");
        out.write("            \n");
        out.write("            ");
        if (_jspx_meth_c_remove_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_remove_0.setVar("addCart");
    _jspx_th_c_remove_0.setScope("session");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }
}
