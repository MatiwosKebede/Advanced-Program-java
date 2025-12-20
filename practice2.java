import java.util.*;

public class pratice2{
	public static void main(String[] args){
		Map<String, Integer> ages = new HashMap<>();
		ages.put("bati", 20);
		ages.put("mami", 40);
		ages.put("babi", 23);
		ages.put("dadi", 55);
		ages.put("fafi", 34);
		System.out.println("total hashmap created: "+ages);
		System.out.println("get key by value .get(\"bati\"), bati age: " + ages.get("bati"));
		//check existance by key
		System.out.println("existance of mami by key, mami: " +  ages.containsKey("mami"));
		//check existance by value
		System.out.println("check existance by value: 20: " +ages.containsValue(20));
		//remove by key
		System.out.println("remove by key .remove(\"fafi\") by key");
		ages.remove("fafi");
		System.out.println("hashmap after update: " + ages);				

	for(String key : ages.keySet())
		System.out.println(key + ": " + ages.get(key));

	}
}
		
