package gume;

	/**
	 * Klasa AutoGuma koja sadrzi atribute gume automobila.
	 * 
	 * @author Kristina Dekic
	 * @version 1.0
	 *
	 */

	public class AutoGuma {
		/** 
		 * String koji sadrzi naziv marke automobila.
		 */
		private String markaModel = null;
		/** 
		 * Ceo broj predstavlja dimenziju, odnosno precnik gume.
		 */
		private int precnik = 0;
		/**
		 * Ceo broj koji predstavlja sirinu gume. 
		 */
		private int sirina = 0;
		/**
		 * Ceo broj koji predstavlja visinu gume.
		 */
		private int visina = 0;
		
		/**
		 * Get metoda koja vraca naziv marke-modela.
		 * @return markaModel naziv marke guma
		 */
		public String getMarkaModel() {
			return markaModel;
		}
		
		/**
		 * Set metoda koja postavlja naziv marke-modela.
		 * @param markaModel naziv marke 
		 * @throws java.lang.RuntimeException ako je parametar null vrednost ili ako je duzina naziva manja od 3
		 */
		public void setMarkaModel(String markaModel) {
			if (markaModel == null || markaModel.length() < 3)
				throw new RuntimeException("Morate uneti marku i model");
			this.markaModel = markaModel;
		}
		
		/**
		 * Get metoda vraca ceo broj, koji predstavlja precnik gume.
		 * @return precnik precnik gume
		 */
		public int getPrecnik() {
			return precnik;
		}
		
		/**
		 * Set metoda koja postavlja dimenzije, odnosno precnik gume.
		 * @param precnik precnik gume 
		 * @throws java.lang.RuntimeException ako je parametar manji od 13 i veci od 22
		 */
		public void setPrecnik(int precnik) {
			if (precnik < 13 && precnik > 22)
				throw new RuntimeException("Precnik van opsega");
			this.precnik = precnik;
		}
		
		/**
		 * Get metoda vraca ceo broj, koji predstavlja sirinu gume.
		 * @return sirina sirina gume
		 */
		public int getSirina() {
			return sirina;
		}
		
		/**
		 * Set metoda koja postavlja dimenzije, odnosno sirinu gume.
		 * @param sirina sirina gume 
		 * @throws java.lang.RuntimeException ako je parametar manji od 135 i veci od 355
		 */
		public void setSirina(int sirina) {
			if (sirina < 135 && sirina > 355)
				throw new RuntimeException("Sirina van opsega");
			this.sirina = sirina;
		}
		
		/**
		 * Get metoda vraca ceo broj, koji predstavlja visinu gume.
		 * @return visina visina gume
		 */
		public int getVisina() {
			return visina;
		}
		
		/**
		 * Set metoda koja postavlja dimenzije, odnosno visinu gume.
		 * @param visina visina gume 
		 * @throws java.lang.RuntimeException ako je parametar manji od 25 ili veci od 95
		 */
		public void setVisina(int visina) {
			if (visina < 25 || visina > 95)
				throw new RuntimeException("Visina van opsega");
			this.visina = visina;
		}
		
		/**
		 * ToString metoda koja daje detaljan ispis podataka o gumi.
		 * @return podaci o gumi
		 */
		@Override
		public String toString() {
			return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
					+ visina + "]";
		}
		
		/**
		 * Metoda koja proverava da li su jednaki podaci na osnovu unetog objekta i vraca true/false, odnosno boolean vrednost.
		 * @return true/false
		 * 
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AutoGuma other = (AutoGuma) obj;
			if (markaModel == null) {
				if (other.markaModel != null)
					return false;
			} else if (!markaModel.equals(other.markaModel))
				return false;
			if (precnik != other.precnik)
				return false;
			if (sirina != other.sirina)
				return false;
			if (visina != other.visina)
				return false;
			return true;
		}
}


