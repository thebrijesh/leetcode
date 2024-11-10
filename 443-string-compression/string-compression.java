class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0; // Index to write compressed character or count

        int i = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int charCount = countConsecutiveChars(chars, i, currentChar);

            chars[writeIndex++] = currentChar; // Write the character to the compressed array

            if (charCount > 1) {
                writeCountToChars(chars, writeIndex, charCount); // Write count if greater than 1
                writeIndex += String.valueOf(charCount).length();
            }

            i += charCount; // Move to the next unique character sequence
        }

        return writeIndex; // Length of the compressed array
    }

    private int countConsecutiveChars(char[] chars, int startIndex, char targetChar) {
        int count = 0;
        while (startIndex < chars.length && chars[startIndex] == targetChar) {
            count++;
            startIndex++;
        }
        return count;
    }

    private void writeCountToChars(char[] chars, int writeIndex, int count) {
        for (char digit : String.valueOf(count).toCharArray()) {
            chars[writeIndex++] = digit;
        }
    }
}
