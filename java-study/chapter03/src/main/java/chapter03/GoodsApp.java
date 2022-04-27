package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods = new Goods();
		
		goods.setName("nikon");
		goods.setPrice(400000);
		goods.setCountSold(50);
		goods.setCountStock(30);
		
		goods.showInfo();
		Goods goods2 = new Goods();
		System.out.println("Good count:" + Goods.countOfGoods);
		
		// discount price 구하기
		goods.setPrice(2000);
		int discountPrice = goods.calculateDiscountPrice(0.5);
		System.out.println("Goods Discount Price: "+ discountPrice);
	}

}