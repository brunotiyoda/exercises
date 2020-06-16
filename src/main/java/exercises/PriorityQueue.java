package exercises;

import java.util.*;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

class Student {

    private Integer id;
    private String name;
    private Double cgpa;

    public Student(Integer id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getCgpa() {
        return cgpa;
    }


}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> studentQueue = new PriorityQueue<>(
                Comparator.comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getName)
                        .thenComparing(Student::getId)
        );

        List<Student> students = new ArrayList<>();

        for (String e : events) {
            Scanner in = new Scanner(e);
            String event = in.next();

            if (event.equals("ENTER")) {
                addStudent(studentQueue, in);
            } else if (event.equals("SERVED")) {
                studentQueue.poll();
            }
            in.close();
        }

        Student first = studentQueue.poll();

        if (isNull(first)) {
            return students;
        }

        while (nonNull(first)) {
            students.add(first);
            first = studentQueue.poll();

        }
        return students;
    }

    private void addStudent(PriorityQueue<Student> studentQueue, Scanner in) {
        String name = in.next();
        double cgpa = in.nextDouble();
        int id = in.nextInt();

        Student student = new Student(id, name, cgpa);
        studentQueue.add(student);
    }
}

