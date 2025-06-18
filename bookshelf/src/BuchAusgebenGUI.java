import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class BuchAusgebenGUI extends JFrame {

    private DefaultListModel<String> listModel;
    private JList<String> buchListe;
    private JButton btnZurueck;

    public BuchAusgebenGUI() {
        setTitle("Alle Bestellungen");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 300);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Überschrift
        JLabel lblUeberschrift = new JLabel("My Bookshelf");
        lblUeberschrift.setFont(new Font("Sans Serif", Font.BOLD, 20));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.insets = new Insets(20, 10, 10, 10);
        c.anchor = GridBagConstraints.CENTER;
        add(lblUeberschrift, c);

        // Listbox mit ScrollPane
        listModel = new DefaultListModel<>();
        buchListe = new JList<>(listModel);
        buchListe.setVisibleRowCount(4);  // max. 4 sichtbare Zeilen
        JScrollPane scrollPane = new JScrollPane(buchListe);

        c.gridy = 1;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        c.insets = new Insets(0, 10, 10, 10);
        add(scrollPane, c);

        // Zurück-Button
        //BUTTONS
        MyActionListener mylistener = new MyActionListener();

        btnZurueck = new JButton("Zurück");
        btnZurueck.setFont(new Font("Sans Serif", Font.PLAIN, 14));
        c.gridy = 2;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        c.weighty = 0;
        c.insets = new Insets(10, 10, 20, 10);
        add(btnZurueck, c);

        btnZurueck.addActionListener(mylistener);

        //ladeBuecher();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class MyActionListener implements ActionListener{

        

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== btnZurueck){
                new HomeGUI();
                dispose();
            
            }
        }
    }

    /*private void ladeBuecher() {
        BuchDAO dao = new BuchDAO();
        List<Buch> buecher = dao.ladeAlleBuecher();
    
        if (buecher.isEmpty()) {
            listModel.addElement("Keine Bücher gefunden.");
            return;
        }
    
        for (Buch b : buecher) {
            String eintrag = "Titel: " + b.getTitel() +
                             ", Autor: " + b.getAutor() +
                             ", Seiten: " + b.getSeiten() +
                             ", Erscheinungsjahr: " + b.getErscbeinungsjahr() +
                             ", Bewertung: " + b.getBewertung() + "/5 Sterne";
    
            listModel.addElement(eintrag);
        }
    }*/
    
}
