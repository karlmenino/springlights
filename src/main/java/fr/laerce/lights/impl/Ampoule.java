package fr.laerce.lights.impl;

import fr.laerce.lights.Eclairage;

import java.util.Random;
//bon on créer une class mère ampoule qui implémante Eclairage
public abstract class Ampoule implements Eclairage {

    protected int etat;
    protected double chance;
    //attention l'attribue chance change en fonction de l'ampoule
    protected int probaPanne()
    {
        Random alea = new Random();
        if (alea.nextInt(100) <chance) {
            return -1;
        }
        return 0;
    }


    public Ampoule() {
        etat=0;
    }
//on ecrit la methode allumer si etat et probapanne different de -1 on met a 10
    public void allumer() {
        if (etat != -1 && probaPanne() != -1) {
            etat = 10;
        } else {
            etat = -1;
        }
    }
    //même logique avec eteindre
    public void eteindre() {
        if (etat != -1) {
            etat = 0;
        }
    }
    //intensifier on incrémente de 1 si eta different de -1 et de 10
    public void intensifier() {
        if (etat != -1 && etat < 10) {
            etat++;
        }
    }
    //même logique qu'intensifier
    public void diminuer() {
        if ( etat > 0) {
            etat--;
        }
    }
//on retourne l'état
    public int etat() {
        return etat;
    }


//on return l'état de l'objet sous la forme d'une chaîne de caractères
    public String toString() {
        return this.getClass().getName() + " : " + etat;
    }
//pour ecrire l'etat d'un objet
    public void setEtat(int etat) {
        this.etat = etat;
    }
}
