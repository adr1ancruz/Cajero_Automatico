package system_Cajero;

public class Cajero_Padre {
	
	
	protected String Usuario;
	protected int Saldo,Retiro,Deposito,Contraseņa;


	public Cajero_Padre(){
		this.Usuario="Adrian";
		this.Contraseņa=12345;
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
	

	public boolean getEvaluar_Contraseņa(String usuario,int contraseņa) {
		
		if(usuario.equalsIgnoreCase(this.Usuario)&&contraseņa==this.Contraseņa) {
			
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
