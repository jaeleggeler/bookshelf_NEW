import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

public class NeuesBuchGUI extends JFrame{
    
    //Attribute
    JLabel lbl_ueberschrift, lbl_titel, lbl_autor, lbl_seiten, lbl_jahr,
        lbl_bewertung, lbl_format, lbl_frage, lbl_leseJahr, lbl_leseMonat;
    JTextField txt_titel, txt_autor, txt_seiten, txt_jahr, txt_leseJahr;
    JComboBox<Integer> cbo_bewertung;
    JComboBox<String> cbo_leseMonat;
    JRadioButton opt_ebook, opt_gebunden;
    JButton btn_abbrechen, btn_speichern;

    //Konstruktor
    public NeuesBuchGUI() {

        this.setTitle("My Bookshelf");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Komponenten
        initComponents();

        this.pack();
        this.setLocation(400, 100);
        this.setVisible(true);

    }//end constructor

    private void initComponents(){

        //Layout
        this.setLayout(new GridBagLayout());
        //Constraints
        GridBagConstraints c = new GridBagConstraints();

        //Überschrift
        lbl_ueberschrift = new JLabel("Neues Buch");
        Font font_ueberschrift = new Font("Sans Serif", Font.BOLD, 24);
        lbl_ueberschrift.setFont(font_ueberschrift);
        lbl_ueberschrift.setForeground(Color.BLACK);
        lbl_ueberschrift.setHorizontalAlignment(JLabel.CENTER);
        c.gridx = 0; //Spalte
        c.gridy = 0; //Zeile
        c.gridwidth = 2; //über 2 Spalten
        c.gridheight = 1; //über 1 Zeile
        c.anchor = GridBagConstraints.SOUTH;
        c.insets = new Insets(20, 10, 10, 10);
        this.add(lbl_ueberschrift,c);

        //Titel
        lbl_titel = new JLabel("Buchtitel:");
        Font font_beschriftungen = new Font("Sans Serif", Font.PLAIN, 12);
        lbl_titel.setFont(font_beschriftungen);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(5, 10, 0, 10);
        this.add(lbl_titel, c);

        txt_titel = new JTextField(20);
        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(5, 0, 0, 10);
        this.add(txt_titel, c);

        //Autor
        lbl_autor = new JLabel("Autor:");
        lbl_autor.setFont(font_beschriftungen);
        c.gridx = 0;
        c.gridy = 2;
        c.insets = new Insets(5, 10, 0, 10);
        this.add(lbl_autor, c);

        txt_autor = new JTextField(20);
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(5, 0, 0, 10);
        this.add(txt_autor, c);

        //Seitenzahl
        lbl_seiten = new JLabel("Seitenanzahl");
        lbl_seiten.setFont(font_beschriftungen);
        c.gridx = 0;
        c.gridy = 3;
        c.insets = new Insets(5, 10, 0, 10);
        this.add(lbl_seiten, c);

        txt_seiten = new JTextField(20);
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(5, 0, 0, 10);
        this.add(txt_seiten, c);

        //Erscheinungsjahr
        lbl_jahr = new JLabel("Erscheinungsjahr");
        lbl_jahr.setFont(font_beschriftungen);
        c.gridx = 0;
        c.gridy = 4;
        c.insets = new Insets(5, 10, 0, 10);
        this.add(lbl_jahr, c);

        txt_jahr = new JTextField(20);
        c.gridx = 1;
        c.gridy = 4;
        c.insets = new Insets(5, 0, 0, 10);
        this.add(txt_jahr, c);

        //Bewertung
        lbl_bewertung = new JLabel("Bewertung");
        lbl_bewertung.setFont(font_beschriftungen);
        c.gridx = 0;
        c.gridy = 5;
        c.insets = new Insets(5, 10, 0, 10);
        this.add(lbl_bewertung, c);

        Integer[] bewertungen = {1, 2, 3, 4, 5};
        cbo_bewertung = new JComboBox<Integer>(bewertungen);
        c.gridx = 1;
        c.gridy = 5;
        c.insets = new Insets(5, 0, 0, 10);
        this.add(cbo_bewertung, c);

        //Format
        lbl_format = new JLabel("Format");
        Font font_titel = new Font("Sans Serif", Font.BOLD, 14);
        lbl_format.setFont(font_titel);
        c.gridx = 0;
        c.gridy = 6;
        c.insets = new Insets(5, 10, 0, 10);
        this.add(lbl_format, c);

        opt_ebook = new JRadioButton("E-Book");
        opt_ebook.setFont(font_beschriftungen);
        opt_ebook.setSelected(true);
        c.gridx = 0;
        c.gridy = 7;
        c.insets = new Insets(0, 10, 0, 10);
        this.add(opt_ebook, c);

        opt_gebunden = new JRadioButton("Gebunden");
        opt_gebunden.setFont(font_beschriftungen);
        c.gridx = 1;
        c.gridy = 7;
        c.insets = new Insets(0, 0, 0, 10);
        this.add(opt_gebunden, c);

        ButtonGroup format = new ButtonGroup();
        format.add(opt_ebook);
        format.add(opt_gebunden);
        
        //Gelesen
        lbl_frage = new JLabel("Wann hast du deises Buch gelesen?");
        lbl_frage.setFont(font_titel);
        c.gridx = 0;
        c.gridy = 8;
        c.gridwidth = 2;
        c.insets = new Insets(5, 10, 0, 10);
        this.add(lbl_frage, c);

        //leseJahr
        lbl_leseJahr = new JLabel("Jahr");
        lbl_leseJahr.setFont(font_beschriftungen);
        c.gridx = 0;
        c.gridy = 9;
        c.gridwidth = 1;
        c.insets = new Insets(0, 10, 0, 10);
        this.add(lbl_leseJahr, c);

        txt_leseJahr = new JTextField(20);
        c.gridx = 1;
        c.gridy = 9;
        c.insets = new Insets(0, 0, 0, 10);
        this.add(txt_leseJahr, c);

        //leseMonat
        lbl_leseMonat = new JLabel("Monat");
        lbl_leseMonat.setFont(font_beschriftungen);
        c.gridx = 0;
        c.gridy = 10;
        c.insets = new Insets(5, 10, 0, 10);
        this.add(lbl_leseMonat, c);

        String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        cbo_leseMonat = new JComboBox<String>(monate);
        c.gridx = 1;
        c.gridy = 10;
        c.insets = new Insets(5, 0, 0, 10);
        this.add(cbo_leseMonat, c);

        //Buttons
        MyActionListener listener = new MyActionListener();

        //btn abbrechen
        btn_abbrechen = new JButton("Abbrechen");
        Font font_button = new Font("Sans Serif", Font.BOLD, 16);
        btn_abbrechen.setFont(font_button);
        c.gridx = 0;
        c.gridy = 11;
        c.insets = new Insets(20, 10, 10, 10);
        this.add(btn_abbrechen, c);
        btn_abbrechen.addActionListener(listener);

        //btn speichern
        btn_speichern = new JButton("Buch speichern");
        btn_speichern.setFont(font_button);
        c.gridx = 1;
        c.gridy = 11;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(20, 0, 10, 10);
        this.add(btn_speichern, c);
        btn_speichern.addActionListener(listener);

    }//end initComponents

    private class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btn_abbrechen){
                
                System.exit(0);

            }else if (e.getSource() == btn_speichern){

                //eingegebene Werte prüfen
                if (txt_titel.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Trage bitte einen Buchtitel ein.");
                } else if (txt_autor.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Gib bitte den Namen des Autors ein.");
                } else if (txt_seiten.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Bitte gib eine gültige Seitenzahl ein.");
                } else if (txt_jahr.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Trage bitte das Erscheiungsjahr des Buches ein.");
                } else if (txt_leseJahr.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Gib im Feld ´Jahr` das Jahr ein, in dem du das Buche gelesen hast.");
                }

                //Daten in einem Objekt speichern
                /*String titel, String autor, int seiten, int erscheinjahr,
                 *int bewertung, String format, int lesejahr, String lesemonat*/
                String titel = txt_titel.getText();
                String autor = txt_autor.getText();
                int seiten = Integer.parseInt(txt_seiten.getText());
                int erscheinjahr = Integer.parseInt(txt_jahr.getText());
                int bewertung = (int) cbo_bewertung.getSelectedItem();
                String format = "";
                int lesejahr = Integer.parseInt(txt_leseJahr.getText());
                String lesemonat = (String) cbo_leseMonat.getSelectedItem();

                if (opt_ebook.isSelected()){
                    format = "E-Book";
                }else if (opt_gebunden.isSelected()){
                    format = "Gebunden";
                }
                    
                //neues Buch-Objekt erstellen
                Buch neuesBuch = new Buch(titel, autor, seiten, erscheinjahr, bewertung, format, lesejahr, lesemonat);

                //Verknüpfung zu DAO
                BuchDAO dao = new BuchDAO();
                dao.speichereBuch(neuesBuch);

                //Fenster schließen
                System.exit(0);
      
            }

        }//end actionPerformed

    }//end actionListener



}//end class