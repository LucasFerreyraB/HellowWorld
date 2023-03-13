

public class Primitivos {
    public static void main(String[] args) {

        byte numeroByte = 7;
        System.out.println("numerobyte=" + numeroByte);
        System.out.println("tipo byte corresponde en bytes a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("valor máximo de un byte es: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte es: " + Byte.MIN_VALUE);

        short numeroShort = 300;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a: " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("valor máximo de un short es: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short es: " + Short.MIN_VALUE);

        int numeroInt = 35000;
        System.out.println("numeroint=" + numeroInt);
        System.out.println("tipo int corresponde en bytes a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("valor máximo de un int es: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int es: " + Integer.MIN_VALUE);

        long numerolong = 21474836;
        System.out.println("numerolong=" + numerolong);
        System.out.println("tipo long corresponde en bytes a: " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("valor máximo de un long es: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long es: " + Long.MIN_VALUE);
        }

    }