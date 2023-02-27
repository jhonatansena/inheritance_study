package bytebank_inheritance;

public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		return this.senha == senha ? true : false;
	}
	

	
	public boolean autentica(int senha, String login) {
		return this.senha == senha ? true : false;
	}



	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}
	
	
	
	
}
