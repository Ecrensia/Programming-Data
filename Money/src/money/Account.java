package money;

public class Account {
    // ���¹�ȣ, ������, �ܾ� �ʵ� ����
    // getter / setter �޼��� ����

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