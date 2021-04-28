//deque는 Stack이랑 Queue 특징 전부 다 가짐.
//즉 선입선출. 후입선출 둘다  가능한 괴상한 특징. Deque는 인터페이스로 구성이 되어있음.
//단 Index를 응용은 불가능함. search 불가능.
//Deque 인터페이스 이용하는 클래스는  ArrayDeque, LinkedBlockingDeque, ConcurrentLinkedDeque, LinkedList

import java.util.ArrayDeque;//어떤 클래스 사용하냐에 따른 import. 위 4개중 하나  선택하기.
import java.util.Deque;//2개다 선언필수.

public class Deque_study {
    public static void main(String[] args) {
    Deque<Integer> que=new ArrayDeque<Integer>();//선언방식
    que.addFirst(1);//앞쪽에 삽입. 용량 초과시 Exception 발생.
    que.addLast(4);//뒤쪽에 삽입. 용량초과시 Exception 발생. add()랑  동급
    que.offer(3);//addLast랑 같음. 즉 queue offer 처럼
    que.offerFirst(54);//addFirst랑 같음
    que.offerLast(-34);//offer랑 같음.
    que.push(21);//addFirst랑 같음.

    System.out.println(que);// [21, 54, 1, 4, 3, -34]

    System.out.println(que.remove());//앞쪽에서 데이터값 하나 제거한 뒤 그 값을 retrun
    System.out.println(que);
    //removeFirst(), pollFirst(), poll(), pop() 동일
    System.out.println(que.pollLast());//뒤쪽에서 데이터값 하나 제거한 뒤 그 값을 return
    //removeLast()은 pollLast와 같음.

    System.out.println("앞쪽 데이터 : "+que.getFirst()+"뒤쪾 데이터 : "+que.getLast());
    //앞쪽 데이터 와 뒤쪽 데이터를 출력. (삭제아님)
    //getFirst()==peek()==peekFirst() / getLast()==peekLast()

    que.addLast(1);
    que.addLast(4);
    //[54, 1, 4, 3, 1, 4]

    que.removeFirstOccurrence(1);//앞쪽부터 탐색해서 가장 먼저 나오는 입력된 값(요소)를 제거. 없을 경우 변경발생x
    que.removeLastOccurrence(4);//뒤쪽부터 탐색해서 가장 먼저 나오는 입력된 값(요서 제거). 없을 경우 변경발생x
    
    System.out.println(que);

    boolean p=que.contains(23);//que에 23이라는 값이 있는지 판단. 있을경우 true.

    Object[] ap=que.toArray();//array형으로 변환 단 Object형으로 return됨.



    Integer[] ae= (Integer[]) que.toArray(new Integer[que.size()]);//아니면 이렇게 참조형 배열을 원할 경우 이방식을 이용.
    //이 방식은 List, Set에서 다 통하는 방식임.

    






    }

}
