package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bdatos.AdminDB;
import modelo.Estudiante;
import modelo.Examen;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        
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
	
		
		
		Examen examen=new Examen();
		HttpSession sesion= request.getSession();
		Estudiante estudiante= new Estudiante();
		
		
		String nombre=request.getParameter("nombre");
		String apellidopaterno=request.getParameter("apellidopaterno");
		String apellidomaterno=request.getParameter("apellidomaterno");
		String matricula=request.getParameter("matricula");
		estudiante.setNombre(nombre);
		estudiante.setApellidoPaterno(apellidopaterno);
		estudiante.setApellidoMaterno(apellidomaterno);
		estudiante.setMatricula(matricula);
		
		
			
		
		AdminDB admin=new AdminDB(); 
		 admin.conectate(); 
		 admin.Traerpreguntas1();
		 
		 examen.setPregunta1(admin.getPregunta1());
		 examen.setOpciona1(admin.getOpciona1());
		 examen.setOpcionb1(admin.getOpcionb1());
		 examen.setOpcionc1(admin.getOpcionc1());
		 examen.setOpciond1(admin.getOpciond1());
		 examen.setRespuesta1(admin.getRespuesta1());
		 
		 
		 examen.setPregunta2(admin.getPregunta2());
		 examen.setOpciona2(admin.getOpciona2());
		 examen.setOpcionb2(admin.getOpcionb2());
		 examen.setOpcionc2(admin.getOpcionc2());
		 examen.setOpciond2(admin.getOpciond2());
		 examen.setRespuesta2(admin.getRespuesta2());
		 
		 examen.setPregunta3(admin.getPregunta3());
		 examen.setOpciona3(admin.getOpciona3());
		 examen.setOpcionb3(admin.getOpcionb3());
		 examen.setOpcionc3(admin.getOpcionc3());
		 examen.setOpciond3(admin.getOpciond3());
		 examen.setRespuesta3(admin.getRespuesta3());
		 
		 examen.setPregunta4(admin.getPregunta4());
		 examen.setOpciona4(admin.getOpciona4());
		 examen.setOpcionb4(admin.getOpcionb4());
		 examen.setOpcionc4(admin.getOpcionc4());
		 examen.setOpciond4(admin.getOpciond4());
		 examen.setRespuesta4(admin.getRespuesta4());
		 
		 examen.setPregunta5(admin.getPregunta5());
		 examen.setOpciona5(admin.getOpciona5());
		 examen.setOpcionb5(admin.getOpcionb5());
		 examen.setOpcionc5(admin.getOpcionc5());
		 examen.setOpciond5(admin.getOpciond5());
		 examen.setRespuesta5(admin.getRespuesta5());
		 
		 examen.setPregunta6(admin.getPregunta6());
		 examen.setOpciona6(admin.getOpciona6());
		 examen.setOpcionb6(admin.getOpcionb6());
		 examen.setOpcionc6(admin.getOpcionc6());
		 examen.setOpciond6(admin.getOpciond6());
		 examen.setRespuesta6(admin.getRespuesta6());
		 
		 examen.setPregunta7(admin.getPregunta7());
		 examen.setOpciona7(admin.getOpciona7());
		 examen.setOpcionb7(admin.getOpcionb7());
		 examen.setOpcionc7(admin.getOpcionc7());
		 examen.setOpciond7(admin.getOpciond7());
		 examen.setRespuesta7(admin.getRespuesta7());
		 
		 examen.setPregunta8(admin.getPregunta8());
		 examen.setOpciona8(admin.getOpciona8());
		 examen.setOpcionb8(admin.getOpcionb8());
		 examen.setOpcionc8(admin.getOpcionc8());
		 examen.setOpciond8(admin.getOpciond8());
		 examen.setRespuesta8(admin.getRespuesta8());
		 
		 examen.setPregunta9(admin.getPregunta9());
		 examen.setOpciona9(admin.getOpciona9());
		 examen.setOpcionb9(admin.getOpcionb9());
		 examen.setOpcionc9(admin.getOpcionc9());
		 examen.setOpciond9(admin.getOpciond9());
		 examen.setRespuesta9(admin.getRespuesta9());
		 
		 examen.setPregunta10(admin.getPregunta10());
		 examen.setOpciona10(admin.getOpciona10());
		 examen.setOpcionb10(admin.getOpcionb10());
		 examen.setOpcionc10(admin.getOpcionc10());
		 examen.setOpciond10(admin.getOpciond10());
		 examen.setRespuesta10(admin.getRespuesta10());
		 
		 examen.setPregunta11(admin.getPregunta11());
		 examen.setOpciona11(admin.getOpciona11());
		 examen.setOpcionb11(admin.getOpcionb11());
		 examen.setOpcionc11(admin.getOpcionc11());
		 examen.setOpciond11(admin.getOpciond11());
		 examen.setRespuesta11(admin.getRespuesta11());
		 
		 examen.setPregunta12(admin.getPregunta12());
		 examen.setOpciona12(admin.getOpciona12());
		 examen.setOpcionb12(admin.getOpcionb12());
		 examen.setOpcionc12(admin.getOpcionc12());
		 examen.setOpciond12(admin.getOpciond12());
		 examen.setRespuesta12(admin.getRespuesta12());
		 
		 examen.setPregunta13(admin.getPregunta13());
		 examen.setOpciona13(admin.getOpciona13());
		 examen.setOpcionb13(admin.getOpcionb13());
		 examen.setOpcionc13(admin.getOpcionc13());
		 examen.setOpciond13(admin.getOpciond13());
		 examen.setRespuesta13(admin.getRespuesta13());
		 
		 examen.setPregunta14(admin.getPregunta14());
		 examen.setOpciona14(admin.getOpciona14());
		 examen.setOpcionb14(admin.getOpcionb14());
		 examen.setOpcionc14(admin.getOpcionc14());
		 examen.setOpciond14(admin.getOpciond14());
		 examen.setRespuesta14(admin.getRespuesta14());
		 
		 examen.setPregunta15(admin.getPregunta15());
		 examen.setOpciona15(admin.getOpciona15());
		 examen.setOpcionb15(admin.getOpcionb15());
		 examen.setOpcionc15(admin.getOpcionc15());
		 examen.setOpciond15(admin.getOpciond15());
		 examen.setRespuesta15(admin.getRespuesta15());
		 
		 sesion.setAttribute("examen", examen);
		 sesion.setAttribute("estudiante", estudiante);
		
		 
		
		RequestDispatcher despachador= request.getRequestDispatcher("crearexamen.jsp");
		despachador.forward(request, response);
		
		
	}

}
