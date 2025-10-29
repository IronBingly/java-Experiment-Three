package src;

public class Person {

    protected String id;
    protected String name;
    protected String gender;
    protected String email;
    protected String phoneNumber;
    
    public Person(String id, String name, String gender, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void printInfo() {
        System.out.println("编号: " + id + ", 姓名: " + name + ", 性别: " + gender + ", 邮箱: " + email + ", 电话: " + phoneNumber);
    }

    public void printWorkSheet() {
        System.out.println("基本信息 - 编号: " + id + ", 姓名: " + name + ", 性别: " + gender + ", 邮箱: " + email + ", 电话: " + phoneNumber);
    }
}