import java.util.HashMap;//Hashmap 사용시 필수조건
import java.util.Set;

//Hashmap 은 Map에 종속됨. 특징 : 키값만 없거나 value값만 없는 것은 불가능. Key 중복 불가능 . Value는 중복허용 .
//데이터 순서 취급X

public class Hashmap_study {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();//HashMap 값 추가, <Key, Value> 형식임. 이때 파라미터는 전부 참조형이어야함.
        HashMap<Integer,String> map2=new HashMap<>();//괄호안에 숫자를 넣을 시 , 초기 크기를 설정
        HashMap<String,Integer> map4=new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Chicken");//put(key값,value값)식으로 값을 추가할 수 있음. 
        map2.putAll(map); //map 에 있는 모든 데이터를 map2로 옮김. 단 파라미터 형식이 같아야함 

        map.remove(1);//key값이 1인 경우의 데이터 삭제

        System.out.println(map.toString());//결과 {2=Banana, 3=Chicken}
        System.out.println(map.remove(2));//remove할때 value값이 리턴이 됨.

        System.out.println(map.entrySet());//map에 있는 데이터를 key=value형태로 Set에 저장하여 반환함.

        //map.clear() 할 경우 map에 있는 모든 데이터 삭제

        System.out.println(map2.size());//map2의 데이터 개수를 int로 return. 

        System.out.println(map2.values());//map2 에 있는 value들을 collection 형태로 출력 , 즉 [] 형태 // [Apple, Banana, Chicken]

        System.out.println(map2.get(2));//map2 에 key값이 2 인 value값을 return. 출력은 Banana


        HashMap<Integer,String> map3=(HashMap<Integer,String>) map2.clone();//map2 모든 데이터를 map3로 복사. 

        if (map3.containsKey(4)) {
            System.out.println("True"); //map2 key값이 4가 있을 경우 true 아니면 false /containsValue도 있음.
        }

        Set<Integer> xp= map3.keySet();//map3의 모든 키들을 set 형태로 반환



    }
}
