package view;

import java.util.concurrent.Semaphore;

import Controller.Formula1;

public class MainFormula1 {

	public static void main(String[] args) {
		Semaphore se =new Semaphore(5);
		for (int ca =1; ca <=2; ca++) {
			for ( int i = 1; i <= 14; i++) {
		
		Thread s = new Formula1 (i , se , ca );
		s.start();
		}
		}
	}

}
