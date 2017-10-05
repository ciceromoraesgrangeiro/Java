package introducaometodos.test;

import introducaometodos.classes.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args){
		Calculadora calc=new Calculadora();
		calc.somaDoisNumeros();
		System.out.println("--------------");
		calc.subtracaoDoisNumeros();
		calc.multiplicaDoisNumeros(5, 5);
		System.out.println("----------*----");
		System.out.println(calc.divideDoisNumeros(20,2));
		System.out.println("***************");
		System.out.println( calc.divideDoisNumeros(20,2));
		
		
	}

}
