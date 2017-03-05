package Administration;

import java.util.*;
import Voyage.*;
import Transport.*;

public class SystemeAdmin {

	Collection<LogInfoTrajet> logInfoTrajet;
	Collection<Administrateur> admin;
	Collection<Station> station;

	/**
	 * 
	 * @param <T>
	 * @param objet
	 */
	public <T> void affichageVoyage(T objet) {
		// TODO - implement SystemeAdmin.affichageVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param Ville
	 * @param type
	 */
	public void creerStation(String id, String nom, String Ville, Station type) {
		// TODO - implement SystemeAdmin.creerStation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param station
	 */
	public void supprimerStation(Station station) {
		// TODO - implement SystemeAdmin.supprimerStation
		throw new UnsupportedOperationException();
	}

	public Station modifierStation() {
		// TODO - implement SystemeAdmin.modifierStation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param section
	 */
	public void creerSection(Section section) {
		// TODO - implement SystemeAdmin.creerSection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param section
	 */
	public void supprimerSection(Section section) {
		// TODO - implement SystemeAdmin.supprimerSection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param section
	 */
	public Section modifierSection(Section section) {
		// TODO - implement SystemeAdmin.modifierSection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param type
	 */
	public void creerCompagnie(String id, Compagnie type) {
		// TODO - implement SystemeAdmin.creerCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compagnie
	 */
	public void supprimerCompagnie(Compagnie compagnie) {
		// TODO - implement SystemeAdmin.supprimerCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compagnie
	 */
	public Compagnie modifierCompagnie(Compagnie compagnie) {
		// TODO - implement SystemeAdmin.modifierCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCompagnie
	 * @param tempsDepart
	 * @param prix
	 * @param idVoyage
	 * @param duree
	 */
	public void creerTrajet(String idCompagnie, String tempsDepart, double prix, String idVoyage, int duree) {
		// TODO - implement SystemeAdmin.creerTrajet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajet
	 */
	public void supprimerTrajet(Trajet trajet) {
		// TODO - implement SystemeAdmin.supprimerTrajet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajet
	 */
	public Trajet modifierTrajet(Trajet trajet) {
		// TODO - implement SystemeAdmin.modifierTrajet
		throw new UnsupportedOperationException();
	}

}