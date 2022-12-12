import java.util.Scanner; // Import de l'utilitaire Scanner


public class Main {
    public static void main(String[] args){ // Point d'entrée du programme Java
        Scanner scanner = new Scanner(System.in); // Création de l'objet Scanner

//        System.out.println("Ecrire un entier en limite"); // Instruction pour l'user
//        System.out.println("Ecrire un entier");
//        System.out.println("Ecrire un float entre 0 et 1 avec une VIRGULE");

//        int entermaxlimit = scanner.nextInt(); // Déclaration et stockage dans une variable de l'entrée de l'utilisateur
//        int n = scanner.nextInt();
//        int limit = scanner.nextInt();
//        float epsilon = scanner.nextFloat();

        Exos counter = new Exos(); // Création de l'objet counter à partir de la classe Exos
//        counter.enumerate_for();
//        counter.enumerate_while();
//        counter.enumerate_for(entermaxlimit); // Appel de méthodes de counter définies dans la classe Exos
//        counter.smallest_square_next_of_n(n);
//        counter.greatest_square_previous_of_n(n);
//        counter.fibo(limit);
//        counter.approximation_fibo(epsilon);
//        counter.describe();
//        counter.describe_for_each();
//        counter.describe_for_each_sup4();
//        counter.to_upper_case();
        counter.decrypt();
    }
}