/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-09-19 08:14:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.community;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class board_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>게시글</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Latest compiled and minified CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Latest compiled JavaScript -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-color: #ADE8F4;\r\n");
      out.write("        }\r\n");
      out.write("        .wrap {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            max-width: 1246px;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            box-shadow: 1px 1px 1px 1px rgb(203, 203, 203);\r\n");
      out.write("        }\r\n");
      out.write("        #header {\r\n");
      out.write("            width: 1284px;\r\n");
      out.write("            max-width: 1284px;\r\n");
      out.write("            height: 91px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border-radius: 30px;\r\n");
      out.write("            margin: 20px auto;\r\n");
      out.write("            box-shadow: 1px 1px 1px 1px rgb(203, 203, 203);\r\n");
      out.write("        }\r\n");
      out.write("        .post-title {\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            background-color: #F6F6F6;\r\n");
      out.write("        }\r\n");
      out.write("        .post-meta {\r\n");
      out.write("            font-size: 14px;\r\n");
      out.write("            background-color: #F6F6F6;\r\n");
      out.write("        }\r\n");
      out.write("        .post-meta table {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            table-layout: fixed;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            border: 2px solid #C8C8C8;\r\n");
      out.write("        }\r\n");
      out.write("        .post-meta td {\r\n");
      out.write("            border: 2px solid #C8C8C8;\r\n");
      out.write("        }\r\n");
      out.write("        .post-content {\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            line-height: 1.5;\r\n");
      out.write("            padding: 15px 0;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border: 2px solid #C8C8C8;\r\n");
      out.write("        }\r\n");
      out.write("        .comments-section {\r\n");
      out.write("            padding-left: 20px;\r\n");
      out.write("            padding-right: 20px;\r\n");
      out.write("            background-color: #F6F6F6;\r\n");
      out.write("            border: 2px solid #C8C8C8;\r\n");
      out.write("        }\r\n");
      out.write("        .comment {\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            padding : 5px;\r\n");
      out.write("        }\r\n");
      out.write("        .buttons {\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            gap: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .pagination {\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        /* 반응형 처리 */\r\n");
      out.write("        @media (max-width: 768px) {\r\n");
      out.write("            .wrap {\r\n");
      out.write("                width: 90%;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            #header {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                margin: 10px auto;\r\n");
      out.write("            }\r\n");
      out.write("            .post-meta table {\r\n");
      out.write("                font-size: 12px;\r\n");
      out.write("            }\r\n");
      out.write("            .post-meta td {\r\n");
      out.write("                padding: 5px;\r\n");
      out.write("            }\r\n");
      out.write("            .post-content {\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("            }\r\n");
      out.write("            .comments-section {\r\n");
      out.write("                padding-left: 10px;\r\n");
      out.write("                padding-right: 10px;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* 모바일 화면에서 테이블의 <td> 요소를 한 줄씩 배치 */\r\n");
      out.write("        @media (max-width: 480px) {\r\n");
      out.write("            .post-meta td {\r\n");
      out.write("                display: block;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border: none;\r\n");
      out.write("                background-color: #ececec;\r\n");
      out.write("                margin-bottom: 5px;\r\n");
      out.write("            }\r\n");
      out.write("            .post-meta table {\r\n");
      out.write("                border: none;\r\n");
      out.write("            }\r\n");
      out.write("            .post-meta tr {\r\n");
      out.write("                display: block;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination {\r\n");
      out.write("                font-size: 12px;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"header\"></div>\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        <h1 style=\"text-align: center;\">게시글</h1>\r\n");
      out.write("        <!-- Post Metadata -->\r\n");
      out.write("        <div class=\"post-meta\">\r\n");
      out.write("            <table class=\"table text-center\" style=\"margin-bottom: 0px;\">\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td colspan=\"5\" style=\"text-align: center; border: 2px solid #C8C8C8; background-color: #ececec; font-weight: bold;\">제목: 제주도/근교/맛집</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr> \r\n");
      out.write("                    <td style=\"background-color: #ececec;\">아이디: test01</td>\r\n");
      out.write("                    <td style=\"background-color: #ececec;\">작성일: 2024/01/01</td>\r\n");
      out.write("                    <td style=\"background-color: #ececec;\">유형: QnA</td>\r\n");
      out.write("                    <td style=\"background-color: #ececec;\">조회수: 20</td>\r\n");
      out.write("                    <td style=\"background-color: #ececec;\">좋아요: 6</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <!-- Post Content -->\r\n");
      out.write("            <div class=\"post-content\">\r\n");
      out.write("                저번 주말에 부모님과 제주도를 다녀왔는데 xx수산이 정말 친절하고 좋았어요. OO들레길도 다녀왔는데 부모님이 좋아하셔서 기분이 좋았네요. 그 후 일정은 딱히 없었는데 트레팍에서 주변에 **기념관이 있다고 해서 다녀왔습니다. 사실도 깨끗하고 조용해서 좋더라고요. 여행 코스로 추천받아서 알차게 다녀왔어요. 이 사이트 괜찮다고 생각합니다. 다른 사이트는 결제 유도하던데 여기는 그런게 없어서 괜찮은 것 같아요. 심리테스트도 부모님께 해보시라고 권해드리니 신기하다며 좋아하시네요. xx수산, OO들레길, **기념관은 조용한 곳 좋아하시는 분이 가면 좋을 것 같네요. 추천합니다!\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Comment Section -->\r\n");
      out.write("        <div class=\"comments-section\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <h5 style=\"font-weight: bold;\">댓글</h5>\r\n");
      out.write("            <div class=\"comment\">\r\n");
      out.write("                <textarea class=\"form-control mb-3\" rows=\"4\" placeholder=\"댓글을 입력하세요\"></textarea>\r\n");
      out.write("                <button class=\"btn btn-primary\">작성 완료</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"comment mt-4\" style=\"background-color: white;\">\r\n");
      out.write("                <strong>test02</strong>\r\n");
      out.write("                <p>잘 다녀오셨네요. 다음에 저도 가봐야겠어요.</p>\r\n");
      out.write("                <button class=\"btn btn-link\" style=\"background-color: rgb(225, 225, 255);\">답변</button>\r\n");
      out.write("                <button class=\"btn btn-link text-danger\"  style=\"background-color: rgb(255, 225, 225);\">댓글 삭제</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"comment mt-4 text-muted\" style=\"background-color: white;\">\r\n");
      out.write("                '삭제된 댓글입니다.'\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Pagination -->\r\n");
      out.write("            <nav aria-label=\"Page navigation\">\r\n");
      out.write("                <ul class=\"pagination justify-content-center mt-3\">\r\n");
      out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"#\">1</a></li>\r\n");
      out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\r\n");
      out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"#\">4</a></li>\r\n");
      out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"#\">5</a></li>\r\n");
      out.write("                    <li class=\"page-item disabled\"><a class=\"page-link\" href=\"#\">...</a></li>\r\n");
      out.write("                    <li class=\"page-item\"><a class=\"page-link\" href=\"#\">10</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
