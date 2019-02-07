package mymockitoproject.Misc;

import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Student{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa =cgpa;
    }

    public double getCgpa(){
        return this.cgpa;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

class Priorities{

    public List <Student> getStudents(List < String > events) {

        PriorityQueue <Student> student_queue = new
                PriorityQueue(Comparator.comparing(Student::getCgpa)
                .reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getId));
        List < Student > students = new ArrayList < Student > ();


        for (String e: events) {
            Scanner in =new Scanner(e);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int token = in.nextInt();

                Student student = new Student(token, name, cgpa);
                student_queue.add(student);
                System.out.println(student);
            } else if (event.equals("SERVED")) {
                System.out.println("\n ******* Before Popping ");
                System.out.println(student_queue + "\n");
                Student first = student_queue.poll();
                System.out.println("Popping Student:"+ first);
            }
            in .close();
        }
        Student first = student_queue.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = student_queue.poll();

            }
            return students;
        }
    }
}





public class PriorityQueueSolution {

    /*
     Input:
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

output:
Dan
Ashley
Shafaet
Maria
     */


    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}