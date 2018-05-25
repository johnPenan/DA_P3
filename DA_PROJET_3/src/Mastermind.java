import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		Random rand = new Random();
		int nbreSecret = rand.nextInt(10000 - 1000 + 1) + 1000, maCombinaison = 0, essai = 0;
		char reponse = ' ';
		Scanner sc = new Scanner(System.in);
		do {
			essai = 0;
			do {
				essai++;
				do {
					System.out.println("\nLe nombre secret généré: " + nbreSecret);
					System.out.println("\nVeillez saisir votre combinaison :");
					maCombinaison = sc.nextInt();
					sc.nextLine();
					if (maCombinaison < 1000 || maCombinaison > 10000)
						System.out.println("\nVotre combinaison doit être comprise entre 1000 et 10000 !");
				} while (maCombinaison < 1000 || maCombinaison > 10000);				
				//Recherche +/-
				System.out.print("Proposition : " + maCombinaison + " -> Reponse : ");
				for (int i = 0; i < 4; i++) {
					int position=0;
					// Conversion en chaine de caractère la combinaison aléatoire
					String t = String.valueOf(nbreSecret);
					// extraction des caractères
					char nb = t.charAt(i);
					// Conversion en chaine de caractère la combinaison de l'utilisateur
					String t2 = String.valueOf(maCombinaison);
					// extraction des caractères
					char nb2 = t2.charAt(i);
					// Comparaison des caratères
					if ((nb2 < nb) ) {
						nb2=nb=0;
						position=nb2+nb;
						position++;
						System.out.print(position+" mal placé, ");
					}
					else if (nb2>nb) {
						nb2=nb=0;
						position=nb2+nb;
						position++;
						System.out.print(position+" mal placé,");
					}
					else {
						nb2=nb=0;
						position=nb2+nb;
						position++;
						System.out.print(position+" bien placé, ");
					}
				}
				
				if (essai == 4 && maCombinaison!=nbreSecret)
					System.out.println("\nVous avez depassé le nombre d'essai posssible !");
			} while (essai < 4 && maCombinaison != nbreSecret);
			do {
				// Génértion d'une nouvelle combinaison aléatoire à chaque lancement de
				// l'application.
				nbreSecret = rand.nextInt(10000 - 1000 + 1) + 1000;
				System.out.print("\nVoulez-vous rejouer ? (0/N)");
				reponse = sc.nextLine().charAt(0);
				sc.nextLine();
			} while (reponse != 'O' && reponse != 'N');

		} while (reponse == 'O');
		System.out.println("Au revoir...!");



	}

}
