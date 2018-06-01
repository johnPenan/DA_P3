import java.util.Random;
import java.util.Scanner;

public class Defenseur {

	public static void main(String[] args) {
		Random rand = new Random();
		int combinaisonOrdi, maCombinaison, essai = 0;
		Scanner sc = new Scanner(System.in);
		char reponse = 'O';
		do {
			System.out.println("Veillez saisir votre combinaison:");
			maCombinaison = sc.nextInt();
			sc.nextLine();
			essai = 0;
			do {
				essai++;
				System.out.println("\nRecherche de combinaison de l'ordinateur:");
				combinaisonOrdi = rand.nextInt(10000 - 1000 + 1) + 1000;
				System.out.print("Proposition Ordinateur : " + combinaisonOrdi + " -> Reponse : ");
				for (int i = 0; i < 4; i++) {
					String utilisateur = String.valueOf(maCombinaison);
					char caracUtilisateur = utilisateur.charAt(i);
					String ordinateur = String.valueOf(combinaisonOrdi);
					char caracOrdinateur = ordinateur.charAt(i);
					if (caracOrdinateur > caracUtilisateur)
						System.out.print("+");
					else if (caracOrdinateur < caracUtilisateur)
						System.out.print("-");
					else
						System.out.print("=");
				}
				if (essai == 4)
					System.out.println("\nM. Ordinateur vous avez depassé le nombre d'essai...!");
			} while (essai < 4);
			do {
				System.out.println("Voulez-vous rejouer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
				sc.nextLine();
			} while (reponse != 'O' && reponse != 'N');

		} while (reponse == 'O');
		System.out.println("Au revoir...!");

	}

}
