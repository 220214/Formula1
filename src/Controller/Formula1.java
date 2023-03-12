package Controller;

import java.util.concurrent.Semaphore;

public class Formula1 extends Thread{
	//private  int [] temp = new int[7];
	//private int [] vt= new int [7];
	private int ca;
	private int carro;
	private Semaphore se;
	public Formula1( int carro, Semaphore se,int ca) {
		this.carro= carro;
		this.se= se;
		this.ca=ca;
		}

	public void run() {
		try {
			se.acquire();
			carro();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			se.release();
		}
		//Classifica();
		
	}
	private void carro() {
		
		int volta= 3;
		int dis = 1;
		int tempo =(int)((Math.random()*10)+10 );
		int vI= 0;
			while (vI< volta) {
				vI += dis;
				
				System.out.println("Carro  "+carro +" equipe "+ ca +"   " +  vI + "voltas  em " + tempo  );
			}
			try {
				sleep(tempo);
			}catch (InterruptedException e) {
				e.printStackTrace();
				}finally {
					se.release();
				}
	}
}
			/*if (carro ==0) {
				temp[1]=tempo;
			}
			if(tempo < temp[1]) {
					temp[1] =tempo;
					vt[1]= vI;
			}
			
		}
	}/*
	private void carro2() {
		int volta= 3;
		int dis = 1;
		int tempo =(int)((Math.random()*1000)+1000 );
		int vI= 0;
		for (int i=0 ; i < 2; i ++) {
			while (dis< volta) {
				vI += dis;
				dis++;
				System.out.println("Carro2 "+ vI + "voltas  em " + tempo  );
			}
			try {
				sleep(tempo);
			}catch (InterruptedException e) {
				e.printStackTrace();
				}
			if (i==0) {
				temp[2] =tempo;
			}
			if(tempo < temp[2]) {
					temp[2] =tempo;
					vt[2]= vI;
			}
			
		}
	}
	
		private void carro3() {
			int volta= 3;
			int dis = 1;
			int tempo =(int)((Math.random()*1000)+1000 );
			int vI= 0;
			for (int i=0 ; i < 2; i ++) {
				while (dis< volta) {
					vI += dis;
					dis++;
					System.out.println("Carro3 "+ vI + "voltas  em " + tempo );
				}
				try {
					sleep(tempo);
				}catch (InterruptedException e) {
					e.printStackTrace();
					}
				if (i==0) {
					temp[3] =tempo;
				}
				if(tempo < temp[3]) {
						temp[3] =tempo;
						vt[3]= vI;
				}
				
			}
		
	}
		private void carro4() {
			int volta= 3;
			int dis = 1;
			int tempo =(int)((Math.random()*1000)+1000 );
			int vI= 0;
			for (int i=0 ; i < 2; i ++) {
				while (dis< volta) {
					vI += dis;
					dis++;
					System.out.println("Carro4 "+ vI + "voltas  em " + tempo  );
			}
				try {
					sleep(tempo);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i==0) {
				temp[4] =tempo;
				}
				if(tempo < temp[4]) {
					temp[4] =tempo;
					vt[4]= vI;
			}
			
		}
	}
	
		private void carro5() {
			int volta= 3;
			int dis = 1;
			int tempo =(int)((Math.random()*1000)+1000 );
			int vI= 0;
			for (int i=0 ; i < 2; i ++) {
				while (dis< volta) {
					vI += dis;
					dis++;
					System.out.println("Carro 5 "+ vI + "voltas em " + tempo  );
				}
				try {
					sleep(tempo);
				}catch (InterruptedException e) {
					e.printStackTrace();
					}
				if (i==0) {
					temp[5] =tempo;
				}
				if(tempo < temp[5]) {
						temp[5] =tempo;
						vt[5]= vI;
				}
				
			}
		
	}
		private void carro6() {
			int volta= 3;
			int dis = 1;
			int tempo =(int)((Math.random()*1000)+1000 );
			int vI= 0;
			for (int i=0 ; i < 2; i ++) {
				while (dis< volta) {
					vI += dis;
					dis++;
					System.out.println("Carro6 "+ vI + "voltas  em " + tempo );
				}
				try {
					sleep(tempo);
				}catch (InterruptedException e) {
					e.printStackTrace();
					}
				if (i==0) {
					temp[6] =tempo;
				}
				if(tempo < temp[6]) {
						temp[6] =tempo;
						vt[6]= vI;
				}
				
			}
		}
	
	private void carro7() {
		int volta= 3;
		int dis = 1;
		int tempo =(int)((Math.random()*1000)+1000 );
		int vI= 0;
		for (int i=0 ; i < 2; i ++) {
			while (dis< volta) {
				vI += dis;
				dis++;
				System.out.println("Carro7 "+ vI + "voltas em " + tempo );
			}
			try {
				sleep(tempo);
			}catch (InterruptedException e) {
				e.printStackTrace();
				}
			if (i==0) {
				temp[7] =tempo;
			}
			if(tempo < temp[7]) {
					temp[7] =tempo;
					vt[7]= vI;
			}
			
		}
		System.out.println();
	}
	/*private void classifica() {
		
	int i ;
	int j ;
		for ( i = 1; i <=7; i ++) {
			for( j = (i+1); j <=6;i++) {
				if (temp[i]> temp[j]) {
					int aux = i;
					i =j;
					j =aux;
			}
		}
	}
		for(int cta = 1 ; cta <=3; cta ++) {
			System.out.println("O Carro  "+ i +"");
		}
	}*/

