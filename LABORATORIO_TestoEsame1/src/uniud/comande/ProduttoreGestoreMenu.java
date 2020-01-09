package uniud.comande;

/**
 * Rappresenta un produttore di gestori di men�
 *
 */
public class ProduttoreGestoreMenu implements Produttore {

	/**
	 * Produce un gestore di men�. (Observer)
	 * @return una nuova istanza di un gestore di men�
	 */
	@Override
	public GestoreMenu produci() {
		return new GestoreMenu();
	}

}
