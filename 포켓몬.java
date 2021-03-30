import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;


class remove {
	public ArrayList<Integer> remove1 (int[] p) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int k : p) {
			if (!list.contains(k)) {
				list.add(k);
			}
		}
		return list;
	}
	public HashSet<Integer> remove2 (int [] p) {
		HashSet<Integer> list=new HashSet<>();
		
		for (int k : p) {
			list.add(k);
		}
		return list;
	}
	
	public TreeSet<Integer> remove3 (int[] p) {
		TreeSet<Integer> list= new TreeSet<>();
		
		for (int k : p) {
			list.add(k);
		}
		return list;
	}
}
	



public class hellow {

	public static void main(String[] arge) {
		int[] input= {3,3,3,2,2,2,3,2,4,5,6,7,7,8,8,8,9,32,20,22,22,22,22,22};
		remove sc=new remove();
		
		int max=sc.remove1(input).size();
		int half=input.length/2;
		
		System.out.print("포켓몬 최대 종류수 : "+(max>half?half:max));

		
	}
		
		
		
	}