import java.util.Random;
import java.util.Scanner;

public class Defenseur {

	public static void main(String[] args) {
		Random rand = new Random();
		int combinaisonOrdi, maCombinaison, essai = 0;
		Scanner sc = new Scanner(System.in);
		char reponse = 'O';
		System.out.println("Veillez saisir votre combinaison:");
		maCombinaison = sc.nextInt();
		sc.nextLine();
		do {
			essai=0;
			do {
				essai++;
				System.out.println("Recherche de l'ordinateur:");
				combinaisonOrdi = rand.nextInt(10000 - 1000 + 1) + 1000;
				for (int i = 0; i < 4; i++) {
					String t = String.valueOf(maCombinaison);
					char caracT = t.charAt(i);
					String t2 = String.valueOf(combinaisonOrdi);
					char caracT2 = t2.charAt(i);
					if (caracT2 > caracT)
						System.out.println("La combinaison " + combinaisonOrdi + " de l'ordinateur est supérieur à "
								+ maCombinaison);
					else if (caracT2 < caracT)
						System.out.println("La combinaison " + combinaisonOrdi + " de l'ordinateur est inférieur à "
								+ maCombinaison);
					else
						System.out.println(
								"La combinaison " + combinaisonOrdi + " de l'ordinateur est égale à " + maCombinaison);
				}
					if (essai == 4 && combinaisonOrdi != maCombinaison)
						System.out.println("M. Ordinateur vous avez depassé le nombre d'essai...!");
			} while (essai < 4 && combinaisonOrdi != maCombinaison);

		} while (reponse == 'O');

	}

}
