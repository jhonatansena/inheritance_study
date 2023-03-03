package bytebank_inheritance;

public class Administrador extends Funcionario implements Autenticavel{
	private AutenticacaoUtil autenticador;
	
	Administrador(){
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
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
