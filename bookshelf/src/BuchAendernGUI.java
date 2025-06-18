    import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuchAendernGUI extends JFrame{


    //Attribute
    JLabel lbl_ueberschrift, lbl_titel;
    JTextField txt_titel;
    JButton btn_aendern, btn_abbrechen; 

    //Konstruktor
    public BuchAendernGUI(){
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
        lbl_ueberschrift = new JLabel("Buch ändern");
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
        //Name und dazugehöriges Textfeld
        lbl_titel = new JLabel("Name:");
        Font font_beschriftungen = new Font("Sans Serif", Font.PLAIN, 12);
        lbl_titel.setFont(font_beschriftungen);
        c.gridx = 0; //Spalte
        c.gridy = 1; //Zeile
        c.gridwidth = 1;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(5, 10, 0 , 10);
        this.add(lbl_titel,c);

        txt_titel = new JTextField(25);
        c.gridx = 1;
        c.gridy = 1;
        //Breite und Höhe Einstellungen bleiben weiterhin erhalten (gleiche bei anchor)
        c.insets = new Insets(5, 0, 0, 10);
        this.add(txt_titel,c);

        //BUTTONS
        MyActionListener mylistener = new MyActionListener();
        
            
        //Alle Bücher anzeigen
        btn_abbrechen = new JButton("Abbrechen");  
        Font font_button = new Font("Sans Serif", Font.BOLD, 14);
        btn_abbrechen.setFont(font_button);
        c.gridx = 2;
        c.gridy = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 5, 10);
        this.add(btn_abbrechen,c);

        //neues Buch hinzufügen
        btn_aendern = new JButton("Buch ändern");
        btn_aendern.setFont(font_button);
        c.gridx = 2;
        c.gridy = 4;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 10, 5, 10);
        this.add(btn_aendern,c);

        btn_abbrechen.addActionListener(mylistener);
        btn_aendern.addActionListener(mylistener);

    }//ende initComponents

    private class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== btn_abbrechen){
                new HomeGUI();
                dispose();
            }else if( e.getSource() == btn_aendern){

            }
        }
    }
}//ende Class
