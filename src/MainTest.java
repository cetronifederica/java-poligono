
public class MainTest {
	public static void main(String[] args) {

		Poligono triangolo = new Triangolo(10, 20, 30, 30, 20);

		triangolo.calcolaArea();
		triangolo.calcolaPerimetro();

		Poligono esagono = new Esagono(10);
		esagono.calcolaArea();
		esagono.calcolaPerimetro();

	}
}
