package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>();
		
		v.addElement("�Ѹ�");
		v.addElement("������");
		v.addElement("�����");
		
		// ��ȸ 1
		for(int i = 0 ; i < v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		// ����
		v.removeElementAt(2);
		System.out.println("=================");
		// ��ȸ 2
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
