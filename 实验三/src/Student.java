package src;

public class Student extends Person {
    private Course selectedCourse;
    
    public Student(String id, String name, String gender, String email, String phoneNumber) {
        super(id, name, gender, email, phoneNumber);
    }
    
    // 学生选课
    public void selectCourse(Course course) {
        if (selectedCourse != null) {
            System.out.println(name + " 已经选择了课程: " + selectedCourse.getCourseName());
        }
        else{
        selectedCourse = course;
        course.addStudent(this);
        System.out.println(name + " 成功选择课程: " + course.getCourseName());
        }
    }
    
    // 学生退课
    public void dropCourse() {
        if (selectedCourse != null) {
            System.out.println(name + " 退选课程: " + selectedCourse.getCourseName());
            selectedCourse.removeStudent(this);
            selectedCourse = null;
        } 
        else {
            System.out.println(name + " 没有选择任何课程");
        }
    }
    
    // 打印课表
    public void printCourseTable() {
        System.out.println(name + "的课表 :");
        printInfo();
        if (selectedCourse != null) {
            System.out.println("课程: " + selectedCourse.getCourseName());
            System.out.println("地点: " + selectedCourse.getLocation());
            System.out.println("时间: " + selectedCourse.getTime());
            System.out.println("教师: " + selectedCourse.getTeacher().getName());
        } 
        else {
            System.out.println("暂无课程");
        }
        System.out.println("—————————————————分割线—————————————————");
    }

    @Override
    public void printInfo() {
        // 先打印父类的基本信息
        super.printInfo();
        // 附加学生特有的选课信息
        if (selectedCourse != null) {
            System.out.println("已选课程: " + selectedCourse.getCourseName());
        } else {
            System.out.println("未选择课程");
        }
    }
}