package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<>();
		
		q.offer("������");
		q.offer("�Ѹ�");
		q.offer("�����");
		
		while(!q.isEmpty()) {
			String s = q.poll();
			System.out.println(s);
		}
		q.offer("������");
		q.offer("�Ѹ�");
		q.offer("�����");
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		// ��� �ִ� ��� null�� ��ȯ�Ѵ�
		System.out.println(q.poll());
	}

}
