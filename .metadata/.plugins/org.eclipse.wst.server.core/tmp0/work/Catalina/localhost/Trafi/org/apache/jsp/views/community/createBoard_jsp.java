/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-09-19 07:44:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.community;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class createBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>게시글 작성</title> \r\n");
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
      out.write("            width: 1246px;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            box-shadow: 1px 1px 1px 1px rgb(203, 203, 203);\r\n");
      out.write("        }\r\n");
      out.write("        #header {\r\n");
      out.write("            width: 1284px;\r\n");
      out.write("            height: 91px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            border-radius: 30px;\r\n");
      out.write("            margin: 20px auto;\r\n");
      out.write("            box-shadow: 1px 1px 1px 1px rgb(203, 203, 203);\r\n");
      out.write("        }\r\n");
      out.write("        .title-container {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("        .title-container label {\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("            white-space: nowrap;\r\n");
      out.write("        }\r\n");
      out.write("        .title-container input {\r\n");
      out.write("            flex-grow: 1;\r\n");
      out.write("        }\r\n");
      out.write("        .button-container {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .left-buttons {\r\n");
      out.write("            display: flex;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("        }\r\n");
      out.write("        button, .dropdown {\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            border: 2px solid #C8C8C8;\r\n");
      out.write("        }\r\n");
      out.write("        .img-button {\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("            border: 2px solid #C8C8C8;\r\n");
      out.write("        }\r\n");
      out.write("        .back-button {\r\n");
      out.write("            background-color: #FF9797;\r\n");
      out.write("            border-color: #FF3E3E;\r\n");
      out.write("            color: white;\r\n");
      out.write("        }\r\n");
      out.write("        .back-button:hover {\r\n");
      out.write("            background-color: #ff4646;\r\n");
      out.write("            border-color: #ff0000;\r\n");
      out.write("            color: white;\r\n");
      out.write("        } \r\n");
      out.write("        .submit-button {\r\n");
      out.write("            border: 2px solid #C8C8C8;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* 반응형 스타일 */\r\n");
      out.write("        @media (max-width: 768px) {\r\n");
      out.write("            .wrap {\r\n");
      out.write("                width: 90%; /* 화면 좌우에 5%씩 여백 */\r\n");
      out.write("                margin: 0 auto;\r\n");
      out.write("                border-radius: 10px;\r\n");
      out.write("                box-shadow: 1px 1px 10px 1px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            }\r\n");
      out.write("            #header {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border-radius: 0;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("                box-shadow: none;\r\n");
      out.write("            }\r\n");
      out.write("            .button-container {\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("            }\r\n");
      out.write("            .left-buttons {\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @media (max-width: 576px) {\r\n");
      out.write("            .wrap {\r\n");
      out.write("                width: 95%; /* 작은 화면에서 더 많은 여백을 추가 */\r\n");
      out.write("                margin: 0 auto;\r\n");
      out.write("            }\r\n");
      out.write("            .title-container {\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("                align-items: flex-start;\r\n");
      out.write("            }\r\n");
      out.write("            .title-container label {\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            .button-container {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("            }\r\n");
      out.write("            .left-buttons {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("            }\r\n");
      out.write("            .right-buttons {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: space-between;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"header\"></div>\r\n");
      out.write("    <div class=\"wrap\">\r\n");
      out.write("        <form action=\"board_create.bd\" method=\"post\">\r\n");
      out.write("            <!-- 제목 -->\r\n");
      out.write("            <div class=\"mb-3 title-container\">\r\n");
      out.write("                <label for=\"title\" class=\"form-label\" style=\"font-weight: bold;\">제목</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"title\" name=\"title\" placeholder=\"제목을 입력하세요\" style=\"border: none;\" required>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <!-- 내용 -->\r\n");
      out.write("            <div class=\"mb-3\">\r\n");
      out.write("                <label for=\"content\" class=\"form-label\" style=\"font-weight: bold;\">내용</label>\r\n");
      out.write("                <textarea class=\"form-control\" id=\"content\" name=\"content\" rows=\"10\" placeholder=\"내용을 입력하세요\" style=\"border: none; resize: none; height: 450px;\" required></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("            <hr>\r\n");
      out.write("            <!-- 버튼 섹션 -->\r\n");
      out.write("            <div class=\"button-container\">\r\n");
      out.write("                <div class=\"left-buttons\">\r\n");
      out.write("                    <button type=\"button\" class=\"img-button btn btn-light\">사진추가</button>\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- 유형추가: 드롭다운 -->\r\n");
      out.write("                    <div class=\"dropdown\">\r\n");
      out.write("                        <button class=\"btn btn-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                            유형선택\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\" onclick=\"selectType('QnA')\">QnA</a></li>\r\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\" onclick=\"selectType('여행추천')\">여행추천</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"right-buttons\">\r\n");
      out.write("                    <button type=\"button\" class=\"back-button btn\" onclick=\"goBack()\">뒤로가기</button>\r\n");
      out.write("                    <button type=\"submit\" class=\"submit-button btn btn-light\">작성완료</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        // 게시글 제출 시 확인 메시지\r\n");
      out.write("        document.querySelector('form').addEventListener('submit', function(e) {\r\n");
      out.write("            e.preventDefault(); // 기본 제출 방지\r\n");
      out.write("            alert('게시글이 작성되었습니다!');\r\n");
      out.write("            // 여기서 서버로 데이터를 전송하는 로직을 추가할 수 있습니다.\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        // 유형 선택 시 버튼 텍스트 변경\r\n");
      out.write("        function selectType(type) {\r\n");
      out.write("            document.getElementById('dropdownMenuButton').innerText = type;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        // 뒤로 가기 버튼 클릭 시 이전 페이지로 이동\r\n");
      out.write("        function goBack() {\r\n");
      out.write("            window.history.back();\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
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