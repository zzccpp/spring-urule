package cn.zcp.urule.bean;

import com.bstek.urule.model.Label;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-02-10 18:21
 * @describe urule-project <描述>
 */
public class Student {

    @Label("姓名")
    private String name;
    @Label("年龄")
    private int age;
    @Label("爱好")
    private String hobby;
    @Label("班级")
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
