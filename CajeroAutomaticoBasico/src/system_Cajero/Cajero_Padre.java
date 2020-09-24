package system_Cajero;

public class Cajero_Padre {
	
	
	private  String Usuario;
	private  int Saldo,Retiro,Deposito,Contrase�a;


	public Cajero_Padre(){
		this.Usuario="Adrian";
		this.Contrase�a=12345;
		this.Saldo=1000;
		
	}
	
	//metodo que retorna el saldo del cliente
	public String getConsulta_De_Saldo() {
		
		return "Tiene un saldo de: $"+ Saldo+" Pesos";
	}
	
	//metodo que realiza un deposito y se lo suma al saldo actual del cliente
	public void setDeposito_De_Efectivo(int Deposito) {
		this.Deposito=Deposito;
		this.Saldo+=this.Deposito;
	}
	
	
	//metodo que realiza la disminuicion de saldo con un retiro de efectivo del cliente
	public void setRetiro_De_Efectivo(int Retiro) {
		
		this.Saldo-=Retiro;
	}
	
	public int getRetiro_De_Efectivo() {
		return Retiro;
	}
	

	public boolean getEvaluar_Contrase�a(String usuario,int contrase�a) {
		
		if(usuario.equalsIgnoreCase(this.Usuario)&&contrase�a==this.Contrase�a) {
			
			return true;
			
		}
		
		return false;
	}
	
	public boolean getIntentos(int intentos) {
		if(intentos!=3) {
			return true;
		}else {
			return false;
		}
	
				
	}
	
	

}
