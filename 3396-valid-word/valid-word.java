class Solution {
    public static boolean isValid(String word) {
    if (word == null || word.length() < 3) {
        return false;
    }

    boolean hasVowel = false;
    boolean hasConsonant = false;

    for (char c : word.toCharArray()) {
        // Must be a letter or digit only
        if (!Character.isLetterOrDigit(c)) {
            return false;
        }

        char lower = Character.toLowerCase(c);

        if ("aeiou".indexOf(lower) >= 0) {
            hasVowel = true;
        } else if (Character.isLetter(lower)) {
            hasConsonant = true;
        }
    }

    return hasVowel && hasConsonant;
}
}