/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2016-05-16 10:33:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(9);
    _jspx_dependants.put("file:/Users/nhn/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar", Long.valueOf(1380624896000L));
    _jspx_dependants.put("/WEB-INF/include/head.jspf", Long.valueOf(1463321226000L));
    _jspx_dependants.put("/WEB-INF/include/tags.jspf", Long.valueOf(1463314056000L));
    _jspx_dependants.put("/WEB-INF/include/footer.jspf", Long.valueOf(1463316135000L));
    _jspx_dependants.put("/WEB-INF/include/navigation.jspf", Long.valueOf(1463394782000L));
    _jspx_dependants.put("file:/Users/nhn/.m2/repository/org/springframework/spring-webmvc/4.2.5.RELEASE/spring-webmvc-4.2.5.RELEASE.jar", Long.valueOf(1459257722000L));
    _jspx_dependants.put("jar:file:/Users/nhn/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/Users/nhn/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/Users/nhn/.m2/repository/org/springframework/spring-webmvc/4.2.5.RELEASE/spring-webmvc-4.2.5.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1456330292000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html5/loose.dtd\">\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, minimum-scale=1.0\">\n");
      out.write("<title>Issue Tracking System</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/dialog-polyfill/0.4.3/dialog-polyfill.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://code.getmdl.io/1.1.3/material.blue_grey-orange.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/styles.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/tinymce.css\">");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"issues issues--wrap mdl-layout mdl-js-layout has-drawer is-upgraded\">\n");
      out.write("\t\t");
      out.write("\n");
      out.write("<header class=\"mdl-layout__header mdl-layout__header--waterfall\">\n");
      out.write("\t<div class=\"mdl-layout__header-row\">\n");
      out.write("\t\t<!-- Title -->\n");
      out.write("\t\t<span class=\"mdl-layout-title\">javajigi/slipp</span>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Tabs -->\n");
      out.write("\t<div class=\"mdl-layout__tab-bar mdl-js-ripple-effect\">\n");
      out.write("\t\t<a href=\"https://github.com/javajigi/slipp\" class=\"mdl-layout__tab\">Code</a>\n");
      out.write("\t\t<a href=\"#\" class=\"mdl-layout__tab is-active\"> \n");
      out.write("\t\t\t<span class=\"mdl-badge\" data-badge=\"11\">Issues</span>\n");
      out.write("\t\t</a> \n");
      out.write("\t\t<a href=\"https://github.com/javajigi/slipp/pulls\" class=\"mdl-layout__tab\"> \n");
      out.write("\t\t\t<span class=\"mdl-badge\" data-badge=\"0\">Pull requests</span>\n");
      out.write("\t\t</a> \n");
      out.write("\t\t<a href=\"https://github.com/javajigi/slipp/wiki\" class=\"mdl-layout__tab\">Wiki</a> \n");
      out.write("\t\t<a href=\"https://github.com/javajigi/slipp/pulse\" class=\"mdl-layout__tab\">Pulse</a> \n");
      out.write("\t\t<a href=\"https://github.com/javajigi/slipp/graphs\" class=\"mdl-layout__tab\">Graphs</a>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<div class=\"mdl-layout__drawer\">\n");
      out.write("\t<span class=\"mdl-layout-title\">GitHub</span>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t\t<main class=\"mdl-layout__content\">\n");
      out.write("\t\t<div class=\"issues__posts mdl-grid\">\n");
      out.write("\t\t\t<div class=\"issues-card-wide mdl-card mdl-shadow--2dp\">\n");
      out.write("\t\t\t\t<div class=\"mdl-card__title mdl-shadow--2dp\">\n");
      out.write("\t\t\t\t\t<h2 class=\"mdl-card__title-text mdl-color-text--grey-800\">Open\n");
      out.write("\t\t\t\t\t\tIssues</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<button\n");
      out.write("\t\t\t\t\tclass=\"mdl-button mdl-js-button mdl-button--fab mdl-js-ripple-effect mdl-button--colored show-modal\">\n");
      out.write("\t\t\t\t\t<i class=\"material-icons\">add</i>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<div class=\"mdl-card__supporting-text\">\n");
      out.write("\t\t\t\t\t<ul class=\"issue-list mdl-list\">\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>spring boot로 전환 작업 진행해\n");
      out.write("\t\t\t\t\t\t\t\t\t\t본다.</strong></a> <span class=\"mdl-list__item-sub-title\">#259 opened\n");
      out.write("\t\t\t\t\t\t\t\t\t<relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"0\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>질문 간에 답변을 이동할 수 있어야\n");
      out.write("\t\t\t\t\t\t\t\t\t\t한다.</strong></a> <span class=\"mdl-list__item-sub-title\">#259 opened\n");
      out.write("\t\t\t\t\t\t\t\t\t<relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"0\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>페이스북의 경우 댓글의 댓글을 가져올 수\n");
      out.write("\t\t\t\t\t\t\t\t\t\t있도록 한다.</strong></a> <span class=\"mdl-list__item-sub-title\">#259\n");
      out.write("\t\t\t\t\t\t\t\t\topened <relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"0\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>[버그] 화면 스크롤 시 오른쪽\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\"태그추가\" 버튼 크기 자동 변경</strong></a> <span class=\"mdl-list__item-sub-title\">#259\n");
      out.write("\t\t\t\t\t\t\t\t\topened <relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"3\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>사용자가 수정을 하는 경우 수정된 시간이\n");
      out.write("\t\t\t\t\t\t\t\t\t\t반영되지 않는다.</strong></a> <span class=\"mdl-list__item-sub-title\">#259\n");
      out.write("\t\t\t\t\t\t\t\t\topened <relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"0\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>본인이 누른 좋아요와 싫어요를 인지할 수\n");
      out.write("\t\t\t\t\t\t\t\t\t\t있도록 한다.</strong></a> <span class=\"mdl-list__item-sub-title\">#259\n");
      out.write("\t\t\t\t\t\t\t\t\topened <relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"1\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>페북 로그인 사용자의 경우 페북에 바로\n");
      out.write("\t\t\t\t\t\t\t\t\t\t댓글 달 수 있도록 한다.</strong></a> <span class=\"mdl-list__item-sub-title\">#259\n");
      out.write("\t\t\t\t\t\t\t\t\topened <relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"0\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>질문 작성 중 임시저장 기능이 있으면\n");
      out.write("\t\t\t\t\t\t\t\t\t\t좋겠어요</strong></a> <span class=\"mdl-list__item-sub-title\">#259 opened\n");
      out.write("\t\t\t\t\t\t\t\t\t<relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"1\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>원 글에도 공감하기를 할 수 있도록\n");
      out.write("\t\t\t\t\t\t\t\t\t\t한다.</strong></a> <span class=\"mdl-list__item-sub-title\">#259 opened\n");
      out.write("\t\t\t\t\t\t\t\t\t<relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"5\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>자신이 공감한 글을 볼 수 있도록\n");
      out.write("\t\t\t\t\t\t\t\t\t\t해주세요</strong></a> <span class=\"mdl-list__item-sub-title\">#259 opened\n");
      out.write("\t\t\t\t\t\t\t\t\t<relative-time datetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"4\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"mdl-list__item mdl-list__item--two-line\"><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"mdl-list__item-primary-content\"> <a\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi\"> <img\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"mdl-list__item-avatar\" height=\"48\" width=\"48\"\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://avatars2.githubusercontent.com/u/520500?v=3&amp;s=96\"\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"@javajigi\">\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"issue.html\"><strong>트랙백이 가능하도록 한다.</strong></a> <span\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"mdl-list__item-sub-title\">#259 opened <relative-time\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdatetime=\"2016-01-12T08:08:59Z\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle=\"2016년 1월 12일 오후 5:08 GMT+9\">on 12 Jan</relative-time>\n");
      out.write("\t\t\t\t\t\t\t\t\tby <a\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://github.com/javajigi/slipp/issues?q=is%3Aissue+is%3Aopen+author%3Ajavajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\taria-label=\"View all issues opened by javajigi\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"tooltipped tooltipped-s muted-link\">javajigi</a></span>\n");
      out.write("\t\t\t\t\t\t</span> </span> <span class=\"mdl-list__item-secondary-content\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"material-icons mdl-badge mdl-badge--overlap\"\n");
      out.write("\t\t\t\t\t\t\t\t\tdata-badge=\"0\">comment</div>\n");
      out.write("\t\t\t\t\t\t</span></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t");
      out.write("<footer class=\"mdl-mini-footer\">\n");
      out.write("\t<div class=\"mdl-mini-footer--left-section\">\n");
      out.write("\t\t<div class=\"mdl-logo mdl-color-text--grey-600\">\n");
      out.write("\t\t\tProudly powered by <a href=\"https://github.com/Byeol\">Byeol</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\t\t</main>\n");
      out.write("\t\t<div class=\"mdl-layout__obfuscator\"></div>\n");
      out.write("\t</div>\n");
      out.write("\t<dialog class=\"mdl-dialog new-issue\">\n");
      out.write("\t<div class=\"pr\">\n");
      out.write("\t\t<i class=\"material-icons\">create</i>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"mdl-dialog__content\">\n");
      out.write("\t\t<form action=\"#\">\n");
      out.write("\t\t\t<div class=\"mdl-textfield mdl-js-textfield\">\n");
      out.write("\t\t\t\t<input class=\"mdl-textfield__input\" type=\"text\"\n");
      out.write("\t\t\t\t\tid=\"new-issue__title\"> <label class=\"mdl-textfield__label\"\n");
      out.write("\t\t\t\t\tfor=\"new-issue__title\"><strong>Title</strong></label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<textarea rows=20 class=\"mdl-textfield__input\"\n");
      out.write("\t\t\t\tid=\"new-issue__comment\"></textarea>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"mdl-dialog__actions mdl-dialog__actions\">\n");
      out.write("\t\t<button type=\"button\" class=\"mdl-button close\">Submit new\n");
      out.write("\t\t\tissue</button>\n");
      out.write("\t</div>\n");
      out.write("\t</dialog>\n");
      out.write("\t<script src=\"https://code.getmdl.io/1.1.3/material.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/dialog-polyfill/0.4.3/dialog-polyfill.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdn.tinymce.com/4/tinymce.min.js\"></script>\n");
      out.write("\t<script src=\"/resources/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /WEB-INF/include/navigation.jspf(22,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.user}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        \t<a href=\"/users/logout\" class=\"mdl-layout__tab\" role=\"button\">Logout</a>\n");
        out.write("        \t<a href=\"/users/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("/edit\" class=\"mdl-layout__tab\" role=\"button\">Update Account</a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        \t<a href=\"/users/login\" class=\"mdl-layout__tab\" role=\"button\">Login</a>\n");
        out.write("        \t<a href=\"/users/new\" class=\"mdl-layout__tab\" role=\"button\">Sign Up</a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }
}
