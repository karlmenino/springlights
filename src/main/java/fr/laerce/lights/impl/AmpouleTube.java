package fr.laerce.lights.impl;

import java.util.Random;

import fr.laerce.lights.Eclairage;


public class AmpouleTube extends Ampoule{


    //on a besoin de surcharger intensifier et diminuer étant donné que le tube ne varie pas d'intensité
    // et on definit la chance qyu'il tombe en panne
    public AmpouleTube() {
        chance=10;
    }

    public void intensifier() {
        allumer();
    }

    /**
     * Diminuer l'intensité lumineuse de l'ampoule
     */
    public void diminuer() {
        eteindre();
    }

}
