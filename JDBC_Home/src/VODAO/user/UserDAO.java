package VODAO.user;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class UserDAO {
    private Connection connection;

    //파라미터(매개변수)를 받을 생성자 생성
    public UserDAO(Connection connection) {
        this.connection = connection;


    }

    public boolean createUser(UserVO user) {
        String sql = "INSERT INTO USERINFO(user_id,userName,email,reg_date)"
                + " values (?,?,?,?)";
        try {
            PreparedStatement pt = connection.prepareStatement(sql);
            pt.setInt(1, user.getUser_id());
            pt.setString(2, user.getUserName());
            pt.setString(3, user.getEmail());
            pt.setDate(4, new Date(user.getRegDate().getTime()));

            int rows = pt.executeUpdate();
            return rows > 0; //값이 들어오면 0보다 커지므로 true가 됨.


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }





}
