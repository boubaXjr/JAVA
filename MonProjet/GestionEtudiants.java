package MonProjet;

import java.util.ArrayList;
import java.util.List;

public class GestionEtudiants {
    private List<Etudiant> listeEtudiants = new ArrayList<>();

    public void ajouterEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
        System.out.println("Étudiant ajouté avec succès !");
    }

    public void afficherEtudiants() {
        if (listeEtudiants.isEmpty()) {
            System.out.println("Aucun étudiant inscrit.");
        } else {
            System.out.println("Liste des étudiants :");
            for (Etudiant etudiant : listeEtudiants) {
                etudiant.afficher();
            }
        }
    }
}
