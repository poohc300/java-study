package chapter03;

import mypackage.Goods2;

public class GoodsApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods2 goods2 = new Goods2();
		
		// public은 모든 접근이 가능하다.
		goods2.name = "camera";
		
		// protected는 같은 패키지에서 접근 가능 패키지 달라지면 에러남
		// 더 중요한 접근 제어는 자식에서 접근이 가능하다
		//goods2.price = 10000;
		
		// default는 같은 패키지에서 접근이 가능하다
		//goods2.countStock = 10;
		
		// private는 같은 클래스에서만 접근이 가능하다
		goods2.setCountSold(10);
	}

}
