import java.util.*;
public class Find_item_in_array
{
	public static void main(String[] args) {
		int[] arr = { 2,3,4,5,3,5,7};
		Find(arr,5,0);
		System.out.println(List);
	}
	static ArrayList<Integer> List = new ArrayList<>();
	static void Find(int[] arr,int search, int index){
		if(index == arr.length){
			return ;
		}
		if(arr[index] == search){
		
			List.add(index);
			

		}
		 Find(arr,search,index + 1);

	}
}