import java.util.ArrayList;

public class Exos {
    // Fonction qui print tous les entiers jusqu'à la limite avec une boucle for
    public void enumerate_for(int limit) { // Définition de fonction : public définit la visibilité de la fonction, void mentionne qu'elle ne renvoie rien
        for (int i = 0; i <= limit; i++) {
            System.out.println(i);
        }
    }

    // Fonction qui print tous les entiers jusqu'à la limite avec une boucle while
    public void enumerate_while(int limit) {
        int i = 0;
        while (i <= limit) {
            System.out.println(i);
            i++;
        }
    }

    // Fonction qui print tous les entiers jusqu'à la limite avec une boucle while, si ils sont pairs, sinon print une erreur
    public void enumerate_even(int limit){
        int i = 0;
        while (i <= limit){
            if(i == 0 || i%2 == 0){
                System.out.println(i);
            }else{
                System.out.println(i + " est un nombre impair!");
            }
            i++;
        }
    }

    // Fonction qui prend un nombre entier et retourne le plus petit carré supérieur à n
    public void smallest_square_next_of_n(int n){
        double intToDoubleConverted = n;
        double squareRootOfN = Math.sqrt(intToDoubleConverted);
        double roundedUpNumber = Math.ceil(squareRootOfN);
        int roundedUpNumberConverted = (int)roundedUpNumber;
        int nextSquare = roundedUpNumberConverted*roundedUpNumberConverted;
        if(n == nextSquare) {
            System.out.println((roundedUpNumberConverted+1)*(roundedUpNumberConverted+1));
        }else{
            System.out.println(nextSquare);
        }
    }

    // Fonction qui prend un nombre entier et retourne le plus grand carré inférieur à n
    public void greatest_square_previous_of_n(int n){
        double intToDoubleConverted = n;
        double squareRootOfN = Math.sqrt(intToDoubleConverted);
        double roundedDownNumber =Math.floor(squareRootOfN);
        int roundedDownNumberConverted = (int)roundedDownNumber;
        int previousSquare = roundedDownNumberConverted*roundedDownNumberConverted;
        if(n == previousSquare){
            System.out.println((roundedDownNumberConverted-1)*(roundedDownNumberConverted-1));
        }else{
            System.out.println(previousSquare);
        }
    }

    // Fonction qui définit une suite de fibonacci à partir de 0 selon une limite donnée
    public void fibo(int limit){
        if(limit == 0){
            System.out.println("Mettre une limit supérieure à 0 svp");
            return;
        } else if (limit == 1) {
            System.out.println(0);
            System.out.println(1);
            return;
        }

        int[] fiboArray = new int[limit];
        fiboArray[0] = 0;
        fiboArray[1] = 1;
        int i=1;

        while(i < limit -1) {
            int previousNumber = fiboArray[i - 1];
            int actualNumber = fiboArray[i];
            int futurNumber = previousNumber + actualNumber;
            i++;
            fiboArray[i] = futurNumber;
        }
        for(int affichage = 0; affichage < limit; affichage++){
            System.out.println(fiboArray[affichage]);
        }
    }

    // Fonction qui vérifie la marge d'erreur epsilon (division de la paire de la suite - phi doit être inférieur à
    // epsilon en valeur absolue).  Si oui afficher la paire

    public void approximation_fibo(float epsilon){
        Integer a = 0;
        int previousNumber = 1;
        int actualNumber = 1;
        double phi = 1.618033;
        double verificationNumber = 1;

        while(verificationNumber > epsilon){
            actualNumber = actualNumber+previousNumber;
            previousNumber = actualNumber-previousNumber;
            verificationNumber = ( (double) actualNumber/ (double) previousNumber)-phi;
            if(verificationNumber < 0 ){
                verificationNumber = verificationNumber*-1;
            }
        }
        System.out.println(actualNumber);
        System.out.println(previousNumber);
    }

    // Fonction qui affiche chaque ligne d'une ArrayList de String grâce à la méthode toString()
    public void describe(){

        ArrayList<String> prenoms = new ArrayList<String>();

        prenoms.add("Jean");
        prenoms.add("Ahmed");
        prenoms.add("Lea");
        prenoms.add("Blanco");
        prenoms.add("Philippe");

        System.out.println(prenoms.toString());
    }

    // Fonction qui affiche chaque ligne d'une ArrayList de String grâce à une boucle foreach

    public void describe_for_each(){

        ArrayList<String> prenoms = new ArrayList<String>();

        prenoms.add("Jean");
        prenoms.add("Ahmed");
        prenoms.add("Lea");
        prenoms.add("Blanco");
        prenoms.add("Philippe");

        for(String prenom : prenoms){
            System.out.println(prenom);
        }
    }

    // Fonction qui affiche chaque ligne d'une ArrayList de String grâce à une boucle foreach si sa longueur est supérieure à 4

    public void describe_for_each_sup4(){

        ArrayList<String> prenoms = new ArrayList<String>();

        prenoms.add("Jean");
        prenoms.add("Ahmed");
        prenoms.add("Lea");
        prenoms.add("Blanco");
        prenoms.add("Philippe");

        for(String prenom : prenoms){
            if (prenom.length() > 4 ) {
                System.out.println(prenom);
            }
        }
    }

    // Fonction qui affiche chaque ligne d'une ArrayList de String en MAJUSCULES!

    public void to_upper_case(){

        ArrayList<String> prenoms = new ArrayList<String>();

        prenoms.add("Jean");
        prenoms.add("Ahmed");
        prenoms.add("Lea");
        prenoms.add("Blanco");
        prenoms.add("Philippe");

        for(String prenom : prenoms){
            System.out.println(prenom.toUpperCase());
        }
    }

    public void decrypt(){

        String messageCrypte = "000T000000000000000000000000000000o0000u00000000000j0o0000000u0000000000r00s0000 c00o0000d00000e000000000000r000000000000000000 00000c0000000000o000m00000000000000m0e000 000000000s00i0000000000 0l000e00000000 g000000000000a00000000000000000r0s0000 000000000000000000000000000q00000u0000000000000000000000000i00000000 000f000i0ni00000r0000000a 000p00000a00000r0000000000000000000000000000000 m00000000000000a000in0t000000e00n000000000i00r0000000000000000 00000000000v00000000000o0000000t00r0000000e000000000 0c000o00d000000000e000000000 00e0000000000000000000000000000000000s0t0000000000000000000 0000000000000u0n00000 0000000000000000000000000000000ps00000000y000000000000000000c0h0000000op00000a0t0000h0e0 000000000000000v00000000000i00000000000000000000000000000000000000o0000l0000en00t 0000000q0u000000000i 00000000sa00000it00000 000où0000000000 000000v0000000o0000000000u000000000000000s000000000000000000 00000v00000000000000i00000000v0000000000000000000000000000e0000000000z0000000 00(000000c0i0000000000000000000ta0ti0o00000000n 000000d000000000000000000e00 00J000o00000000000000h0n00 0W00o000000000000o00000000000d0000000s0000000000)0";
        messageCrypte = messageCrypte.replaceAll("0","");
        System.out.println(messageCrypte);
    }
}
