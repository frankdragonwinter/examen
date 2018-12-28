package bdatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import modelo.*;

public class AdminDB {
	private Connection conexion;
	private ResultSet resultado;
	private String controladorBD;
	private String host;
	private String puerto;
	private String baseDatos;
	private String url;
	private String usuario;
	private String contra;
	private Statement proposicion=null;
	 private int num_pregunta;
	 private int numa[]; // Arreglo de Numeros Aleatorios
	 
	  private String respondidas;
	  private String[] cajarespondidas;
	 
	  private String numempleado;
	  private String email;
	  private String password;
	  
	
	
	int numpregunta1,numpregunta2, numpregunta3, numpregunta4, numpregunta5, numpregunta6, numpregunta7, numpregunta8, numpregunta9, numpregunta10,numpregunta11,numpregunta12,numpregunta13,numpregunta14,numpregunta15;
	String pregunta1, pregunta2, pregunta3, pregunta4, pregunta5,pregunta6,pregunta7,pregunta8, pregunta9, pregunta10,pregunta11,pregunta12,pregunta13,pregunta14,pregunta15;
	String opciona1, opciona2, opciona3, opciona4, opciona5, opciona6, opciona7, opciona8, opciona9, opciona10,opciona11,opciona12,opciona13,opciona14,opciona15;
	String opcionb1, opcionb2, opcionb3, opcionb4, opcionb5, opcionb6, opcionb7, opcionb8, opcionb9, opcionb10,opcionb11,opcionb12,opcionb13,opcionb14,opcionb15;
	String opcionc1, opcionc2, opcionc3, opcionc4, opcionc5, opcionc6, opcionc7, opcionc8, opcionc9, opcionc10,opcionc11,opcionc12,opcionc13,opcionc14,opcionc15;
	String opciond1, opciond2, opciond3, opciond4, opciond5, opciond6, opciond7, opciond8, opciond9, opciond10,opciond11,opciond12,opciond13,opciond14,opciond15;
	String respuesta1,respuesta2,respuesta3,respuesta4,respuesta5,respuesta6,respuesta7,respuesta8,respuesta9,respuesta10,respuesta11,respuesta12,respuesta13,respuesta14,respuesta15;
	
	private Statement sentencia;
	
	Examen examen;
	private Estudiante estudiante;
/**
 * La AdminDB
 * Guarda los datos que se van a usar para hacer la conexion	
 */
	public AdminDB(){
		numa=new int[14];// numero Aleatorio Random
		//numaleatorio=new int[10];// numero Aleatorio Random
		examen=new Examen();
		numa=examen.generarExamen(1,15);
		
		//controladorBD= "org.postgresql.Driver";
                controladorBD= "com.mysql.jdbc.Driver";
		host= "localhost";
		//puerto = "5432";
        puerto="3306";
		baseDatos="examen";
		//url ="jdbc:postgresql://"+host+":"+puerto+"/"+baseDatos;
		//usuario="postgres";
		//contra="p057gr35";
                url ="jdbc:mysql://"+host+":"+puerto+"/"+baseDatos;
		usuario="root";
		contra="123";
		resultado=null;
		conexion =null;
	}
/**
 * Metodo conectate(), hace la conexion a la base de datos	
 */
	public String conectate(){
       String mensaje="Conectando...";
       
   try {
      
    		  
    			Class.forName("com.mysql.jdbc.Driver").newInstance();
				conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/examen", "root","123");
   			
 	 
       }catch(SQLException sqe){
    	   System.out.println(sqe.getMessage());
    	   mensaje ="conexion Fallo"; 
       } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       return mensaje;
    }
					
			
	public String Traerpreguntas1(){
		String mensaje="Buscando preguntas";
					
				try{
					
					
				
				  for(int i=0;i<15;i++){
						System.out.println("#"+i+" Numero Aleatorio: "+numa[i]);
						// muestro los numeros aleatorios
					}
				  
					sentencia=conexion.createStatement();
				String consultaSQL="SELECT * FROM reactivos";
				resultado=sentencia.executeQuery(consultaSQL);
			 
						while(resultado.next()){
								
							
						    num_pregunta=resultado.getInt("num_pregunta");
							String pregunta=resultado.getString("pregunta");					
							String opcion_a=resultado.getString("opcion_a");
							String opcion_b=resultado.getString("opcion_b");
							String opcion_c=resultado.getString("opcion_c");
							String opcion_d=resultado.getString("opcion_d");
							String respuesta=resultado.getString("respuesta");
								
							if(num_pregunta==numa[0]){
								
							pregunta1=pregunta;
							opciona1=opcion_a;
							opcionb1=opcion_b;
							opcionc1=opcion_c;
							opciond1=opcion_d;
							respuesta1=respuesta;
							System.out.println("Pregunta 1 es: "+pregunta1);
							
							examen.setPregunta1(pregunta1);
							examen.setOpciona1(opciona1);
							examen.setOpcionb1(opcionb1);
							examen.setOpcionc1(opcionc1);
							examen.setOpciond1(opciond1);
							numpregunta1=num_pregunta;
							examen.setNumpregunta1(numpregunta1);
							examen.setRespuesta1(respuesta1);
							}
						
							
							if(num_pregunta==numa[1]){
								numpregunta2=num_pregunta;
								pregunta2=pregunta;
								opciona2=opcion_a;
								opcionb2=opcion_b;
								opcionc2=opcion_c;
								opciond2=opcion_d;
								respuesta2=respuesta;
								
								examen.setNumpregunta2(numpregunta2);
								examen.setPregunta2(pregunta2);
								examen.setOpciona2(opciona2);
								examen.setOpcionb2(opcionb2);
								examen.setOpcionc2(opcionc2);
								examen.setOpciond2(opciond2);
								examen.setRespuesta2(respuesta2);
								
								}
								if(num_pregunta==numa[2]){
								numpregunta3=num_pregunta;
								pregunta3=pregunta;
								opciona3=opcion_a;
								opcionb3=opcion_b;
								opcionc3=opcion_c;
								opciond3=opcion_d;
								respuesta3=respuesta;
								
								examen.setNumpregunta3(numpregunta3);
								examen.setPregunta3(pregunta3);
								examen.setOpciona3(opciona3);
								examen.setOpcionb3(opcionb3);
								examen.setOpcionc3(opcionc3);
								examen.setOpciond3(opciond3);
								examen.setRespuesta3(respuesta3);
								
								}
								if(num_pregunta==numa[3]){
									numpregunta4=num_pregunta;
									pregunta4=pregunta;
									opciona4=opcion_a;
									opcionb4=opcion_b;
									opcionc4=opcion_c;
									opciond4=opcion_d;
									respuesta4=respuesta;
									
									examen.setNumpregunta4(numpregunta4);
									examen.setPregunta4(pregunta4);
									examen.setOpciona4(opciona4);
									examen.setOpcionb4(opcionb4);
									examen.setOpcionc4(opcionc4);
									examen.setOpciond4(opciond4);
									examen.setRespuesta4(respuesta4);
									
									}
								if(num_pregunta==numa[4]){
										numpregunta5=num_pregunta;
										pregunta5=pregunta;
										opciona5=opcion_a;
										opcionb5=opcion_b;
										opcionc5=opcion_c;
										opciond5=opcion_d;
										respuesta5=respuesta;
										
										examen.setNumpregunta5(numpregunta5);
										examen.setPregunta5(pregunta5);
										examen.setOpciona5(opciona5);
										examen.setOpcionb5(opcionb5);
										examen.setOpcionc5(opcionc5);
										examen.setOpciond5(opciond5);
										examen.setRespuesta5(respuesta5);
										
										}if(num_pregunta==numa[5]){
											numpregunta6=num_pregunta;
											pregunta6=pregunta;
											opciona6=opcion_a;
											opcionb6=opcion_b;
											opcionc6=opcion_c;
											opciond6=opcion_d;
											respuesta6=respuesta;
											
											examen.setNumpregunta6(numpregunta6);
											examen.setPregunta6(pregunta6);
											examen.setOpciona6(opciona6);
											examen.setOpcionb6(opcionb6);
											examen.setOpcionc6(opcionc6);
											examen.setOpciond6(opciond6);
											examen.setRespuesta6(respuesta6);
											}if(num_pregunta==numa[6]){
												numpregunta7=num_pregunta;
												pregunta7=pregunta;
												opciona7=opcion_a;
												opcionb7=opcion_b;
												opcionc7=opcion_c;
												opciond7=opcion_d;
												respuesta7=respuesta;
												
												examen.setNumpregunta7(numpregunta7);
												examen.setPregunta7(pregunta7);
												examen.setOpciona7(opciona7);
												examen.setOpcionb7(opcionb7);
												examen.setOpcionc7(opcionc7);
												examen.setOpciond7(opciond7);
												examen.setRespuesta7(respuesta7);
												}if(num_pregunta==numa[7]){
													numpregunta8=num_pregunta;
													pregunta8=pregunta;
													opciona8=opcion_a;
													opcionb8=opcion_b;
													opcionc8=opcion_c;
													opciond8=opcion_d;
													respuesta8=respuesta;
													
													examen.setNumpregunta8(numpregunta8);
													examen.setPregunta8(pregunta8);
													examen.setOpciona8(opciona8);
													examen.setOpcionb8(opcionb8);
													examen.setOpcionc8(opcionc8);
													examen.setOpciond8(opciond8);
													examen.setRespuesta8(respuesta8);
													}if(num_pregunta==numa[8]){
														numpregunta9=num_pregunta;
														pregunta9=pregunta;
														opciona9=opcion_a;
														opcionb9=opcion_b;
														opcionc9=opcion_c;
														opciond9=opcion_d;
														respuesta9=respuesta;
														
														examen.setNumpregunta9(numpregunta9);
														examen.setPregunta9(pregunta9);
														examen.setOpciona9(opciona9);
														examen.setOpcionb9(opcionb9);
														examen.setOpcionc9(opcionc9);
														examen.setOpciond9(opciond9);
														examen.setRespuesta9(respuesta9);
														}if(num_pregunta==numa[9]){
															numpregunta10=num_pregunta;
															pregunta10=pregunta;
															opciona10=opcion_a;
															opcionb10=opcion_b;
															opcionc10=opcion_c;
															opciond10=opcion_d;
															respuesta10=respuesta;
															
															examen.setNumpregunta10(numpregunta10);
															examen.setPregunta10(pregunta10);
															examen.setOpciona10(opciona10);
															examen.setOpcionb10(opcionb10);
															examen.setOpcionc10(opcionc10);
															examen.setOpciond10(opciond10);
															examen.setRespuesta10(respuesta10);
															
															} if(num_pregunta==numa[10]){
																numpregunta11=num_pregunta;
																pregunta11=pregunta;
																opciona11=opcion_a;
																opcionb11=opcion_b;
																opcionc11=opcion_c;
																opciond11=opcion_d;
																respuesta11=respuesta;
																
																examen.setNumpregunta11(numpregunta11);
																examen.setPregunta11(pregunta11);
																examen.setOpciona11(opciona11);
																examen.setOpcionb11(opcionb11);
																examen.setOpcionc11(opcionc11);
																examen.setOpciond11(opciond11);
																examen.setRespuesta11(respuesta11);
															}  if(num_pregunta==numa[11]){
																numpregunta12=num_pregunta;
																pregunta12=pregunta;
																opciona12=opcion_a;
																opcionb12=opcion_b;
																opcionc12=opcion_c;
																opciond12=opcion_d;
																respuesta12=respuesta;
																
																examen.setNumpregunta12(numpregunta12);
																examen.setPregunta12(pregunta12);
																examen.setOpciona12(opciona12);
																examen.setOpcionb12(opcionb12);
																examen.setOpcionc12(opcionc12);
																examen.setOpciond12(opciond12);
																examen.setRespuesta12(respuesta12);
															} if(num_pregunta==numa[12]){
																numpregunta13=num_pregunta;
																pregunta13=pregunta;
																opciona13=opcion_a;
																opcionb13=opcion_b;
																opcionc13=opcion_c;
																opciond13=opcion_d;
																respuesta13=respuesta;
																
																examen.setNumpregunta13(numpregunta13);
																examen.setPregunta13(pregunta13);
																examen.setOpciona13(opciona13);
																examen.setOpcionb13(opcionb13);
																examen.setOpcionc13(opcionc13);
																examen.setOpciond13(opciond13);
																examen.setRespuesta13(respuesta13);
															} if(num_pregunta==numa[13]){
																numpregunta14=num_pregunta;
																pregunta14=pregunta;
																opciona14=opcion_a;
																opcionb14=opcion_b;
																opcionc14=opcion_c;
																opciond14=opcion_d;
																respuesta14=respuesta;
																
																examen.setNumpregunta14(numpregunta14);
																examen.setPregunta14(pregunta14);
																examen.setOpciona14(opciona14);
																examen.setOpcionb14(opcionb14);
																examen.setOpcionc14(opcionc14);
																examen.setOpciond14(opciond14);
																examen.setRespuesta14(respuesta14);
															} if(num_pregunta==numa[14]){
																numpregunta15=num_pregunta;
																pregunta15=pregunta;
																opciona15=opcion_a;
																opcionb15=opcion_b;
																opcionc15=opcion_c;
																opciond15=opcion_d;
																respuesta15=respuesta;
																
																examen.setNumpregunta15(numpregunta15);
																examen.setPregunta15(pregunta15);
																examen.setOpciona15(opciona15);
																examen.setOpcionb15(opcionb15);
																examen.setOpcionc15(opcionc15);
																examen.setOpciond15(opciond15);
																examen.setRespuesta15(respuesta15);
															}							
							
							
						}
						sentencia.close();
					}catch(Exception e){
						e.printStackTrace();
						conexion=null;
						
					}finally{
						if(resultado !=null){
							try{
								resultado.close();
								
							}catch(Exception e){
							e.printStackTrace();
							}
						}
						if(sentencia !=null){
							try{
								sentencia.close();
							}catch(Exception e){
								e.printStackTrace();
							}
						}
						if(conexion !=null){
							try{
								conexion.close();
								
							}catch(Exception e){
								e.printStackTrace();
							}
							
						}
					}
				return mensaje;
	}
	
	
	
/**
 * AGREGAR UN ESTUDIANTE A LA BASE DE DATOS	
 */
	public String agregarEstudiante(Estudiante estudiante){
		String mensaje="Agregando estudiante... ";
		String ordenSQL=null;
		Statement proposicion=null;
		int exito=0;
		
		mensaje = conectate(); 
		
		if(conexion != null){
			try{
		        proposicion = conexion.createStatement(); 
			    ordenSQL="INSERT INTO estudiante values( '"+estudiante.getMatricula()+"','"+estudiante.getNombre()+"','"+estudiante.getApellidoPaterno()+"',"
			    + "'"+estudiante.getApellidoMaterno()+"',"+estudiante.getCalificacion()+");";
	            exito=proposicion.executeUpdate(ordenSQL);
	            proposicion.close();
	
	            if(exito==1){
	            	mensaje="El registro se Agrego Exitosamente =)";
	            
	            }else{
	            	mensaje="ERROR: El registro No se Agrego Exitosamente =(";
	            	
	            }	            
			 }catch(SQLException sqle){
				 mensaje=""+sqle.getMessage();
			 }finally{
			   try{
				  conexion.close();
			   }catch(SQLException sqle){
                  mensaje="falla conexion";			   
			   }
			 } 
			 
		}else {
			mensaje="fallo conexion";
		}
		return mensaje;
	  }
	
	/**
	 * AGREGA UN EXAMEN A LA BASE DE DATOS	
	 * 
	 * @return mensaje que informa el estado de la operacion
	 */
		public String agregarExamen(Examen examen,Estudiante estudiante){
			cajarespondidas=new String[15];
			String mensaje="Agregando examen... ";
			for(int i=0;i<15;i++){
				System.out.println("#"+i+" Numero Aleatorio al Agregar Examen: "+numa[i]);
			}
			
			//String ordenSQL=null;
			for(int j=0;j<15;j++){
				switch(j){
				case 0:cajarespondidas[j]=examen.getRespuestaest1();
				break;
				case 1:cajarespondidas[j]=examen.getRespuestaest2();
				break;
				case 2:cajarespondidas[j]=examen.getRespuestaest3();
				break;
				case 3:cajarespondidas[j]=examen.getRespuestaest4();
				break;
				case 4:cajarespondidas[j]=examen.getRespuestaest5();
				break;
				case 5:cajarespondidas[j]=examen.getRespuestaest6();
				break;
				case 6:cajarespondidas[j]=examen.getRespuestaest7();
				break;
				case 7:cajarespondidas[j]=examen.getRespuestaest8();
				break;
				case 8:cajarespondidas[j]=examen.getRespuestaest9();
				break;
				case 9:cajarespondidas[j]=examen.getRespuestaest10();
				break;
				case 10:cajarespondidas[j]=examen.getRespuestaest11();
				break;
				case 11:cajarespondidas[j]=examen.getRespuestaest12();
				break;
				case 12:cajarespondidas[j]=examen.getRespuestaest13();
				break;
				case 13:cajarespondidas[j]=examen.getRespuestaest14();
				break;
				case 14:cajarespondidas[j]=examen.getRespuestaest15();
				break;
				}
				
			}
			
			
			int exito=0;
			
			mensaje = conectate(); 
			
			if(conexion != null){
				try{
					 
					int i;
					for( i=0;i<15;i++){
					//	proposicion = conexion.createStatement();
						respondidas=cajarespondidas[i];
					switch(i){
						case 0:  
					String ordenSQL2="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"uno"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
					proposicion = conexion.createStatement();
					exito=proposicion.executeUpdate(ordenSQL2);
					break;
						case 1:
							String ordenSQL3="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"dos"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							exito=proposicion.executeUpdate(ordenSQL3);
					break;
						case 2:
							String ordenSQL4="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"tres"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							exito=proposicion.executeUpdate(ordenSQL4);
					break;
						case 3:
							String ordenSQL5="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"cuatro"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							exito=proposicion.executeUpdate(ordenSQL5);
					break;	
						case 4:
							String ordenSQL6="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"cinco"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
						proposicion = conexion.createStatement();
							exito=proposicion.executeUpdate(ordenSQL6);
					break;
						case 5:
							String ordenSQL7="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"seis"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							exito=proposicion.executeUpdate(ordenSQL7);
					break;
						case 6:
							String ordenSQL8="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"siete"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							exito=proposicion.executeUpdate(ordenSQL8);
					break;
						case 7:
							String ordenSQL9="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"ocho"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							exito=proposicion.executeUpdate(ordenSQL9);
					break;
						case 8:
							String ordenSQL10="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"nueve"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							exito=proposicion.executeUpdate(ordenSQL10);
					break;
						case 9:
							String ordenSQL11="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"diez"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							 exito=proposicion.executeUpdate(ordenSQL11);
					break;
						case 10:
							String ordenSQL12="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"once"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							 exito=proposicion.executeUpdate(ordenSQL12);
					break;
						case 11:
							String ordenSQL13="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"doce"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							 exito=proposicion.executeUpdate(ordenSQL13);
					break;
						case 12:
							String ordenSQL14="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"trece"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							 exito=proposicion.executeUpdate(ordenSQL14);
					break;
						case 13:
							String ordenSQL15="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"catorce"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							 exito=proposicion.executeUpdate(ordenSQL15);
					break;
						case 14:
							String ordenSQL16="INSERT INTO examen VALUES ("+" "+numa[i]+" ,'"+"quince"+"' , '"+respondidas+"','"+estudiante.getMatricula()+"');";
							proposicion = conexion.createStatement();
							 exito=proposicion.executeUpdate(ordenSQL16);
					break;
					
					



					}


					}
				            
				            
				            
				            
		            
		
		            if(exito==1){
		            	mensaje="El registro se Agrego Exitosamente =)";
		            
		            }else{
		            	mensaje="ERROR: El registro No se Agrego Exitosamente =(";
		            	
		            }	            
				 }catch(SQLException sqle){
					 mensaje=""+sqle.getMessage();
				 }finally{
				   try{
					  conexion.close();
				   }catch(SQLException sqle){
	                  mensaje="falla conexion";			   
				   }
				 } 
				 
			}else {
				mensaje="fallo conexion";
			}
			return mensaje;
		  }
	//Busca EL correo y password desde LA BASE DE DATOS PARA EL LOGIN DE PROFESOR
		
		public String logindeProfesor(){
			
			String mensaje="Buscando usuario y contrasena";
			
					
					try{
						
						sentencia=conexion.createStatement();
					String consultaSQL="Select * From profesor";
					resultado=sentencia.executeQuery(consultaSQL);
				 
							while(resultado.next()){
									
							   	String email=resultado.getString("email");					
								String password=resultado.getString("password");
								
								this.setEmail(email);
								this.setPassword(password);
									
							}
							sentencia.close();
						}catch(Exception e){
							e.printStackTrace();
							conexion=null;
							
						}finally{
							if(resultado !=null){
								try{
									resultado.close();
									
								}catch(Exception e){
								e.printStackTrace();
								}
							}
							if(sentencia !=null){
								try{
									sentencia.close();
								}catch(Exception e){
									e.printStackTrace();
								}
							}
							if(conexion !=null){
								try{
									conexion.close();
									
								}catch(Exception e){
									e.printStackTrace();
								}
								
							}
						}
					return mensaje;
		}
	
	
 // BUSCAR UN ESTUDIANTE DE LA BASE DE DATOS POR SU MATRICULA	 
  
 
	public Estudiante buscarEstudiante(String matricula){ 
		String mensaje="Buscando... ";
		String ordenSQL=null;
		Statement proposicion=null;
		ResultSet rs=null;
		estudiante = new Estudiante();
		//cat= new Categoria();
		mensaje = conectate(); 
		
		if(conexion != null){
			try{
		        proposicion = conexion.createStatement(); 
			    rs= proposicion.executeQuery("Select * From estudiante Where matricula= '"+matricula+"';");
	            while(rs.next()){
	            	estudiante.setMatricula(rs.getString(1));
	            	estudiante.setNombre(rs.getString(2));
		            estudiante.setApellidoPaterno(rs.getString(3));
		            estudiante.setApellidoMaterno(rs.getString(4));
		            estudiante.setCalificacion(rs.getDouble(5));
		            
	            }
	            proposicion.close();            
		
			 }catch(SQLException sqle){
				 mensaje=""+sqle.getMessage();
			 }finally{
			   try{
				  conexion.close();
			   }catch(SQLException sqle){
                  mensaje="falla conexcion";			   
			   }
			 } 
			 
		}else {
			mensaje="fallo conexion";
		}
		System.out.println(mensaje);
		return estudiante;
	}
	

	
	public String getPregunta1() {
		return pregunta1;
	}
	public void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}
	public String getOpciona1() {
		return opciona1;
	}
	public void setOpciona1(String opciona1) {
		this.opciona1 = opciona1;
	}
	public String getOpcionb1() {
		return opcionb1;
	}
	public void setOpcionb1(String opcionb1) {
		this.opcionb1 = opcionb1;
	}
	public String getOpcionc1() {
		return opcionc1;
	}
	public void setOpcionc1(String opcionc1) {
		this.opcionc1 = opcionc1;
	}
	public String getPregunta2() {
		return pregunta2;
	}
	public void setPregunta2(String pregunta2) {
		this.pregunta2 = pregunta2;
	}
	public String getOpciona2() {
		return opciona2;
	}
	public void setOpciona2(String opciona2) {
		this.opciona2 = opciona2;
	}
	public String getOpcionb2() {
		return opcionb2;
	}
	public void setOpcionb2(String opcionb2) {
		this.opcionb2 = opcionb2;
	}
	public String getOpcionc2() {
		return opcionc2;
	}
	public void setOpcionc2(String opcionc2) {
		this.opcionc2 = opcionc2;
	}
	public String getPregunta3() {
		return pregunta3;
	}
	public void setPregunta3(String pregunta3) {
		this.pregunta3 = pregunta3;
	}
	public String getOpciona3() {
		return opciona3;
	}
	public void setOpciona3(String opciona3) {
		this.opciona3 = opciona3;
	}
	public String getOpcionb3() {
		return opcionb3;
	}
	public void setOpcionb3(String opcionb3) {
		this.opcionb3 = opcionb3;
	}
	public String getOpcionc3() {
		return opcionc3;
	}
	public void setOpcionc3(String opcionc3) {
		this.opcionc3 = opcionc3;
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
	public String getPregunta4() {
		return pregunta4;
	}
	public void setPregunta4(String pregunta4) {
		this.pregunta4 = pregunta4;
	}
	public String getOpciona4() {
		return opciona4;
	}
	public void setOpciona4(String opciona4) {
		this.opciona4 = opciona4;
	}
	public String getOpcionb4() {
		return opcionb4;
	}
	public void setOpcionb4(String opcionb4) {
		this.opcionb4 = opcionb4;
	}
	public String getOpcionc4() {
		return opcionc4;
	}
	public void setOpcionc4(String opcionc4) {
		this.opcionc4 = opcionc4;
	}
	public String getRespuesta4() {
		return respuesta4;
	}
	public void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
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
	public int[] getNuma() {
		return numa;
	}
	public void setNuma(int[] numa) {
		this.numa = numa;
	}
	public String getNumempleado() {
		return numempleado;
	}
	public void setNumempleado(String numempleado) {
		this.numempleado = numempleado;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	
	
   }