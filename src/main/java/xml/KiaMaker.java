package xml;

public class KiaMaker implements CarMaker {

    // default로 붙이긴 하지만, 명확하게 해주는게 좋음
    @Override
    public Car sell(Money money){
        System.out.println("기아 자동차(입금) : " + money.getAmount());
        Car car = new Car("K5");
        return car;
    }
}
