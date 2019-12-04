package code.date.tricks;

public class FriendsGroup {

	public static int friendGroup(int input1) {

		int numOfGroups = 1;
		for (int i = 2; i <= input1 + 1; i++) {

			if (i % 2 != 0 && i % 3 != 0 && (i * 2 > input1 + 1))
				numOfGroups++;
		}
		return numOfGroups;
	}

	public static void main(String[] args) {
			int n = 10;
			System.out.print(friendGroup(n));

	}
}