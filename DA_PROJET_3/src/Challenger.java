import java.util.Random;
import java.util.Scanner;

public class Challenger {

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
					System.out.println("\nLe nombre secret g�n�r�: " + nbreSecret);
					System.out.println("\nVeillez saisir votre combinaison :");
					maCombinaison = sc.nextInt();
					sc.nextLine();
					if (maCombinaison < 1000 || maCombinaison > 10000)
						System.out.println("\nVotre combinaison doit �tre comprise entre 1000 et 10000 !");
				} while (maCombinaison < 1000 || maCombinaison > 10000);
//				if (maCombinaison < nbreSecret)
//					System.out
//							.println("La combinaison " + maCombinaison + " est inf�rieure � la combinaison secr�te !");
//				else if (maCombinaison > nbreSecret)
//					System.out
//							.println("La combinaison " + maCombinaison + " est sup�rieure � la combinaison s�cr�te !");
//				else
//					System.out.println("Bravo ! " + maCombinaison + " est bien la combinaison s�cr�te !");
				
				//Recherche +/-
				System.out.print("Proposition : " + maCombinaison + " -> Reponse : ");
				for (int i = 0; i < 4; i++) {
					// Conversion en chaine de caract�re la combinaison al�atoire
					String t = String.valueOf(nbreSecret);
					// extraction des caract�res
					char nb = t.charAt(i);
					// Conversion en chaine de caract�re la combinaison de l'utilisateur
					String t2 = String.valueOf(maCombinaison);
					// extraction des caract�res
					char nb2 = t2.charAt(i);
					// Comparaison des carat�res
					if (nb2 < nb)
						System.out.print("-");
					else if (nb2 > nb)
						System.out.print("+");
					else
						System.out.print("=");
				}
				
				if (essai == 4 && maCombinaison!=nbreSecret)
					System.out.println("\nVous avez depass� le nombre d'essai posssible !");
			} while (essai < 4 && maCombinaison != nbreSecret);
			do {
				// G�n�rtion d'une nouvelle combinaison al�atoire � chaque lancement de
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


		
