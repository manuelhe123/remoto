package rallay;

import java.util.Scanner;

public class ejem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="";
		Scanner sc =new Scanner (System.in);
		System.out.println("Introduzca un nombre");
		nombre =sc.nextLine();
		for (int i=nombre.length()-1;i>=0;i--) {
			System.out.print(nombre.charAt(i));
			
		}}
}
