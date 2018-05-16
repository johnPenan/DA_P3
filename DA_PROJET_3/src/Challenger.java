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
					System.out.println(nbreSecret);
					System.out.println("Veillez saisir votre combinaison :");
					maCombinaison = sc.nextInt();
					sc.nextLine();
					if (maCombinaison < 1000 || maCombinaison > 10000)
						System.out.println("Votre combinaison doit �tre comprise entre 1000 et 10000 !");
				} while (maCombinaison < 1000 || maCombinaison > 10000);
				if (maCombinaison < nbreSecret)
					System.out
							.println("La combinaison " + maCombinaison + " est inf�rieure � la combinaison secr�te !");
				else if (maCombinaison > nbreSecret)
					System.out
							.println("La combinaison " + maCombinaison + " est sup�rieure � la combinaison s�cr�te !");
				else
					System.out.println("Bravo ! " + maCombinaison + " est bien la combinaison s�cr�te !");
				if (essai == 4)
					System.out.println("Vous avez depass� le nombre d'essai posssible !");
			} while (essai < 4);
			do {
				maCombinaison = sc.nextInt();
				sc.nextLine();
				System.out.println("Voulez-vous rejouer ? (0/N)");
			} while (reponse != 'O' && reponse != 'N');

		} while (reponse == 'O');
		System.out.println("Au revoir...!");

	}

}
