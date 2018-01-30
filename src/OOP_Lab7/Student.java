package OOP_Lab7;
//Talking about Student?
//1.Student ID
//2.Major
//3.Faculty
//4.Name


public class Student {
    private String id ;
    private String major;
    private String faculy;
    private String name;
    //Constructor
    //Default constructor
    public Student(){}
    //create constructor by owner
    public  Student (String id,String m ,String f ,String n) {
        //assign data to class properties
        this.id = id;
        this.faculy = f;
        this.major = m;
        this.name = n;
    }
    //getter and setter methods

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculy='" + faculy + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFaculy() {
        return faculy;
    }

    public void setFaculy(String faculy) {
        this.faculy = faculy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
