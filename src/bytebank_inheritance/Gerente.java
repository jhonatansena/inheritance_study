package bytebank_inheritance;

public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		return this.senha == senha ? true : false;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	
	
}
