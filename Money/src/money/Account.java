package money;

public class Account {
    // 계좌번호, 계좌주, 잔액 필드 생성
    // getter / setter 메서드 생성

    int id;
    String name;
    Long amount;

    public Account(int id, String name, Long amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}