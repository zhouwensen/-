import java.util.Scanner;

public class Settlement {
    public static void main(String[] args) {
        Commodity commodity = new Commodity();
        String strawberry = "草莓";
        //总金额
        int sum = 0;
        //通过键盘输入对购买参数进行赋值
        Scanner sca = new Scanner(System.in);
        System.out.println("输入选购商品种类");
        //购买商品数量
        int type = sca.nextInt();
        for (int i = 0; i < type; i++) {
            System.out.println("输入商品名称");
            String name = sca.next();
            commodity.setName(name);
            System.out.println("输入商品单价");
            Integer univalent = sca.nextInt();
            commodity.setMoney(univalent);
            System.out.println("输入商品重量");
            Integer weight = sca.nextInt();
            commodity.setKilogram(weight);
            //判断商品重量是否小于0
            if (weight < 0) {
                sum += 0;
            } else if (strawberry.equals(name)) {
                sum += commodity.getKilogram() * commodity.getMoney() * 0.8;
            } else {
                sum += commodity.getKilogram() * commodity.getMoney();
            }
        }
        //判断金额，大于等于100则进行满减
        if (sum >= 100) {
            System.out.println("购买商品总金额为：" + (sum - 10) + "元");
        } else {
            System.out.println("购买商品总金额为：" + sum + "元");
        }
    }
}
