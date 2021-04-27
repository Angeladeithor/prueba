package polinomios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Polinomio {
	/**
	 *�ngela
	 *20:46:55
	 *31-ene-2021
	 **/
	
		
		
	
	/**
	 * variables de instancia
	 */
	private int []polinomio;
	private int grado;
	/**
	 * constructores
	 */
	public Polinomio (int n) {
		this.grado=n;
		this.polinomio=new int [grado];
	}
	/**
	 * getters y setters
	 */
	public int[] getPolinomio() {
		return polinomio;
	}
	public void setPolinomio(int[] polinomio) {
		this.polinomio = polinomio;
	}
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	public String toStringpolinomio() {
		String cad=" ";
		for(int cont=0;cont<this.polinomio.length;cont++) {
			
		 cad=cad+"+"+polinomio[cont]+"X ^"+cont+" ";
				}
		return cad;
	}
	/**
	 * redefinicion del m�todo toString
	 */
	@override
	public String toString() {
		return Arrays.toString(polinomio);
	}
	/**
	 * m�todo de lectura de los elementos
	 */
	public void lectura() {
		int el;
		Scanner e=new Scanner(System.in);
		for(int cont=0;cont<this.polinomio.length;cont++) {
			System.out.println("Introduzca elemento");
			el=e.nextInt();
			this.polinomio[cont]=el;
		}
		
	}
	/**
	 * m�todo que genera los elemantos aleatorios
	 */
	public void aleatorio() {
		Random r=new Random();
		int el;
		for(int cont=0;cont<this.polinomio.length;cont++) {
			el=r.nextInt(50)+1;
			this.polinomio[cont]=el;
		}
	}
	
}
