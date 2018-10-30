import java.util.*;

public class ticTacToe2 {

	//declaration of all variables
	static boolean ersterZug = false;
	static int punkteSpieler = 0;
	static int punkteKI = 0;
	static char feld [][] = new char[3][3];
	static Scanner konsole = new Scanner(System.in);
	public static void main(String[] args) {
		
		inizialisiereBoard();
		menue();
	}
	//declaration of board size
	public static void inizialisiereBoard() {
		for(int z=0;z<3;z++) {
			for(int s=0;s<3;s++) {
				feld[z][s]='_';
			}
		}
	}
	//print the actual board out
	public static void printBoard() {
		System.out.println("["+feld[0][0]+"]"+"["+feld[0][1]+"]"+"["+feld[0][2]+"]");
		System.out.println("["+feld[1][0]+"]"+"["+feld[1][1]+"]"+"["+feld[1][2]+"]");
		System.out.println("["+feld[2][0]+"]"+"["+feld[2][1]+"]"+"["+feld[2][2]+"]");
	}
	//Menu where the player is introduced into the game and is asked if he wants to start
	public static void menue () {
		
		System.out.println("Willkommen bei TicTacToe");
		System.out.println("Bei dieser Variante geben Sie ihr Feld mittels Koordinaten an wobei die erste Zahl für die Zeile steht und die zweite für die Spalte");
		System.out.println("Wenn Sie beginnen möchten geben Sie jetzt : 1  ein wenn der Computer beginnen soll: 0");
		String beginner = konsole.nextLine();
		if(beginner.equals("1")) {
			ersterZug = true;
			starteSpiel();
		}else{
			ersterZug = false;
			starteSpiel();
		}
		
	}
	//check if player is going to start or computer
	public static void starteSpiel(){
		if(ersterZug==true) {
			spielerAmZug(konsole);
		}else {
			computerAmZug(konsole);		
		}
	}
	//player turn. Looking if the field is empty, if empty write down X add points to scoreBoard and check if player won
	public static void spielerAmZug(Scanner konsole) {
		System.out.println("Wählen Sie bedacht");
		printBoard();
		int z = konsole.nextInt() -1;
		int s = konsole.nextInt() -1;
		 if(feld[z][s]=='_') {
			 feld[z][s]='X';
			 if(feld[0][0]=='X') {
				 printBoard();
				 punkteSpieler=punkteSpieler +1;
				 System.out.println(punkteSpieler);
				 pruefePunkteSpieler(konsole);
				 computerAmZug(konsole);
			 }else if(feld[0][1]=='X') {
				 printBoard();
				 punkteSpieler=punkteSpieler+2;
				 System.out.println(punkteSpieler);
				 pruefePunkteSpieler(konsole);
				 computerAmZug(konsole);
			 }else if(feld[0][2]=='X') {
				 printBoard();
				 punkteSpieler =punkteSpieler+3;
				 System.out.println(punkteSpieler);
				 pruefePunkteSpieler(konsole);
				 computerAmZug(konsole);
			 }else if(feld[1][0]=='X') {
				 printBoard();
				 punkteSpieler=punkteSpieler+100;
				 System.out.println(punkteSpieler);
				 pruefePunkteSpieler(konsole);
				 computerAmZug(konsole);
			 }else if(feld[1][1]=='X') {
				 printBoard();
				 punkteSpieler=punkteSpieler+200;
				 System.out.println(punkteSpieler);
				 pruefePunkteSpieler(konsole);
				 computerAmZug(konsole);
			 }else if(feld[1][2]=='X') {
				 printBoard();
				 punkteSpieler=punkteSpieler+300;
				 System.out.println(punkteSpieler);
				 pruefePunkteSpieler(konsole);
				 computerAmZug(konsole);
			 }else if(feld[2][0]=='X') {
				 printBoard();
				 punkteSpieler=punkteSpieler+1000;
				 System.out.println(punkteSpieler);
				 pruefePunkteSpieler(konsole);
				 computerAmZug(konsole);
			 }else if(feld[2][1]=='X') {
				 printBoard();
				 punkteSpieler=punkteSpieler+2000;
				 System.out.println(punkteSpieler);
				 pruefePunkteSpieler(konsole);
				 computerAmZug(konsole);
			 }else if(feld[2][2]=='X') {
				 printBoard();
				 punkteSpieler=punkteSpieler+3000;
				 System.out.println(punkteSpieler);
				 pruefePunkteSpieler(konsole);
				 computerAmZug(konsole);
			 }
		 }
	}
	//check PlayerScoreboard
	public static void pruefePunkteSpieler(Scanner konsole) {
		if(punkteSpieler==6||punkteSpieler==600||punkteSpieler==6000||punkteSpieler==3201||punkteSpieler==1203||punkteSpieler==1101||punkteSpieler==2202||punkteSpieler==3303) {
			System.out.println("Diesesmmal haben Sie gewonnen");
		}
		
	}
	//KI turn. Looking if the field is empty, if empty write down O add points to the KiScoreboard and check if Ki won
	public static void computerAmZug(Scanner konsole) {
		if(feld[0][0]=='_') {
			feld[0][0]='O';
			printBoard();
			punkteKI +=1;
			pruefePunkteKI(konsole);
			spielerAmZug(konsole);
		}else if(feld[0][1]=='_') {
			feld[0][1]='O';
			printBoard();
			punkteKI +=2;
			pruefePunkteKI(konsole);
			spielerAmZug(konsole);
		}else if(feld[0][2]=='_') {
			feld[0][2]='O';
			printBoard();
			punkteKI +=3;
			pruefePunkteKI(konsole);
			spielerAmZug(konsole);
		}else if(feld[1][0]=='_') {
			feld[1][0]='O';
			printBoard();
			punkteKI +=10;
			pruefePunkteKI(konsole);
			spielerAmZug(konsole);
		}else if(feld[1][1]=='_') {
			feld[1][1]='O';
			printBoard();
			punkteKI +=20;
			pruefePunkteKI(konsole);
			spielerAmZug(konsole);
		}else if(feld[1][2]=='_') {
			feld[1][2]='O';
			printBoard();
			punkteKI +=30;
			pruefePunkteKI(konsole);
			spielerAmZug(konsole);
		}else if(feld[2][0]=='_') {
			feld[2][0]='O';
			printBoard();
			punkteKI +=100;
			pruefePunkteKI(konsole);
			spielerAmZug(konsole);
		}else if(feld[2][1]=='_') {
			feld[2][1]='O';
			printBoard();
			punkteKI +=200;
			pruefePunkteKI(konsole);
			spielerAmZug(konsole);
		}else if(feld[2][2]=='_') {
			feld[2][2]='O';
			printBoard();
			punkteKI +=300;
			pruefePunkteKI(konsole);
			spielerAmZug(konsole);
		}
	}
	//check KiScoreboard
	private static void pruefePunkteKI(Scanner konsole) {
		if(punkteKI==6||punkteKI==60||punkteKI==600||punkteKI==321||punkteKI==123||punkteKI==111||punkteKI==222||punkteKI==333) {
			System.out.println("Diesesmmal haben die Maschinen gewonnen");
		}
	}
}
