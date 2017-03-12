package com.apple.interview;
/**
*   @author Rajeswari
*	Problem: Given a String and a Character, remove all instances of the Character in the String
* 	This is a test class for the class StringReplacement 
*	TestNG library is used for assertion
*   testStr has test input values
*   expectedResult has the expected result for each input string
*/
import org.testng.Assert;
import org.testng.annotations.Test;
import com.apple.interview.StringReplacement;
public class StringReplacementTest  {
char removechar = 'a';
String testStr1 = "Programming language Java";
String testStr2 ="";
String testStr3 ="        ";
String testStr4 ="4Programming language3#12";
String testStr5 = "a";
String testStr6 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa123456aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
String testStr7;
String testStr8 = null;
String expectedResult1 = "Progrmming lnguge Jv";
String expectedResult2 = "";
String expectedResult3 = "";
String expectedResult4 = "4Progrmming lnguge3#12";
String expectedResult5 = "";
String expectedResult6 = "123456";
	     
@Test(expectedExceptions =NullPointerException.class )
public void testdeleteAllcharsFromString() {
	System.out.println("Tests to test deleteAllCharsFromString method of StringReplacement class");
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString(this.testStr1,this.removechar),this.expectedResult1); 
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString(this.testStr2,this.removechar),"NullEmptyString"); 
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString(this.testStr3,this.removechar),"NullEmptyString");
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString(this.testStr4,this.removechar),this.expectedResult4);
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString(this.testStr5,this.removechar),this.expectedResult5);
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString(this.testStr6,this.removechar),this.expectedResult6); 
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString(this.testStr7,this.removechar),"NullEmptyString");
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString(this.testStr8,this.removechar),"NullEmptyString");
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString("two-by-two",'-'),"twobytwo");
	Assert.assertEquals(StringReplacement.deleteAllcharsFromString("Go2Office",'2'),"GoOffice");
	

 }
@Test(expectedExceptions =NullPointerException.class)
public void testdeleteAllusingCharAt() {
	System.out.println("Tests to test deleteAllusingCharAt method of StringReplacement class");
    Assert.assertEquals(StringReplacement.deleteAllusingCharAt(this.testStr1,this.removechar),this.expectedResult1); 
    Assert.assertEquals(StringReplacement.deleteAllusingCharAt(this.testStr2,this.removechar),"NullEmptyString"); 
    Assert.assertEquals(StringReplacement.deleteAllusingCharAt(this.testStr3,this.removechar),"NullEmptyString");
    Assert.assertEquals(StringReplacement.deleteAllusingCharAt(this.testStr4,this.removechar),this.expectedResult4);
    Assert.assertEquals(StringReplacement.deleteAllusingCharAt(this.testStr5,this.removechar),this.expectedResult5);
    Assert.assertEquals(StringReplacement.deleteAllusingCharAt(this.testStr6,this.removechar),this.expectedResult6); 
    Assert.assertEquals(StringReplacement.deleteAllusingCharAt(this.testStr7,this.removechar),"NullEmptyString"); 
    Assert.assertEquals(StringReplacement.deleteAllusingCharAt(this.testStr8,this.removechar),"NullEmptyString"); 
    Assert.assertEquals(StringReplacement.deleteAllusingCharAt("two-by-two",'-'),"twobytwo");
	Assert.assertEquals(StringReplacement.deleteAllusingCharAt("Go2Office",'2'),"GoOffice");

	}

	}
