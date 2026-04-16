public class Main {
    public static void main(String[] args) {

        // Création d'une personne
        Personne p1 = new Personne(
                "MAT001",
                "Diarra",
                "Moussa",
                "Bamako",
                "76123456",
                25,
                'M'
        );

        // Affichage des infos
        System.out.println("Nom: " + p1.getNom());
        System.out.println("Prénom: " + p1.getPrenom());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Téléphone: " + p1.getPhone());
    }
}