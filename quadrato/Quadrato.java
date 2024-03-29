package quadrato;

import java.util.Scanner;

public class Quadrato {

	private int lato;

	public Quadrato(){
		lato = 0;
	}

	public Quadrato(int lato){
		this.lato = lato;
	}
	
	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		int l;
		
		do {
			System.out.println("Inserisci il lato del quadrato");
			l = KB.nextInt();
		}while(l<=0);
		setLato(l);
	}
	
	public void setLato(int lato) {
		if (lato>0)
			this.lato = lato;
		else 
			this.lato = 0;
	}
	
	public int getLato() {
		return lato;
	}
	
	public int getPerimetro() {
		int p = lato*4;
		return p;
	}

	public int getArea() {
		int area=lato*lato;
		return area;
	}
		
	public String toString() {
		String s= "Quadrato -> Lato= " + getLato() + " Perimetro= " + getPerimetro() + " Area= " + getArea();
		return s;
	}
	
}
