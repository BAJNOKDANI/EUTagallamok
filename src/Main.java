import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate ma = LocalDate.now();
        System.out.println(ma.getYear());
        System.out.println(ma);

        LocalDate szulinap = LocalDate.of(2008,4,8);
        System.out.println(szulinap.getYear());

        Feladatok f = new Feladatok();
    }
}