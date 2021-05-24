package com.octest.servlets;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class form
 */
@WebServlet("/form")
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/Formulaire.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String q1 = "1- est-ce que vous vous lavez les mains à répétition, parfois même au point de se blesser ";
	    String q2 = "2- est-ce que vous prennez plusieurs douches chaque jour ?";
	    String q3 = "3- est-ce que vous vous considerer perfectionniste ? ";
	    String q4 = "4- est-ce que vous faites le ménage sans arrêt ?";
	    String q5 = "5- est-ce que vous vous assurez sans cesse d'avoir bien éteint les appareils électriques ? ";
	    String q6 = "6- est-ce que vous vérifiez plusieurs fois que les portes sont verrouillées avant de sortir ou d’aller se coucher ?";
	    String q7 = "7- est-ce que vous consacrez énormément de temps à perfectionner l’organisation et le rangement du contenu des armoires ?";
	    String q8 = "8- est-ce que vous vous obliger à suivre chaque jour le même chemin pour se rendre au travail, et traverser la rue exactement au même endroit ?";
		String r1 = request.getParameter("F1.1");
		String r2 = request.getParameter("F1.2");
		String r3 = request.getParameter("F1.3");
		String r4 = request.getParameter("F1.4");
		String r5 = request.getParameter("F1.5");
		String r6 = request.getParameter("F1.6");
		String r7 = request.getParameter("F1.7");
		String r8 = request.getParameter("F1.8");
		String[] questions = new String[] {q1,q2,q3,q4,q5,q6,q7,q8};
		String[] responses = new String[] {r1,r2,r3,r4,r5,r6,r7,r8};
		String [][] Formlist1 = new String [8][8];
		int i = 0 ;
		for (i=0 ;i<8;i++) {
			Formlist1 [i][0] = questions[i];
			Formlist1 [i][1] = responses[i];
				}
		RequestDispatcher dispatcher = null;
	    String val = request.getParameter("validation");
	    if (val.equals("valider" )) {
	    	dispatcher = request.getRequestDispatcher("/WEB-INF/end.jsp");
	     }
	    dispatcher.forward(request, response);
		
		

	}

}
