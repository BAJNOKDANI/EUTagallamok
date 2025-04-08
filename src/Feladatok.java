import java.io.*;
import java.util.ArrayList;

public class Feladatok {
    ArrayList<Csatlakozas>lista;

    public Feladatok() {
        this.lista = new ArrayList<>();
        beolvasas();
    }

    private void beolvasas(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("EUcsatlakozas.txt"));
            String sor = reader.readLine();
            while (sor!=null){
                lista.add(new Csatlakozas(sor));
                sor = reader.readLine();
            }
            for (Csatlakozas item : lista){
                System.out.println(item);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}