package archive.main.randomQuestions;

import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {

	public static void main(String[] args) {

		List<List<String>> items = Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
				Arrays.asList("phone", "blue", "pixel"), Arrays.asList("phone", "blue", "pixel"));

		String ruleKey = "color";
		String ruleValue = "blue";

		System.out.println(countMatches(items, ruleKey, ruleValue));

	}

	public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

		int count = 0;

		int ruleKeyIndex = -1;

		switch (ruleKey) {
		case "type":
			ruleKeyIndex = 0;
			break;
		case "color":
			ruleKeyIndex = 1;
			break;
		case "name":
			ruleKeyIndex = 2;
			break;
		default:
			ruleKeyIndex = 0;
			break;
		}

		for (int i = 0; i < items.size(); i++) {

			if (items.get(i).get(ruleKeyIndex).equalsIgnoreCase(ruleValue)) {

				count++;
			}
		}

		return count;

	}

}
