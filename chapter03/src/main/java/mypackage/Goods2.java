/**
 * 
 */
package mypackage;

/**
 * @author 청출어람_PC05
 *
 */
public class Goods2 {
	public String name; 	/*모든 접근이 가능(접근 제한이 없다*/
	protected int price; 	/*자식 접근이 가능*/
	int countStock; 		// default, 같은 패키지
	private int countSold; 	// 클래스 내부에서만 접근 가능
	
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	
}
