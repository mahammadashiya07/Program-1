class Student {
    void display() {
        System.out.println("Student Details");
    }
}
class Marks extends Student {
    void showMarks() {
        System.out.println("Marks: 90");
    }
}
public class Main {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.display();      
        m.showMarks();    
    }
}
