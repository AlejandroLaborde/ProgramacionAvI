package exam;

import java.util.Map;
import java.util.TreeMap;

public class program {

	public static void main(String[] args) {
		String s = "No se, no entiendo, no funciona";
		s.replaceAll("no", "");
		System.out.println(s.indexOf("no"));
	
		
		String u = new String("UNO");
		String d = new String("DOS");
		String i = new String("UNO");
		
		Map<String, String> lista = new TreeMap();
		lista.put(u, u);
		lista.put(d, d);
		lista.put(i, i);
		
		System.out.println(lista.size());
		
		asdasd sad = new asdasd();
		
		sad.manejoExepciones();
	}
	

	
	
	
}


