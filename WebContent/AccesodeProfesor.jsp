<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
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
				background-color:white;
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
		<% String mensajeIngreso="Acceso de Profesor";
	   String mensaje= (String)session.getAttribute("mensaje");
		if(mensaje != null)	   
			mensajeIngreso=mensaje;
		%>
		<h3><%= mensajeIngreso %></h3>
		
		<div id="header">
			<ul class="nav">
				<li><a href="index.jsp">Ventana Principal</a></li>
				<li><a href="">Examen</a>
					<ul>
						<li><a href="Examen.jsp">Crear Examen</a></li>
						
						
					</ul>
				</li>
				<li><a href="">Acceso de Profesor</a>
					<ul>
						<li><a href="AccesodeProfesor.jsp">Consultation des notes</a></li>
						
					</ul>
				</li>
				
			</ul>
		</div>
		
		
		
	<form action="/examen/controladordelogin" method="post" >
	<br><br><br><br>
	<center>correo del profesor:<input type="text" name="email" ></center> <br><br>
	<center>password:<input type="password" name="password" ></center> 
	<br>
	<center><input type="submit" value="aceptar" ></center>
</form>
		
	</body>
</html>