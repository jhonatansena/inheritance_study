package bytebank_inheritance;

public class ControleBonificacao {
	
	private double somaBonificao = 0.0;
	
	public void registra(Funcionario f) {
		this.somaBonificao += f.salarioSomadoComBonificacao();
	}
	
	public double getSomaBonificacaoTotal() {
		return this.somaBonificao;
	}
}
