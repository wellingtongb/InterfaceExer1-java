package exercicio1;

public class Testes {

	public static void main(String[] args) {

		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.CalculaArea());
		
		AreaCalculavel circulo = new Circulo(3.0);
		System.out.println(circulo.CalculaArea());

	}

}
