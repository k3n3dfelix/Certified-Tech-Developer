import java.io.*;

public class Escrita {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Lorem sit dolor amet");
        bw.newLine();
        bw.write("Lorem sit dolor amet");
        bw.close();

    }
}

