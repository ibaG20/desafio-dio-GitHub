package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a, b);
		int sub = sub(a, b);
		float div = div(a, b);
		int mult = mult(a, b);
		int pot = pot (a, b);
		
		System.out.println(a + " + " + b + " = " + soma);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " / " + b + " = " + div);
		System.out.println(a + " x " + b + " = " + mult);
		System.out.println(a + " ^ " + b + " = " + pot);
		
	}
	
	public static int soma (int a, int  b) {
		return a + b;
	}
	
	public static int sub (int a, int b) {
		return a - b;
	}
	
	public static float div (int a, int b) {
		float div;
		div = (float)a / (float)b;
		return div;
	}

	public static int mult (int a, int b) {
		return a * b;
	}
	
	public static int pot (int a, int b) {
		int potencia = (int) (Math.pow(a,b));
		return potencia;
	}
  }