public class Homework5 {
    public static void main(String[] args) {
        Person person = new Person("张三",25);
        person.display();
        person.setAge(22);
        Person person2 = new Person();
        person2.setName("李白");
        person2.display();
    }


}


class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("name:" + this.getName() + "\nage:" + this.getAge());
    }
}