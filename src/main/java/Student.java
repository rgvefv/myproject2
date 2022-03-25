public class Student {
    String name;
    int english;
    int math;
    public Student(String name) {

        this.name = name;
    }
    public Student(String name, int english, int math){
        this(name);
        //        this.name = name;
        this.english = english;
        this.math = math;
    }
    public Student() {
        this("John Doe", -1, -1);
        /*name = "John Doe";
        english = -1;
        math = -1;*/
    }
    public void print() {
        System.out.print(name +
                "\t" + english + "\t" +
                math +"\t" + getAverage());
        if (getAverage() < 60){
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage() {
        return (english+math)/2;
    }

    public static class Scoring {
        public static void main(String[] args) {
            Student jack = new Student("Jack", 78, 62);
            Student hank = new Student("Hank", 60, 30);
            GraduateStudent jane =
                    new GraduateStudent("Jane", 65, 82, 79);
            jack.print();
            hank.print();
            jane.print();
        }
    }
}