import java.util.ArrayList;
import java.util.List;

public class Libreria2 {
	private List<Libro> collezioneLibri;
	
	public Libreria2() {
		this.collezioneLibri=new ArrayList<>();
	}
	
	public Libreria2(List<Libro> collezione) {
		this.collezioneLibri=collezione;
	}
	
	public void add(Libro l) {
		this.collezioneLibri.add(l);
	}
	
	public void remove(Libro l) {
		this.collezioneLibri.remove(l);
	}
	
	public int trova(String autore, double prezzo){
		int cont=0;
		for(Libro l : collezioneLibri) {
			if(l.getAutore().equals(autore) && l.getPrezzo() > prezzo)
					cont++;
		}
		return cont;
	}
	
	public List<String> libriAutore(String autore){
		List<String> libriAutore=new ArrayList<>();
		
		for (Libro l : collezioneLibri) {
			if(l.getAutore().equals(autore))
				if(!libriAutore.contains(autore))
					libriAutore.add(l.getTitolo());
		}
		return libriAutore;
	}

	@Override
	public String toString() {
		return "Libreria [collezioneLibri=" + collezioneLibri + "]";
	}
}
