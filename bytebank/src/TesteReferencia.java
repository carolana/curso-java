
public class TesteReferencia {
	public static void main(String[] args) {
		// primeiraConta � do tipo vari�vel refer�ncia (� um "caminho" para o objeto, n�o o objeto em si")
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo da primeira conta: R$ " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: R$ " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta: R$ " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
	}
}
