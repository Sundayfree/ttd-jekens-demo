/**
 * Description:
 * Author: Liu
 * Date: 2019-09-21 10:36
 */
public class Demo {
    public static void main(String[] args) {
    }
    public static String wrap(String string, int length) {
        if (string == null || string.trim().length() == 0)  throw new IllegalArgumentException("string is null");
        if (length <= 0) throw new IllegalArgumentException("length is negative or 0");
        string = string.trim();
        if (string.length() <= length )  return string;
        // considering last character of string is whitespace, plus 1
        int index = string.substring(0, length + 1).lastIndexOf(" ");
        if (index != -1)
            // if index exists, substring, replace whitespace with newline and invoke wrap method
            return string.substring(0, index).trim() + "\n" + wrap(string.substring(index), length);
        // if no index, break the word, add newline and invoke wrap method
        return string.substring(0, length) + "\n" + wrap(string.substring(length), length);
    }

}



