package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		List<String> list = new Vector<>();
		
		list.add("�Ѹ�");
		list.add("������");
		list.add("�����");
		
		for(int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		// ����
		list.remove(2);
		
		System.out.println("==============");
		
		// ��ȸ 2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}
}
