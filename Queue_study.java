//Queue 선입선출 방식. 먼저 들어온 데이터가 가장 먼저 나가는 방식.

import java.util.Queue;
import java.util.LinkedList; //stack과 다르게 Queue는 이 2개가 무조껀 필요하다.

public class Queue_study {

    public static void main(String args[]) {
    Queue<Integer> q1=new LinkedList<>();//Queue 선언 방법.
    Queue<String> q2=new LinkedList<>();
    
    q1.offer(1);//Queue 삽입 메소드는 원칙이 offer 이나 add 가능
    q2.add("A");
    q1.offer(2);
    q2.add("B");
    q1.add(3);
    q2.offer("C");

    System.out.println(q1);
    System.out.println(q2);

    System.out.println(q1.poll());//q1 가장 먼저 들어간 데이터 삭제 즉 1 삭제. 삭제된 값 리턴됨
    System.out.println(q2.peek());//q2 가장 먼저 들어간 데이터가 먼지 조회.

    int n1=q1.size();//사이즈
    boolean yn=q1.isEmpty();//q1데이터가 아무것도 없으면 true 아니면 false



    }

}
