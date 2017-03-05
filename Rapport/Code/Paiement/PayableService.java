package Paiement;

import java.util.*;

public interface PayableService {

	Collection<TransactionPaiment> getPaiment();

	float calulFrais();

}