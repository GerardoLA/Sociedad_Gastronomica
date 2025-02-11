package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.LoginModelo;
import modelo.Usuario;

/**
 * Servlet implementation class Inicio
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inicio() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		
		LoginModelo lm = new LoginModelo();
		Usuario usuario = lm.getUsuarioPorId(id);
		HttpSession session = request.getSession();
		
		if (usuario != null && password.equals(usuario.getPassword())) {
		    session.setAttribute("usuario", usuario);
		    response.sendRedirect("UsuarioFactura.jsp");
		} else {
		    request.setAttribute("error", "Usuario o contraseña incorrectos");
		    request.getRequestDispatcher("Login.jsp").forward(request, response);
		}
	}

}
