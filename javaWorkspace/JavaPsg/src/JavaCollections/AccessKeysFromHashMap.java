package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> userCityMap=new HashMap<>();
		System.out.println("is userCityMapping empty: "+userCityMap.isEmpty());
		userCityMap.put("hari","new york");
		userCityMap.put("sanjay", "bengaluru");
		userCityMap.put("sakthi","London");
		
		System.out.println("user city Mapping HashMap: "+userCityMap);
		System.out.println("we have the city information of "+userCityMap.size()+" user");
		
		String userName="Steve";
		if(userCityMap.containsKey(userName)) {
			String city=userCityMap.get(userName);
			System.out.println(userName+"Lives in"+city);
		}else {
			System.out.println("city detail not found from user"+userName);
		}
		
		if(userCityMap.containsValue("new york")) {
			System.out.println("there is a user in the userCityMapping lives in new york");
		}else {
			System.out.println("there is no user in userCityMapping who lives in new york");
		}
		userCityMap.put(userName,"California");
		System.out.println(userName+" moved to a new city "+userCityMap.get(userName)+" new userCityMapping "+userCityMap);
		System.out.println("Lisa's city: "+userCityMap.get("Lisa"));

	}

}
