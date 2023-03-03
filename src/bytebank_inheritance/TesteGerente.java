package bytebank_inheritance;

public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente();
		g1.setSalario(5000);
		g1.setNome("Jhondsfsd");
		g1.setCpf("343432432");
		g1.setSenha(222);
		
		
		Administrador ad = new Administrador();
		ad.setSalario(2000);
		ad.setNome("Jhondsfsd");
		ad.setCpf("343432432");
		ad.setSenha(222);
		
		Cliente cl = new Cliente();
		cl.setSenha(222);
		
		SistemInterno si = new SistemInterno();
		si.autentica(ad);
		si.autentica(g1);
		si.autentica(cl);
	}

}
