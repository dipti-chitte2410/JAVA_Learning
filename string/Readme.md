StringJoiner:
-> its is empty unless add method is called
-> StringJoiner sj = new StringJoiner(",","[","]");

Parts of Fomatter:
% (required) , conversion (required), flags(optional), width(optional), precision(optional), argument index(optional)
String formatter
%.1f ->to show numbers upto 1 decimal place
%.2f ->to show numbers upto 2 decimal place
                                  type        example        result
%d -> to show Decimal number      Integral    123            123    
%x -> to show Hexadecimal number  Integral    123            7b
%#X->  to show Hexadecimal number with 0x prefix              0x7B
%s -> to show string              General     "Hello"        Hello
%b -> to show boolean             General     true           true
%t -> to show date and time        Time       new Date()     Sat May 12 12:00:00 IST 2018
%f -> to show floating point       Floating    123.45         123.4555555
%tc -> to show date and time in default format
%tr -> to show time in default format
%td -> to show date in default format

Flags:
#,0,-, , ,space,+,-,(,^
Flag    Description
%#X->  to show Hexadecimal number with 0x prefix              0x7B
W:%d X:%d -> W:5 X:235
W:%4d X:%d -> to keep width of 4 space W:   5 X: 235
W:%04d  X:%04d -> To add leading 0s W:0005 X:0235
W:%-4d X:%-4d -> To left justify W:5    X:235

%,d -> to show number with comma separated 1,23,456
%,.2f -> to show number with comma separated upto 2 decimal place 1,23,456.78

space:
% d -> to show number with space separated  
 123
-456

+: always show sign
%+d -> to show number with sign
+123
-456

( : show negative number in bracket like -123 to (123) and 456 456
%(d -> to show negative number with bracket
(123)


Argument Index -> to specify the order of argument
String.format("%3d %1$d %2$d",10,20,30) -> 30 10 20

String s4=String.format("%2$d %<d %1$d",2,1,3);

%<d ->previous formatter:
String s4=String.format("%2$d %<d %1$d",2,1,3); -> 1 1 2

**Formatter** Writting formatted content to a stream
BufferedWriter bufferedWriter= Files.newBufferedWriter(Paths.get("string/testfile.txt"));
try(Formatter f=new Formatter(bufferedWriter)){
f.format("%s %d %f","Hello",123,123.45); // writes formatted content to file
}

Regular Expressions:
\b:indicates that a pattern is bounded by a non-word character.
\w+ : A word character or more word characters

Pattern: Complies a regular expression creates Mather class based on that patten
Matcher: It is used to match the pattern with the input string




