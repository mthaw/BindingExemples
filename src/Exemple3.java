import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemple3 {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileReader ficALire;
		BufferedReader entree;
		char c;

		ficALire = new FileReader("monFichier.txt");
		entree = new BufferedReader(ficALire);
		c = (char) entree.read();

		while (c != -1 && c != '\n') {
			System.out.print((char) c);
			c = (char) entree.read();
		}
		entree.close();
		ficALire.close();

	}
}
