package it.prova.provaset.test;

import java.util.Set;
import java.util.HashSet;

public class TestProvaSet {

	public static void main(String[] args) {
		//https://it.tutorialcup.com/java/set-java.htm
		Set<String> set1 = new HashSet<String>();
		
		Set<String> setString = new HashSet<String>();
		
		set1.add("Python");
		set1.add("C++");
		
		setString.add("Java");
		setString.add("Javascript");
	
		// STAMPO L'INSIEME DI set1 e setString
		System.out.println("set1 contiene: " + set1);
		System.out.println("setString contiene: " + setString);
		
		//UNISCO I DUE INSIEMI CON IL METODO .addAll
		
		setString.addAll(set1);
		
		System.out.println("Ora l'insieme setString contiene anche set1: " + setString);
		
		//ANALOGAMENTE, ESISTONO ANCHE I METODI .remove() e .removeAll()###########
	}

}