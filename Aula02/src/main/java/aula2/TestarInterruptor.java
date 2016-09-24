package aula2;

import java.util.Scanner;

public class TestarInterruptor {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		Lampada objLampada = new Lampada("", "");
		Interruptor objInterruptor = new Interruptor(objLampada);
		
		objInterruptor.Apertar();		
		objInterruptor.Apertar();
		
//		sc.close();
	}

}
