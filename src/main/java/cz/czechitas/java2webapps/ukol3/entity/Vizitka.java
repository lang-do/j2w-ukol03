package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {

    private String jmeno;
    private String firma;
    private String ulice;
    private String obecPsc;
    private String celaAdresa; //(readonly property, ve tvaru „ulice, obecPsc“)
    private String email;
    private String telefon;
    private String web;

    public Vizitka() {
    }

    public Vizitka(String jmeno, String firma, String ulice, String obecPsc, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obecPsc = obecPsc;
        //this.celaAdresa = celaAdresa;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getFirma() {
        return firma;
    }

    public String getUlice() {
        return ulice;
    }

    public String getObecPsc() {
        return obecPsc;
    }

    public String getCelaAdresa() {
        return ulice + "," + obecPsc;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public void setObecPsc(String obecPsc) {
        this.obecPsc = obecPsc;
    }

    /*public void setCelaAdresa(String celaAdresa) {
        this.celaAdresa = celaAdresa;                   //read only
    }*/

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
