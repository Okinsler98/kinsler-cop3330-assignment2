package ex24.base;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2){
        int usedValues[] = new int[word1.length()];
        int countValue = 0;

        if (word1.length() != word2.length()){
            return false;
        }

        for(int i = 0; i < word1.length(); i++){
            for(int j = 0; j < word2.length(); j++){
                if (word1.charAt(i) == word2.charAt(j)){
                    for (int k = 0; k < usedValues.length; k++){
                        if (j == usedValues[k]){
                            break;
                        } else if (k == usedValues.length - 1){
                            usedValues[countValue] = j;
                            countValue++;
                        }
                    }
                }
            }
        }

        if (countValue == word1.length() - 1){
            return true;
        } else {
            return false;
        }
    }
}
