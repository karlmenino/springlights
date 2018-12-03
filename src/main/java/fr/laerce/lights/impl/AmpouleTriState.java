package fr.laerce.lights.impl;

public class AmpouleTriState extends Ampoule {

    //on a besoin de surcharger intensifier et diminuer étant donné que le tristate varie de 5 en 5 d'intensité
    // et on definit la chance qu'il tombe en panne
    public AmpouleTriState() {
        chance =0.5;
    }

    public void intensifier() {
        if (etat == 0 || etat == 5) {
            etat = +5;
        }
    }

    public void diminuer() {
        if (etat == 5 || etat == 10) {
            etat = -5;
        }
    }
}
