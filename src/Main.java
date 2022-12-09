import java.util.Scanner; // Import de l'utilitaire Scanner

public class Main {
    public static void main(String[] args){ // Point d'entrée du programme Java
        Scanner scanner = new Scanner(System.in); // Création de l'objet Scanner
        System.out.println("Ecrire un entier en limite"); // Instruction pour l'user
        int entermaxlimit = scanner.nextInt(); // Déclaration et stockage dans une variable de l'entrée de l'utilisateur
        Exos counter = new Exos(); // Création de l'objet counter à partir de la classe Exos
//        counter.enumerate_for();
//        counter.enumerate_while();
        counter.enumerate_for(entermaxlimit); // Appel de méthodes de counter définies dans la classe Exos
    }
}