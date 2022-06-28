
public class Esagono implements Poligono {

	private int lato;
	final double costante = 2.598;

	public Esagono(int lato) {
		this.lato = lato;
	}

// calcoli 

	@Override
	public void calcolaPerimetro() {
		int perimetro = (lato * 6);
		System.out.println("Il perimetro dell'esagono è: " + perimetro);

		return;
	}

	@Override
	public void calcolaArea() {
		double area = (lato * lato) * costante;
		System.out.println("L'area dell'esagono è: " + area);
		return;

	}

}
