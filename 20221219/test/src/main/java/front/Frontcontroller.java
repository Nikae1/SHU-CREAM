package front;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.ActionBean;
import Note.Note;

/**
 * Servlet implementation class Frontcontroller
 */
@WebServlet({"/Join", "/Login", "/Logout","/NoteReg","/JJimReg"})
public class Frontcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Frontcontroller() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String jobCode = request.getRequestURI().substring(request.getContextPath().length() + 1);
		ActionBean action;
		
		/* 게시물을 찾기위한 */
		if(jobCode.equals("NoteSelect")) {
			action = new Note().backcontroller(22);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String jobCode = request.getRequestURI().substring(request.getContextPath().length() + 1);
		ActionBean action;
		
		
		if(jobCode.equals("Join")) {
//			auth = new Auth(request);
//			action = auth.backController(1);
		}else if(jobCode.equals("Login")) {
//			auth = new Auth(request);
//			action = auth.backController(2);
		}else if(jobCode.equals("NoteReg")) {
			action = new Note().backcontroller(21);
		}
		
		
		
		
	}

}
