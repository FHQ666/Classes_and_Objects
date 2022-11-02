
public class Person{
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