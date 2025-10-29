package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== 学生选课系统测试 ===\n");
        
        // 1. 创建教师和学生
        Teacher teacher1 = new Teacher("T001", "张老师", "男", "zhanglaoshi@example.com", "123456789");
        Teacher teacher2 = new Teacher("T002", "李老师", "女", "lilaoshi@example.com", "987654321");

        Student student1 = new Student("S001", "小明", "男", "xiaoming@example.com", "111222333");
        Student student2 = new Student("S002", "小红", "女", "xiaohong@example.com", "444555666");

        // 2. 教师开课
        System.out.println("1. 教师开课:");
        teacher1.openCourse("Java编程", "教学楼101", "周一 9:00");
        teacher2.openCourse("数据库", "教学楼201", "周三 14:00");
        
        // 3. 学生选课
        System.out.println("\n2. 学生选课:");
        student1.selectCourse(teacher1.getTeachingCourse());
        student2.selectCourse(teacher1.getTeachingCourse());
        student2.selectCourse(teacher2.getTeachingCourse()); // 选择第二门课
        
        // 4. 打印课表
        System.out.println("\n3. 学生课表:");
        student1.printCourseTable();
        student2.printCourseTable();
        
        // 5. 教师授课信息
        System.out.println("\n4. 教师授课信息:");
        teacher1.printTeachingInfo();
        teacher2.printTeachingInfo();
        
        // 6. 学生退课
        System.out.println("\n5. 学生退课:");
        student1.dropCourse();
        student1.printCourseTable();
    }
}