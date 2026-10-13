import java.util.ArrayList;
public class WrapperClassExample {
    public static void main(String[] args) {
        int a = 100;
        Integer intObj = a; 
        System.out.println("1. Autoboxing (Primitive int to Integer object): " + intObj);

        Integer intObjExplicit = Integer.valueOf(a);
        System.out.println("   Explicit Boxing using valueOf(): " + intObjExplicit);

        int b = intObj; 
        System.out.println("2. Unboxing (Integer object to primitive int): " + b);
        
        int c = intObj.intValue();
        System.out.println("   Explicit Unboxing using intValue(): " + c);

        String numStr = "450";
        int parsedInt = Integer.parseInt(numStr);
        System.out.println("3. Parsing (String \"" + numStr + "\" to int): " + parsedInt);

        String convertedStr = Integer.toString(parsedInt);
        System.out.println("   Conversion (int to String): \"" + convertedStr + "\"");
    
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); 
        numbers.add(20);
        System.out.println("4. Using Wrappers in ArrayList: " + numbers);
        int firstNum = numbers.get(0); // Unboxing happens here
        System.out.println("   Accessing element (unboxed): " + firstNum);

        Double dObj = 123.45;
        System.out.println("5. Double Object Value: " + dObj.doubleValue());
        
        char ch = 'A';
        Character charObj = ch;
        System.out.println("   Character Object: " + charObj);
        System.out.println("   Is '" + charObj + "' a letter? " + Character.isLetter(charObj));
        System.out.println("   Uppercase version of '" + charObj + "': " + Character.toUpperCase(ch));
    }
}