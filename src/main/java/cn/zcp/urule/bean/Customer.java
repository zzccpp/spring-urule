package cn.zcp.urule.bean;

import com.bstek.urule.model.Label;

import java.util.Date;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-02-10 18:06
 * @describe urule-project <描述>
 */
public class Customer {

    @Label("名称")
    private String name;
    @Label("年龄")
    private int age;
    @Label("生日")
    private Date birthDay;
    @Label("等级")
    private int level;
    @Label("手机")
    private int mobile;
    @Label("性别")
    private boolean gender;
    @Label("是否有车")
    private boolean car;
    @Label("是否结婚")
    private boolean married;
    @Label("是否有房")
    private boolean house;

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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isHouse() {
        return house;
    }

    public void setHouse(boolean house) {
        this.house = house;
    }
}
