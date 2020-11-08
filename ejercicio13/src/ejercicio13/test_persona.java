package ejercicio13;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class test_persona {
	
	@Before
	public void before() {
		System.out.println("-------------Inicia test------------------");
	}
	
//	@Test
//	public void test_01List() {
//		List<Persona> lista = new ArrayList();
//		Persona p1 = new Persona( "Juan" ,"Perez", 29942000 );
//		Persona p2 = new Persona( "Victor", "Lopez" ,24540789 );
//		Persona p3 = new Persona( "Juan", "Perez" , 29942000 );
//		lista.add(p1);
//		lista.add(p2);
//		lista.add(p3);
//		
//		for (Persona persona : lista) {
//		
//			System.out.println(persona.toString());
//		}
//		
//		assertTrue(true);
//	}
	@Test
	public void test_02Set() {
		Set<Persona> lista = new HashSet<Persona>();
		Persona p1 = new Persona( "Juan" ,"Perez", 29942000 );
		Persona p2 = new Persona( "Victor", "Lopez" , 24540789 );
		Persona p3 = new Persona( "Juan", "Perez" , 29942000 );
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		for (Persona persona : lista) {
			System.out.println(persona.toString());
		}
		assertTrue(true);
	}
	
	@Test
	public void test_02Sorted() {
		Set<Persona> lista = new HashSet();
		Persona p1 = new Persona( "Perez" ,"Juan", 29942002 );
		Persona p2 = new Persona( "Lopez", "asd" , 24540789 );
		Persona p3 = new Persona( "AlfredApellido", "aa" , 29942000 );
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		for (Persona persona : lista) {
			System.out.println(persona.toString());
		}
		assertTrue(true);
	}
//	@Test
//	public void test_03Map() {
//		
//		Map<Integer,Persona> lista = new HashMap();
//		Persona p1 = new Persona( "Juan" ,"Perez", 29942000 );
//		Persona p2 = new Persona( "Victor", "Lopez" ,24540789 );
//		Persona p3 = new Persona( "Juan", "Peresssz" ,29942000 );
//		lista.put(p1.dni, p1);
//		lista.put(p2.dni, p2);
//		lista.put(p3.dni, p3);
//		
//		Collection<Persona> valores = lista.values();
//		
//		for (Persona persona : valores) {
//			System.out.println(persona);
//		}
//		
//		assertTrue(true);
//	}
}
