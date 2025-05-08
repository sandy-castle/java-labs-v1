package chapter6.labs.lab3;

import java.util.HashMap;
import java.util.Map;

 /* 은행 시스템 클래스
 * 여러 계좌를 관리하고 계좌 간 이체 기능을 제공하는 클래스입니다.
 */
public class BankingSystem
{
    private Map<String, BankAccount> accounts;
    
  //생성자
    public BankingSystem() {
        this.accounts = new HashMap<>();
    }
    
    /**
     * 계좌 생성 메소드
     * @param accountNumber 계좌번호
     * @param ownerName 예금주 이름
     * @param initialBalance 초기 잔액
     * @throws IllegalArgumentException 계좌번호가 이미 존재하거나 초기 잔액이 0 미만인 경우
     */
    public void createAccount(String accountNumber, String ownerName, double initialBalance)
            throws IllegalArgumentException
    {
        // 계좌번호 중복 체크
        if (accounts.containsKey(accountNumber))
        {throw new IllegalArgumentException("이미 존재하는 계좌번호입니다.");}
        // 초기 잔액 유효성 검사
        if (initialBalance < 0)
        {throw new IllegalArgumentException("초기 잔액은 0 이상이어야 합니다.");}
        // 새 계좌 생성 후 저장
        BankAccount account = new BankAccount(accountNumber, ownerName, initialBalance);
        accounts.put(accountNumber, account);
        /*
         이렇게도 작성 가능!!!!
         accounts.put(accountNumber, new BankAccount(accountNumber, ownerName, initialBalance);
         */
    }

    /**
     * 계좌 조회 메소드
     * @param accountNumber 조회할 계좌번호
     * @return 계좌 객체
     * @throws InvalidAccountException 계좌번호가 존재하지 않는 경우
     */
    public BankAccount getAccount(String accountNumber) throws InvalidAccountException {
        // TODO: 계좌번호가 존재하지 않는 경우 InvalidAccountException을 발생시키세요.
        // TODO: 계좌가 존재하면 해당 계좌 객체를 반환하세요.
        if (!accounts.containsKey(accountNumber)) {
            throw new InvalidAccountException("해당 계좌번호가 존재하지 않습니다.");
        }
        return accounts.get(accountNumber);
    }

    /**
     * 계좌 이체 메소드
     *
     * @param fromAccountNumber 출금 계좌번호
     * @param toAccountNumber   입금 계좌번호
     * @param amount            이체 금액
     * @throws InvalidAccountException      계좌번호가 유효하지 않은 경우
     * @throws InsufficientBalanceException 잔액이 부족한 경우
     * @throws IllegalArgumentException     이체 금액이 0 이하인 경우
     */
    public void transfer(String fromAccountNumber, String toAccountNumber, double amount)
            throws InvalidAccountException, InsufficientBalanceException, IllegalArgumentException {

    }
    //모든 계좌 정보 출력 메소드
    public void displayAllAccounts()
    {
        System.out.println("=== 모든 계좌 목록 ===");
        if (accounts.isEmpty())
        {
            System.out.println("등록된 계좌가 없습니다.");
            return;
        }
            for (BankAccount account : accounts.values())
            {
            System.out.println(account);
        }
    }

    public void deposit(String accountNumber, double amount) {
    }

    public void withdraw(String accountNumber, double amount) {
    }
    // BankingSystem 클래스 맨 아래에 추가하세요
    public static class InvalidAccountException extends Exception {
        public InvalidAccountException(String message) {
            super(message);
        }
    }

    public static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

}