import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Author : mthaw
 * Date : Jun. 9, 2021
 * Description : Introduction sur les expressions regulieres etapes / structures
 */
public class RegExp1 {

	public static void main(String[] args) {
		//Initializer le scanner nomme "crayon"
		Scanner crayon = new Scanner(System.in);
		//Demander et recuperer un entree de l'usager
		System.out.println("Inscrire le texte pour la recherche");
		String input = crayon.nextLine();
		//Demander et recuperer la chaine de caracteres recherchee (expression reguliere)
		System.out.println("Inscrire le texte recherche");
		String regEx = crayon.nextLine();
	
		//Etape 1: Utiliser pattern 
		Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
		
		//Etape 2: Allouer un objet Matcher pour l'entree specifie
		Matcher matcher = pattern.matcher(input);
		
		//Etape 3: Verifier la concordance et afficher le resultat
		
		//EXERCISE 1 : TROUVER TOUT LES OCCURENCES DU String RECHERCHEE DANS LE String POUR LA RECHERCHE
		
		/*
		
		//Nous utilisons la methode .find() pour matcher
		while(matcher.find()) {
			System.out.println("Le(s) mots \""+matcher.group()+"\" debute a l'indice "+matcher.start() + " et finit a l'indice " + matcher.end());
		}
		
		*/
		
		//EXERCISE 2 :VERIFIER SI LES DEUX TEXTES SONT LES MEMES OU PAS
		
		/*
		 
		if(matcher.matches()) {
			System.out.println("Les deux textes sont les memes");
		}else {
			System.out.println("Les deux textes sont differents");
		}
		
		*/
		
		//EXERCISE 3: VERIFIER SI LE TEXTE SE TROUVE AU DEBUT OU PAS
		
		if(matcher.lookingAt()) {
			System.out.println("On a trouve \"" + matcher.group()+"\" commencant a l'indice "+matcher.start() + " et finit a l'indice "+matcher.end());
		}else {
			System.out.println("Le texte ne se trouve pas au debut");
		}
	}

}
