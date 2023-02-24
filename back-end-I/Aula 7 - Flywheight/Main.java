package aula7.flywheight;

public class Main {
    public static void main(String[] args){
        ComputadorFactory computadorFactory = new ComputadorFactory();

        Computador mac1 = computadorFactory.getComputador(8,500);
        Computador windows = computadorFactory.getComputador(2,256);
        Computador mac2 = computadorFactory.getComputador(8,501);

        System.out.println(mac1.toString());
        System.out.println(windows.toString());
        System.out.println(mac2.toString());
    }
}
