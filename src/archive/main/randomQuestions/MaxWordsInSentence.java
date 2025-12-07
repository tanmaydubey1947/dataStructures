package archive.main.randomQuestions;

public class MaxWordsInSentence {

	public int mostWordsFound(String[] sentences) {
		
		int[] arr = new int[sentences.length];
		
		for(int i =0;i<sentences.length;i++) {
			arr[i] = countNoOfWords(sentences[i]);
		}
		
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		
		return max;

	}
	
	int countNoOfWords(String sentence) {
		
		int count = 0;
		
		for(int i = 0;i<sentence.length();i++) {
			
			if(sentence.charAt(i)==' ') {
				count++;
				
			}
		}
		
		return count;
	}

}
