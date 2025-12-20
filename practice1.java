import java.util.*;

public class practice1{
	public static void main(String[] args){
	List<String> proName = new ArrayList<>();
	proName.add("java");
	proName.add("Python");
	proName.add("C#");
	proName.add("Kotlin");
	proName.add("javascript");
	System.out.println("different Programming Language added to proName arrayslist");
	System.out.println("return array value by get() method first index: "+proName.get(0));
	System.out.println("ArrayListName.get(1): " + proName.get(1));

	System.out.println("arrayList before updated: " + proName);
	proName.set(4, "typescript");
	System.out.println("proName.get(4): " + proName.get(4));

	System.out.println("before remove index 2 which is C#: " + proName);
	proName.remove(2);
	System.out.println(proName);
	System.out.println("to print size of arraylist size: " +proName.size());
	System.out.println("check if C# exist: " + proName.contains("C#"));
	System.out.println("check if java exist: " + proName.contains("java"));



	}
}
