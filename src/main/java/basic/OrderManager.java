package basic;

public class OrderManager {

    private HyundaiMaker maker;

    // 기본 생성자
    public OrderManager() {
        this.maker = new HyundaiMaker();
    }

    public void order(int cost){
        Money money = new Money(cost);
        Car car = maker.sell(money);
        System.out.println("판매상(인수) : " + car.getName());
    }
}
