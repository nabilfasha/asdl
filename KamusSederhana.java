package dictionary;
import java.util.*;
import java.io.*;

public class KamusSederhana {
	
	
	static BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
	private String[] indonesia = {"satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh"};
	private String[] english = {"one","two","three","four","five","six","seven","eight","nine","ten"};
	private String nilai;
	
	public KamusSederhana() {
		this.nilai = null;
	}
	
	private String penginputan(int a) {
		String bahasa = null;
		try {
			if(a == 0) {
				bahasa = masuk.readLine();
			}else if(a == 1) {
				bahasa = masuk.readLine();
			}
				
		}catch(Exception e) {
			System.out.println("Maaf nilai anda eror");
			e.printStackTrace();
		}
		this.nilai = bahasa;
		return nilai;
	}
	
	private String pencarian(int a) {
		String output = nilai+" Tidak ada dalam kamus";
		for(int i = 0; i < indonesia.length; i++) {
			if(a == 0) {
				if(nilai.equalsIgnoreCase(indonesia[i]) == true) 
					output = english[i];
			}else if(a == 1) {
				if(nilai.equalsIgnoreCase(english[i]) == true) 
					output = indonesia[i];
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String input,a,b;
		int pilih;
		
		do {
			System.out.println("KAMUS SEDERHANA JAVA");
			System.out.println("1. Indonesia-English");
			System.out.println("2. English-Indonesia");
			System.out.println("0. Keluar");
			System.out.println();
			System.out.print("Pilihan Menu: ");
			pilih = userInput.nextInt();
			
			switch(pilih) {
			case 1:
				System.out.print("Masukan kata dalam bahasa Indonesia: ");
				KamusSederhana obj = new KamusSederhana();
				input = obj.penginputan(0);
				
				a = obj.pencarian(0);
				if(a.equals(input+" Tidak ada dalam kamus")) {
					System.out.println(""+obj.pencarian(0));
					System.out.print("\n");
				}
					
				else {
					System.out.println(""+input+" adalah "+ obj.pencarian(0));
					System.out.print("\n");
				}
			break;
			
			case 2:
				System.out.print("Masukan kata dalam bahasa Inggris: ");
				KamusSederhana obj2 = new KamusSederhana();
				input = obj2.penginputan(1);
				
				b = obj2.pencarian(1);
				if(b.equals(input+" Tidak ada dalam kamus"))
					System.out.println(""+obj2.pencarian(1));
				else
					System.out.println(""+input+" adalah "+ obj2.pencarian(1));
					System.out.print("\n");
			break;
			
			}
		}while(pilih != 0);

	}

}
