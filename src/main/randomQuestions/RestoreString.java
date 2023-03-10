package main.randomQuestions;

public class RestoreString {

	public String restoreString(String s, int[] indices) {

		int lengthOfIndices = indices.length;
		StringBuffer restoredString = new StringBuffer();

		for (int i = 0; i < lengthOfIndices; i++) {

			for (int j = 0; j < lengthOfIndices; j++) {

				if (i == indices[j]) {

					restoredString.append(s.charAt(j));

				}
			}
		}

		return restoredString.toString();

	}

}
