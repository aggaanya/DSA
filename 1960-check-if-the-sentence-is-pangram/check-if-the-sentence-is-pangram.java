class Solution {
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> seen = new HashSet<>();
        //add all the characters of the sentence into the seen set, it does not contain any duplicates
        //so the set must contain all the characters
        for (char ch: sentence.toCharArray()){
            seen.add(ch);
        }
        return seen.size() == 26;
    }
}