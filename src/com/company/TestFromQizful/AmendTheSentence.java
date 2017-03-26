package com.company.TestFromQizful;

/**
 * Created by Маша on 23.03.2017.
 */
/*For s = "CodefightsIsAwesome", the output should be
amendTheSentence(s) = "codefights is awesome";
For s = "Hello", the output should be
amendTheSentence(s) = "hello".*/
public class AmendTheSentence {
    public static void main(String[] args) {
        String s = "CodefightsIsAwesome";
        System.out.println(amendTheSentence(s));

    }

    static String amendTheSentence(String s) {
        String result = " ";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                result += " " + s.charAt(i);
            } else if (Character.isLowerCase(s.charAt(i))) {
                result += s.charAt(i);
            }
            result =result.toLowerCase();


        }
        result = result.trim();
        return result;

    }
//    StringBuilder builder = new StringBuilder();
//		for (char c : s.toCharArray()) {
//        if(Character.isUpperCase(c)){
//            builder.append(" " + Character.toLowerCase(c));
//        } else{
//            builder.append("" + c);
//        }
//    }
//		return builder.toString().trim();
//}
}

