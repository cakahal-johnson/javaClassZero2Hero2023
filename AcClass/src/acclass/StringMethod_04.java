/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acclass;

/**
 *
 * @author Cakahal Johnson
 */
public class StringMethod_04 {
    StringMethod_04(){
        /*Java creates these string methods as a way of manipulating a string 
        with 48 methdos*/
        
        //creating a string as an Object
        String name = new String("hello Java, 123456");
        System.out.println(name);
        
        //shorthand for string
        String Name = "Java is aweson!";
        String hello = "amazing to learn";
        
        // Escape characters are way to add a programmable formt to codes
        /*
        List of Java (programming Lang.):
        
            \\ (backSlash)we use this to display a single slash in the String text
            \t (backSlash t) we use to display tab format (indentation)
            \n (backSlash n) we use to move next to a new line
            \r (backSlash r) we to return a function
            \b (backSlash b) returns back-space
        
        BN: to use this escape character just add to the String line code
        */
        
              // Concatenating a String means combining two or more strings
        // + (plus sign works only for String not in operator)
        System.out.println("welcome to"+ name +" and "+ hello +" "+Name);
        
        // concatenation using concat() method
        
        String n = "Cakahal";
        n= n.concat(" Johnson");
        System.out.println(n);
        
        // checking for length index in a String
        System.out.println(name.length()); // 18
        
        //SubStrings takes params starting and ending index
        
        String check_sub = name.substring(6, 11); // java from the string
        System.out.println(check_sub);
        
        // print out a text that has single qoute and also double qoute as well 'single' and "double"
        
        // where we search for a keyword inside a string we using last indexOf()
        String DB = "where we search for a keyword inside a string we using last indexOf()";
//        int data = DB.indexOf("w"); //0
          int data = DB.indexOf("we"); //6
        System.out.println(data);
        
        // checking for if two strings are equal,,, using the equal() which returns boolean 
        String LP = "abcd";
        String PDP = "ABCD";
        String APC = "BADOs";
        String NNPC = "abcd";
        
        System.out.println("is Lp equal to: PDP"+ LP.equals(PDP));  //false
        System.out.println("is Lp equal to: PDP"+ LP.equalsIgnoreCase(PDP));  //true
        
        //checking if a String starts with a word or not
        System.out.println("checking if Where starts DB string "+ DB.startsWith("Where")); // false
        System.out.println("checking if Where starts DB string "+ DB.startsWith("where")); // true
        
        
        //         //checking if a String ends with a word or not
        
        System.out.println("checking if () ends DB string "+ DB.endsWith("()")); // true
        
        // how to chage a character in a string
        String newDB = DB.replace("where", "we are here to learn java");
        System.out.println(newDB);
        
        
        // turning small to upper case
        System.out.println(NNPC.toUpperCase());
        System.out.println(PDP.equals(NNPC)); //false
        
         // turning upper to lower case
        System.out.println(NNPC.toLowerCase());
        System.out.println(PDP.equals(NNPC)); //false
        
        
        // checking if a character is inside a String returns boolean
        if(LP.contains("e")){
            System.out.println("Yes c is inside in the String");
        }else{
            System.out.println("Opps! No is not in the list");
        }
        
        /*
            1	char charAt(int index)
Returns the character at the specified index.

2	int compareTo(Object o)
Compares this String to another Object.

3	int compareTo(String anotherString)
Compares two strings lexicographically.

4	int compareToIgnoreCase(String str)
Compares two strings lexicographically, ignoring case differences.

5	String concat(String str)
Concatenates the specified string to the end of this string.

6	boolean contentEquals(StringBuffer sb)
Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer.

7	static String copyValueOf(char[] data)
Returns a String that represents the character sequence in the array specified.

8	static String copyValueOf(char[] data, int offset, int count)
Returns a String that represents the character sequence in the array specified.

9	boolean endsWith(String suffix)
Tests if this string ends with the specified suffix.

10	boolean equals(Object anObject)
Compares this string to the specified object.

11	boolean equalsIgnoreCase(String anotherString)
Compares this String to another String, ignoring case considerations.

12	byte[] getBytes()
Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.

13	byte[] getBytes(String charsetName)
Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.

14	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
Copies characters from this string into the destination character array.

15	int hashCode()
Returns a hash code for this string.

16	int indexOf(int ch)
Returns the index within this string of the first occurrence of the specified character.

17	int indexOf(int ch, int fromIndex)
Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.

18	int indexOf(String str)
Returns the index within this string of the first occurrence of the specified substring.

19	int indexOf(String str, int fromIndex)
Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.

20	String intern()
Returns a canonical representation for the string object.

21	int lastIndexOf(int ch)
Returns the index within this string of the last occurrence of the specified character.

22	int lastIndexOf(int ch, int fromIndex)
Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.

23	int lastIndexOf(String str)
Returns the index within this string of the rightmost occurrence of the specified substring.

24	int lastIndexOf(String str, int fromIndex)
Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.

25	int length()
Returns the length of this string.

26	boolean matches(String regex)
Tells whether or not this string matches the given regular expression.

27	boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
Tests if two string regions are equal.

28	boolean regionMatches(int toffset, String other, int ooffset, int len)
Tests if two string regions are equal.

29	String replace(char oldChar, char newChar)
Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.

30	String replaceAll(String regex, String replacement
Replaces each substring of this string that matches the given regular expression with the given replacement.

31	String replaceFirst(String regex, String replacement)
Replaces the first substring of this string that matches the given regular expression with the given replacement.

32	String[] split(String regex)
Splits this string around matches of the given regular expression.

33	String[] split(String regex, int limit)
Splits this string around matches of the given regular expression.

34	boolean startsWith(String prefix)
Tests if this string starts with the specified prefix.

35	boolean startsWith(String prefix, int toffset)
Tests if this string starts with the specified prefix beginning a specified index.

36	CharSequence subSequence(int beginIndex, int endIndex)
Returns a new character sequence that is a subsequence of this sequence.

37	String substring(int beginIndex)
Returns a new string that is a substring of this string.

38	String substring(int beginIndex, int endIndex)
Returns a new string that is a substring of this string.

39	char[] toCharArray()
Converts this string to a new character array.

40	String toLowerCase()
Converts all of the characters in this String to lower case using the rules of the default locale.

41	String toLowerCase(Locale locale)
Converts all of the characters in this String to lower case using the rules of the given Locale.

42	String toString()
This object (which is already a string!) is itself returned.

43	String toUpperCase()
Converts all of the characters in this String to upper case using the rules of the default locale.

44	String toUpperCase(Locale locale)
Converts all of the characters in this String to upper case using the rules of the given Locale.

45	String trim()
Returns a copy of the string, with leading and trailing whitespace omitted.

46	static String valueOf(primitive data type x)
Returns the string representation of the passed data type argument.
        
        
        
        */
        


        

        
        
        
        
        
    }
}
