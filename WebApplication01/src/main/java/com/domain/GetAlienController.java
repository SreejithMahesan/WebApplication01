package com.domain;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.dao.AlienDao;


public class GetAlienController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		AlienDao dao = new AlienDao();
		Alien a1 = dao.getAlien(aid);
		
		RequestDispatcher  rd = request.getRequestDispatcher("ShowAlien.jsp");
		rd.forward(request, response);
	}

	

}
