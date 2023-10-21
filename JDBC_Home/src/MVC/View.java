package MVC;

import java.sql.SQLException;
import java.util.Scanner;

public class View {

    public void addBank(){
        Scanner sc = new Scanner(System.in);
        System.out.println("은행에 등록할 계좌 정보 입력해주세요.");

        System.out.print("은행 ID :");
        int accountId = sc.nextInt();
        System.out.print("계좌번호 :");
        int accountNumber = sc.nextInt();
        System.out.print("성함 : ");
        String accountName = sc.next();
        System.out.print("입금할 돈 : ");
        double balance = sc.nextDouble();
        System.out.println("지역 : ");
        String branchName = sc.next();
        System.out.println("계좌생성일 : ");
        String lastTransactionDate = sc.next();

        //스캐너로 받은 정보를 디비에 새로 추가

        BankDTO newAccount = new BankDTO(accountId,accountNumber,accountName,balance,branchName,lastTransactionDate);

        Model model;
        boolean success = false;

        try {
            model = Model.getInstance();
            success = model.insertBank(newAccount);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(success){
            System.out.println("새로운 계좌가 성공적으로 추가되었습니다.");

        }else {
            System.out.println("새로운 계좌정보가 추가 중에 오류가 발생했습니다.");
        }

        sc.close();


    }

}
