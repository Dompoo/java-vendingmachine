package vendingmachine;

public class PutMoney {
	
	private static int MIN_AMOUNT = 0;
	
	private final int amount;
	
	public PutMoney(int amount) {
		validate(amount);
		this.amount = amount;
	}
	
	private static void validate(int money) {
		if (money < MIN_AMOUNT) {
			throw new IllegalArgumentException("투입 금액은 0 미만이 될 수 없습니다.");
		}
	}
	
	public PutMoney withReducingAmount(int amountToReduce) {
		return new PutMoney(this.amount - amountToReduce);
	}
}
