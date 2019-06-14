package ctlove.com.OHollo;

public class Nperson {
    float weight;
    float height;
    public float bmi2(){
        float bmi2 = weight/(height*height);
        return bmi2;
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

    public void hsya(){
        System.out.println("Hi see you again.");
    }
    public void hsya(String name){
    System.out.println(name + ", Hey nice to you");
}

}
