/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2017-01-09 14:48:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/bootstrap.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/bootstrap-responsive.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/camera.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/style.css\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/superfish.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.ui.totop.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/camera.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.mobile.customized.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.caroufredsel.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery.touchSwipe.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/bootstrap.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\t//\r\n");
      out.write("\r\n");
      out.write("\t$('#camera_wrap').camera({\r\n");
      out.write("\t\t//thumbnails: true\r\n");
      out.write("\t\t//alignment\t\t\t: 'centerRight',\r\n");
      out.write("\t\tautoAdvance\t\t\t: true,\r\n");
      out.write("\t\tmobileAutoAdvance\t: true,\r\n");
      out.write("\t\tfx\t\t\t\t\t: 'simpleFade',\r\n");
      out.write("\t\theight: '41%',\r\n");
      out.write("\t\thover: false,\r\n");
      out.write("\t\tloader: 'none',\r\n");
      out.write("\t\tnavigation: true,\r\n");
      out.write("\t\tnavigationHover: true,\r\n");
      out.write("\t\tmobileNavHover: true,\r\n");
      out.write("\t\tplayPause: false,\r\n");
      out.write("\t\tpauseOnClick: false,\r\n");
      out.write("\t\tpagination\t\t\t: true,\r\n");
      out.write("\t\ttime: 5000,\r\n");
      out.write("\t\ttransPeriod: 1000,\r\n");
      out.write("\t\tminHeight: '200px'\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//\tcarouFredSel banner\r\n");
      out.write("\t$('#banner .carousel.main ul').carouFredSel({\r\n");
      out.write("\t\tauto: {\r\n");
      out.write("\t\t\ttimeoutDuration: 8000\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tresponsive: true,\r\n");
      out.write("\t\tprev: '.banner_prev',\r\n");
      out.write("\t\tnext: '.banner_next',\r\n");
      out.write("\t\twidth: '100%',\r\n");
      out.write("\t\tscroll: {\r\n");
      out.write("\t\t\titems: 1,\r\n");
      out.write("\t\t\tduration: 1000,\r\n");
      out.write("\t\t\teasing: \"easeOutExpo\"\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\titems: {\r\n");
      out.write("        \twidth: '350',\r\n");
      out.write("\t\t\theight: 'variable',\t//\toptionally resize item-height\r\n");
      out.write("\t\t\tvisible: {\r\n");
      out.write("\t\t\t\tmin: 1,\r\n");
      out.write("\t\t\t\tmax: 4\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tmousewheel: false,\r\n");
      out.write("\t\tswipe: {\r\n");
      out.write("\t\t\tonMouse: true,\r\n");
      out.write("\t\t\tonTouch: true\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t$(window).bind(\"resize\",updateSizes_vat).bind(\"load\",updateSizes_vat);\r\n");
      out.write("\tfunction updateSizes_vat(){\r\n");
      out.write("\t\t$('#banner .carousel.main ul').trigger(\"updateSizes\");\r\n");
      out.write("\t}\r\n");
      out.write("\tupdateSizes_vat();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}); //\r\n");
      out.write("$(window).load(function() {\r\n");
      out.write("\t//\r\n");
      out.write("\r\n");
      out.write("}); //\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"front\">\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"cake1\"></div>\r\n");
      out.write("<div class=\"cake2\"></div>\r\n");
      out.write("<div class=\"cake3\"></div>\r\n");
      out.write("<div class=\"cake4\"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"top1_wrapper\">\r\n");
      out.write("<div class=\"top1_wrapper2\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"span12\">\r\n");
      out.write("<div class=\"top1 clearfix\">\r\n");
      out.write("\r\n");
      out.write("<header><div class=\"logo_wrapper\"><a href=\"index.html\" class=\"logo\"><img src=\"resources/images/1234.png\" alt=\"\"></a></div></header>\r\n");
      out.write("\r\n");
      out.write("<div class=\"navbar navbar_\">\r\n");
      out.write("\t<div class=\"navbar-inner navbar-inner_\">\r\n");
      out.write("\t\t<a class=\"btn btn-navbar btn-navbar_\" data-toggle=\"collapse\" data-target=\".nav-collapse_\">\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t<div class=\"nav-collapse nav-collapse_ collapse clearfix\">\r\n");
      out.write("<ul class=\"nav nav_left sf-menu clearfix\">\r\n");
      out.write("\t<li class=\"active\"><a href=\"home\">Home</a></li>\r\n");
      out.write("\t<li class=\"sub-menu sub-menu-1\"><a href=\"items\">Categories</a>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"items\">Anniversary</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"items\">Birth Day</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"items\">Special</a></li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li><a href=\"about\">About Us</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<ul class=\"nav nav_right sf-menu clearfix\">\r\n");
      out.write("\t<li><a href=\"login\">Login</a></li>\r\n");
      out.write("\t<li><a href=\"index-4.html\">Sign Up</a></li>\r\n");
      out.write("\t<li><a href=\"contact\">contacts</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"top2_wrapper\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"span12\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"top2 clearfix\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"slider_wrapper\">\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("<div id=\"slider_inner\" class=\"clearfix\">\r\n");
      out.write("<div id=\"slider\" class=\"clearfix\">\r\n");
      out.write("\t<div id=\"camera_wrap\">\r\n");
      out.write("\t\t<div data-src=\"resources/images/slide01.jpg\">\r\n");
      out.write("\t\t\t<div class=\"camera_caption nav1 fadeIn\">\r\n");
      out.write("\t\t\t\t<div class=\"txt1\">The Best Cakes for the Special Occasions</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-src=\"resources/images/slide02.jpg\">\r\n");
      out.write("\t\t\t<div class=\"camera_caption nav1 fadeIn\">\r\n");
      out.write("\t\t\t\t<div class=\"txt1\">The Best Cakes for the Special Occasions</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-src=\"resources/images/slide03.jpg\">\r\n");
      out.write("\t\t\t<div class=\"camera_caption nav1 fadeIn\">\r\n");
      out.write("\t\t\t\t<div class=\"txt1\">The Best Cakes for the Special Occasions</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"shadow1\"><img src=\"resources/images/shadow1.png\" alt=\"\" class=\"img\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"banner_wrapper\">\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("<div id=\"banner\">\r\n");
      out.write("<a class=\"banner_prev\" href=\"#\"></a>\r\n");
      out.write("<a class=\"banner_next\" href=\"#\"></a>\r\n");
      out.write("<div class=\"carousel-box\">\r\n");
      out.write("\t<div class=\"inner\">\r\n");
      out.write("\t\t<div class=\"carousel main\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner_inner2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt1\">Cupcakes</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure><img src=\"resources/images/banner1.jpg\" alt=\"\" class=\"img\"></figure>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tA cupcake is a small cake designed to serve one person,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t which may be baked in a small thin paper or aluminum cup. \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt3\">read more</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner_inner2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt1\">Birthday</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure><img src=\"resources/images/banner2.jpg\" alt=\"\" class=\"img\"></figure>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tThe birthday cake has been an integral part of the birthday celebrations in \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twestern European countries since the middle of the 19th century,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt3\">read more</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner_inner2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt1\">Wedding</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure><img src=\"resources/images/banner3.jpg\" alt=\"\" class=\"img\"></figure>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tA wedding cake is the traditional cake served at wedding receptions following dinner. \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tIn some parts of England, the wedding cake is \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tserved \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt3\">read more</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner_inner2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt1\">Special</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure><img src=\"resources/images/banner4.jpg\" alt=\"\" class=\"img\"></figure>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tSpecial occasion cake Recipes. Sort by: title, rating ... \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tChocolate Mousse Cake with Raspberries. star rating ... \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt3\">read more</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner_inner2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt1\">Cupcakes</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure><img src=\"resources/images/banner1.jpg\" alt=\"\" class=\"img\"></figure>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tA cupcake is a small cake designed to serve one person,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t which may be baked in a small thin paper or aluminum cup. \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt3\">read more</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner_inner2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt1\">Birthday</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure><img src=\"resources/images/banner2.jpg\" alt=\"\" class=\"img\"></figure>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tThe birthday cake has been an integral part of the birthday celebrations in \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twestern European countries since the middle of the 19th century,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt3\">read more</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner_inner2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt1\">Wedding</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure><img src=\"resources/images/banner3.jpg\" alt=\"\" class=\"img\"></figure>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tA wedding cake is the traditional cake served at wedding receptions following dinner. \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tIn some parts of England, the wedding cake is \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tserved at a wedding breakfast\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt3\">read more</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner_inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"banner_inner2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt1\">Special</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<figure><img src=\"resources/images/banner4.jpg\" alt=\"\" class=\"img\"></figure>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tSpecial occasion cake Recipes. Sort by: title, rating ... \r\n");
      out.write("\t\t\t\t\t\t\t\t\t    Chocolate Mousse Cake with Raspberries. star rating ... \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"txt3\">read more</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"h1_wrapper\">\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("<div class=\"\">\r\n");
      out.write("<div class=\"clearfix\">\r\n");
      out.write("<div class=\"h1_inner\">\r\n");
      out.write("<h1>Our Special Proposals</h1>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("\r\n");
      out.write("<h4>Custom cake from Rs40</h4>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("\tFlowers, Anytime Anywhere · Fixed Time Delivery · Free Shipping in India · Mid-Night Delivery Services: Midnight Delivery, Same Day Delivery, Fixed Time Delivery\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<a href=\"#\" class=\"button1\">details</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("\r\n");
      out.write("<h4>Cakes for every special day</h4>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("\tI would like to let everyone know how wonderful it was to work with Special Days Cake Boutique. They did a beautiful semi naked cake and it was amazing.\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<a href=\"#\" class=\"button1\">details</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"span4\">\r\n");
      out.write("\r\n");
      out.write("<h4>Corporate service specials</h4>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("\tWe have great collection of corporate cakes that can be delivered in India same ... The Maya the Bee Special Cupcakes are bright and cheery and bring in some ..\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("<a href=\"#\" class=\"button1\">details</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
