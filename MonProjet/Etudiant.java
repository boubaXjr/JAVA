package MonProjet;

public class Etudiant {
    String nom;
    String prenom;
    String classe;

    public Etudiant(String nom, String prenom, String classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }

    public void afficher() {
        System.out.println("Nom : " + nom + ", Prénom : " + prenom + ", Classe : " + classe);
    }
}
