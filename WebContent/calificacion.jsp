<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="modelo.Examen" %>
    <%@ page import="modelo.Estudiante" %>
    <%@ page import="bdatos.AdminDB" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%--<% Estudiante estudiante=(Estudiante)session.getAttribute("estudiante");%>--%>
		<%--<% Examen examen=(Examen)session.getAttribute("examen");%>--%>
		<title>Menu Desplegable</title>
		<style type="text/css">
			
			* {
				margin:0px;
				padding:0px;
			}
			
			#header {
				margin:auto;
				width:500px;
				font-family:Arial, Helvetica, sans-serif;
			}
			
			ul, ol {
				list-style:none;
			}
			
			.nav > li {
				float:left;
			}
			
			.nav li a {
				background-color:green;
				color:black;
				text-decoration:none;
				padding:10px 12px;
				display:block;
			}
			
			.nav li a:hover {
				background-color:White;
			}
			
			.nav li ul {
				display:none;
				position:absolute;
				min-width:140px;
			}
			
			.nav li:hover > ul {
				display:block;
			}
			
			.nav li ul li {
				position:relative;
			}
			
			.nav li ul li ul {
				right:-140px;
				top:0px;
			}
			
		</style>
	</head>
	<body>
	<jsp:useBean  id="examen" class="modelo.Examen" scope="session" />  
	<jsp:useBean  id="estudiante" class="modelo.Estudiante" scope="session" /> 
	
		<div id="header">
			<ul class="nav">
				<li><a href="index.jsp">Ventana Principal</a></li>
				<li><a href="">Examen</a>
					<ul>
						<li><a href="Examen.jsp">Generar Examen</a></li>
						
						
							
					</ul>
				</li>
				<li><a href="">Acceso de Profesor</a>
					<ul>
						<li><a href="AccesodeProfesor.jsp">Consulta de Calificaciones</a></li>
						
					</ul>
				</li>

			</ul>
		</div>
		
		
		<br><br><br>
	<center>	<h1>Calificacion</h1>  </center>
	
	Nombre:<jsp:getProperty property="nombre" name="estudiante" />
	Apellido Paterno:<jsp:getProperty property="apellidoPaterno" name="estudiante" />
	Apellido Materno:<jsp:getProperty property="apellidoMaterno" name="estudiante" />
	Matricula:<jsp:getProperty property="matricula" name="estudiante" />
	<br><br>
	En la Pregunta 1 usted Respondio: <jsp:getProperty property="respuestaest1" name="examen" /><br>
	En la Pregunta 2 usted Respondio: <jsp:getProperty property="respuestaest2" name="examen" /><br>
	En la Pregunta 3 usted Respondio: <jsp:getProperty property="respuestaest3" name="examen" /><br>
	En la Pregunta 4 usted Respondio: <jsp:getProperty property="respuestaest4" name="examen" /><br>
	En la Pregunta 5 usted Respondio: <jsp:getProperty property="respuestaest5" name="examen" /><br>
	En la Pregunta 6 usted Respondio: <jsp:getProperty property="respuestaest6" name="examen" /><br>
	En la Pregunta 7 usted Respondio: <jsp:getProperty property="respuestaest7" name="examen" /><br>
	En la Pregunta 8 usted Respondio: <jsp:getProperty property="respuestaest8" name="examen" /><br>
	En la Pregunta 9 usted Respondio: <jsp:getProperty property="respuestaest9" name="examen" /><br>
	En la Pregunta 10 usted Respondio: <jsp:getProperty property="respuestaest10" name="examen"/><br>
	En la Pregunta 11 usted Respondio: <jsp:getProperty property="respuestaest11" name="examen"/><br>
	En la Pregunta 12 usted Respondio: <jsp:getProperty property="respuestaest12" name="examen"/><br>
	En la Pregunta 13 usted Respondio: <jsp:getProperty property="respuestaest13" name="examen"/><br>
	En la Pregunta 14 usted Respondio: <jsp:getProperty property="respuestaest14" name="examen"/><br>
	En la Pregunta 15 usted Respondio: <jsp:getProperty property="respuestaest15" name="examen"/><br>
	<br>
	Su Calificacion es:<%=estudiante.getCalificacion() %>
	 <%--<jsp:getProperty property="calificacionfinal" name="examen"/><br> --%>  
	 <%-- Calificacion: <%=examen.getCalificacion() %> --%>
		<%--<% AdminDB ad=new AdminDB();%>--%>
		<%--<%ad.agregarEstudiante(estudiante);%> --%>
	</body>
</html>