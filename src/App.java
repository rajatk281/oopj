class Teacher{

    void display(){
        System.out.println("hey I am a teacher ");
    }
    public class Student{
        void display(){
            System.out.println("hello student");
        }
    }
};

public class App {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher.Student student = teacher.new Student(); 
        teacher.display();
        student.display();
    }
}
