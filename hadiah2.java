import java.util.Scanner;
public class hadiah2 {
	public static void main(String[] args) {
		float p = 2;
		float l = 5;
		float luas = p * l;
		
		Scanner masukan = new Scanner(System.in);
		int jam ;
		int menit;
		int detik;
		System.out.print("Masukkan nilai jam:");
	    	jam = masukan.nextInt();
		System.out.print("Masukkan nilai menit:");
			menit = masukan.nextInt();
		System.out.print("Masukkan nilai detik:");
		    detik = masukan.nextInt();
	    System.out.println();
		int totdet = jam*3600 + menit*60 + detik;
		System.out.println("totdet "+jam*3600+ " + "  +menit*60+ " + " +detik+ " = " +totdet);
		System.out.println("luas " +p+ " * " +l+ " = "  +luas);
		
		}
	}