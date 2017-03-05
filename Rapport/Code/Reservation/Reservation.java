package Reservation;

import Paiement.*;

import java.util.Collection;

import Client.*;

public class Reservation extends Observer implements PayableService {

	Client client;
	Reservable place;
	private String numero;
	private boolean confirme;
	private String tempsAttribution;
	private float tarif;
	private boolean disponible;

	public float calculFrais() {
		// TODO - implement Reservation.calculFrais
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param place
	 */
	public void modifierPlace(Reservable place) {
		// TODO - implement Reservation.modifierPlace
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection<TransactionPaiment> getPaiment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float calulFrais() {
		// TODO Auto-generated method stub
		return 0;
	}

}