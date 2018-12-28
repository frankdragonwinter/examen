package modelo;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import bdatos.AdminDB;

public class Examen {
	String respuesta=null; //r=respuesta de estudiante
	private double calificacion = 0;
	private double calificacionfinal=0;
		
	int numpregunta1,numpregunta2, numpregunta3, numpregunta4, numpregunta5, numpregunta6, numpregunta7, numpregunta8, numpregunta9, numpregunta10,numpregunta11,numpregunta12,numpregunta13,numpregunta14,numpregunta15;
	String pregunta1, pregunta2=null, pregunta3=null, pregunta4=null, pregunta5=null,pregunta6=null,pregunta7=null,pregunta8=null, pregunta9=null, pregunta10=null,pregunta11=null,pregunta12=null,pregunta13=null,pregunta14=null,pregunta15=null;
	String opciona1=null, opciona2=null, opciona3=null, opciona4=null, opciona5=null, opciona6=null, opciona7=null, opciona8=null, opciona9=null, opciona10=null,opciona11=null,opciona12=null,opciona13=null,opciona14=null,opciona15=null;
	String opcionb1=null, opcionb2=null, opcionb3=null, opcionb4=null, opcionb5=null, opcionb6=null, opcionb7=null, opcionb8=null, opcionb9=null, opcionb10=null,opcionb11=null,opcionb12=null,opcionb13=null,opcionb14=null,opcionb15=null;
	String opcionc1=null, opcionc2=null, opcionc3=null, opcionc4=null, opcionc5=null, opcionc6=null, opcionc7=null, opcionc8=null, opcionc9=null, opcionc10=null,opcionc11=null,opcionc12=null,opcionc13=null,opcionc14=null,opcionc15=null;
	String opciond1=null, opciond2=null, opciond3=null, opciond4=null, opciond5=null, opciond6=null, opciond7=null, opciond8=null, opciond9=null, opciond10=null,opciond11=null,opciond12=null,opciond13=null,opciond14=null,opciond15=null;
	String respuesta1,respuesta2,respuesta3,respuesta4,respuesta5,respuesta6,respuesta7,respuesta8,respuesta9,respuesta10,respuesta11,respuesta12,respuesta13,respuesta14,respuesta15;
	String respuestaest1,respuestaest2,respuestaest3=null,respuestaest4=null,respuestaest5=null,respuestaest6=null,respuestaest7=null,respuestaest8=null,respuestaest9=null,respuestaest10=null,respuestaest11=null,respuestaest12=null,respuestaest13=null,respuestaest14=null,respuestaest15=null;
	


	ArrayList<String> numpreguntavista;
 	ArrayList<String> respuestasdelEstudiante;
 	
 	static int[] num;
 	
 	ArrayList<String> respuestasCorrectas;
	public Examen(){
		 
		
		numpreguntavista=new ArrayList<>();
		respuestasdelEstudiante=new ArrayList<>();
		respuestasCorrectas=new ArrayList<>();
	}
	
	public int[] generarExamen(int ni,int nf){
		num=new int[15];
		int numeroInicial=ni;
		int numeroFinal=nf;
		
		
	    NumeroAleatorios na = new NumeroAleatorios(numeroInicial,numeroFinal);    
	          for(int i = 0; i < (numeroFinal - numeroInicial) + 1;i++){
	           
	        	  num[i]=na.generar();
	        	  
	          }
			return num;
			
	}
	
	public void calificarExamen(String[] respuestacorrecta, String[] respuestadelestudiante,Estudiante estudiante,Examen examen){
		String[] rc=respuestacorrecta;
		String[] re=respuestadelestudiante;
		String respuestac,respuestae;
		
		for(int i=0;i<15;i++){
	
	
				respuestac=rc[i];
					respuestae=re[i];
	
					System.out.println("Caja de respuestas: "+rc[i]+" Caja respondidas:  "+re[i]);
	 
					if(respuestac.equals(respuestae)){
	 
						calificacion++;
						System.out.println("#: "+i+"  Respuesta Correcta "+respuestac+" su respuesta  "+respuestae+" calificacion: "+calificacion);
					}
		}
		
		calificacionfinal=((calificacion*(10))/(15));
		//cf calificacion final		
		
		estudiante.setCalificacion(calificacionfinal);
		
		AdminDB ad=new AdminDB();
		ad.agregarEstudiante(estudiante);
		ad.agregarExamen(examen, estudiante);
		
				
		System.out.println(":) Calificacion: "+calificacionfinal);
		
		
	}
	
	public void respuestadeEstudiante(String respuesta){
		this.respuesta=respuesta;
	respuestasdelEstudiante.add(this.respuesta);
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	

	public String getPregunta1() {
		return pregunta1;
	}

	public void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}

	public String getPregunta2() {
		return pregunta2;
	}

	public void setPregunta2(String pregunta2) {
		this.pregunta2 = pregunta2;
	}

	public String getPregunta3() {
		return pregunta3;
	}

	public void setPregunta3(String pregunta3) {
		this.pregunta3 = pregunta3;
	}

	public String getPregunta4() {
		return pregunta4;
	}

	public void setPregunta4(String pregunta4) {
		this.pregunta4 = pregunta4;
	}

	public String getPregunta5() {
		return pregunta5;
	}

	public void setPregunta5(String pregunta5) {
		this.pregunta5 = pregunta5;
	}

	public String getPregunta6() {
		return pregunta6;
	}

	public void setPregunta6(String pregunta6) {
		this.pregunta6 = pregunta6;
	}

	public String getPregunta7() {
		return pregunta7;
	}

	public void setPregunta7(String pregunta7) {
		this.pregunta7 = pregunta7;
	}

	public String getPregunta8() {
		return pregunta8;
	}

	public void setPregunta8(String pregunta8) {
		this.pregunta8 = pregunta8;
	}

	public String getPregunta9() {
		return pregunta9;
	}

	public void setPregunta9(String pregunta9) {
		this.pregunta9 = pregunta9;
	}

	public String getPregunta10() {
		return pregunta10;
	}

	public void setPregunta10(String pregunta10) {
		this.pregunta10 = pregunta10;
	}
	
	

	public int getNumpregunta1() {
		return numpregunta1;
	}

	public void setNumpregunta1(int numpregunta1) {
		this.numpregunta1 = numpregunta1;
	}

	public int getNumpregunta2() {
		return numpregunta2;
	}

	public void setNumpregunta2(int numpregunta2) {
		this.numpregunta2 = numpregunta2;
	}

	public int getNumpregunta3() {
		return numpregunta3;
	}

	public void setNumpregunta3(int numpregunta3) {
		this.numpregunta3 = numpregunta3;
	}

	public int getNumpregunta4() {
		return numpregunta4;
	}

	public void setNumpregunta4(int numpregunta4) {
		this.numpregunta4 = numpregunta4;
	}

	public int getNumpregunta5() {
		return numpregunta5;
	}

	public void setNumpregunta5(int numpregunta5) {
		this.numpregunta5 = numpregunta5;
	}

	public int getNumpregunta6() {
		return numpregunta6;
	}

	public void setNumpregunta6(int numpregunta6) {
		this.numpregunta6 = numpregunta6;
	}

	public int getNumpregunta7() {
		return numpregunta7;
	}

	public void setNumpregunta7(int numpregunta7) {
		this.numpregunta7 = numpregunta7;
	}

	public int getNumpregunta8() {
		return numpregunta8;
	}

	public void setNumpregunta8(int numpregunta8) {
		this.numpregunta8 = numpregunta8;
	}

	public int getNumpregunta9() {
		return numpregunta9;
	}

	public void setNumpregunta9(int numpregunta9) {
		this.numpregunta9 = numpregunta9;
	}

	public int getNumpregunta10() {
		return numpregunta10;
	}

	public void setNumpregunta10(int numpregunta10) {
		this.numpregunta10 = numpregunta10;
	}

	public String getOpciona1() {
		return opciona1;
	}

	public void setOpciona1(String opciona1) {
		this.opciona1 = opciona1;
	}

	public String getOpciona2() {
		return opciona2;
	}

	public void setOpciona2(String opciona2) {
		this.opciona2 = opciona2;
	}

	public String getOpciona3() {
		return opciona3;
	}

	public void setOpciona3(String opciona3) {
		this.opciona3 = opciona3;
	}

	public String getOpciona4() {
		return opciona4;
	}

	public void setOpciona4(String opciona4) {
		this.opciona4 = opciona4;
	}

	public String getOpciona5() {
		return opciona5;
	}

	public void setOpciona5(String opciona5) {
		this.opciona5 = opciona5;
	}

	public String getOpciona6() {
		return opciona6;
	}

	public void setOpciona6(String opciona6) {
		this.opciona6 = opciona6;
	}

	public String getOpciona7() {
		return opciona7;
	}

	public void setOpciona7(String opciona7) {
		this.opciona7 = opciona7;
	}

	public String getOpciona8() {
		return opciona8;
	}

	public void setOpciona8(String opciona8) {
		this.opciona8 = opciona8;
	}

	public String getOpciona9() {
		return opciona9;
	}

	public void setOpciona9(String opciona9) {
		this.opciona9 = opciona9;
	}

	public String getOpciona10() {
		return opciona10;
	}

	public void setOpciona10(String opciona10) {
		this.opciona10 = opciona10;
	}

	public String getOpcionb1() {
		return opcionb1;
	}

	public void setOpcionb1(String opcionb1) {
		this.opcionb1 = opcionb1;
	}

	public String getOpcionb2() {
		return opcionb2;
	}

	public void setOpcionb2(String opcionb2) {
		this.opcionb2 = opcionb2;
	}

	public String getOpcionb3() {
		return opcionb3;
	}

	public void setOpcionb3(String opcionb3) {
		this.opcionb3 = opcionb3;
	}

	public String getOpcionb4() {
		return opcionb4;
	}

	public void setOpcionb4(String opcionb4) {
		this.opcionb4 = opcionb4;
	}

	public String getOpcionb5() {
		return opcionb5;
	}

	public void setOpcionb5(String opcionb5) {
		this.opcionb5 = opcionb5;
	}

	public String getOpcionb6() {
		return opcionb6;
	}

	public void setOpcionb6(String opcionb6) {
		this.opcionb6 = opcionb6;
	}

	public String getOpcionb7() {
		return opcionb7;
	}

	public void setOpcionb7(String opcionb7) {
		this.opcionb7 = opcionb7;
	}

	public String getOpcionb8() {
		return opcionb8;
	}

	public void setOpcionb8(String opcionb8) {
		this.opcionb8 = opcionb8;
	}

	public String getOpcionb9() {
		return opcionb9;
	}

	public void setOpcionb9(String opcionb9) {
		this.opcionb9 = opcionb9;
	}

	public String getOpcionb10() {
		return opcionb10;
	}

	public void setOpcionb10(String opcionb10) {
		this.opcionb10 = opcionb10;
	}

	public String getOpcionc1() {
		return opcionc1;
	}

	public void setOpcionc1(String opcionc1) {
		this.opcionc1 = opcionc1;
	}

	public String getOpcionc2() {
		return opcionc2;
	}

	public void setOpcionc2(String opcionc2) {
		this.opcionc2 = opcionc2;
	}

	public String getOpcionc3() {
		return opcionc3;
	}

	public void setOpcionc3(String opcionc3) {
		this.opcionc3 = opcionc3;
	}

	public String getOpcionc4() {
		return opcionc4;
	}

	public void setOpcionc4(String opcionc4) {
		this.opcionc4 = opcionc4;
	}

	public String getOpcionc5() {
		return opcionc5;
	}

	public void setOpcionc5(String opcionc5) {
		this.opcionc5 = opcionc5;
	}

	public String getOpcionc6() {
		return opcionc6;
	}

	public void setOpcionc6(String opcionc6) {
		this.opcionc6 = opcionc6;
	}

	public String getOpcionc7() {
		return opcionc7;
	}

	public void setOpcionc7(String opcionc7) {
		this.opcionc7 = opcionc7;
	}

	public String getOpcionc8() {
		return opcionc8;
	}

	public void setOpcionc8(String opcionc8) {
		this.opcionc8 = opcionc8;
	}

	public String getOpcionc9() {
		return opcionc9;
	}

	public void setOpcionc9(String opcionc9) {
		this.opcionc9 = opcionc9;
	}

	public String getOpcionc10() {
		return opcionc10;
	}

	public void setOpcionc10(String opcionc10) {
		this.opcionc10 = opcionc10;
	}

 	public String getOpciond1() {
		return opciond1;
	}

	public void setOpciond1(String opciond1) {
		this.opciond1 = opciond1;
	}

	public String getOpciond2() {
		return opciond2;
	}

	public void setOpciond2(String opciond2) {
		this.opciond2 = opciond2;
	}

	public String getOpciond3() {
		return opciond3;
	}

	public void setOpciond3(String opciond3) {
		this.opciond3 = opciond3;
	}

	public String getOpciond4() {
		return opciond4;
	}

	public void setOpciond4(String opciond4) {
		this.opciond4 = opciond4;
	}

	public String getOpciond5() {
		return opciond5;
	}

	public void setOpciond5(String opciond5) {
		this.opciond5 = opciond5;
	}

	public String getOpciond6() {
		return opciond6;
	}

	public void setOpciond6(String opciond6) {
		this.opciond6 = opciond6;
	}

	public String getOpciond7() {
		return opciond7;
	}

	public void setOpciond7(String opciond7) {
		this.opciond7 = opciond7;
	}

	public String getOpciond8() {
		return opciond8;
	}

	public void setOpciond8(String opciond8) {
		this.opciond8 = opciond8;
	}

	public String getOpciond9() {
		return opciond9;
	}

	public void setOpciond9(String opciond9) {
		this.opciond9 = opciond9;
	}

	public String getOpciond10() {
		return opciond10;
	}

	public void setOpciond10(String opciond10) {
		this.opciond10 = opciond10;
	}
	
	
	public String getRespuesta1() {
		return respuesta1;
	}

	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	public String getRespuesta2() {
		return respuesta2;
	}

	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	public String getRespuesta3() {
		return respuesta3;
	}

	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}

	public String getRespuesta4() {
		return respuesta4;
	}

	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}

	public String getRespuesta5() {
		return respuesta5;
	}

	public void setRespuesta5(String respuesta5) {
		this.respuesta5 = respuesta5;
	}

	public String getRespuesta6() {
		return respuesta6;
	}

	public void setRespuesta6(String respuesta6) {
		this.respuesta6 = respuesta6;
	}

	public String getRespuesta7() {
		return respuesta7;
	}

	public void setRespuesta7(String respuesta7) {
		this.respuesta7 = respuesta7;
	}

	public String getRespuesta8() {
		return respuesta8;
	}

	public void setRespuesta8(String respuesta8) {
		this.respuesta8 = respuesta8;
	}

	public String getRespuesta9() {
		return respuesta9;
	}

	public void setRespuesta9(String respuesta9) {
		this.respuesta9 = respuesta9;
	}

	public String getRespuesta10() {
		return respuesta10;
	}

	public void setRespuesta10(String respuesta10) {
		this.respuesta10 = respuesta10;
	}

	public String getRespuestaest1() {
		return respuestaest1;
	}

	public void setRespuestaest1(String respuestaest1) {
		this.respuestaest1 = respuestaest1;
	}

	public String getRespuestaest2() {
		return respuestaest2;
	}

	public void setRespuestaest2(String respuestaest2) {
		this.respuestaest2 = respuestaest2;
	}

	public String getRespuestaest3() {
		return respuestaest3;
	}

	public void setRespuestaest3(String respuestaest3) {
		this.respuestaest3 = respuestaest3;
	}

	public String getRespuestaest4() {
		return respuestaest4;
	}

	public void setRespuestaest4(String respuestaest4) {
		this.respuestaest4 = respuestaest4;
	}

	public String getRespuestaest5() {
		return respuestaest5;
	}

	public void setRespuestaest5(String respuestaest5) {
		this.respuestaest5 = respuestaest5;
	}

	public String getRespuestaest6() {
		return respuestaest6;
	}

	public void setRespuestaest6(String respuestaest6) {
		this.respuestaest6 = respuestaest6;
	}

	public String getRespuestaest7() {
		return respuestaest7;
	}

	public void setRespuestaest7(String respuestaest7) {
		this.respuestaest7 = respuestaest7;
	}

	public String getRespuestaest8() {
		return respuestaest8;
	}

	public void setRespuestaest8(String respuestaest8) {
		this.respuestaest8 = respuestaest8;
	}

	public String getRespuestaest9() {
		return respuestaest9;
	}

	public void setRespuestaest9(String respuestaest9) {
		this.respuestaest9 = respuestaest9;
	}

	public String getRespuestaest10() {
		return respuestaest10;
	}

	public void setRespuestaest10(String respuestaest10) {
		this.respuestaest10 = respuestaest10;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public int getNumpregunta11() {
		return numpregunta11;
	}

	public void setNumpregunta11(int numpregunta11) {
		this.numpregunta11 = numpregunta11;
	}

	public int getNumpregunta12() {
		return numpregunta12;
	}

	public void setNumpregunta12(int numpregunta12) {
		this.numpregunta12 = numpregunta12;
	}

	public int getNumpregunta13() {
		return numpregunta13;
	}

	public void setNumpregunta13(int numpregunta13) {
		this.numpregunta13 = numpregunta13;
	}

	public int getNumpregunta14() {
		return numpregunta14;
	}

	public void setNumpregunta14(int numpregunta14) {
		this.numpregunta14 = numpregunta14;
	}

	public int getNumpregunta15() {
		return numpregunta15;
	}

	public void setNumpregunta15(int numpregunta15) {
		this.numpregunta15 = numpregunta15;
	}

	public String getPregunta11() {
		return pregunta11;
	}

	public void setPregunta11(String pregunta11) {
		this.pregunta11 = pregunta11;
	}

	public String getPregunta12() {
		return pregunta12;
	}

	public void setPregunta12(String pregunta12) {
		this.pregunta12 = pregunta12;
	}

	public String getPregunta13() {
		return pregunta13;
	}

	public void setPregunta13(String pregunta13) {
		this.pregunta13 = pregunta13;
	}

	public String getPregunta14() {
		return pregunta14;
	}

	public void setPregunta14(String pregunta14) {
		this.pregunta14 = pregunta14;
	}

	public String getPregunta15() {
		return pregunta15;
	}

	public void setPregunta15(String pregunta15) {
		this.pregunta15 = pregunta15;
	}

	public String getOpciona11() {
		return opciona11;
	}

	public void setOpciona11(String opciona11) {
		this.opciona11 = opciona11;
	}

	public String getOpciona12() {
		return opciona12;
	}

	public void setOpciona12(String opciona12) {
		this.opciona12 = opciona12;
	}

	public String getOpciona13() {
		return opciona13;
	}

	public void setOpciona13(String opciona13) {
		this.opciona13 = opciona13;
	}

	public String getOpciona14() {
		return opciona14;
	}

	public void setOpciona14(String opciona14) {
		this.opciona14 = opciona14;
	}

	public String getOpciona15() {
		return opciona15;
	}

	public void setOpciona15(String opciona15) {
		this.opciona15 = opciona15;
	}

	public String getOpcionb11() {
		return opcionb11;
	}

	public void setOpcionb11(String opcionb11) {
		this.opcionb11 = opcionb11;
	}

	public String getOpcionb12() {
		return opcionb12;
	}

	public void setOpcionb12(String opcionb12) {
		this.opcionb12 = opcionb12;
	}

	public String getOpcionb13() {
		return opcionb13;
	}

	public void setOpcionb13(String opcionb13) {
		this.opcionb13 = opcionb13;
	}

	public String getOpcionb14() {
		return opcionb14;
	}

	public void setOpcionb14(String opcionb14) {
		this.opcionb14 = opcionb14;
	}

	public String getOpcionb15() {
		return opcionb15;
	}

	public void setOpcionb15(String opcionb15) {
		this.opcionb15 = opcionb15;
	}

	public String getOpcionc11() {
		return opcionc11;
	}

	public void setOpcionc11(String opcionc11) {
		this.opcionc11 = opcionc11;
	}

	public String getOpcionc12() {
		return opcionc12;
	}

	public void setOpcionc12(String opcionc12) {
		this.opcionc12 = opcionc12;
	}

	public String getOpcionc13() {
		return opcionc13;
	}

	public void setOpcionc13(String opcionc13) {
		this.opcionc13 = opcionc13;
	}

	public String getOpcionc14() {
		return opcionc14;
	}

	public void setOpcionc14(String opcionc14) {
		this.opcionc14 = opcionc14;
	}

	public String getOpcionc15() {
		return opcionc15;
	}

	public void setOpcionc15(String opcionc15) {
		this.opcionc15 = opcionc15;
	}

	public String getOpciond11() {
		return opciond11;
	}

	public void setOpciond11(String opciond11) {
		this.opciond11 = opciond11;
	}

	public String getOpciond12() {
		return opciond12;
	}

	public void setOpciond12(String opciond12) {
		this.opciond12 = opciond12;
	}

	public String getOpciond13() {
		return opciond13;
	}

	public void setOpciond13(String opciond13) {
		this.opciond13 = opciond13;
	}

	public String getOpciond14() {
		return opciond14;
	}

	public void setOpciond14(String opciond14) {
		this.opciond14 = opciond14;
	}

	public String getOpciond15() {
		return opciond15;
	}

	public void setOpciond15(String opciond15) {
		this.opciond15 = opciond15;
	}

	public String getRespuesta11() {
		return respuesta11;
	}

	public void setRespuesta11(String respuesta11) {
		this.respuesta11 = respuesta11;
	}

	public String getRespuesta12() {
		return respuesta12;
	}

	public void setRespuesta12(String respuesta12) {
		this.respuesta12 = respuesta12;
	}

	public String getRespuesta13() {
		return respuesta13;
	}

	public void setRespuesta13(String respuesta13) {
		this.respuesta13 = respuesta13;
	}

	public String getRespuesta14() {
		return respuesta14;
	}

	public void setRespuesta14(String respuesta14) {
		this.respuesta14 = respuesta14;
	}

	public String getRespuesta15() {
		return respuesta15;
	}

	public void setRespuesta15(String respuesta15) {
		this.respuesta15 = respuesta15;
	}

	public String getRespuestaest11() {
		return respuestaest11;
	}

	public void setRespuestaest11(String respuestaest11) {
		this.respuestaest11 = respuestaest11;
	}

	public String getRespuestaest12() {
		return respuestaest12;
	}

	public void setRespuestaest12(String respuestaest12) {
		this.respuestaest12 = respuestaest12;
	}

	public String getRespuestaest13() {
		return respuestaest13;
	}

	public void setRespuestaest13(String respuestaest13) {
		this.respuestaest13 = respuestaest13;
	}

	public String getRespuestaest14() {
		return respuestaest14;
	}

	public void setRespuestaest14(String respuestaest14) {
		this.respuestaest14 = respuestaest14;
	}

	public String getRespuestaest15() {
		return respuestaest15;
	}

	public void setRespuestaest15(String respuestaest15) {
		this.respuestaest15 = respuestaest15;
	}
	
	
	
	
	
}
