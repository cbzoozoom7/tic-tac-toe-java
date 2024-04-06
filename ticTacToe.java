import java.util.*;
import java.io.*;
public class ticTacToe {
	public static void main(String[] args) {
		String[][] ticTacToe=new String[3][3];
		ticTacToe[0][0]=" ";
		ticTacToe[0][1]=" ";
		ticTacToe[0][2]=" ";
		ticTacToe[1][0]=" ";
		ticTacToe[1][1]=" ";
		ticTacToe[1][2]=" ";
		ticTacToe[2][0]=" ";
		ticTacToe[2][1]=" ";
		ticTacToe[2][2]=" ";
		int o=0;
		int x=0;
		boolean win=false;
		int move;
		Scanner myScanner = new Scanner(System.in);
		while (ticTacToe[0][0].equals(" ") || ticTacToe[0][1].equals(" ") || ticTacToe[0][2].equals(" ") || ticTacToe[1][0].equals(" ") || ticTacToe[1][1].equals(" ") || ticTacToe[1][2].equals(" ") || ticTacToe[2][0].equals(" ") || ticTacToe[2][1].equals(" ") || ticTacToe[2][2].equals(" ")) {
			if (o<=x) {
				if ((ticTacToe[0][0].equals(ticTacToe[0][1]) && ticTacToe[0][0].equals(ticTacToe[0][2]) && !ticTacToe[0][0].equals(" ")) || (ticTacToe[1][0].equals(ticTacToe[1][1]) && ticTacToe[1][0].equals(ticTacToe[1][2]) && !ticTacToe[1][0].equals(" ")) || (ticTacToe[2][0].equals(ticTacToe[2][1]) && ticTacToe[2][0].equals(ticTacToe[2][2]) && !ticTacToe[2][0].equals(" ")) || (ticTacToe[0][0].equals(ticTacToe[1][0]) && ticTacToe[0][0].equals(ticTacToe[2][0]) && !ticTacToe[0][0].equals(" ")) || (ticTacToe[0][1].equals(ticTacToe[1][1]) && ticTacToe[0][1].equals(ticTacToe[2][1]) && !ticTacToe[0][1].equals(" ")) || (ticTacToe[0][2].equals(ticTacToe[1][2]) && ticTacToe[0][2].equals(ticTacToe[2][2]) && !ticTacToe[0][2].equals(" ")) || (ticTacToe[0][0].equals(ticTacToe[1][1]) && ticTacToe[0][0].equals(ticTacToe[2][2]) && !ticTacToe[0][0].equals(" ")) || (ticTacToe[0][2].equals(ticTacToe[1][1]) && ticTacToe[0][2].equals(ticTacToe[2][0]) && !ticTacToe[0][2].equals(" "))) {
					System.out.println("Player 2 wins.");
					ticTacToe[0][0]="X";
            		ticTacToe[0][1]="X";
            		ticTacToe[0][2]="X";
            		ticTacToe[1][0]="X";
            		ticTacToe[1][1]="X";
            		ticTacToe[1][2]="X";
            		ticTacToe[2][0]="X";
            		ticTacToe[2][1]="X";
            		ticTacToe[2][2]="X";
            		win=true;
				} else {
					System.out.println("1|2|3");
            		System.out.println("-+-+-");
            		System.out.println("4|5|6");
            		System.out.println("-+-+-");
            		System.out.println("7|8|9");
            		System.out.println("Ready, Player 1? Make your move.");
            		move=myScanner.nextInt();
            		switch (move) {
            			case 1:
            				if (ticTacToe[0][0].equals(" ")) {
            					ticTacToe[0][0]="O";
            					o++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 2:
            				if (ticTacToe[0][1].equals(" ")) {
            					ticTacToe[0][1]="O";
            					o++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 3:
            				if (ticTacToe[0][2].equals(" ")) {
            					ticTacToe[0][2]="O";
            					o++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 4:
            				if (ticTacToe[1][0].equals(" ")) {
            					ticTacToe[1][0]="O";
            					o++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 5:
            				if (ticTacToe[1][1].equals(" ")) {
            					ticTacToe[1][1]="O";
            					o++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 6:
            				if (ticTacToe[1][2].equals(" ")) {
            					ticTacToe[1][2]="O";
            					o++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 7:
            				if (ticTacToe[2][0].equals(" ")) {
            					ticTacToe[2][0]="O";
            					o++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 8:
            				if (ticTacToe[2][1].equals(" ")) {
            					ticTacToe[2][1]="O";
            					o++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 9:
            				if (ticTacToe[2][2].equals(" ")) {
            					ticTacToe[2][2]="O";
            					o++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			default:
            				System.out.println("Invalid input.");
            				break;
            		}
            			System.out.println(ticTacToe[0][0] + "|" + ticTacToe[0][1] + "|" + ticTacToe[0][2]);
            			System.out.println("-+-+-");
            			System.out.println(ticTacToe[1][0] + "|" + ticTacToe[1][1] + "|" + ticTacToe[1][2]);
            			System.out.println("-+-+-");
            			System.out.println(ticTacToe[2][0] + "|" + ticTacToe[2][1] + "|" + ticTacToe[2][2]);
            			System.out.println();
				}
			}else if (o>x) {
				if ((ticTacToe[0][0].equals(ticTacToe[0][1]) && ticTacToe[0][0].equals(ticTacToe[0][2]) && !ticTacToe[0][0].equals(" ")) || (ticTacToe[1][0].equals(ticTacToe[1][1]) && ticTacToe[1][0].equals(ticTacToe[1][2]) && !ticTacToe[1][0].equals(" ")) || (ticTacToe[2][0].equals(ticTacToe[2][1]) && ticTacToe[2][0].equals(ticTacToe[2][2]) && !ticTacToe[2][0].equals(" ")) || (ticTacToe[0][0].equals(ticTacToe[1][0]) && ticTacToe[0][0].equals(ticTacToe[2][0]) && !ticTacToe[0][0].equals(" ")) || (ticTacToe[0][1].equals(ticTacToe[1][1]) && ticTacToe[0][1].equals(ticTacToe[2][1]) && !ticTacToe[0][1].equals(" ")) || (ticTacToe[0][2].equals(ticTacToe[1][2]) && ticTacToe[0][2].equals(ticTacToe[2][2]) && !ticTacToe[0][2].equals(" ")) || (ticTacToe[0][0].equals(ticTacToe[1][1]) && ticTacToe[0][0].equals(ticTacToe[2][2]) && !ticTacToe[0][0].equals(" ")) || (ticTacToe[0][2].equals(ticTacToe[1][1]) && ticTacToe[0][2].equals(ticTacToe[2][0]) && !ticTacToe[0][2].equals(" "))) {
					System.out.println("Player 1 wins.");
					ticTacToe[0][0]="O";
            		ticTacToe[0][1]="O";
            		ticTacToe[0][2]="O";
            		ticTacToe[1][0]="O";
            		ticTacToe[1][1]="O";
            		ticTacToe[1][2]="O";
            		ticTacToe[2][0]="O";
            		ticTacToe[2][1]="O";
            		ticTacToe[2][2]="O";
            		win=true;
				} else {
					System.out.println("1|2|3");
            		System.out.println("-+-+-");
            		System.out.println("4|5|6");
            		System.out.println("-+-+-");
            		System.out.println("7|8|9");
            		System.out.println("Ready, Player 2? Make your move.");
            		move=myScanner.nextInt();
            		switch (move) {
            			case 1:
            				if (ticTacToe[0][0].equals(" ")) {
            					ticTacToe[0][0]="X";
            					x++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 2:
            				if (ticTacToe[0][1].equals(" ")) {
            					ticTacToe[0][1]="X";
            					x++;
            				break;
            				}else{
            					System.out.println("Invalid move.");
            				}
            			case 3:
            				if (ticTacToe[0][2].equals(" ")) {
            					ticTacToe[0][2]="X";
            					x++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 4:
            				if (ticTacToe[1][0].equals(" ")) {
            					ticTacToe[1][0]="X";
            					x++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 5:
            				if (ticTacToe[1][1].equals(" ")) {
            					ticTacToe[1][1]="X";
            					x++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 6:
            				if (ticTacToe[1][2].equals(" ")) {
            					ticTacToe[1][2]="X";
            					x++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 7:
            				if (ticTacToe[2][0].equals(" ")) {
            					ticTacToe[2][0]="X";
            					x++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 8:
            				if (ticTacToe[2][1].equals(" ")) {
            					ticTacToe[2][1]="X";
            					x++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			case 9:
            				if (ticTacToe[2][2].equals(" ")) {
            					ticTacToe[2][2]="X";
            					x++;
            				}else{
            					System.out.println("Invalid move.");
            				}
            				break;
            			default:
            				System.out.println("Invalid input.");
            				break;
            		}
            			System.out.println(ticTacToe[0][0] + "|" + ticTacToe[0][1] + "|" + ticTacToe[0][2]);
            			System.out.println("-+-+-");
            			System.out.println(ticTacToe[1][0] + "|" + ticTacToe[1][1] + "|" + ticTacToe[1][2]);
            			System.out.println("-+-+-");
            			System.out.println(ticTacToe[2][0] + "|" + ticTacToe[2][1] + "|" + ticTacToe[2][2]);
            			System.out.println();
				}
			}
		}
	}
}