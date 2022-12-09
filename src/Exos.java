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

    // Fonction qui
    public void fibo(int limit){
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



}
