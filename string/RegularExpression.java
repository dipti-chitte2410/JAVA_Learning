package string;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        String s1="apple, apple and orange please";
        String s2=s1.replaceAll("ple","ricot");
        System.out.println(s2);
        s2=s1.replaceAll("ple\\b","ricot");
        System.out.println(s2);

        String [] parts=s1.split("\\b");

        for(String s:parts){
            if(s.matches("\\w+")){
                System.out.println(s);
            }
        }

        Pattern pattern=Pattern.compile("\\w+");
        Matcher matcher=pattern.matcher(s1);
        System.out.print(matcher.group());
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

}
