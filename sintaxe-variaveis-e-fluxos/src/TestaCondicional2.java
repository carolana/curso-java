
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 20;
		boolean acompanhado = true;
	// boolean acompanhado = quantidadePessoas >= 2;
//		int quantidadePessoas = 1;
//		
//		if (idade >= 18 || quantidadePessoas >=2) {
//			System.out.println("voc� tem mais de 18 anos, seja bem-vindo!");
//		} else 
//				System.out.println("infelizmente voc� n�o pode entrar");
//		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem-vindo!");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
	
	}
}

//|| � OU
// && E