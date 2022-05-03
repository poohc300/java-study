package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("�Ѹ�");
		list.add("������");
		list.add("�����");
		
		// ��ȸ1
		for(int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		//  ����
		list.remove(2);
		
		System.out.println("===============");
		
		// ��ȸ2
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println("===============");
		
		// ��ȸ3
		for(String s : list) {
			System.out.println(s);
		}
	}
}