import java.math.BigDecimal;
import java.time.LocalDate;

import static java.lang.Integer.parseInt;

public class Predajca {
    private String meno;
    private  LocalDate datumNarodenin = LocalDate.of(1984,8,31);
    private double zmluvy ;
    private double prodaneMrkve ;
    private String sidloFirmy = "Bratislava";
    private String SPZ =  "BL - 184DE";
    private BigDecimal spotrebaAuto1 = BigDecimal.valueOf(14.4);
    private String ipAddress = "192.168.1.1";

            //konstruktor triedy
        public Predajca(String meno, double zmluvy, double prodaneMrkve) {
        this.meno = meno;
        this.zmluvy = zmluvy;
        this.prodaneMrkve = prodaneMrkve;
    }
             // gettery a settery
    public String getMeno() {
        return meno;
    }

    public double getZmluvy() {
        return zmluvy;
    }

    public void setZmluvy(double zmluvy) {
        this.zmluvy = zmluvy;
    }

    public double getProdaneMrkve() {
        return prodaneMrkve;
    }

    public void setProdaneMrkve(double prodaneMrkve) {
        this.prodaneMrkve = prodaneMrkve;
    }
    public String priemerMnozstvaMrkve(){
        double vysledok = prodaneMrkve/zmluvy;

        String formatovanyVysledok = String.format("%.3f", vysledok);
        return   formatovanyVysledok; // priemer mnozstva mrkvy na 1 zmluvu
    }


    public void rozdelNaTonyAKilogramy() {
        double vysledok = prodaneMrkve/zmluvy;
        int  tony =  (int)vysledok;

        System.out.println("Tony: " + tony + " ton");

        String formatovanyVysledok = String.format("%.3f", vysledok);
        String cisloBezCiarky = formatovanyVysledok.replace(",", ".");
        String[] casti = cisloBezCiarky.split("\\.");

        // Ak máme aspoň dve časti (celočíselná a desatinná)
        if (casti.length >= 2) {
            String desatinnaCast = casti[1];
            int cislo2 = Integer.parseInt(desatinnaCast);

            System.out.println("Kilá: " + cislo2 +" kg");
        }




    }

}
