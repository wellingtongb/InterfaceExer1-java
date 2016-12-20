package exercicio1;

public class Retangulo implements AreaCalculavel {

	int largura;
	int altura;
	
	public Retangulo(int largura, int altura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	@Override
	public double CalculaArea() {
		return this.altura * this.largura;
	}

}
