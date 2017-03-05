package Client;

import java.util.*;

import Paiement.CarteCredit;
import Voyage.*;
import Transport.*;
import Reservation.*;

public class SystemeClient {

	Collection<Client> client;

	/**
	 * 
	 * @param origine
	 * @param destination
	 * @param date
	 * @param section
	 */
	public void verifierTrajetDispo(Station origine, Station destination, String date, Section section) {
		// TODO - implement SystemeClient.verifierTrajetDispo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservation
	 */
	public void annulerTrajet(Reservation reservation) {
		// TODO - implement SystemeClient.annulerTrajet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param placeParTrajet
	 * @param client
	 */
	public Reservation reserverPlace(Reservable placeParTrajet, Client client) {
		// TODO - implement SystemeClient.reserverPlace
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservation
	 */
	public void modifierReservation(Reservation reservation) {
		// TODO - implement SystemeClient.modifierReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param priorite
	 */
	public void filtrerSiege(String priorite) {
		// TODO - implement SystemeClient.filtrerSiege
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservation
	 */
	public void verificationReservation(Reservation reservation) {
		// TODO - implement SystemeClient.verificationReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param carte
	 * @param montant
	 */
	public void payer(CarteCredit carte, double montant) {
		// TODO - implement SystemeClient.payer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nom
	 * @param adresse
	 * @param courriel
	 * @param tel
	 * @param dateNaissance
	 * @param noPasseport
	 * @param dateExpPasseport
	 */
	public void infoAJour(int nom, int adresse, int courriel, int tel, int dateNaissance, int noPasseport, int dateExpPasseport) {
		// TODO - implement SystemeClient.infoAJour
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param resrevation
	 */
	public void acheterPlace(Reservation resrevation) {
		// TODO - implement SystemeClient.acheterPlace
		throw new UnsupportedOperationException();
	}

}