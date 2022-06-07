package aula11.ClassesAbsract;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ImpressoraEpson impressoraCannon = new ImpressoraEpson(
                "CN1020",
                "USB",
                LocalDate.now(),
                10,
                100
        );
        System.out.println(impressoraCannon.imprimir());
    }

}