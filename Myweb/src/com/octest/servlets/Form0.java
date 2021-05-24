package com.octest.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form0
 */
@WebServlet("/Form0")
public class Form0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form0() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/Formulaire0.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String q1 = "1- est-ce que vous sentez une déréalisation (sentiments d’irréalité) ou dépersonnalisation (être détaché de soi) ?";
	    String q2 = "2- est-ce que vous avez peur de mourir ? ";
	    String q3 = "3- est-ce que vous vous considerer perfectionniste ?";
	    String q4 = "4- est-ce que vous avez peur de perdre le contrôle de soi ou de « devenir fou » ?";
	    String q5 = "5- est-ce que vous avez  une sensation de vertige, d’instabilité, de tête vide ou impression d’évanouissement de temps en temps ? ";
	    String q6 = "6- est-ce que vous souffrez du tremblements ou secousses musculaires ?";
	    String q7 = "7- est-ce que vous avez des douleurs ou gêne thoracique ?";
	    String q8 = "8- est-ce que vou avez des palpitations, battements de cœur sensibles ou accélération du rythme cardiaque ?";
		String r1 = request.getParameter("F0.1");
		String r2 = request.getParameter("F0.2");
		String r3 = request.getParameter("F0.3");
		String r4 = request.getParameter("F0.4");
		String r5 = request.getParameter("F0.5");
		String r6 = request.getParameter("F0.6");
		String r7 = request.getParameter("F0.7");
		String r8 = request.getParameter("F0.8");
		String[] questions = new String[] {q1,q2,q3,q4,q5,q6,q7,q8};
		String[] responses = new String[] {r1,r2,r3,r4,r5,r6,r7,r8};
		String [][] Formlist0 = new String [8][8];
		int i = 0 ;
		for (i=0 ;i<8;i++) {
			Formlist0 [i][0] = questions[i];
			Formlist0 [i][1] = responses[i];
				}
		RequestDispatcher dispatcher = null;
	    String val = request.getParameter("validation");
	    if (val.equals("valider" )) {
	    	dispatcher = request.getRequestDispatcher("/WEB-INF/end.jsp");
	     }
	    dispatcher.forward(request, response);
		
	}

}
