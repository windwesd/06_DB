<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="edu.kh.member.service.MemberService, edu.kh.member.service.MemberServiceImpl" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>

<%
    int index = Integer.parseInt(request.getParameter("index"));
    MemberService service = new MemberServiceImpl();
    boolean result = service.deleteMember(index);

    HttpSession session = request.getSession();
    String message = null;

    if (result) {
        message = "탈퇴 되었습니다";
    } else {
        message = "탈퇴 실패";
    }

    session.setAttribute("message", message);
    response.sendRedirect("/selectList");
%>
