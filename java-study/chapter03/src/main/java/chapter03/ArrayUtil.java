package chapter03;



public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		// TODO Auto-generated method stub
		double[] result = new double[a.length];
		for(int i = 0; i< a.length; i++) {
			result[i] = a[i];
		}
		return result;
	}

	public static int[] doubleToInt(double[] d) {
		// TODO Auto-generated method stub
		int[] result = new int[d.length];
		
		for(int i=0; i< d.length; i++) {
			result[i] = (int)(d[i]);
		}
		
		return result;
	}

	public static int[] concat(int[] p, int[] q) {
		// TODO Auto-generated method stub
		
		
		int maxArrayLength = p.length + q.length;
		int[] result = new int[maxArrayLength];
		
		int j=0;
		for(int i=0; i< maxArrayLength; i++) {
			if(i < p.length) {
				result[i] = p[i];

			}
			else if(i >= p.length) {
				result[i] = q[j];
				j++;
			}
			
		}
		
		return result;
	}

}
