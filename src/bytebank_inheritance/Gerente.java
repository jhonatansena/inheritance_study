package bytebank_inheritance;

public class Gerente extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		return this.senha == senha ? true : false;
	}
	
	public double salarioSomadoComBonificacao() {
		System.out.println("A bonificação do Gerente é: " + super.bonificacaoIndividual());
		return super.getBonificacao() + super.getSalario();
	}
	
	public boolean autentica(int senha, String login) {
		return this.senha == senha ? true : false;
	}
	
	
	
	
}
