package ctlove.com;

import ctlove.com.hello.Person;
import ctlove.com.hello.Student;

public class Tester {
    public static void main(String[] args) {
        Student stu = new Student("001", "Tommy", 60, 80);
        Student stu1 = new Student("004", "Benton", 35, 60);
        stu.print();
        stu1.print();


/*        stu.setId("001");
        stu.setName("Tommy");
        stu.setMath(60);
        stu.setMath(80);*/


//        System.out.println("Hello world");
/*        Person person = new Person();
        person.hello();
        person.hello("Tommy");
        person.setWeight(68);
        person.setHeight(1.7f);
//        公制單位 =23.5

*//*        person.weight = 150;
        person.height = 67;
//       英制單位 23.49*//*

        System.out.println(person.bmi());*/
    }
}

