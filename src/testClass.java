import java.util.Scanner;

public class testClass {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("flower");
        sb.append("boom");
        System.out.println(sb.toString());
        sb.insert(6,"big");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.delete(4,7);
        System.out.println(sb.toString());
    }

    public static void main3(String[] args) {

        String a = new String("abc");
        String b = new String("cbc");
        String c = new String("abcde");
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub sub = new Sub(x, y, z);
            System.out.println(sub.calculate());
        }
    }

}
class Base {
    private int x;
    private int y;
    public Base(){
    }
    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}

class Sub extends Base {
    private int z;
    public Sub(int x, int y, int z) {
        //write your code here
        super(x,y);
        this.z = z;
    }
    public int getZ() {
        return z;
    }
    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }



    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }
    }
}

class Data {

    private int x;
    private int y;

    public Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Dog{
    String name;
    String colour;
    public void bark(){

    };
    public void wag(){

    };
}




