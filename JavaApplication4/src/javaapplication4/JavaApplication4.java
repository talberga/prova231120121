package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        int somma = 0;
        somma = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);       
        System.out.println("somma = " + somma);
    }
}
