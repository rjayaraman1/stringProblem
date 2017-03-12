package com.apple.interview;
/**
 * @author Rajeswari
 * Problem: Given a String and a Character, remove all instances of the Character in the String
 * Solve this two ways:
 * 1. Iterate through the String, one character at a time - Method deleteAllusingCharAt
 * 2. Find a method in the String class that can solve this in one line - Method name:deleteAllcharsFromString
 *
 */
public class StringReplacement {
	
	public static void main(String[] args) {
       
		System.out.println("Method 2: Result of deleteAllusingCharAt() using charAt iteative: " + deleteAllusingCharAt("Java Language",'a'));
        System.out.println("Method 2: Result of deleteAllchars() using string method replaceAll: " + deleteAllcharsFromString("Java Language",'a'));
       
    }
	//Method using string builtin method remove all instances of the Character in the String
	public static String deleteAllcharsFromString(String strGiven, char charToRemove) {
		String charToString = Character.toString(charToRemove);
		String resultStr = new String();
		if(!strGiven.isEmpty() && !strGiven.trim().isEmpty() && strGiven !=null) {
			resultStr = strGiven.replaceAll(charToString, "");
		}
		else{
			 resultStr = "NullEmptyString";
			 System.out.println("NullEmptyString");
			 
		}
		return resultStr;

	}
	//Method to remove all instances of the Character in the String by iterating through the string
	public static String deleteAllusingCharAt(String strGiven, char charToRemove) {
        StringBuffer buf = new StringBuffer();
        if(strGiven.isEmpty() || strGiven.trim().isEmpty() || strGiven ==null){
          buf= buf.append("NullEmptyString");
          System.out.println("NullEmptyString");
        	
        }
        else{
        	for (int i = 0; i < strGiven.length(); i++){
        	    if (strGiven.charAt(i) != charToRemove){
                 buf.append(strGiven.charAt(i));
        	    }
        	}
        }
        return buf.toString();
    }
 
}

	