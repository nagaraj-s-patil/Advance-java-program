package servlet.lifecycle.demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/on-click")
public class DemoServlet  extends GenericServlet{

	public DemoServlet() {
		System.out.println("object Created");
	}
	@Override
	public void init() throws ServletException {
	
		System.out.println("inti() is called !");
	}
	@Override
	public void destroy() {
		System.out.println("destroy() is called !");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service() is called");
	}
}
