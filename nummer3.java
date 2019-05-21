package Bonusaufgaben1;

import java.util.Arrays;

public class nummer3 {
	
	private double[] vektor;
	
	public nummer3(double[] vektor) {
		this.vektor = vektor;
	}
	
	public double arithMittel() {
		double erg = 0;
		for(int i = 0; i<vektor.length; i++) {
			erg +=vektor[i];
		}
		erg /= vektor.length;
		return erg;
	}
	public double median() {
		Arrays.sort(vektor);
		if(vektor.length%2==1)
			return vektor[vektor.length/2];
		else
			return (vektor[vektor.length/2] + vektor[(vektor.length/2)+1])/2; //sorry
	}
	public double geoMittel() {
		double erg = vektor[0];
		for(int i = 1; i<vektor.length; i++) {
			erg *=vektor[i];
		}
		if(erg==0)
			return 0;
		else 
			return root(erg, vektor.length);
	}
	public double harmMittel() {
		double erg = 0;
		for (int i = 0; i < vektor.length; i++) {
			erg += 1/vektor[i];
		}
		return vektor.length/erg;
	}
	public double var() {
		double erg = 0;
		for (int i = 0; i < vektor.length; i++) {
			erg +=Math.pow(vektor[i]-arithMittel(),2);
		}
		return ((double)1/vektor.length)*erg;
	}
	public double korrVar() {
		double erg = 0;
		for (int i = 0; i < vektor.length; i++) {
			erg +=Math.pow(vektor[i]-arithMittel(),2);
		}
		return ((double)1/(vektor.length-1))*erg;
	}
	public double empStandartabweichung() {
		return Math.sqrt(var());
	}
	public double korrStandartabweichung() {
		return Math.sqrt(korrVar());
	}
	public static double root(double num, double root) {
		return Math.pow(Math.E, Math.log(num)/root);
	}
}
