package paint;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point = new Point();
		
		point.setX(2);
		point.setY(5);
		point.show();
		point.setX(10);
		point.setY(23);
		point.show();
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
}
