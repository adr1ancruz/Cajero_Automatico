package system_Cajero;

public  class Login {
	
	protected String Usuario;
	protected int Contraseņa;
	public Login() {
        this.Usuario="Adrian";
        this.Contraseņa=12345;
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
