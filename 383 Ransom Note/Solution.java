import java.util.HashMap;

public class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {

    for (int i = 0; i < ransomNote.length(); i++) {
      char r = ransomNote.charAt(i);

      int matchingIndex = magazine.indexOf(r);

      if (matchingIndex == -1) {
        return false;
      }
      magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
    }
    return true;
    // Time complexity O(nm)
    // Space complexity O(m)
  }

  public boolean canConstructWithHashMap(String ransomNote, String magazine) {
    HashMap<Character, Integer> magazineLetters = new HashMap<>();
    for (int i = 0; i < magazine.length(); i++) {
      char m = magazine.charAt(i);
      int currentCount = magazineLetters.getOrDefault(m, 0);
      magazineLetters.put(m, currentCount + 1);
    }

    for (int i = 0; i < ransomNote.length(); i++) {
      char r = ransomNote.charAt(i);
      int currentCount = magazineLetters.getOrDefault(r, 0);

      if (currentCount == 0) {
        return false;
      }
      magazineLetters.put(r, currentCount - 1);
    }
    return true;
    // Time complexity O(m)
    // Space complexity O(k)---> k = 26(Alphabet) ---> O(1)
  }

  public static void main(String[] args) {
    String ransomNote = "aacd";
    String magazine = "aacsda";
    Solution solution = new Solution();
    System.out.println(solution.canConstruct(ransomNote, magazine));
    System.out.println(solution.canConstructWithHashMap(ransomNote, magazine));
  }
}
