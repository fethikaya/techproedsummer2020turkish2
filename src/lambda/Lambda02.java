package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		kareCiftFunctional (list);
		System.out.println();
		kupBirFazlaFunctional (list);
		System.out.println();
		kareKokCiftFunctional (list);
		System.out.println();
		maxElFunctional (list);
	}

	// �ift say� olan elemlar�n� karesin ayn� sat�rda aralranda bo�luk b�rakarak consula yazdr�n
	
	public static void kareCiftFunctional (List <Integer>list) {
		list.stream().filter(Lambda01::isCift).map(t->t*t).forEach(Lambda01::printEl);
	}
	
	// Teksay� olan elemlar�n� bir fazlas� ayn� sat�rda aralranda bo�luk b�rakarak consula yazdr�n
	
	public static void kupBirFazlaFunctional (List <Integer>list) {
		list.stream().filter(t->t%2!=0).map(t->t*t*t+1).forEach(Lambda01::printEl);
	}
	
	// �ift say� olan elemanlar�n karek�k�n� yaz�n
	
	public static void kareKokCiftFunctional (List <Integer>list) {
		list.stream().filter(Lambda01::isCift).map(Math::sqrt).forEach(System.out::println);
	}
	
	// En b�y�k elaman� consola yazd�r�n.
	
	public static void maxElFunctional (List <Integer>list) {
		Optional<Integer> max = list.stream().reduce(Math::max);
		System.out.println(max);
	}
}
