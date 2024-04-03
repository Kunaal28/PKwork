package collectionsandgenericsassignment;

import java.util.ArrayList;
import java.util.List;

public class FriendFinder {

	public static void main(String[] args) {
		List<FriendshipCriteria<String, String>> friendsandtheirplaces =
				new
				ArrayList<FriendshipCriteria<String, String>>();
		friendsandtheirplaces.add(new FriendshipCriteria<>("John", "Italy"));
		friendsandtheirplaces.add(new FriendshipCriteria<>("Erick", "Milano"));
		friendsandtheirplaces.add(new FriendshipCriteria<>("Joseph", "venice"));

		String targetLocation = "Milano"; // Eg: Find friends in this location
		System.out.println("showing friends in " + targetLocation);
		for (FriendshipCriteria<String,String> friend : friendsandtheirplaces) {
			if (friend.getAttribute().equalsIgnoreCase(targetLocation)) {
				System.out.println(friend.getName() + " is a friend.");
			}
		}

		List<FriendshipCriteria<String, Integer>> friendsWithAge = new ArrayList<FriendshipCriteria<String, Integer>>();


		friendsWithAge.add(new FriendshipCriteria<>("John", 45));
		friendsWithAge.add(new FriendshipCriteria<>("Erick", 33));
		friendsWithAge.add(new FriendshipCriteria<>("Joseph", 29));

		int age = 40;
		System.out.println("Shows the  list of friends less than : " + age);
		for(FriendshipCriteria<String, Integer> friend : friendsWithAge) {
			if(friend.getAttribute() <= age) {
				System.out.println(friend.getName());
			}
		}
	}

}


