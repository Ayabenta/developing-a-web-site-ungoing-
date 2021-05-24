package com.octest.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Myappservlet")
public class Myappservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Myappservlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 this.getServletContext().getRequestDispatcher("/WEB-INF/patient.jsp").forward(request, response);
		 
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String seekness = request.getParameter("maladie");
		String gmail = request.getParameter("Gmail");
		RequestDispatcher dispatcher = null;
		 // if (gmail == null) {
	        	//System.out.println("Veuillez taper votre email pour qu'on puisse vous contacter");	
	        	//dispatcher = request.getRequestDispatcher("/WEB-INF/patient.jsp");
		//  }
		  //else {
			  switch (seekness) {
			  case "Troubles anxieux. Phobie. Anxiété généralisée. Trouble panique et agoraphobie":	  
	        	  dispatcher  = request.getRequestDispatcher("/WEB-INF/Formulaire0.jsp");
	              break;
	          case "Troubles obsessionnel-compulsif (TOC)":
	    	      dispatcher  = request.getRequestDispatcher("/WEB-INF/Formulaire.jsp");
	              break;
	          case "Troubles de l'humeur. Dépression. Troubles bipolaires":
	    	      dispatcher  = request.getRequestDispatcher("/WEB-INF/Formulaire2.jsp");
	              break;
	    
		      default:
			     dispatcher = request.getRequestDispatcher("/WEB-INF/patient.jsp");
		      break;
		}
	//	  }
	    dispatcher.forward(request, response);
	   
	   
	}

}
