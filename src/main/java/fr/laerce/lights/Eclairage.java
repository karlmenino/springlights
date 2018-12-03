/**
 * Interface de service pour les opérations liées aux actions sur les 
 * eclairages : ampoule ou luminaire
 * les classes d'implémentation devront donner corps à (implémenter)
 * les méthodes déclarées ici. 
 */
package fr.laerce.lights;

public interface Eclairage {
    /**
     * Allume l'eclairage à pleine intensité
     */
    public void allumer();

    /**
     * Eteint l'eclairage
     */
    public void eteindre();

    /**
     * Augmente l'intensité lumineuse de l'eclairage
     */
    public void intensifier();

    /**
     * Diminue l'intensité lumineuse de l'eclairage
     */
    public void diminuer();

    /**
     * Retourne l'état de l'eclairage
     * 
     * @return une valeur sur [0..10] selon l'intensité, -1 si il est en panne
     */
    public int etat();
}
