import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Author : mthaw
 * Date : Jun. 14, 2021
 * Description : Ce programme permet de recevoir les numeros de telephone de formats differents valide (amerique du nord)
 * et de les reformatter en un format unique choisi. On utilise ici des expression regulieres tant pour la verification 
 * du formattage que pour le reformattage.
 */

public class PhoneNewFormat {
	public static void main(String[] args) {
		// L'expression reguliere qu'il faut respecter
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})?[-.\\s]([0-9]{4})$";

		// Liste de numeros de telephone
		List<String> tel = new ArrayList<String>();
		Scanner crayon = new Scanner(System.in);
		int k = 0;
		String input = "";
		for (int i = 0; i < 5; i++) {
			k = i + 1;
			System.out.println("Inscrire le numero de telephone " + k);
			input = crayon.nextLine();
			tel.add(input);
		}
		crayon.close();

		Pattern pattern = Pattern.compile(regex);
		for (String phone : tel) {
			Matcher matcher = pattern.matcher(phone);
			if (matcher.matches()) {
				System.out.println(matcher.replaceFirst("($1) $2-$3"));
			}
		}
	}
}
