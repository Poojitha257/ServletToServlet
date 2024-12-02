package SFS;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add") 
public class AddingServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		
		//********* cookies *********//
		Cookie cookie = new Cookie("k", k + "");
		resp.addCookie(cookie);
		resp.sendRedirect("sq");
		
		
		
		//*********  session management ******//
//		HttpSession session =req.getSession();
//		session.setAttribute("k", k);
//		resp.sendRedirect("sq");
		
		//***** send redirect******//
//		resp.sendRedirect("sq?k="+k);  // this is url Redirecting
		//********Request dispatcher*****//
//		req.setAttribute("k", k);
//	req.getRequestDispatcher("sq").forward(req, resp);;

	}
	}
