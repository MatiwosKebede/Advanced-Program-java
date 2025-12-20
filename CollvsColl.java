import java.util.*;

public class CollvsColl{
	public static void main(String[] args){
		// creating arraylist using collection interface 
		Collection<String> listArray = new ArrayList<>();
		// create arraylist using List Interface
		List<Integer> listNum = new ArrayList<>();
		listNum.add(10);
		System.out.println(listNum);

		List<String> nameList = new ArrayList<>();
		nameList.add("kaka");
		nameList.add("baba");
		nameList.add("dada");
		nameList.add("mama");
		System.out.println("\nname added to name ArrayList");
		for(String name : nameList)
			System.out.println(name);
		Collections.sort(nameList);
		System.out.println("\nnameList is sorted");
		for(String name : nameList)
			System.out.print(name + ", ");
		Collections.reverse(nameList);
		System.out.println("\nnameList is reversed there order");
		for(String name : nameList)
			System.out.print(name + ", ");
		Collections.shuffle(nameList);
		System.out.println("\nnameList order is shuffled");
		for(String name : nameList)
			System.out.print(name + ", ");

	}

}
