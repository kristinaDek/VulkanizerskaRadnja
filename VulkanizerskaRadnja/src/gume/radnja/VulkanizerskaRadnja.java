package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;
/** 
 * Klasa vulkanizerske radnje sa nekim funkcionalnostima.
 * @author Kristina Dekic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	
	/** 
	 * Lista guma u vulkanizerskoj radnji.
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * Metoda koja dodaje novu automobilsku gumu na pocetak liste guma u vulkanizerskoj radnji.
	 * @param a automobilska guma 
	 * @throws java.lang.NullPointerException ako je uneti parametar null vrednost
	 * @throws java.lang.RuntimeException ako se uneti parametar vec nalazi u listi guma u vulkanizerskoj radnji
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	
	/**
	 * Metoda koja pronalazi automobilske gume po nazivu marke-modela u listi guma i ubacuje ih u novu listu guma.
	 * @param markaModel naziv automobilske gume (model-marka)
	 * @return null (kada je parametar markaModel null vrednost) ili
	 * nova lista guma koje imaju isti naziv modela-marke kao uneti parametar
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
	
	/**
	 * Metoda vraca listu auto guma 
	 * @return lista AutoGuma
	 */
	public LinkedList<AutoGuma> vratiGume(){
		
		return gume;
	}
}
