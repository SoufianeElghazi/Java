package Soufiane;

/**
 *
 * @author elgha
 */
public class Eleve {
    private String nom;
    private float note1,note2,note3,moyenne;

    public Eleve(String nom, float note1, float note2, float note3,float moyenne) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.moyenne = moyenne;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getNote1() {
        return note1;
    }

    public void setNote1(float note1) {
        this.note1 = note1;
    }

    public float getNote2() {
        return note2;
    }

    public void setNote2(float note2) {
        this.note2 = note2;
    }

    public float getNote3() {
        return note3;
    }

    public void setNote3(float note3) {
        this.note3 = note3;
    }

    public float getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(float moyenne) {
        this.moyenne = moyenne;
    }
    
}
