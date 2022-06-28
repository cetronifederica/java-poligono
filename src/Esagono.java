
public class Esagono implements Poligono {

	private int lato;
	final double costante;

	public Esagono(int lato, double costante) {
		this.costante = 2.598;
		this.lato = lato;
	}

// calcoli 
	public double area() {
		double area = (lato * lato) * costante;
		return area;
	}
	// @Override
	// public void calcolaPerimetro() {
	// int perimetro = (lato * 6);

	// }

	// @Override
	// public void calcolaArea() {
	// System.out.println("L'area dell'esagono è: ");

	// }

	@Override
	public void calcolaPerimetro() {
		// TODO Auto-generated method stub

	}

	@Override
	public void calcolaArea() {
		// TODO Auto-generated method stub

	}

}
