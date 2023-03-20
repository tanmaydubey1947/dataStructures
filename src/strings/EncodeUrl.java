package strings;

public class EncodeUrl {
  
  // Simple and basic solution with time complexity: O(n)
  // Leetcode Link: https://leetcode.com/problems/encode-and-decode-tinyurl/description/

	 private String result;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        this.result = longUrl;
        return this.result;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return this.result;
    }

}
