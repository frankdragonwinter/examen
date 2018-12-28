<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="modelo.Examen" %>
    <%@ page import="modelo.Estudiante" %>
    <%@ page import="bdatos.AdminDB" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Menu Desplegable</title>
		<% Examen examen=(Examen)session.getAttribute("examen");%>
		
		<% //Examen examen=new Examen();%>
		<% //AdminDB admin=new AdminDB();%>
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
	  
	<%--    <jsp:useBean  id="examen" class="modelo.Examen" scope="session" />  --%>
	
	
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

<br><br><br><center><H1>Examen</H1></center>
<center><H1>Responde las preguntas seleccionando solo 1 opción</H1></center>
<br>
      
<%int i[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; %>
      
<form action="/examen/controladordepreguntas" method="post" >
     <%-- <jsp:getProperty property="pregunta1" name="examen" />  <br><br>  --%>
     <%=i[0] %>.-<%=examen.getPregunta1() %><br>
   	<input type="radio"  value= "a"  name="respuesta1" ><%=examen.getOpciona1()%>
	<input type="radio"  value= "b" name="respuesta1"><%=examen.getOpcionb1()%> 
	<input type="radio"  value= "c" name="respuesta1"><%=examen.getOpcionc1()%>
	<input type="radio"  value= "d" name="respuesta1"><%=examen.getOpciond1()%>
	<br><br>
	<%=i[1] %>.-<%=examen.getPregunta2() %><br>
   	<input type="radio"  value= "a"  name="respuesta2" ><%=examen.getOpciona2()%>
	<input type="radio"  value= "b" name="respuesta2"><%=examen.getOpcionb2()%> 
	<input type="radio"  value= "c" name="respuesta2"><%=examen.getOpcionc2()%>
	<input type="radio"  value= "d" name="respuesta2"><%=examen.getOpciond2()%>
	<br><br>
	<%=i[2] %>.-<%=examen.getPregunta3() %><br>
   	<input type="radio"  value= "a"  name="respuesta3" ><%=examen.getOpciona3()%>
	<input type="radio"  value= "b" name="respuesta3"><%=examen.getOpcionb3()%> 
	<input type="radio"  value= "c" name="respuesta3"><%=examen.getOpcionc3()%>
	<input type="radio"  value= "d" name="respuesta3"><%=examen.getOpciond3()%>
	<br><br>
	<%=i[3] %>.-<%=examen.getPregunta4() %><br>
   	<input type="radio"  value= "a"  name="respuesta4" ><%=examen.getOpciona4()%>
	<input type="radio"  value= "b" name="respuesta4"><%=examen.getOpcionb4()%> 
	<input type="radio"  value= "c" name="respuesta4"><%=examen.getOpcionc4()%>
	<input type="radio"  value= "d" name="respuesta4"><%=examen.getOpciond4()%>
	<br><br>
	<%=i[4] %>.-<%=examen.getPregunta5() %><br>
   	<input type="radio"  value= "a"  name="respuesta5" ><%=examen.getOpciona5()%>
	<input type="radio"  value= "b" name="respuesta5"><%=examen.getOpcionb5()%> 
	<input type="radio"  value= "c" name="respuesta5"><%=examen.getOpcionc5()%>
	<input type="radio"  value= "d" name="respuesta5"><%=examen.getOpciond5()%>
	<br><br>
	<%=i[5] %>.-<%=examen.getPregunta6() %><br>
   	<input type="radio"  value= "a"  name="respuesta6" ><%=examen.getOpciona6()%>
	<input type="radio"  value= "b" name="respuesta6"><%=examen.getOpcionb6()%> 
	<input type="radio"  value= "c" name="respuesta6"><%=examen.getOpcionc6()%>
	<input type="radio"  value= "d" name="respuesta6"><%=examen.getOpciond6()%>
	<br><br>
	<%=i[6] %>.-<%=examen.getPregunta7() %><br>
   	<input type="radio"  value= "a"  name="respuesta7" ><%=examen.getOpciona7()%>
	<input type="radio"  value= "b" name="respuesta7"><%=examen.getOpcionb7()%> 
	<input type="radio"  value= "c" name="respuesta7"><%=examen.getOpcionc7()%>
	<input type="radio"  value= "d" name="respuesta7"><%=examen.getOpciond7()%>
	<br><br>
	<%=i[7] %>.-<%=examen.getPregunta8() %><br>
   	<input type="radio"  value= "a"  name="respuesta8" ><%=examen.getOpciona8()%>
	<input type="radio"  value= "b" name="respuesta8"><%=examen.getOpcionb8()%> 
	<input type="radio"  value= "c" name="respuesta8"><%=examen.getOpcionc8()%>
	<input type="radio"  value= "d" name="respuesta8"><%=examen.getOpciond8()%>
	<br><br>
	<%=i[8] %>.-<%=examen.getPregunta9() %><br>
   	<input type="radio"  value= "a"  name="respuesta9" ><%=examen.getOpciona9()%>
	<input type="radio"  value= "b" name="respuesta9"><%=examen.getOpcionb9()%> 
	<input type="radio"  value= "c" name="respuesta9"><%=examen.getOpcionc9()%>
	<input type="radio"  value= "d" name="respuesta9"><%=examen.getOpciond9()%>
	<br><br>
	<%=i[9] %>.-<%=examen.getPregunta10() %><br>
   	<input type="radio"  value= "a"  name="respuesta10" ><%=examen.getOpciona10()%>
	<input type="radio"  value= "b" name="respuesta10"><%=examen.getOpcionb10()%> 
	<input type="radio"  value= "c" name="respuesta10"><%=examen.getOpcionc10()%>
	<input type="radio"  value= "d" name="respuesta10"><%=examen.getOpciond10()%>
	<br>
	<%=i[10] %>.-<%=examen.getPregunta11() %><br>
   	<input type="radio"  value= "a"  name="respuesta11" ><%=examen.getOpciona11()%>
	<input type="radio"  value= "b" name="respuesta11"><%=examen.getOpcionb11()%> 
	<input type="radio"  value= "c" name="respuesta11"><%=examen.getOpcionc11()%>
	<input type="radio"  value= "d" name="respuesta11"><%=examen.getOpciond11()%>
	<br>
	<%=i[11] %>.-<%=examen.getPregunta12() %><br>
   	<input type="radio"  value= "a"  name="respuesta12" ><%=examen.getOpciona12()%>
	<input type="radio"  value= "b" name="respuesta12"><%=examen.getOpcionb12()%> 
	<input type="radio"  value= "c" name="respuesta12"><%=examen.getOpcionc12()%>
	<input type="radio"  value= "d" name="respuesta12"><%=examen.getOpciond12()%>
	<br>
	<%=i[12] %>.-<%=examen.getPregunta13() %><br>
   	<input type="radio"  value= "a"  name="respuesta13" ><%=examen.getOpciona13()%>
	<input type="radio"  value= "b" name="respuesta13"><%=examen.getOpcionb13()%> 
	<input type="radio"  value= "c" name="respuesta13"><%=examen.getOpcionc13()%>
	<input type="radio"  value= "d" name="respuesta13"><%=examen.getOpciond13()%>
	<br>
	<%=i[13] %>.-<%=examen.getPregunta14() %><br>
   	<input type="radio"  value= "a"  name="respuesta14" ><%=examen.getOpciona14()%>
	<input type="radio"  value= "b" name="respuesta14"><%=examen.getOpcionb14()%> 
	<input type="radio"  value= "c" name="respuesta14"><%=examen.getOpcionc14()%>
	<input type="radio"  value= "d" name="respuesta14"><%=examen.getOpciond14()%>
	<br>
	<%=i[14] %>.-<%=examen.getPregunta15() %><br>
   	<input type="radio"  value= "a"  name="respuesta15" ><%=examen.getOpciona15()%>
	<input type="radio"  value= "b" name="respuesta15"><%=examen.getOpcionb15()%> 
	<input type="radio"  value= "c" name="respuesta15"><%=examen.getOpcionc15()%>
	<input type="radio"  value= "d" name="respuesta15"><%=examen.getOpciond15()%>
	<br>
	<center><input type="submit" value="Calificar" ></center>
</form>
		
		
	</body>
</html>