import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Csatlakozas {
    private String orszag;
    private LocalDate datum;

    public Csatlakozas(String sor) {
        String [] reszek = sor.split(";");
        this.orszag = reszek[0];
        DateTimeFormatter format = DateTimeFormatter.ofPattern(("yyyy.MM.dd"));
        this.datum = LocalDate.parse(reszek[1],format);
    }

    public String getOrszag() {
        return orszag;
    }

    public void setOrszag(String orszag) {
        this.orszag = orszag;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "orszag=" + orszag +
                ", datum=" + datum;
    }
}