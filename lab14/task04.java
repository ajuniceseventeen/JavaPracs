package lab14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task04
{
    public static void main(String[] args)
    {
        taskFour();
    }
    private static void taskFour()
    {
        String INPUT = "(1 + 8) Ц 9 / 4)";
        String INPUT1 = "(1 - 8) Ц 9 / 4)";
        String regex1="[0-9]+[' ']+\\+";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(INPUT);
        Matcher matcher1 = pattern.matcher(INPUT1);
        System.out.println(matcher.find());
        System.out.println(matcher1.find());
    }
}

/* ƒан текст, необходимо проверить есть ли в тексте цифры, за
    которыми не стоит знак Ђ+ї.
        a) пример правильных выражений:(1 + 8) Ц 9 / 4
        b) пример неправильных выражений: 6 / 5 Ц 2 * 9 */
