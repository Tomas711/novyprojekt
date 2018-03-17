package balicek;

import java.io.*;

/**
 * 
 * @author Tomáš Rousek
 * @version 1.0
 *
 */
public class Function implements IInformace {
	
	private File file;
	private BufferedReader bf;
	private String textInFile;
	
	/*
	 * Kontruktor
	 */
	public Function(String path) throws IOException {
		this.setPathToFile(path);
	}
	
	
	private void ReadFile() throws IOException {
		bf = new BufferedReader(new FileReader(file));
		String s;
		while((s = bf.readLine())!= null) {
			textInFile += s;
		}
		bf.close();
	}
	
	@Override
	public void setPathToFile(String path) throws IOException {
		  file = new File(path);
		  ReadFile();
	}

	@Override
	public int getNumberOfLines() throws IOException{
		int linenumber=0;
		
		bf = new BufferedReader(new FileReader(file));
		LineNumberReader count = new LineNumberReader(bf);
		while(count.readLine()!=null) {
			linenumber++;
		}
		count.close();
		bf.close();
			
		return linenumber;
	}

	@Override
	public int getNumberOfWords() throws IOException{
			String[] list = textInFile.split(" ");
	
			return list.length;
	}

	@Override
	public int getNumberOfNoWhite(){
		int c = 0;
		
		for(int i=0;i<textInFile.length();i++)
        {
            char ch=textInFile.charAt(i);
            if(ch==' ')
            c++;
        }
        return getNumberOfAllChar() - c;
	}

	@Override
	public int getNumberOfAllChar() {
		return textInFile.length();
	}

}
