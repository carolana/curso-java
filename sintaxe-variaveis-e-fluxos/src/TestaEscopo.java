
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem-vindo!");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	
	}
}
