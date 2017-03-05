package Reservation;

public interface Reservable {

	Reservation getReservation();

	Etat getEtat();

	void setReseve();

	void setDisponible();

	void setConfirme();

	float prix();

}