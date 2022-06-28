
public class Triangolo implements Poligono {

	private int lato1, lato2, lato3, base, altezza;

	public Triangolo(int lato1, int lato2, int lato3, int base, int altezza) {
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.lato3 = lato3;
		this.base = base;
		this.altezza = altezza;
	}

	// calcoli

	@Override
	public void calcolaPerimetro() {
		int perimetro = (lato1 + lato2 + lato3);
		System.out.println("Il perimetro del triangolo è: " + perimetro);

	}

	@Override
	public void calcolaArea() {
		int area = (base * altezza) / 2;
		System.out.println("l'area del triangolo è: " + area);

	}

}
