package Controlador;

import Datos.ProfesoresDAO;
import HAHP.Profesores;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/ServletProfesores")
public class ServletProfesores extends HttpServlet {
        private static final long serialVersionUID = 1L;
        @Override
        protected void doGet(HttpServletRequest hsreq, HttpServletResponse hsres)
                throws ServletException, IOException {
            List<Profesores> profesores = new ProfesoresDAO().listar();
            System.out.println("profesores = " + profesores);
            hsreq.setAttribute("profesores", profesores);
            hsreq.getRequestDispatcher("profesores.jsp").forward(hsreq, hsres);
        }
}
