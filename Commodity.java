import java.util.Objects;

public class Commodity {
    /*商品名称*/
    private String name;
    /*商品价格*/
    private Integer money;
    /*购买斤数*/
    private Integer kilogram;

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", kilogram=" + kilogram +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getKilogram() {
        return kilogram;
    }

    public void setKilogram(Integer kilogram) {
        this.kilogram = kilogram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return Objects.equals(name, commodity.name) && Objects.equals(money, commodity.money) && Objects.equals(kilogram, commodity.kilogram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, kilogram);
    }
}
