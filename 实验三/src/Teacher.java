package src;

public class Teacher extends Person {
    private Course teachingCourse;
    
    public Teacher(String id, String name, String gender, String email, String phoneNumber) {
        super(id, name, gender, email, phoneNumber);
    }
    
    // 教师开课
    public void openCourse(String courseName, String location, String time) {
        teachingCourse = new Course(courseName, this, location, time);
        System.out.println(name + " 开设课程: " + courseName);
    }
    
    public Course getTeachingCourse() {
        return teachingCourse;
    }
    
    // 打印授课信息
    public void printTeachingInfo() {
        System.out.println(name + "的授课信息 :");
        printInfo();
        if (teachingCourse != null) {
            System.out.println("课程: " + teachingCourse.getCourseName());
            System.out.println("地点: " + teachingCourse.getLocation());
            System.out.println("时间: " + teachingCourse.getTime());
        } else {
            System.out.println("暂无授课课程");
        }
        System.out.println("—————————————————分割线—————————————————");
    }

    @Override
    public void printInfo() {
        // 先打印父类的基本信息
        super.printInfo();
        // 附加教师特有的授课信息
        if (teachingCourse != null) {
            System.out.println("授课课程: " + teachingCourse.getCourseName());
        } else {
            System.out.println("暂无授课课程");
        }
    }
}