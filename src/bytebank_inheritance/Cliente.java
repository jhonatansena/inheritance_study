package bytebank_inheritance;

public class Cliente implements Autenticavel{
	private AutenticacaoUtil autenticador;

	Cliente(){
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}
	
	@Override
	public boolean autentica(int senha) {
		boolean result = autenticador.autentica(senha);
		return result;
	}

}
