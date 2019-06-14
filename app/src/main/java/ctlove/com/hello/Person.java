package ctlove.com.hello;

public class Person {
    float weight;
    float height;
    public float bmi(){
        float bmi = weight / (height*height);
        return bmi;
        //        公制單位: BMI = 體重 (公斤) / (身高 (公尺) x 身高 (公尺))

/*        float bmi = weight / (height*height) *703;
                return bmi;
//        英制單位: BMI = 體重(英磅) / (身高(吋) x 身高(吋)) x 703*/

    }
    public void hello() {
        System.out.println("Hello Tommy");
    }

    public void hello(String name){
        System.out.println("Hi," + name);
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
