package sandbox;

import java.util.Scanner;
class Elem {
	int adat;
	Elem kov;	
}

class LinkedList {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		Elem elso = new Elem();
		Elem akt = new Elem();
		elso.kov = null;
		
		int szam = 0;
		do {
			
			System.out.print("Szam: ");
			szam = in.nextInt();
			if(szam != 0) {
				Elem uj = new Elem();

				uj.adat = szam;
				uj.kov = null;
			
				if(elso.adat == 0) {				
					elso = uj;
				}else {
					akt.kov = uj;
				}
				akt = uj;
			}
		}while(szam != 0);
		
		akt = elso;
		
		//Kiíratás
		System.out.println("Kiíratás");
		do {
			System.out.println(akt.adat);
			akt = akt.kov;
		}while(akt != null);
		
	}
}
