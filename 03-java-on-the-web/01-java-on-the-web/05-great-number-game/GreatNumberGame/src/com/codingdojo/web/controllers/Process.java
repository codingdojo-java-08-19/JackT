package com.codingdojo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Process
 */
@WebServlet("/Process")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Process() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		if(request.getParameter("gnum")!=null) {
			Integer gnum = Integer.parseInt(request.getParameter("gnum"));
			Integer rnum = (Integer) session.getAttribute("rnum");			
			session.setAttribute("firstguess", false);
		
			if(rnum.equals(gnum)) {
				System.out.println("they be equal " + rnum);
				session.setAttribute("color", "green");
				session.setAttribute("phrase", gnum+" was the number!");
				session.setAttribute("incorrect", false);
			}
			else if (rnum.intValue()<gnum.intValue()){
				System.out.println("they be not so equal" + gnum);
				session.setAttribute("color", "red");
				session.setAttribute("phrase", gnum+" was to high!");
				session.setAttribute("incorrect", true);
			}
			else {
				System.out.println("they be not so equal" + gnum);
				session.setAttribute("color", "red");
				session.setAttribute("phrase", gnum+" was to low!");
				session.setAttribute("incorrect", true);
			}
		}
		System.out.println(request.getParameter("reset")!=null);
		if(request.getParameter("reset") != null) {
			session.setAttribute("rnum", null);
			System.out.println(session.getAttribute("rnum"));
		}
		response.sendRedirect("/GreatNumberGame/Game");
			
		
		
	}

}
