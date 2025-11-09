package Tugas1;

public class Course {
    private String CourseName;
    private String CourseId;
    private String CourseCategory;

    public String getId() {
        //mengembalikan nilai id Course
        return this.CourseId;
    }

    public void setId(String id) {
        //set id Course
        this.CourseId = id;
    }

    public String getName() {
        //Mengembalikan Nama Course
        return this.CourseName;
    }

    public void setName(String name) {
        //set Nama Course
        this.CourseName = name;
    }

    public String getCategory() {
        //Mengembalikan kategori Course
        return this.CourseCategory;
    }

    public void setCategory(String category) {
        //set Kategori Course
        this.CourseCategory = category;
    }
}