package lab2.task8;

public class StringReverse {
    public static void main(String[] args) {
        String[] arrString = {"123qwe", "456rty", "789uio", "lkj0-=", "hgf=-0", "dsa987", "zxc654", "vbn321", "temp1temp2temp"}; // длина = 9
        String temp;
        for (int i = 0; i < arrString.length / 2; i++)
        {
            temp = arrString[i];
            arrString[i] = arrString[arrString.length - i - 1];
            arrString[arrString.length - i - 1] = temp;
        }
        System.out.print("Получаем : ");
        for (int i = 0; i < arrString.length; i++)
        {
            System.out.print(arrString[i] + " ");
        }
    }
}
