import java.lang.reflect.Array;
import java.util.Arrays;

public class Person{

    int b;

    public static void main(String[] args) {
//        String a = "      ";
//        System.out.println(countSegments(a));
        final Person a = new Person();
        a.b = 6;
        System.out.println(a.b);

//        String b = "4d5w";
//        System.out.println(!Character.isSpace(b.charAt(0)));
    }

    public static int countSegments(String s) {
        int count = 1;
        int count1 = 0;
        if(s.equals("")||s == null)
            return 0;
        String a = " ";
        if(!Character.isSpace(s.charAt(0))) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isSpace(s.charAt(i)))
                    count++;
//                if ()
            }
            return count;
        }
        return 0;
    }

    public String name ;
    public int age;
    public Person(){
        System.out.println("Person类");
    }
    public Person(String name){
        this();
        this.name = name;
    }
    public Person(String name,int age){
        this(name);
        this.age = age;
    }
    public void fun(){
        System.out.println(name+"  "+age);
    }
    public static String sex = "男";



    public static void main1(String[] args) {
        System.out.println(Person.sex);
        Person.sex = "女";
        System.out.println(Person.sex);
//        Person person = new Person("666",6);
        Person person = null;
        person.sex = "男";
        System.out.println(person.sex);
//        person.fun();
    }
}



 class Child extends Person{

    public String grade;

    public static void main(String[] args){

        Person p = new Child();

        System.out.println(p.name);

    }

}