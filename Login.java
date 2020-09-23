package system_Cajero;

public  class Login {
	
	protected String Usuario;
	protected int Contraseña;
	public Login() {
        this.Usuario="Adrian";
        this.Contraseña=12345;
	}
		
		

	
	public boolean getEvaluar_Contraseña(String usuario,int contraseña) {
		
		if(usuario.equalsIgnoreCase(this.Usuario)&&contraseña==this.Contraseña) {
			
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
