import java.util.TreeMap;
import java.util.Set;
//Treemap 특징 : key와 value를 한쌍으로 하는 데이터를 이진 검색 트리 형태로 저장.
//즉 Key 데이터를 오름차순으로 자동으로 정렬을 해줌. 단 Hashmap보다 무거움.
//또한 이 Treemap은 Map 인터페이스에 종속이됨.

public class TreeMap_Study {
    public static void main(String[] args) {
    TreeMap<Integer, String> map=new TreeMap<>();//Treemap 객체 선언 방법 Hashmap이랑 동일

    map.put(1,"Apple");//데이터 기입 방법. key가 중복시 기존 값을 덮어버림. 이 put은 모든 map 공통 메소드
    map.put(5,"Banana");
    map.put(3,"StrawBerry");
    map.put(4,"Orange");
    map.put(2,"Cake");
    
    System.out.println(map.toString());//결과 : {1=Apple, 2=Cake, 3=StrawBerry, 4=Orange, 5=Banana}
    
    System.out.println(map.ceilingEntry(3));//제공된 키값보다 크거나 같은값중 가장 작은키의 key값과 value값 (entry) 반환 없을시 null
    System.out.println(map.ceilingKey(6));//제공된 키값보다 크거나 같은값중 가장 작은키의 key값반환 없을시 null
    System.out.println(map.floorEntry(8));//제공된 키값보다 작거나 같은값중 가장 작은키의 key값과 value값 (entry) 반환, 없을시 null
    System.out.println(map.floorKey(2));//제공된 키값보다 작거나 같은값중 가장 작은키의 key값 반환
    System.out.println("--------------------------------------------------------------------------------");

    /*결과 
    3=StrawBerry
    null
    5=Banana
    2
    */

    // [ higherEntry() / higherKey() / lowerEntry() / lowerKey() ] 은 위 4개 순서대로 똑같지만 "같은" 조건은 제외
    
    System.out.println(map.lastEntry());//가장 마지막에 저장된 키의 entry(즉 key-value) 반환

    System.out.println(map.headMap(3,true));//map에 저장된 첫번째 요소부터 지정한 Key까지 있는 모든 entry 반환 true이면 그 key값도 포함 false면 포함하지 않음

    
    System.out.println(map.pollFirstEntry());//가장 작은 키의 데이터를 제거하면서 그 entry 반환
    System.out.println(map.pollLastEntry());//가장 큰 키의 데이터를 제거하면서 그 entry 반환
    System.out.println("--------------------------------------------------------------------------------");

    System.out.println(map.descendingKeySet());//해당 treemap 에 있는 key들을 역순으로 NavigableSet 형태로 반환
    System.out.println(map.descendingMap());//해당 treemap에 있는 entry들을  NavigableMap 형태로 
    
    //NavigableSet NavigableMap 둘다 각각 Set, Map 에 종속됨.


    System.out.println("--------------------------------------------------------------------------------");
    System.out.println("--------------------------------------------------------------------------------");

//여기서부터 Map 계열 즉 HashMap, TreeMap 등의 공통 메소드임
    TreeMap<Integer, String> map2=(TreeMap<Integer, String>) map.clone(); // map에있는 데이터를 map2로 복사하는 방법
    //map.clone()은 최상위 object 형으로 retrun 되며, TreeMap으로 복사원할시 위 방식대로 해야함

    System.out.println(map2.size());//map2의 데이터 개수를 int로 return. / 출력 3

    System.out.println(map2.values());//map2 에 있는 value들을 collection 형태로 출력
        //출력 : [Cake, StrawBerry, Orange]
    System.out.println(map2.get(2));//map2 에 key값이 2 인 value값을 return. / 출력 : Cake

    Set<Integer> xp= map2.keySet();//map3의 모든 키들을 set 형태로 반환

    if (map2.containsKey(4)) {
        System.out.println("True"); //map2 key값이 4가 있을 경우 true 아니면 false /containsValue도 있음.
    }

    map2.putAll(map); //map 에 있는 모든 데이터를 map2로 옮김. 단 파라미터 형식이 같아야함 

    boolean tem=map.isEmpty(); //map 데이터가 완전 없으면 False.

    map2.remove(2);//map2에 키값이2인 데이터 삭제 이때 삭제된 value이 return이 됨.
    map2.replace(1,"Chocorate");//key값이 1인 value 값을 Chocorate로 바꿈
    
    }
}
