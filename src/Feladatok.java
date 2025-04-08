import java.io.*;
import java.util.ArrayList;

public class Feladatok {
    ArrayList<Csatlakozas>lista;

    public Feladatok() {
        this.lista = new ArrayList<>();
        beolvasas();
        System.out.println("--------------------------------------------------");
        ketezerhet();
        MO();
        majus();
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

    private void ketezerhet(){
        int db = 0;
        for (Csatlakozas item : lista){
            if (item.getDatum().getYear()==2007){
                db+=1;
            }
        }
        System.out.println("A 2007-ben csatlakozott országok száma: " + db);
    }

    private void MO(){
        for (Csatlakozas item : lista){
            if (item.getOrszag().equals("Magyarország")){
                System.out.println("Magyarország csatlakozásának dátuma: " + item.getDatum());
            }
        }
    }

    private void majus(){
        boolean volt = false;
        int i = 0;
        while (!volt){
            if (lista.get(i).getDatum().getMonthValue()==5){
                    System.out.println("Volt májusban csatlakozás.");
                    volt=true;
            }
            i++;
        }
        if (!volt){
            System.out.println("Nem volt májusban csatlakozás.");
        }
    }

    private void legutolso(){

    }
}