package models;

public class User {
    private String name;
    private Integer age;
    private String userInfo;

    public User(String name, Integer age, String userInfo) {
        this.name = name;
        this.age = age;
        this.userInfo = userInfo;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

}
