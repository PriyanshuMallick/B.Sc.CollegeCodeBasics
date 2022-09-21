// 8. Write a program that show working of different functions of String and StringBufferclasss 
// like setCharAt(), setLength(), append(), insert(), concat()and equals().

public class $8_StringTest {
    public static void main(String[] args) {
        String str = " My name is Eve.", str2, a, b, c;
        StringBuffer bstr = new StringBuffer("Hello");

        // setCharAt()
        System.out.println("\nBefore setCharAt() String is\n" + bstr);
        bstr.setCharAt(1, 'i');
        System.out.println("After setCharAt() String is\n" + bstr + "\n");

        // setLength()
        System.out.println("Before setLenght() Length of String is " + bstr.length() + "\nAnd the string is " + bstr);
        bstr.setLength(2);
        System.out.println(
                "After setLenght() Length of String is " + bstr.length() + "\nAnd the string is " + bstr + "\n");

        // append()
        System.out.println("Before append() String is\n" + bstr);
        bstr.append(", I'm a AI.");
        System.out.println("After append() String is\n" + bstr + "\n");

        // insert()
        System.out.println("Before insert() String is\n" + bstr);
        bstr.insert(9, 'n');
        System.out.println("After insert() String is\n" + bstr + "\n");

        // concat()
        str2 = bstr.toString();
        System.out.println("Before concat() String is\n" + str);
        str = str2.concat(str);
        System.out.println("After concat() String is\n" + str + "\n");

        // equals()
        a = c = "Hey";
        b = "Hi";

        System.out.println("Is '" + a + "' equals to '" + b + "'?");
        System.out.println(a.equals(b) + "\n"); // False

        System.out.println("Is '" + a + "' equals to '" + c + "'?");
        System.out.println(a.equals(c)); // True
    }
}