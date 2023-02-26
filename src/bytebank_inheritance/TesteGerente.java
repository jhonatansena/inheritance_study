package bytebank_inheritance;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario g1 = new Gerente();
		g1.setSalario(5000);
		g1.setNome("Jhondsfsd");
		g1.setCpf("343432432");
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000);
		f1.setNome("Jhondsfsd");
		f1.setCpf("343432432");	

		EditorVideo vd = new EditorVideo();
		vd.setSalario(3000);
		vd.setNome("Jhondsfsd");
		vd.setCpf("343432432");
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(g1);
		cb.registra(f1);
		cb.registra(vd);
		
		System.out.println(cb.getSomaBonificacaoTotal());
	
	
	}

}
