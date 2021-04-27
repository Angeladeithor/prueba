package polinomios;

import java.util.Arrays;
import java.util.Scanner;

public class Mainpolinomio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e=new Scanner(System.in);
		int n1,n2;
		
		
		System.out.print(" \n Introduzca el grado del primer polinomio");
		n1=e.nextInt();
		System.out.print("\n Introduzca el grado del segundo polinomio:");
			n2=e.nextInt();
			
Polinomio p1=new Polinomio(n1);
Polinomio p2=new Polinomio(n2);
p1.aleatorio();
p2.aleatorio();
System.out.print(" \n Polinomio generado:");
System.out.print(p1.toStringpolinomio());
System.out.print("\n segundo polinomio generado:");
System.out.print(p2.toStringpolinomio());
System.out.print("\n Suma de los polinomios generados:");

System.out.print("resultado:"+Arrays.toString(Milibreriaoperaciones.suma(p1.getPolinomio(), p2.getPolinomio())));
System.out.println("\n resta de los polinomios generados.");
System.out.println("Resultado:"+Arrays.toString(Milibreriaoperaciones.resta(p1.getPolinomio(), p2.getPolinomio())));
System.out.println("\n Producto de los polinomios generados");
System.out.println("Resultado:"+Arrays.toString(Milibreriaoperaciones.multiplicacion(p1.getPolinomio(), p2.getPolinomio())));





	}
	/**
	 *Ángela
	 *21:03:26
	 *31-ene-2021
	 **/
	
}
