public class longestSubstringWithoutRepeatedChar {
    public static int WithoutRepeatedChar(String S){
        int [] charCheck = new int[256];
        for(int i = 0; i < 256; i++){
            charCheck[i] = -1;
        }

        int min = 0;
        int Max = 0;
        for(int j = 0; j < S.length(); j++){
            char ch = S.charAt(j);
            if(charCheck[ch] >= min){
                min = charCheck[ch] + 1;
            }
            charCheck[ch] = j;
            Max = Math.max(Max, j - min + 1);
        }
        return Max;
    }
    public static void main(String[] args) {
        System.out.println(WithoutRepeatedChar("abbbbb"));
    }
}
