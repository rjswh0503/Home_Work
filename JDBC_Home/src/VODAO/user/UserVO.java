package VODAO.user;


import java.util.Date;

public class UserVO {
    //필드에 맴버변수 생성
    private int user_id;
    private String userName;
    private String email;
    private Date regDate;

    //Getter Setter를 사용하여 외부에서 접근할 수 있도록 해준다.
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }









}
