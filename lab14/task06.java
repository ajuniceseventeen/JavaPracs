package lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task06
{
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher matcher = pattern.matcher("user@example.com");
        Matcher matcher1 = pattern.matcher("myhost@@@com.ru");
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
    }
}
//
//    �������� ���������� ���������, ������������ �������� �� ������
//        ������� ���������� (����������) �-mail ������� �������� RFC ��� �������
//        2822.
//        a) ������ ���������� ���������: user@example.com, root@localhost.dot
//        b) ������ ������������ ���������: myhost@@@com.ru, @my.ru,