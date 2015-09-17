package br.com.aprendendo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MeuServlet
 */
@WebServlet("/MeuServlet")
public class MeuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("name1");
		String sobrenome = request.getParameter("name2");
		
		String resposta = "<html><body>Nome: " + nome + "<br />Sobrenome: " + sobrenome + "</body></html>";
		response.getWriter().append(resposta);
	}

}
