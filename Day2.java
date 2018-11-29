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

	public static void main (String[]args){
		System.out.println(convertToArrayList(8950));






	}
}