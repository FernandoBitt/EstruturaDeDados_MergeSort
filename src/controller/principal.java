package controller;

public class principal {

	public static void main(String[] args) {
		int lista[]= {11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82};
		int inicio= 0;
		int fim= lista.length-1;
		String mostra="";
		
		controlador.mergeSortRecursivo(lista, inicio, fim);
		
		for (int i=0;i<lista.length;i++) {
			mostra += lista[i]+" ";
		}
		
		System.out.println(mostra);
	}

}
