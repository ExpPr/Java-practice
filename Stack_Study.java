//Stack 클래스는 List 컬렉션 클래스의 Vector 클래스를 상속받아, 전형적인 스택 메모리 구조의 클래스를 제공
//Stack은 후입선출식임 . 가장 나중에 저장된 데이터가 가장 먼저 인출되는 식.
import java.util.Stack;//스택 사용시 필수조건.

public class Stack_Study {

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(4);//4 라는 데이터를 밀어 넣음. 
        st.push(3);
        st.push(2);
        st.push(1);//그럼 가장 위에 것 부터해서 1,2,3,4, 순으로 됨.
        System.out.println(st);
        System.out.println(st.peek());//해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환
        st.pop();//해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환하고, 해당 요소를 스택에서 제거
        System.out.println(st);

        System.out.println(st.search(3));
        System.out.println(st.search(4));
        //해당하는 stack에서 입력한 값의 위치 (인덱스) 반환. 단 제일 마지막에 저장된 요소부터 1로 시작함. 없을경우 음수 return



    }
}
