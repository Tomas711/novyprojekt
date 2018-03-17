package balicek;

import java.io.IOException;

/**
 * Interface slouží ke třídě Informace
 * 
 * @author Vít Vágner
 * @version 1.0
 */

public interface IInformace {
	
	/**
	 * Přiřadí k dokumenu cestu
	 * 
	 * @param path		textový řetezec cesta k dokumentu
	 * @throws IOException		jakákoli chyba s dokumentem
	 */
	void setPathToFile(String path) throws IOException;
	
	/**
	 * Vrací počet všech řádků, co jsou ve dokumentu.
	 * 
	 * @return		int
	 */
	int getNumberOfLines();
	
	/**
	 * Vrací počet všech slov, které jsou v dokumentu.
	 * 
	 * @return		int
	 */
	int getNumberOfWords();
	
	/**
	 * Vrací počet všech no-whitespace znaků, které jsou v dokumentu.
	 * 
	 * @return		int
	 */
	int getNumberOfNoWhite();
	
	/**
	 * Vrací počet všech znaků ve daném dokumentu.
	 * 
	 * @return		int
	 */
	int getNumberOfAllChar();

}
