package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco");
		
		//tamanho da lista com list.size
		System.out.println(list.size());
		
		//remover um elemento da lista
		list.remove("Anna");
		
		
		for(String x : list) {
			
			System.out.println(x);
		}
		System.out.println("----------");
		
		//remover a partir de um predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			
			System.out.println(x);
		}
		//pesquisar por um nome utilizando indexof
		System.out.println("----------");
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		System.out.println("Index of bob: " + list.indexOf("Marco"));
		
		System.out.println("----------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			
			System.out.println(x);
		}
		System.out.println("----------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
	}

}
