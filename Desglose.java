package practica21;

public class Desglose {
	/**
	 *Ángela
	 *8:14:06
	 *16-abr-2021
	 **/
	/**
	variables de instancia
*/
	private double dinero_total;
	private double[] dinero_legal;
	private int[]dinero;
	public Desglose(double d) {
		this.dinero_total=d;
		dinero_legal=new double[] {500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
		dinero=new int[15];
	}
	
	
	public double getDinero_total() {
		return dinero_total;
	}


	public void setDinero_total(double dinero_total) {
		this.dinero_total = dinero_total;
	}


	public double[] getDinero_legal() {
		return dinero_legal;
	}


	public void setDinero_legal(double[] dinero_legal) {
		this.dinero_legal = dinero_legal;
	}


	public int[] getDinero() {
		return dinero;
	}


	public void setDinero(int[] dinero) {
		this.dinero = dinero;
	}


	/**
	 * método que extrae la cantidad en desglose
	 */
	public int[]desglosar(){
		int valor=0;
		int aux=(int) this.dinero_total;
		
		for(int cont=0;cont<this.dinero_legal.length;cont++) {
			while(aux>=this.dinero_legal[cont]) {
				aux=(int) (aux-this.dinero_legal[cont]);
				valor++;
				dinero[cont]=valor;
				
				
			}
		}
		return dinero;
		
	}
	@Override
	public String toString() {
		String text=" ";
		for(int cont=0;cont<dinero.length;cont++) {
			text=text+"\n"+desglosar()[cont]+" "+(this.dinero_legal[cont]<5?"monedas":"billetes")+" de "+this.dinero_legal[cont]+" €";
		}
		return text;
	}
}
