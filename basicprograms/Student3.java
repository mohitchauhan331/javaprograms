package basicprograms;

public class Student3 {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(50);

        Student student1 = new Student("A",1);
        Student student2 = new Student("B",2);
        Student student3 = new Student("C",3);
        Student student4 = new Student("D",4);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.addStudent(student4); 

        classroom.displayallstudents();
    }
}
 class Student{
    private String name;
    private int id;

    public Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void displayDetails(){
        System.out.println("Student Name"+name+",id"+id);
    }
}
 class Classroom{
    private Student[]student;
    private int capacity;
    private int studentcount;

    public Classroom(int capacity) {
        this.capacity = capacity;
        this.student = new Student[capacity]; 
        this.studentcount = 0;
    }

    public void addStudent(Student student){
        if(studentcount <capacity){
            this.student[studentcount]=student ;
            studentcount++;
            System.out.println("Student added"+student.getName());
        }else{
            System.out.println("Can not add student as class is full.");
        }
    }
    public void displayallstudents(){
        if(studentcount==0){
            System.out.println("no student is in the class.");
        }else{
            System.out.println("Students in the class");
            for (int i=0;i<studentcount;i++){
                student[i].displayDetails();
            }
        }
    }
}
