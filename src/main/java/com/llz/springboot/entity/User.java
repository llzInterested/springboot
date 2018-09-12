package com.llz.springboot.entity;

public class User {
    private Integer id;
    private String uName;
    private Integer uage;
    private String sex;
    private Integer deptId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uName;
    }

    public void setUname(String uname) {
        this.uName = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uName + '\'' +
                ", uage=" + uage +
                ", sex='" + sex + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
