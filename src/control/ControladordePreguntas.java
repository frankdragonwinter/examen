package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Estudiante;
import modelo.Examen;
import bdatos.AdminDB;

/**
 * Servlet implementation class ControladordePreguntas
 */
@WebServlet("/controladordepreguntas")
public class ControladordePreguntas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladordePreguntas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sesion= request.getSession();
		Examen examen=(Examen) sesion.getAttribute("examen");
		
		String respuestaest1= request.getParameter("respuesta1");
		examen.setRespuestaest1(respuestaest1);
		String respuestaest2= request.getParameter("respuesta2");
		examen.setRespuestaest2(respuestaest2);
		String respuestaest3= request.getParameter("respuesta3");
		examen.setRespuestaest3(respuestaest3);
		String respuestaest4= request.getParameter("respuesta4");
		examen.setRespuestaest4(respuestaest4);
		String respuestaest5= request.getParameter("respuesta5");
		examen.setRespuestaest5(respuestaest5);
		String respuestaest6= request.getParameter("respuesta6");
		examen.setRespuestaest6(respuestaest6);
		String respuestaest7= request.getParameter("respuesta7");
		examen.setRespuestaest7(respuestaest7);
		String respuestaest8= request.getParameter("respuesta8");
		examen.setRespuestaest8(respuestaest8);
		String respuestaest9= request.getParameter("respuesta9");
		examen.setRespuestaest9(respuestaest9);
		String respuestaest10= request.getParameter("respuesta10");
		examen.setRespuestaest10(respuestaest10);
		String respuestaest11= request.getParameter("respuesta11");
		examen.setRespuestaest11(respuestaest11);
		String respuestaest12= request.getParameter("respuesta12");
		examen.setRespuestaest12(respuestaest12);
		String respuestaest13= request.getParameter("respuesta13");
		examen.setRespuestaest13(respuestaest13);
		String respuestaest14= request.getParameter("respuesta14");
		examen.setRespuestaest14(respuestaest14);
		String respuestaest15= request.getParameter("respuesta15");
		examen.setRespuestaest15(respuestaest15);
	
		
		
		String rc1= examen.getRespuesta1();
		String rc2= examen.getRespuesta2();
		String rc3= examen.getRespuesta3();
		String rc4= examen.getRespuesta4();
		String rc5= examen.getRespuesta5();
		String rc6= examen.getRespuesta6();
		String rc7= examen.getRespuesta7();
		String rc8= examen.getRespuesta8();
		String rc9= examen.getRespuesta9();
		String rc10= examen.getRespuesta10();
		String rc11= examen.getRespuesta11();
		String rc12= examen.getRespuesta12();
		String rc13= examen.getRespuesta13();
		String rc14= examen.getRespuesta14();
		String rc15= examen.getRespuesta15();
		
		System.out.println("Respuesta correcta BD: "+rc1);
	 
		String[] respuestascorrectas={rc1,rc2,rc3,rc4,rc5,rc6,rc7,rc8,rc9,rc10,rc11,rc12,rc13,rc14,rc15};
		String[] respuestasdelestudiante={respuestaest1,respuestaest2,respuestaest3,respuestaest4,respuestaest5,respuestaest6,respuestaest7,respuestaest8,respuestaest9,respuestaest10,respuestaest11,respuestaest12,respuestaest13,respuestaest14,respuestaest15};
		
		Estudiante estudiante=(Estudiante) sesion.getAttribute("estudiante");
		sesion.setAttribute("examen", examen);
		//Examen examen=(Examen) sesion.getAttribute("examen");
		examen.calificarExamen(respuestascorrectas,respuestasdelestudiante,estudiante,examen);
		
		
		
		
		RequestDispatcher despachador= request.getRequestDispatcher("calificacion.jsp");
		despachador.forward(request, response); 
	}

}
