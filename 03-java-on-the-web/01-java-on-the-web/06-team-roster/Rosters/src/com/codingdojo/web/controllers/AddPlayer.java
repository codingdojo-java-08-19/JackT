package com.codingdojo.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codingdojo.web.models.Player;
import com.codingdojo.web.models.Roster;
import com.codingdojo.web.models.Team;

/**
 * Servlet implementation class AddPlayer
 */
@WebServlet("/AddPlayer")
public class AddPlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPlayer() {
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
		Player player = new Player();
		player.setFname(request.getParameter("fname"));
		player.setLname(request.getParameter("lname"));
		player.setAge(Integer.parseInt(request.getParameter("age")));
		System.out.println(player);
		Team team = (Team) session.getAttribute("team");
		System.out.println(team);
		team.addPlayer(player);
		session.setAttribute("team", team);
		
		String path = "/Rosters/Players?id="+team.getId();
		System.out.println(path);
		response.sendRedirect(path);
	}

}
