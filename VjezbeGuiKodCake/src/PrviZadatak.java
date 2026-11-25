import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PrviZadatak extends JFrame {
	 
	
		

	public static void main(String[] args ) {
		String ime = JOptionPane.showInputDialog(null, "Unesite ime:");
		String prezime = JOptionPane.showInputDialog(null, "Unesite prezime:");
		String godiste = JOptionPane.showInputDialog(null, "Unesite godiste:");
		
		
		int godisteInt = Integer.parseInt(godiste);
		
		String email = String.format("%s.%s.%d@kompanija.me",ime,prezime,godisteInt);
		String podaci = String.format("pregled podataka: \n"+ "ime :%s \n"+"prezime: %s\n"+"Godiste: %d\n",ime,prezime,godisteInt);
	int dugme =  JOptionPane.showConfirmDialog(null,podaci, "pregled i potvrda unosa", JOptionPane.YES_NO_CANCEL_OPTION);
		if (dugme == 0) {
			JOptionPane.showMessageDialog(null, "vas email je " + email);
		}else {
			JOptionPane.showMessageDialog(null, "Pogresan unos");
		}
	}
}
//ucitavanje fajla
/*moramo ubaciti java nio file files i java nio file paths kao importovati ih
 *byte[] bajtovi = Files.readAllBytes(paths.get("./src/rates.json"); ova tacna u zagradi je zamjena za sve prije toga manje vise
 *String sadrzaj = new String(bajtovi, "UTF-8");
 */
