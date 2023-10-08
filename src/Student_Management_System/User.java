package Student_Management_System;


public class User {
    //用户名
    private String username;
    //密码
    private String password;
    //手机号
    private String phoneNumber;
    //身份证号
    private String identityCard;

    public User() {
    }

    public User(String username, String password, String phoneNumber, String identityCard) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.identityCard = identityCard;
    }

    /**
     * 获取用户名
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取手机号
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取身份证号
     *
     * @return identityCard
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * 设置身份证号
     *
     * @param identityCard
     */
    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }


    public String toString() {
        return "User{用户名：" + username + ", 密码：" + password + ", 手机号：" + phoneNumber + ", 身份证号：" + identityCard + "}";
    }
}
