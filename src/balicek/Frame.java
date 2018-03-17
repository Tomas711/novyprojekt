package balicek;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

/**
 * Třída sloužící jako user interface
 * 
 * @author Vít Vágner
 * @version 1.0
 */

public class Frame extends JFrame {
	
	private Function fun;
	
	private Font font = new Font("Tahoma", Font.PLAIN, 16);
	
	private JTextField pathField;
	
	private JPanel linePane;
	private JLabel lineLabel;
	private JTextField lineField;
	
	private JPanel wordPane;
	private JLabel wordLabel;
	private JTextField wordField;
	
	private JPanel nonePane;
	private JLabel noneLabel;
	private JTextField noneField;
	
	private JPanel allPane;
	private JLabel allLabel;
	private JTextField allField;

	private Frame() {		
		/*
		 * Hlavní panel
		 */
		JPanel mainPane = new JPanel();
		mainPane.setLayout(new BoxLayout(mainPane, BoxLayout.PAGE_AXIS));
		
		/*
		 * Cesta k dokumentu
		 */
		JPanel pathPane = new JPanel();
		
		JLabel pathLabel = new JLabel("Cesta ke dok.:");
		pathLabel.setFont(font);
		
		pathField = new JTextField(15);
		pathField.setFont(font);
		
		JButton pathButton = new JButton("Načti");
		pathButton.setFont(font);
		pathButton.addActionListener(new SetPathAction());
		
		pathPane.add(pathLabel);
		pathPane.add(pathField);
		pathPane.add(pathButton);
		mainPane.add(pathPane);
			
		/*
		 * Počet řádků
		 */
		lineField = new JTextField(5);
		Frame.setLabelField(mainPane, linePane, lineLabel, "Počet řádků: ", lineField, font);
		/*
		 * Počet slov
		 */
		wordField = new JTextField(5);
		Frame.setLabelField(mainPane, wordPane, wordLabel, "Počet slov:", wordField, font);

		/*
		 * Počet no-whitespace znaků
		 */
		noneField = new JTextField(5);
		Frame.setLabelField(mainPane, nonePane, noneLabel, "Počet no-whitespace znaků:", noneField, font);

		/*
		 * Počet všech znaků
		 */
		allField = new JTextField(5);
		Frame.setLabelField(mainPane, allPane, allLabel, "Počet všech znaků:", allField, font);
		
		add(mainPane);
		
	}
	
	private static void setLabelField (JPanel mainPane, JPanel pane, JLabel label, String labelText, JTextField field, Font font) {	
		pane = new JPanel();
		
		label = new JLabel(labelText);
		label.setFont(font);
		
		field.setFont(font);
		field.setEditable(false);
		field.setHorizontalAlignment(JTextField.CENTER);
		
		pane.add(label);
		pane.add(field);
		mainPane.add(pane);
	}
	
	public static void makeWindow() {
		Frame fr = new Frame();
		fr.setTitle("App by Rousek, Vágner");
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(450, 300);
		fr.setLocationRelativeTo(null);
	}
	
	private class SetPathAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){ 
			try {
				String path = pathField.getText();				
				fun = new Function(path);

				lineField.setText(""+fun.getNumberOfLines());
				wordField.setText(""+fun.getNumberOfWords());
				noneField.setText(""+fun.getNumberOfNoWhite());
				allField.setText(""+fun.getNumberOfAllChar());
				
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}
}
