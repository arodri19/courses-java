import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		palavras.sort(comparador);
//		Collections.sort(palavras,comparador);
		
		
		palavras.sort((s1, s2) -> {
				if(s1.length() < s2.length())
					return -1;
				if(s1.length() > s2.length())
					return 1;
				return 0;
		});
		
		palavras.sort((s1, s2) -> {
			return Integer.compare(s1.length(), s2.length());
		});
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		Function<String, Integer> funcao = s-> s.length();
		Comparator<String> comparador2 = Comparator.comparing(funcao);
		palavras.sort(comparador2);
		
		palavras.sort(Comparator.comparing(String::length));
		
		System.out.println(palavras);
		
		for(String p: palavras){
			System.out.println(p);
		}
		
//		Consumer<String> consumidor = new ImprimeNaLinha();
		
//		Consumer<String> consumidor = new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//				
//			}
//			
//		};
		
		Consumer<String> consumidor = ((String s) -> {
				System.out.println(s);
				
			});
		
//		palavras.forEach(consumidor);
		Consumer<String> impressor = s -> System.out.println(s);
		Consumer<String> impressor2 = System.out::println;
		palavras.forEach(impressor);
		palavras.forEach(s -> System.out.println(s));

	}

}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}
	
}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}