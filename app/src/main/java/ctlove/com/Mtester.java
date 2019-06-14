package ctlove.com;

import androidx.lifecycle.ViewModelProvider;

import ctlove.com.OHollo.Nperson;
import ctlove.com.OHollo.Staff;

public class Mtester {
    public static void main(String[] args) {
        Staff staff = new Staff("005", "Evan", 60, 80);
        Staff staff1 = new Staff("006", "Kai ", 90, 20);
        staff.print();
        staff1.print();

/*        staff.setId("005");
        staff.setName("Evan");
        staff.setMath(60);
        staff.setEnglish(80);*/




//        System.out.println("Hi see you again");
/*        Nperson nperson = new Nperson();
        nperson.hsya();
        nperson.hsya("Tommy");

        nperson.setWeight(69);
        nperson.setHeight(1.7f);
        System.out.println(nperson.bmi2());*/

    }
}
