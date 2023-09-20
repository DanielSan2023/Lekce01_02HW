import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {

            //vytvoril som Objekt predajca.
        Predajca predajca1 = new Predajca("Jan Novak",1365,12260);


            // pomocou metody z triedy predajca som vypocital priemer.
        System.out.println("Predajca : " + predajca1.getMeno());
        System.out.println("Priemerne mnozstvo mrkvy na jednu zmluvu je :  " +predajca1.priemerMnozstvaMrkve() + "ton");

            // a roydelil  na tony a kila.
        predajca1.rozdelNaTonyAKilogramy();

        // povodne som chcel spravit abstraktnu triedu predajca ale pre tento pr9pad to nebolo nutne.Dakujem za feedback.

    }
}