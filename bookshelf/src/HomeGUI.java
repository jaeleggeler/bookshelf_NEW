import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends JFrame{

    //Attribute
    JLabel lbl_ueberschrift;
    JButton btn_neuesBuch, btn_monatsliste, btn_ausgeben, btn_bearbeiten, btn_loeschen;

    //Konstruktor
    public HomeGUI(){
        this.setTitle("My Bookshelf");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Komponenten für dieses Fenster
        initComponents();

        this.pack();
        this.setVisible(true);
    }//ende Konstruktor

    private void initComponents(){

        //Layout
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //Überschrift
        JLabel lbl_ueberschrift = new JLabel("My Bookshelf Home");
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

        //Logo funktioniert nicht
        /* ImageIcon bild = new ImageIcon("BOOKSHELF/src/bookshelf_logo.png"); // Pfad anpassen
        JLabel lbl_bild = new JLabel(bild); // Nur das Bild, kein Text

        c.gridx = 0; // Spalte 0
        c.gridy = 1; // Zeile 1
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(10, 10, 10, 10);
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;

        this.add(lbl_bild, c);
        */


        //BUTTONS
        MyActionListener mylistener = new MyActionListener();
        //neues Buch hinzufügen
        btn_neuesBuch = new JButton("Neues Buch hinzufügen");
        Font font_button = new Font("Sans Serif", Font.BOLD, 14);
        btn_neuesBuch.setFont(font_button);
        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 5, 10);
        this.add(btn_neuesBuch,c);
        
        //Alle Bücher anzeigen
        btn_ausgeben = new JButton("Alle Bücher ausgeben");
        btn_ausgeben.setFont(font_button);
        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 5, 10);
        this.add(btn_ausgeben,c);

        
        //Monatsliste
        btn_monatsliste = new JButton("Monatsliste");
        btn_monatsliste.setFont(font_button);
        c.gridx = 1;
        c.gridy = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 5, 10);
        this.add(btn_monatsliste,c);

        
        //Bearbeiten
        btn_bearbeiten = new JButton("Vorhandenes Buch bearbeiten");
        btn_bearbeiten.setFont(font_button);
        c.gridx = 1;
        c.gridy = 4;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 5, 10);
        this.add(btn_bearbeiten,c);

        
        //löschen
        btn_loeschen = new JButton("Buch löschen");
        btn_loeschen.setFont(font_button);
        c.gridx = 1;
        c.gridy = 5;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 5, 10);
        this.add(btn_loeschen,c);

        //Actionlistener
        
        btn_neuesBuch.addActionListener(mylistener);
        btn_loeschen.addActionListener(mylistener);
        btn_ausgeben.addActionListener(mylistener);
        btn_monatsliste.addActionListener(mylistener);
        btn_bearbeiten.addActionListener(mylistener);

    }//ende initcomponents()

    private class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== btn_neuesBuch){
                new NeuesBuchGUI().setVisible(true);
                dispose();
            }else if( e.getSource() == btn_bearbeiten){
                new BuchAendernGUI().setVisible(true);
                dispose();
            }else if( e.getSource() == btn_monatsliste){
                new Monatsliste().setVisible(true);
                dispose();
            }else if( e.getSource() == btn_loeschen){
                new BuchLoeschenGUI().setVisible(true);
                dispose();
            }else if( e.getSource() == btn_ausgeben){
                new BuchAusgebenGUI().setVisible(true);
                dispose();
            }
            
        }
        
    }
}
