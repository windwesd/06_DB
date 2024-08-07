package com.rabbitshop;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet
public class ProductServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
        response.getWriter().append("<html><body>");
        response.getWriter().append("<h1>토끼용품 목록</h1>");
        response.getWriter().append("<ul>");
        response.getWriter().append("<li>토끼 사료 - ₩10,000</li>");
        response.getWriter().append("<li>토끼 집 - ₩20,000</li>");
        response.getWriter().append("<li>토끼 장난감 - ₩5,000</li>");
        response.getWriter().append("</ul>");
        response.getWriter().append("</body></html>");
    
	}
}
