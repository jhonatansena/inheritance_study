package bytebank_inheritance;

public class SistemInterno {
	private int senha = 222;
	
	public void autentica(FuncionarioAutenticavel fa) {
		boolean autentica = fa.autentica(this.senha);
		
		if(autentica) {
			System.out.println("Autenticou");
		} else {
			System.out.println("Não autenticou");
		}
	}
}
