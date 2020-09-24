package system_Cajero;
import javax.swing.*;
public class Cajero_Automatico {

	public static void main(String[] args) {
		Consulta_Saldo cliente1=new Consulta_Saldo();
		
		Login milogin=new Login();
		String usuario ;
		int contraseña;
		 int intentos=0;
		do {
			intentos++;
		 usuario=JOptionPane.showInputDialog("        INICIO DE SESION \nIntroduce el usuario");
	     contraseña=Integer.parseInt(JOptionPane.showInputDialog("        INICIO DE SESION \nIntroduce la contraseña"));
	    
	       if(milogin.getEvaluar_Contraseña(usuario, contraseña)) {
	    	   JOptionPane.showMessageDialog(null, "Acceso Permitido");
	    	   System.out.println(intentos);
	    	  
	    	   
	       } else if (milogin.getEvaluar_Contraseña(usuario, contraseña)==true||intentos!=3) {
	    	   
	    	   JOptionPane.showMessageDialog(null, "Intente de Nuevo");
	       }if(intentos==3&&milogin.getEvaluar_Contraseña(usuario, contraseña)==false) {
	    	   System.out.println(intentos); 
	    	   JOptionPane.showMessageDialog(null, "Muchos Intentos Fallidos, Vuelva Pronto");
	       }///resolver los intentos fallidos
	       
	       
		}while(!milogin.getEvaluar_Contraseña(usuario, contraseña)&&intentos!=3);
		
		
		int opcion=0;
		while(milogin.getEvaluar_Contraseña(usuario, contraseña)&&opcion!=4){
			
	    opcion=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE UNA OPERACION"+"\n1.-Consulta de Saldo"+"\n2.-Retiro de Efectivo"+"\n3.-Deposito de Efectivo"+"\n4.-Salir"));
		
		switch(opcion) {
		
		case 1:
			JOptionPane.showMessageDialog(null,cliente1.getConsulta_De_Saldo());
			break;
		case 2:
			int Retiro=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a retirar"));
			cliente1.setRetiro_De_Efectivo(Retiro);
			JOptionPane.showMessageDialog(null,"Realizo un retiro de : "+Retiro+"\n "+cliente1.getConsulta_De_Saldo());
			break;
		case 3:
			int Deposito=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a depositar"));
			Deposito_Efectivo mideposito=new Deposito_Efectivo(Deposito);
			JOptionPane.showMessageDialog(null, "Realizo un Deposito de: "+Deposito+" \n"+mideposito.getConsulta_De_Saldo());
			
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Fue Un Placer Atenderlo, Hasta Pronto!!");
			break;
			
		default :
			JOptionPane.showMessageDialog(null, "No Ha Seleccionado Ninguna Opcion,Intentelo de Nuevo");
			break;
		
		}
	
	 }
		
		
  }
}