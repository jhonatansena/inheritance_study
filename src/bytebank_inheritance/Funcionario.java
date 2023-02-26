package bytebank_inheritance;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private double bonificao = 0.05;
	
	public double getBonificacao() {
		return this.salario * this.bonificao;
	}
	
	public double bonificacaoIndividual() {
		return this.bonificao * this.salario;
	}
	public void setBonificao(double bonificao) {
		this.bonificao = bonificao;
	}
	public double salarioSomadoComBonificacao() {
		return this.salario * this.bonificao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
