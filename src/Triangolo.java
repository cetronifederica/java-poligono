
public class Triangolo implements Poligono {

	// attributi
	private double lato1, lato2, lato3, base, altezza;

	// costruttore
	public Triangolo(double lato1, double lato2, double lato3, double base, double altezza) {
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.base = base;
		this.altezza = altezza;
	}

	// calcoli

	@Override
	public double calcolaPerimetro() {
		double perimetro = (lato1 + lato2 + lato3);
		System.out.println("Il perimetro del triangolo è: " + perimetro);
		return perimetro;

	}

	@Override
	public double calcolaArea() {
		double area = (base * altezza) / 2;
		System.out.println("l'area del triangolo è: " + area);
		return area;

	}

}
