import java.io.*;

public class Leitura {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String texto = br.readLine();

        while(texto != null){
            System.out.println(texto);
            texto = br.readLine();
        }


    }
}
