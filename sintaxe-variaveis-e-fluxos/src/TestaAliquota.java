public class TestaAliquota {
	
	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		
		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("A aliquota do seu IR � de 7.5% e voc� pode dedutir o valor at� R$142");
		} else if(salario >= 2800.01 && salario <= 3751.00) {
			System.out.println("A aliquota do seu IR � de 15% e voc� pode dedutir o valor at� R$350");
		} else if(salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("A aliquota do seu IR � de 22.5% e voc� pode dedutir o valor at� R$636");
		}

	}

}
