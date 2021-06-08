import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercise2 {
	public static void main(String []args) throws IOException, FileNotFoundException{
		BufferedReader entree;
		String ligne;
		entree = new BufferedReader(new FileReader("monCalcul.txt"));
		
		FileWriter ficAEcrire;
		PrintWriter sortie;
	
		ficAEcrire = new FileWriter("monResultat.txt");
		sortie = new PrintWriter(ficAEcrire);
	
		
		while(entree.ready()) {
			ligne = entree.readLine();
			int sommeChiffres = 0;
			for(int i = 0; i < ligne.length(); i++) {
				if(ligne.charAt(i)-'0' >= 0 && (int)ligne.charAt(i)-'0' <= 9)sommeChiffres=sommeChiffres+(int)ligne.charAt(i)-'0';
			}
			sortie.print(sommeChiffres+"\n");
		}
		
		entree.close();
		sortie.close();
	}
}
