package src;

import java.util.ArrayList;
import java.util.List;

public class Course {
    final private String courseName;
    final private Teacher teacher;
    final private String location;
    final private String time;
    final private List<Student> students;
    
    public Course(String courseName, Teacher teacher, String location, String time) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.location = location;
        this.time = time;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public void removeStudent(Student student) {
        students.remove(student);
    }
    
    // getter 方法
    public String getCourseName() {
        return courseName;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }
    
    public String getLocation() {
        return location;
    }
    
    public String getTime() {
        return time;
    }
}