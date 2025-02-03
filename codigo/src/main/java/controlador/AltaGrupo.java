package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Grupo;
import modelo.GrupoModelo;

/**
 * Servlet implementation class AltaGrupo
 */
@WebServlet("/AltaGrupo")
public class AltaGrupo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AltaGrupo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GrupoModelo modGrupo = new GrupoModelo();
		request.getRequestDispatcher("AltaGrupo.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		GrupoModelo modGrupo = new GrupoModelo();
		Grupo grupo = new Grupo();
		grupo.setId((Integer.parseInt(request.getParameter("id"))));
		grupo.setNombre(request.getParameter("nombre"));
		modGrupo.crearGrupo(grupo);
		request.getRequestDispatcher("VerGrupos").forward(request, response);
	}

}
