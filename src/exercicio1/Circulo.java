package exercicio1;

public class Circulo implements AreaCalculavel {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double CalculaArea() {
		return this.raio *this.raio * Math.PI;
	}

}
