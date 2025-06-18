import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Monatsliste extends JFrame {

    private JComboBox<String> monatBox;
    private JTextField jahrFeld;
    private JTable buecherTabelle;
    private DefaultTableModel tabelleModell;

    public Monatsliste() {
        // Fenster-Einstellungen
        setTitle("Monatsliste");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setLocationRelativeTo(null);

        // Layout
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);

        // Überschrift
        JLabel ueberschrift = new JLabel("Gelesene Bücher nach Monat und Jahr");
        ueberschrift.setFont(new Font("Arial", Font.BOLD, 20));
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        add(ueberschrift, c);

        // Monat Label
        c.gridy = 1;
        c.gridwidth = 1;
        c.anchor = GridBagConstraints.WEST;
        add(new JLabel("Monat auswählen:"), c);

        // Monat Auswahl
        String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Juni",
                "Juli", "August", "September", "Oktober", "November", "Dezember"};
        monatBox = new JComboBox<>(monate);
        c.gridx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(monatBox, c);

        // Jahr Label
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.NONE;
        add(new JLabel("Jahr eingeben (z. B. 2024):"), c);

        // Jahr Eingabefeld
        jahrFeld = new JTextField(15);
        c.gridx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(jahrFeld, c);

        // Button "Bücher suchen"
        JButton suchenButton = new JButton("Bücher suchen");
        c.gridx = 1;
        c.gridy = 3;
        c.anchor = GridBagConstraints.EAST;
        c.fill = GridBagConstraints.NONE;
        add(suchenButton, c);

        // Tabelle vorbereiten
        String[] spalten = {"Titel", "Autor", "Seiten", "Bewertung"};
        tabelleModell = new DefaultTableModel(spalten, 0);
        buecherTabelle = new JTable(tabelleModell);
        JScrollPane scrollPane = new JScrollPane(buecherTabelle);
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);

        // Button "Zurück"
        JButton zurueckButton = new JButton("Zurück");
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.CENTER;
        c.weighty = 0;
        add(zurueckButton, c);

        // Aktion: Bücher suchen
        suchenButton.addActionListener((ActionEvent e) -> {
            String monat = (String) monatBox.getSelectedItem();
            String jahr = jahrFeld.getText().trim();

            if (jahr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Bitte Jahr eingeben.");
                return;
            }

            // Alte Daten löschen
            tabelleModell.setRowCount(0);

            
        });

        // Aktion: Zurück zur Start-GUI
        zurueckButton.addActionListener(e -> {
            dispose();
            new HomeGUI().setVisible(true);
        });
    }


}
