package stringAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class Three_Strings_Algo_Together {
	
	static Character specialCharacter;

	public Three_Strings_Algo_Together() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	private static void kmpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        int[] lps = computeLPSArray(pattern);

        int i = 0, j = 0;
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;

                if (j == m) {
                    System.out.println("Pattern found at index " + (i - j));
                    j = lps[j - 1];
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
    }
    private static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int length = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
    
    
    
    private static void rabinKarpNotInText(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int prime = 101; // Prime number

        int patternHash = hashString(pattern);
        int textHash = hashString(text.substring(0, m));

        // Set to store characters not in the text
        HashSet<Character> set = new HashSet<Character>();

        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash) {
                for(int j=0;j<m;j++) {
                	if(text.charAt(i+j)==pattern.charAt(j)) {
                		set.add(text.charAt(i+j));
                	}
                	else{
                		set.add(text.charAt(i+j));
                		set.add(pattern.charAt(j));
                	}
                }
            } else {
            	for(int j=0;j<m;j++) {
                	set.add(text.charAt(i+j));
                	set.add(pattern.charAt(j));
                }
            }

            if (i < n - m) {
                textHash = (256 * (textHash - text.charAt(i) * (int) Math.pow(256, m - 1)) + text.charAt(i + m)) % prime;
                if (textHash < 0) {
                    textHash += prime;
                }
            }
        }

        for(int i=32;i<127;i++) {
        	Character s=(char)i;
        	if(!set.contains(s)) {
        		specialCharacter=s;
        		break;
        	}
        }
        
        System.out.println("Character not in text or pattern : "+specialCharacter);
    }
    private static int hashString(String s) {
        int h = 0;
        for (char c : s.toCharArray()) {
            h = (h * 256 + (int) c) % 101;
        }
        return h;
    }
    
    
    
    private static void zAlgorithmNotInPattern(String text, String pattern) {
        String concatStr = pattern + specialCharacter + text;
        int n = concatStr.length();

        int[] zArray = calculateZArray(concatStr);

        for (int i = pattern.length() + 1; i < n; i++) {
            if (zArray[i] == 0) {
                System.out.println("Character not in pattern: " + concatStr.charAt(i));
            }
        }
    }
    private static int[] calculateZArray(String s) {
        int len = s.length();
        int[] zArray = new int[len];
        int left = 0, right = 0;

        for (int i = 1; i < len; i++) {
            if (i <= right) {
                zArray[i] = Math.min(right - i + 1, zArray[i - left]);
            }
            while (i + zArray[i] < len && s.charAt(zArray[i]) == s.charAt(i + zArray[i])) {
                zArray[i]++;
            }
            if (i + zArray[i] - 1 > right) {
                left = i;
                right = i + zArray[i] - 1;
            }
        }

        return zArray;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = "ABABDABACDABABCABAB";
        //String pattern = "ABABCABAB";
        //kmpSearch(text, pattern);
        
        
        String text = "ABABC! \"ABABDABAB";
        String pattern = "XY#";
        rabinKarpNotInText(text, pattern);
        
//        zAlgorithmNotInPattern(text, pattern);

	}

}
