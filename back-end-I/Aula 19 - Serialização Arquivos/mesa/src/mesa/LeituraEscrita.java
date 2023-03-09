package mesa;

import java.io.*;

public class LeituraEscrita {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);



        String texto = br.readLine();
        while (texto != null) {
            System.out.println(texto);
            bw.write(texto);
            bw.newLine();
            texto = br.readLine();
        }
        bw.close();
    }
}
