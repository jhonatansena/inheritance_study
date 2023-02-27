package bytebank_inheritance;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario g1 = new Gerente();
		g1.setSalario(5000);
		g1.setNome("Jhondsfsd");
		g1.setCpf("343432432");
		
		EditorVideo vd = new EditorVideo();
		vd.setSalario(2500);
		vd.setNome("Jhondsfsd");
		vd.setCpf("343432432");
		
		Designer d = new Designer();
		d.setSalario(2000);
		d.setNome("Jhondsfsd");
		d.setCpf("343432432");
		
		ControleBonificacao cb = new ControleBonificacao();
		cb.registra(g1);
		cb.registra(vd);
		cb.registra(d);
		
		System.out.println(cb.getSomaBonificacao());
	
	
	}

}
