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
}
