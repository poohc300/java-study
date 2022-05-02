package chapter03;

public class SwapTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value a = new Value(10);
		Value b = new Value(20);
		
		System.out.println(a.val + ":" + b.val);
		
		swap(a, b);
				
		System.out.println(a.val + ":" + b.val);
	}

	public static void swap(Value p, Value q) {
		// swap
		int temp = 0;
		temp = p.val;
		p.val = q.val;
		q.val = temp;
	}
}
