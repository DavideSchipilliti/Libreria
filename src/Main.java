import java.util.List;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Libro libro1=new Libro("titolo1", "autore1", 10.50);
		Libro libro2=new Libro("titolo2", "autore2", 5.50);
		Libro libro3=new Libro("titolo3", "autore3", 20.00);
		
		List<Libro> listaLibri= new ArrayList<> ();
		listaLibri.add(libro1);
		listaLibri.add(libro2);
		listaLibri.add(libro1);
		listaLibri.add(libro3);
		
		Libreria libreria1=new Libreria(listaLibri);
		
		for(Libro l : listaLibri) {
			System.out.println(l.toString());
		}
		
		libreria1.add(new Libro("titolo2", "autore2", 12.30));
		System.out.println(libreria1.trova("autore1", 10.00));	//ho 2 libri con prezzo 10.50
		System.out.println(libreria1.trova("autore2", 7.50));	//ho un libro a 5.50 e uno a 12.30
		
		libreria1.add(new Libro("titolo4", "autore2", 10.30));
		System.out.println(libreria1.libriAutore("autore2"));	//autore 2 ha fatto titolo2 e titolo4
		
		System.out.println(libreria1.toString());

	}

}
