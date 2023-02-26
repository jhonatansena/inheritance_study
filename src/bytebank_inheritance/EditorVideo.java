package bytebank_inheritance;

public class EditorVideo extends Funcionario {
	public double salarioSomadoComBonificacao() {
		double bonificacao = 100;
		System.out.println("A bonificação do EditorVideo é: " + bonificacao);
		
		return super.getBonificacao() + bonificacao;
	}
}
