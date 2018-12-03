package fr.laerce.lights.impl;

import fr.laerce.lights.Eclairage;

import java.util.List;


/**
 * @author fred
 *
 */
public class Luminaire implements Eclairage {
//onn ajoute dans sprin-conf.xml les ampoules que l'on souhaite à luminaires
    private List<Eclairage> ampoules;

    public Luminaire() {
    }


    public void setAmpoules(List<Eclairage> ampoules) {
        this.ampoules = ampoules;
        // Détecte si les ampoules sont de même type, lance une
        // exception si ce n'est pas le cas
        if(ampoules.size()>0){
            String className = ampoules.get(0).getClass().getName();
            for(int i=1; i < ampoules.size(); i++){
                if(!ampoules.get(i).getClass().getName().equals(className)){
                    throw new RuntimeException("Toutes les ampoules ne sont pas de même type");
                }
            }

            if(ampoules.get(0).getClass().getName()=="fr.laerce.lights.impl.Luminaire"){
                throw new RuntimeException("erreur 42");
            }
        }
    }


    public void allumer() {
        for (int i=0; i< this.ampoules.size();i++ ) {
            this.ampoules.get(i).allumer();
        }
    }


    public void eteindre() {
        for(int i = 0; i< this.ampoules.size();i++){
            this.ampoules.get(i).eteindre();
        }
    }


    public void intensifier() {
        for (int i = 0; i < ampoules.size(); i++) {
            this.ampoules.get(i).intensifier();
        }
    }


    public void diminuer() {
        for(int i = 0; i < ampoules.size(); i++){
            this.ampoules.get(i).diminuer();
        }

    }

    /**
     * Retourne l'état du luminaire dans l'intervalle [0..10] ou -1 si il est en
     * panne. L'état résultant est la plus grande valeur des états de toutes les
     * ampoules du luminaire
     *
     * @return l'état du luminaire
     */

    public int etat() {
        int etat = -1;
        // version defensive
        for(int i = 0; i < ampoules.size(); i++){
            if(ampoules.get(i).etat() > etat){
                etat = ampoules.get(i).etat();
            }
        }
        return etat;
    }

    public String toString() {
        return "Classe : " + this.getClass().getName() + " etat :"
                + this.etat();
    }

}
