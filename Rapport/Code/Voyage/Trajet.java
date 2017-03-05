package Voyage;

import Transport.*;
import java.util.*;

public abstract class Trajet {

	Transport transport;
	Collection<PlaceParTrajet> place;
	DetailTrajet detail;
	private String id;
	private double prix;
	private Date dateDepart;
	private Date dateArrivee;

	/**
	 * 
	 * @param id
	 * @param prix
	 * @param temps
	 */
	public void modifier(String id, double prix, String temps) {
		// TODO - implement Trajet.modifier
		throw new UnsupportedOperationException();
	}

}