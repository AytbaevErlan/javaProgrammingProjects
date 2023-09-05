package Lecture10.task1_l10;

//input 3 string from consol, find the shortest and the longest strings. Output found string and their lenght
public class LengthOfString {

    public static String shortestLenghtofString(String string1, String string2, String string3){
        String shortest = string1;
        if (string2.length() < shortest.length()){
            shortest = string2;
        }
        if (string3.length() < shortest.length()){
            shortest = string3;
        }
        return shortest;
    }

    public static String longestLengthOfString(String string1, String string2, String string3){
        String longest = string1;
        if (string2.length() > longest.length()){
            longest = string2;
        }
        if (string3.length() > string2.length()){
            longest = string3;
        }
        return longest;
    }


}
