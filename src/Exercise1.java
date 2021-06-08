import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		BufferedReader entree;
		String ligne;
		entree = new BufferedReader(new FileReader("monFichier.txt"));
		
		int compteurA = 0;
		while (entree.ready()) {
			ligne = entree.readLine();
			for(int i = 0; i < ligne.length(); i++) {
				if(ligne.charAt(i) == 'a')compteurA++;
			}
		}
		System.out.println(compteurA);
		entree.close();
	}
}
