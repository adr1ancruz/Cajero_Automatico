package system_Cajero;

public  class Login {
	
	protected String Usuario;
	protected int Contrase�a;
	public Login() {
        this.Usuario="Adrian";
        this.Contrase�a=12345;
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
