package ComplejidadComputacional;

import java.util.Arrays;

public class Polinomio {
	private int grado;
	private double[] coeficientes;

	// La posicion 0 del arreglo de coeficientes contiene el coeficiente de grado n
	// la posicion n contiene al termino independiente.

	public Polinomio(double[] coeficientes) {
		this.coeficientes = coeficientes;
		this.grado = coeficientes.length - 1;
	}

	@Override
	public String toString() {
		String cad = new String("Polinomio grado=" + grado + ", P(x)= ");
		for (int i = 0; i < grado; i++) {
			cad += coeficientes[i] + "x^" + (grado - i) + " + ";
		}
		cad += coeficientes[grado];
		return cad;
	}

	double evaluarMSucesivas(double x) {
<<<<<<< Updated upstream
		double suma = 0, resPow;
		
		for(int i = 0; i<=grado; i++) {
			resPow = x;
			for(int j = 0; j < grado - i; j++) {
				resPow *= resPow;
			}
			suma += resPow * coeficientes[i];
=======
		double suma = 0;
		for (int i = 0; i <= grado; i++) {
			suma += Math.pow(x, i) * coeficientes[grado - i];
>>>>>>> Stashed changes
		}
		return suma;
	}

	double evaluarRecursiva(double x){
		
		return evaluarRecursiva(x);
	}

//	double evaluarRecursivaPar(double x){...}
//
	double evaluarProgDinamica(double x){
		double multiplicacionSucesivas = 1;
		double suma = 0;
		for(int i = grado; i >= 0; i--) {			
			suma += multiplicacionSucesivas * coeficientes[i];
			multiplicacionSucesivas *= x;
		}
		return suma;
}

//
//	double evaluarMejorada(double x){...}
//
	double evaluarPow(double x){
		double suma = 0;
		for(int i = 0; i<=grado; i++) {
			suma += Math.pow(x, i) * coeficientes[grado - i];
		}

		return suma;
	}

	double evaluarHorner(double x) {
		double suma = 0;
<<<<<<< Updated upstream
		for(int i = 0; i<=grado; i++) {
=======
		for (int i = 0; i <= grado; i++) {
>>>>>>> Stashed changes
			suma = suma * x + coeficientes[i];
		}
		return suma;
	}
}
