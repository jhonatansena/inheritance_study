package bytebank_inheritance;

public class Administrador extends FuncionarioAutenticavel {
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}
	
	
	

}
