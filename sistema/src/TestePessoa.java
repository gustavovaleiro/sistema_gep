import br.com.gustavovaleiro.verp.modelo.rh.auxiliar.CNPJ;

public class TestePessoa {

	public static void main(String[] args) {
		CNPJ cnpj = new CNPJ();
		cnpj.setCNPJ("22014353000151");
		System.out.println(cnpj.getCNPJ());
	
	}

}
