package string;

import java.time.LocalDate;
import java.util.StringJoiner;

public class StringEx {
    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner(",","[","]");
        stringJoiner.add("Hello").add("World").add("Java");
        System.out.println(stringJoiner);
        //[Hello,World,Java]

        StringJoiner stringJoiner2=new StringJoiner("],[","[","]");
        stringJoiner2.add("Hello").add("World").add("Java");
        System.out.println(stringJoiner2);
        //[Hello],[World],[Java]

        StringJoiner sj2=new StringJoiner("},{ ","{","}");
        sj2.add("Hello").add("World").add("Java");
        System.out.println(sj2);
        //{Hello},{ World},{ Java}

        int david=17,dawson=15,dillion=9,gordon=6;

        String s1="My nephews are "+david+","+dawson+","+dillion+" and "+gordon+" years old.";
        System.out.println(s1);

        String s2=String.format("My nephews are %d,%d,%d and %d",david,dawson,dillion,gordon);
        System.out.println(s2);

        String s3=String.format("W:%d X:%d",5,235);
        System.out.println(s3);
        //W:5 X:235

        String s4=String.format("%2$d %<d %1$d",2,1,3);
        System.out.println(s4);
        // 1 1 2

    }
}
