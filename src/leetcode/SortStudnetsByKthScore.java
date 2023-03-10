package leetcode;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortStudnetsByKthScore {

	public static void main(String[] args) {

		int[][] result = sortTheStudents(new int[][] { { 10, 6, 9, 1 }, { 7, 5, 11, 2 }, { 4, 8, 3, 15 } }, 2);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] +" ");
			}
			System.out.println();
		}

	}

	public static int[][] sortTheStudents(int[][] score, int k) {

		int[][] sortedScore = new int[score.length][score[0].length];

		LinkedHashMap<Integer, int[]> scoreMap = new LinkedHashMap<>();

		for (int i = 0; i < score.length; i++) {
			scoreMap.put(score[i][k], score[i]);
		}

		Map<Integer, int[]> sortedScoreMap = new TreeMap<>((Collections.reverseOrder()));
		sortedScoreMap.putAll(scoreMap);
		int j = 0;

		for (int i : sortedScoreMap.keySet()) {

			sortedScore[j] = scoreMap.get(i);
			j++;
		}

		return sortedScore;

	}

}
