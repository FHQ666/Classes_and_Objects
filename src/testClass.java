import java.util.Scanner;
class UserName extends Exception{
    public UserName(String msg){
        super(msg);
    }
}

class PassWord extends RuntimeException{
    public PassWord(String msg){
        super(msg);
    }
}
class A {
    A(){
        System.out.println("A");
    }
}
public class testClass {

    String string = new String("666");
    public void change(String str){
        str = "66";
    }
    public static void main(String[] args) {
       testClass testClass = new testClass();
       testClass.change(testClass.string);
        System.out.println(testClass.string);
    }

    public static void main9(String[] args) {
        int[] nums = {-1,0,3,4,6,10,13,14};
        System.out.println( search(nums,13));;
    }
    public static int search(int[] nums, int target) {
        // write code here
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;
        while(left <= right){
            if(target > nums[mid]){
                left = mid + 1;
                mid = (left+right)/2;
            }
            if(target < nums[mid]){
                right = mid - 1;
                mid = (left+right)/2;
            }
            if(target == nums[mid])
                return mid;
        }
        return -1;
    }
    public static String username = "666";
    public static String password = "123456";

    public static void main8(String[] args) throws UserName {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = scanner.nextLine();
        System.out.println("请输入密码");
        String pass = scanner.nextLine();
        login(name,pass);
    }

    public static void login(String name,String pass) throws UserName {
        if(!name.equals(testClass.username)){
            throw new UserName("用户名错误");
        }
        if(!pass.equals(testClass.password)){
            throw new PassWord("密码错误");
        }
        System.out.println("登陆成功");
    }

    public static void main7(String[] args) {
        String s1 = " FEAWIKJSFDksdfAFNKJ";
        System.out.println(lower(s1));;
    }

    public static String lower(String string){
        string = string.toLowerCase();
        return string;
    }

    public static void main6(String[] args) {
        String str = new String("hello worlds thankdaefef afew");
        System.out.println(strmorenum(str));
//        System.out.println(Character.isSpace(str.charAt(5)));
    }

    public static int strmorenum(String string){
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isSpace(string.charAt(i))) {
                count = 0;
                continue;
            }
            count++;
            if(count > count1)
                count1 = count;
        }
        return count1;
    }

    public static void main5(String[] args) {
        String s1 = "123456";
        String string = new String(s1);
        System.out.println(s1.substring(3));;
    }

    public static void main4(String[] args) {
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




