public class Buch {
    
    //Attribute
    private String titel;
    private String autor;
    private int seiten;
    private int erscheinjahr;
    private int bewertung;
    private String format;
    private int lesejahr;
    private String lesemonat;

    //Konstruktor
    public Buch(String titel, String autor, int seiten, int erscheinjahr, int bewertung, String format, int lesejahr,
            String lesemonat) {
        this.titel = titel;
        this.autor = autor;
        this.seiten = seiten;
        this.erscheinjahr = erscheinjahr;
        this.bewertung = bewertung;
        this.format = format;
        this.lesejahr = lesejahr;
        this.lesemonat = lesemonat;
    }

    //Getters & Setters
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getSeiten() {
        return seiten;
    }

    public void setSeiten(int seiten) {
        this.seiten = seiten;
    }

    public int getErscheinjahr() {
        return erscheinjahr;
    }

    public void setErscheinjahr(int erscheinjahr) {
        this.erscheinjahr = erscheinjahr;
    }

    public int getBewertung() {
        return bewertung;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getLesejahr() {
        return lesejahr;
    }

    public void setLesejahr(int lesejahr) {
        this.lesejahr = lesejahr;
    }

    public String getLesemonat() {
        return lesemonat;
    }

    public void setLesemonat(String lesemonat) {
        this.lesemonat = lesemonat;
    }

    

    

}
