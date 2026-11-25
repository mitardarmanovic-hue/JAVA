import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormaRazlomak extends JFrame {
	
	private JLabel l1, l2, l3,l4,l5 ,l6,l7,l8;
	private JTextField t1,t2,t3,t4;
	private JButton b1,b2;
	
	
	public FormaRazlomak() {
		super("kalkulator");// title ili ti ime prozora na vrh da ispise nesto
		this.setSize(300,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//na x se gasi prozor
		this.setLocationRelativeTo(null);//forma se pojavljuje u sredinu
		
		this.setLayout(new FlowLayout());
		Font f  = new Font("Times New Roman",Font.BOLD, 18);
		
		l1 = new JLabel("Prvi broj:");
		l1.setFont(f);
		l1.setPreferredSize(new Dimension(100,20));
		
		l2 = new JLabel("/");
		l2.setFont(f);
		l2.setPreferredSize(new Dimension(20,20));
		
		l3 = new JLabel("Drugi broj");
		l3.setFont(f);
		l3.setPreferredSize(new Dimension(100,20));
		
		l4 = new JLabel("/");
		l4.setFont(f);
		l4.setPreferredSize(new Dimension(20,20));
		
		l5 = new JLabel("");
		l5.setFont(f);
		l5.setPreferredSize(new Dimension(215,40));
		
		l6 = new JLabel("");
		l6.setFont(f);
		l6.setPreferredSize(new Dimension(215,40));
		
		l7 = new JLabel("");
		l7.setFont(f);
		l7.setPreferredSize(new Dimension(215,40));
		
		l8 = new JLabel("");
		l8.setFont(f);
		l8.setPreferredSize(new Dimension(215,40));
		t1 = new JTextField("");
		t1.setFont(f);
		t1.setPreferredSize(new Dimension(40,30));
		
		t2 = new JTextField("");
		t2.setFont(f);
		t2.setPreferredSize(new Dimension(40,30));
		
		t3 = new JTextField("");
		t3.setFont(f);
		t3.setPreferredSize(new Dimension(40,30));
		
		t4 = new JTextField("");
		t4.setFont(f);
		t4.setPreferredSize(new Dimension(40,30));
		
		ObradiDugmad od = new ObradiDugmad();
		
		b1 = new JButton("Izracunaj");
		b1.setFont(f);
		b1.setPreferredSize(new Dimension(215,40));
		b1.addActionListener(od);
		
		
		b2 = new JButton("Zatvori");
		b2.setFont(f);
		b2.setPreferredSize(new Dimension(215,40));
		b2.addActionListener(od);
		
		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(l3);
		this.add(t3);
		this.add(l4);
		this.add(t4);
		this.add(b1);
		this.add(b2);
		this.add(l5);
		this.add(l6);
		this.add(l7);
		this.add(l8);
		
		
	}
	private class ObradiDugmad implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1) {
			
				try {
				Razlomak r1 = new Razlomak(Integer.parseInt(t1.getText()),
						Integer.parseInt(t2.getText()));
				Razlomak r2 = new Razlomak(Integer.parseInt(t1.getText()),
						Integer.parseInt(t2.getText()));
				
				Razlomak r3 = Razlomak.Saberi(r1, r2);
				Razlomak r4 = Razlomak.oduzmi(r1, r2);
				Razlomak r5 = Razlomak.Dijeli(r1, r2);
				Razlomak r6 = Razlomak.Pomnozi(r1, r2);
				
				l5.setText("sabiranje"+ r3);
				l6.setText("oduzimanje"+ r4);
				l7.setText("dijeljenje"+ r5);
				l8.setText("mnozenje"+ r6);
				}
				catch(Exception o) {
					JOptionPane.showMessageDialog(null,"nisi dobro unio podatke" + o.getMessage());
				}
			}
			if(e.getSource()== b2 ){
				
				
				int opcija = JOptionPane.showConfirmDialog(null,"Zelite li da izadjetet ",
						"izlaz iz app", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(opcija == JOptionPane.YES_OPTION)
				System.exit(EXIT_ON_CLOSE);
			}
		}


}
}