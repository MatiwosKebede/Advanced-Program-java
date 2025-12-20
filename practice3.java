import java.util.*;

public class  practice3{
	public static void main(String[] args){

		Set<String> uniqueNames = new HashSet<>();
		uniqueNames.add("gaga");
		uniqueNames.add("viva");
		uniqueNames.add("zazi");
		uniqueNames.add("fazi");
		uniqueNames.add("fazi");	

		System.out.println(uniqueNames);
		System.out.println("hashmap doesn't count or added duplicate");
		System.out.println("size: " + uniqueNames.size());
		System.out.println("before removing fazi" +  uniqueNames);
		uniqueNames.remove("fazi");
		System.out.println("check existance of fazi: " + uniqueNames.contains("fazi"));


	}




}
