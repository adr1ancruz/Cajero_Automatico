package Cajero;

public  class Cajero_Padre implements Consulta_Saldo,Retiro_De_Efectivo,Deposito_De_Efectivo,login{
	
	private String usuario;
	protected int saldo,retiro,deposito,contraseña;
	
	public Cajero_Padre() {
		
		this.usuario="adrian";
		this.contraseña=12345;
		this.saldo=1000;
	}
	@Override
  public String getConsulta_De_Saldo() {
	  
	  return"Saldo: "+ this.saldo;
  }
	
	@Override
	//metodo que realiza un deposito y se lo suma al saldo actual del cliente
	public void setDeposito_De_Efectivo(int Deposito) {
		this.deposito=Deposito;
		 this.saldo+=this.deposito;
	}
	
	@Override
	//metodo que realiza la disminuicion de saldo con un retiro de efectivo del cliente" metodo set-get"
	public void setRetiro_De_Efectivo(int Retiro) {
		this.retiro=Retiro;
		 this.saldo-=this.retiro;
	}
	
	@Override
   public boolean getEvaluar_Contraseña(String usuario,int contraseña) {
		
		if(usuario.equalsIgnoreCase(this.usuario)&&contraseña==this.contraseña) {
			
			return true;
			
		}
		
		return false;
	}
	
	@Override
	public boolean getIntentos(int intentos) {
		if (intentos != 3) {
			return true;
		} else {
			return false;
		}
	}

}
