import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.LinkedHashSet;

public class Libreria {
	private List<Libro> collezioneLibri;
	
	public Libreria() {
		this.collezioneLibri=new ArrayList<>();
	}
	
	public Libreria(List<Libro> collezione) {
		this.collezioneLibri=collezione;
	}
	
	public void add(Libro l) {
		this.collezioneLibri.add(l);
	}
	
	public void remove(Libro l) {
		this.collezioneLibri.remove(l);
	}
	
	public long trova(String autore, double prezzo){
		return collezioneLibri.stream()
				.filter(libro->libro.getAutore().equals(autore))
				.filter(libro->libro.getPrezzo() > prezzo)
				.count();
	}
	
	public List<String> libriAutore(String autore){
		Set<String> libriAutore=new LinkedHashSet<>();
		collezioneLibri.forEach(libro->{if(libro.getAutore().equals(autore)) libriAutore.add(libro.getTitolo()); });
		return libriAutore.stream().collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "Libreria [collezioneLibri=" + collezioneLibri + "]";
	}
}