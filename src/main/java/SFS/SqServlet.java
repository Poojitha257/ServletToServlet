package SFS;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet  extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//*********** cookies *********//
	int k=0;
Cookie cookies[]= req.getCookies();
for (Cookie c : cookies) {
	if(c.getName().equals("k"))
	{
		k=Integer.parseInt(c.getValue());
	}
}
	k=k*k;
	resp.getWriter().print("Result is " + k);
System.out.println("sq called");
	
	
	
	//*********	session management *********//
	
//	HttpSession session=req.getSession();
//	int k=(int)session.getAttribute("k");
//	k=k*k;
//	resp.getWriter().print("Result is " + k);
//	System.out.println("sq called");
	
	//******send redirect****//
	
//	int k=Integer.parseInt(req.getParameter("k"));
//	resp.getWriter().print("sq is calling and Result is " + k);
	
	//******** Request dispatcher******//
	
	//int k=(int)req.getAttribute("k");
//	k=k*k;
//	resp.getWriter().print("calling servlet from  another servlet " + " Result is " + k);


}
}
