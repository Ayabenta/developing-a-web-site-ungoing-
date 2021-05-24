package com.octest.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form2
 */
@WebServlet("/Form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/Formulaire2.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String q1 = "1- est-ce que vous avez l'hypomaniaques (symptômes similaires mais moins intenses que lors d’un épisode dit « maniaque »)  ?";
	    String q2 = "2- est-ce que vous la maniaques sans symptômes psychotiques?";
	    String q3 = "3- est-ce que vous avez la dépressions sévères sans symptômes psychotique ?";
	    String q4 = "4- est-ce que vous avez  dépressions sévères avec des symptômes psychotiques ?";
	    String q5 = "5- est-ce que vous êtes agressif(ve) et facilement irrité(é)?";
	    String q6 = "6- est-ce que vous avex des  idées suicidaires ?";
	    String q7 = "7- sont-il fréquentes ?";
	    String q8 = "8- est-ce que vous avez la somnolence ?";
		String r1 = request.getParameter("F2.1");
		String r2 = request.getParameter("F2.2");
		String r3 = request.getParameter("F2.3");
		String r4 = request.getParameter("F2.4");
		String r5 = request.getParameter("F2.5");
		String r6 = request.getParameter("F2.6");
		String r7 = request.getParameter("F2.7");
		String r8 = request.getParameter("F2.8");
		String[] questions = new String[] {q1,q2,q3,q4,q5,q6,q7,q8};
		String[] responses = new String[] {r1,r2,r3,r4,r5,r6,r7,r8};
		String [][] Formlist2 = new String [8][8];
		int i = 0 ;
		for (i=0 ;i<8;i++) {
			Formlist2 [i][0] = questions[i];
			Formlist2 [i][1] = responses[i];
				}
		RequestDispatcher dispatcher = null;
	    String val = request.getParameter("validation");
	    if (val.equals("valider" )) {
	    	dispatcher = request.getRequestDispatcher("/WEB-INF/end.jsp");
	     }
	    dispatcher.forward(request, response);
	}

}
