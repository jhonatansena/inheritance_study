package bytebank_inheritance;

public class Administrador extends Funcionario implements Autenticavel{
	private AutenticacaoUtil autenticacaoUtil;
	
	Administrador(){
		this.autenticacaoUtil = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		autenticacaoUtil.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		boolean result = autenticacaoUtil.autentica(senha);
		return result;
	}
	

}
