package ctlove.com.OHollo;

public class Staff {
        public static int pass =60;
        String id;
        String name;
        int math;
        int english;

        public Staff(String id, String name, int math, int english) {
                this.id = id;
                this.name = name;
                this.math = math;
                this.english = english;
                }
                public void print(){
                        System.out.print(id +"\t" + name + "\t" + math + "\t" + english +"\t" + getAvgrage());
                        if (getAvgrage() < pass) {
                                System.out.println("*");
                        }else{
                                System.out.println();

                        }
                }

                public int getAvgrage(){
                return (math+english)/2;
                }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getMath() {
                return math;
        }

        public void setMath(int math) {
                this.math = math;
        }

        public int getEnglish() {
                return english;
        }

        public void setEnglish(int english) {
                this.english = english;
        }
}
