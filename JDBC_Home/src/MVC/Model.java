package MVC;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.sql.*;

public class Model {
    private static Connection connection;
    private static Model model = null;


    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String user = "sh";
    private static String password = "1234";


    //기본 생성자로부터 외부에서 인스턴스를 직접 생성하는 것을 방지하기 위해 private으로 선언
    private Model() {


    }


    //productModel클래스의 인스턴스를 반환하는 메서드
    //처음 호출될 때 데이터베이스에 연결을 설정하고 이후 호출에서는 이미 생성된 인스턴스를 반환
    // 싱글톤 패턴을 구현하는 방식

    public static Model getInstance() throws SQLException {

        if (model == null) {
            model = new Model();
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sh","1234");
        }
        return model;


    }

    public boolean insertBank(BankDTO bank){
        String sql = "INSERT INTO bank (account_id,account_number,account_name,balance,branch_name,last_transaction_date)"
                    + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,bank.getAccountId());
            ps.setInt(2,bank.getAccountNumber());
            ps.setString(3,bank.getAccountName());
            ps.setDouble(4,bank.getBalance());
            ps.setString(5,bank.getBranchName());
            ps.setString(6,bank.getLastTransactionDate());
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;


        }

    }




}
