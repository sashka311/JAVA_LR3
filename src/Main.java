import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //1
        char c2;
        byte b;
        float f;
        int i = -500;
        //2
        Random random = new Random();
        f = random.nextFloat(10000);
        i = Math.round(f);
        b = (byte)i;
        System.out.println("f = "+f);
        System.out.println("i = "+i);
        System.out.println("b = "+b);
        //3
        double y = (Math.pow(i,5)/ Math.log(f)) - (Math.sin(f) / b);
        System.out.println("y = "+y);

    }
}
