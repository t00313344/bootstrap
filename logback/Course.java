package com.huawei.cn.domain;

public class Course {
    private int courseid;
    private String courseName;
    private String courseDesc;

    public Course(int courseid, String courseName, String courseDesc) {
        super();
        this.courseid = courseid;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

}
