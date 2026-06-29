package MEDIUMRECURSION;

public class RemoveDuplicatesInString{

    public static boolean [] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString) {

        if(idx == newString.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newString);
        }else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abcdaeaafg";
        removeDuplicates(str, 0, "");

    }
}
