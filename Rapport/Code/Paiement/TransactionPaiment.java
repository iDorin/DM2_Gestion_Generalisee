package Paiement;

import java.sql.Time;
import java.util.Date;

public abstract class TransactionPaiment {

	PayableService payableService;
	private double montant;
	private Date date;
	private Time time;
	CarteCredit carteCredit;

	/**
	 * 
	 * @param montant
	 * @param carte
	 */
	public void transaction(double montant, CarteCredit carte) {
		// TODO - implement TransactionPaiment.transaction
		throw new UnsupportedOperationException();
	}

}