import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class BuchDAO {
    
    public void speichereBuch(Buch buch){
        String sql = "INSERT INTO buecher (titel, autor, seiten, erscheinjahr, bewertung, format, lesejahr, lesemonat) VALUES(?,?,?,?,?,?,?,?)";
    
        //Verbindung aufbauen
        try (Connection conn = DatabaseConnector.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){

             //Statement mit Werten verknüpfen (Fragezeichen Werte zuweisen)
             stmt.setString(1, buch.getTitel());
             stmt.setString(2, buch.getAutor());
             stmt.setInt(3, buch.getSeiten());
             stmt.setInt(4, buch.getErscheinjahr());
             stmt.setInt(5, buch.getBewertung());
             stmt.setString(6, buch.getFormat());
             stmt.setInt(7, buch.getLesejahr());
             stmt.setString(8, buch.getLesemonat());

             stmt.executeUpdate();
             System.out.println("Buch wurde erfolgreich gespeichert!");
             JOptionPane.showMessageDialog(null, "Das neue Buch wurde erfolgreich gespeichert!");
                
        }catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Das Buch konnte leider nicht gespeichert werden.");
        }

    
    }

}
