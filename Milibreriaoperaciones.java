package polinomios;

public class Milibreriaoperaciones {
	/**
	 *Ángela
	 *20:50:14
	 *31-ene-2021
	 **/
	/**
	 * método que suma dos polinomios
	 * @param pol1
	 * @param pol2
	 */
	public static int[] suma(int pol1[],int pol2[]) {
	int[]suma =new int[Math.max(pol1.length, pol2.length)];
	for(int i=0;i<Math.min(pol1.length, pol2.length);i++) {
		suma[i]=pol1[i]+pol2[i];
		if(pol1.length<pol2.length) {
			for(int cont =pol1.length;cont<pol1.length;cont++) {
				suma[cont]=suma[cont]+pol1[cont]+pol2[cont];
			}
			
		}
		for(int cont =pol2.length;cont<pol2.length;cont++) {
			suma[cont]=suma[cont]+pol1[cont]+pol2[cont];
		}
	}
		return suma;
		
	}
	/**
	 * método que resta dos polinomios
	 * @param pol1
	 * @param pol2
	 */
	public static int[] resta(int pol1[],int pol2[]) {
		int resta[]=new int[Math.max(pol1.length, pol2.length)];
		for(int i=0;i<Math.min(pol1.length, pol2.length);i++) {
resta[i]=pol1[i]-pol2[i];
			if(pol1.length<pol2.length) {
				for(int cont =pol1.length;cont<pol1.length;cont++) {
					resta[cont]=resta[cont]-pol1[cont]-pol2[cont];
				}
				
			}
			else {
				for(int cont =pol2.length;cont<pol2.length;cont++) {
					resta[cont]=resta[cont]+pol1[cont]+pol2[cont];
				}
			}
			
		}
		return resta;
	}
	/**
	 * método que multiplica polinomios
	 */
	public static int[] multiplicacion(int[] pol1,int []pol2) {
		
		
		int producto[]=new int[pol1.length+pol2.length];
		for(int cont=0;cont<pol1.length;cont++) {
			for(int e=producto[cont];e<pol2.length;e++) {
				
				producto[cont+e]=producto[cont+e]+pol1[cont]*pol2[e];
			}
		}
		return producto;
	}
	
}
