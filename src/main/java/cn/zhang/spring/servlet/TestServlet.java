package cn.zhang.spring.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import cn.zhang.spring.beans.Person;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc = getServletContext();
		ApplicationContext ctx = (ApplicationContext) sc.getAttribute("ApplicationContext");
		Person p = ctx.getBean(Person.class);
		p.show();
	}

}
