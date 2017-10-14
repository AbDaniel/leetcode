package algo;

import java.util.*;

/**
 * Created by daniel on 9/13/17.
 */
public class RomanNumerals {
    Map<Character, Integer> table = new HashMap<>();
    List<Character> orderList = new ArrayList<>();

    RomanNumerals() {
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);

        orderList.add('I');
        orderList.add('V');
        orderList.add('X');
        orderList.add('L');
        orderList.add('C');
        orderList.add('D');
        orderList.add('M');
    }

    public int compare(Character x, Character y) {
        return Integer.compare(orderList.indexOf(x), orderList.indexOf(y));
    }

    class Tuple {
        char numeral;
        int count;

        public Tuple(char numeral, int count) {
            this.numeral = numeral;
            this.count = count;
        }

        @Override
        public String toString() {
            return "(" + numeral + ", " + count + ')';
        }
    }


    public int romanToInt(String s) {
        char[] charArray = s.toCharArray();

        Stack<Tuple> chars = new Stack<>();

        for (int i = 0; i < charArray.length; i++) {
            char current = charArray[i];
            if (chars.isEmpty() || chars.peek().numeral != current) {
                chars.push(new Tuple(current, 1));
            } else {
                chars.peek().count += 1;
            }
        }

        int result = 0;
        Tuple prev = chars.pop();
        result += table.get(prev.numeral) * prev.count;
        Character prevCharacter = prev.numeral;

        while (!chars.isEmpty()) {
            Tuple current = chars.pop();
            Character currentCharacter = current.numeral;

            if (this.compare(currentCharacter, prevCharacter) >= 0) {
                result += table.get(current.numeral) * current.count;
            } else {
                result -= table.get(current.numeral) * current.count;
            }

            prevCharacter = currentCharacter;
        }

        return result;
    }
}
