package prueba;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int variable,variable2;
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca las variable 1");
		variable=s.nextInt();
		System.out.println("Introduzca la variable 2");
		variable2=s.nextInt();
		int producto=variable*variable2;
System.out.println("Hola");
System.out.println("\n El producto de"+variable+"y"+variable2+"es"+producto);
s.close();
	}

}
