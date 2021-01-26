public class Product {
    private int id ;
    private String name;
    private int Money;
    public Product(){

    }

    public Product(int id, String name,int Money) {
        this.id = id;
        this.name = name;
        this.Money = Money;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Money=" + Money +
                '}';
    }
}
