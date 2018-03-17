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
	 * Přiřadí k dokumentu cestu
	 * 
	 * @param path		textový řetezec cesta k dokumentu
	 * @throws IOException		jakákoli chyba s dokumentem
	 */
	void setPathToFile(String path) throws IOException;
	
	/**
	 * Vrací počet všech řádků, co jsou ve dokumentu.
	 * 
	 * @return		int
	 * @throws IOException 
	 */
	int getNumberOfLines() throws IOException;
	
	/**
	 * Vrací počet všech slov, které jsou v dokumentu.
	 * 
	 * @return		int
	 * @throws IOException 
	 */
	int getNumberOfWords() throws IOException;
	
	/**
	 * Vrací počet všech no-whitespace znaků, které jsou v dokumentu.
	 * 
	 * @return		int
	 * @throws IOException 
	 */
	int getNumberOfNoWhite() throws IOException;
	
	/**
	 * Vrací počet všech znaků ve daném dokumentu.
	 * 
	 * @return		int
	 * @throws IOException 
	 */
	int getNumberOfAllChar() throws IOException;

}
