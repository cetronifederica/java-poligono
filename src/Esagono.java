
public class Esagono implements Poligono {

	// attributi
	private double lato;
	final double costante = 2.598;

	// costruttore
	public Esagono(double lato) {
		this.lato = lato;
	}

// calcoli 

	@Override
	public double calcolaPerimetro() {
		double perimetro = (lato * 6);
		System.out.println("Il perimetro dell'esagono è: " + perimetro);

		return perimetro;
	}

	@Override
	public double calcolaArea() {
		double area = (lato * lato) * costante;
		System.out.println("L'area dell'esagono è: " + area);
		return area;

	}

}
