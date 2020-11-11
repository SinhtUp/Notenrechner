import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;



import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class notenRechnerui {
	public float reachedpoints;
	public float maxpoints;
	public float pointsneeded;
	public float grade;
	public JFrame frmNotenRechner;
	private JTextField textField;
	private JTextField txtErreichtepunktepatzhalter;

	/**
	 * Create the application.
	 */
	public notenRechnerui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmNotenRechner = new JFrame();
		frmNotenRechner.setTitle("Noten rechner");
		frmNotenRechner.setResizable(false);
		frmNotenRechner.setBounds(100, 100, 800, 600);
		frmNotenRechner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNotenRechner.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Dialog", Font.PLAIN, 33));
		textField.setBounds(125, 57, 137, 49);
		frmNotenRechner.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtErreichtepunktepatzhalter = new JTextField();
		txtErreichtepunktepatzhalter.setFont(new Font("Dialog", Font.PLAIN, 33));
		txtErreichtepunktepatzhalter.setHorizontalAlignment(SwingConstants.CENTER);
		txtErreichtepunktepatzhalter.setBounds(536, 57, 137, 49);
		frmNotenRechner.getContentPane().add(txtErreichtepunktepatzhalter);
		txtErreichtepunktepatzhalter.setColumns(10);
		
		JTextPane txtpnOutputpercentage = new JTextPane();
		txtpnOutputpercentage.setEditable(false);
		txtpnOutputpercentage.setText("");
		txtpnOutputpercentage.setFont(new Font("Dialog", Font.PLAIN, 33));
		txtpnOutputpercentage.setBounds(343, 135, 137, 49);
		frmNotenRechner.getContentPane().add(txtpnOutputpercentage);
		
		JTextPane textpnDegre = new JTextPane();
		textpnDegre.setEditable(false);
		textpnDegre.setFont(new Font("Dialog", Font.PLAIN, 33));
		textpnDegre.setText("4");
		textpnDegre.setBounds(223, 254, 39, 49);
		frmNotenRechner.getContentPane().add(textpnDegre);
		
		JTextPane textpnPointsneeded = new JTextPane();
		textpnPointsneeded.setEditable(false);
		textpnPointsneeded.setText(Float.toString(pointsneeded));
		textpnPointsneeded.setFont(new Font("Dialog", Font.PLAIN, 33));
		textpnPointsneeded.setBounds(536, 254, 137, 49);
		frmNotenRechner.getContentPane().add(textpnPointsneeded);
		
		JLabel lblMaxpunktzahl = new JLabel("MaxPunktzahl");
		lblMaxpunktzahl.setBounds(142, 30, 106, 15);
		frmNotenRechner.getContentPane().add(lblMaxpunktzahl);
		
		JLabel lblErreicht = new JLabel("Erreichte Punktzahl");
		lblErreicht.setBounds(536, 30, 159, 15);
		frmNotenRechner.getContentPane().add(lblErreicht);
		
		JLabel lblEntsprichtProzent = new JLabel("Entspricht prozent");
		lblEntsprichtProzent.setBounds(343, 108, 137, 15);
		frmNotenRechner.getContentPane().add(lblEntsprichtProzent);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setBounds(223, 227, 70, 15);
		frmNotenRechner.getContentPane().add(lblNote);
		
		JLabel lblFehlendePunkte = new JLabel("Fehlende Punkte");
		lblFehlendePunkte.setBounds(536, 227, 137, 15);
		frmNotenRechner.getContentPane().add(lblFehlendePunkte);
		
		JLabel lblcreator = new JLabel("Ufuk Hamit Alkin");
		lblcreator.setForeground(Color.GRAY);
		lblcreator.setFont(new Font("Dialog", Font.BOLD, 10));
		lblcreator.setBounds(12, 553, 125, 15);
		frmNotenRechner.getContentPane().add(lblcreator);
		
		JLabel lblVersion = new JLabel("Version 0.1");
		lblVersion.setForeground(Color.GRAY);
		lblVersion.setFont(new Font("Dialog", Font.BOLD, 9));
		lblVersion.setBounds(142, 554, 120, 15);
		frmNotenRechner.getContentPane().add(lblVersion);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(notenRechnerui.class.getResource("/image/Daa logoklein.png")));
		lblNewLabel.setBounds(12, 467, 70, 89);
		frmNotenRechner.getContentPane().add(lblNewLabel);
	
		JButton btnBerechne = new JButton("Berechne");
		btnBerechne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(event.getSource()== btnBerechne){
					reachedpoints = Float.parseFloat(txtErreichtepunktepatzhalter.getText());
					maxpoints = Float.parseFloat(textField.getText());
					grade = (100 * reachedpoints) / maxpoints;
					pointsneeded = maxpoints - reachedpoints;
					txtpnOutputpercentage.setText(Float.toString(grade)+"%");
					textpnPointsneeded.setText(Float.toString(pointsneeded));
				}
				
				
			}
		});
	
		btnBerechne.setFont(new Font("Dialog", Font.BOLD, 16));
		btnBerechne.setBounds(613, 472, 137, 49);
		frmNotenRechner.getContentPane().add(btnBerechne);
	}
}
