import java.util.ArrayList;
public class Day2{
	public static ArrayList<Integer> convertToArrayList (int number){
		ArrayList <Integer> list = new ArrayList<>();
				while (number!=0){
					list.add(0, number%10);
					number/=10;

				}
		return list;
	}
	public static int convertToNumber(ArrayList<Integer> list){
		int k = 0;
		int d = 1;
		for (int i = list.size() - 1; i >= 0; i--){
			d *= 10;
			k += list.get(i) * d;
		}
		return k/10;
	}
	public static void main (String[]args){
		System.out.println(convertToArrayList(8950));
		ArrayList<Integer> li = new ArrayList<>();
		li.add(8);
		li.add(9);
		li.add(5);
		li.add(4);
		System.out.println(convertToNumber(li));






	}
}