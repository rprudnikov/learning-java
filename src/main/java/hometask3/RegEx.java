package hometask3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        System.out.print("Введите ФИО (Aa-Zz,-,_): ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Введите телефон (+380...): ");
        String phone = sc.nextLine();
        System.out.print("Введите email (Aa-Zz,0-9,-,_,(.),@): ");
        String email = sc.nextLine();


        Pattern namePat = Pattern.compile("^[A-Za-z]+-*[A-Za-z]+\\s[A-Za-z]+\\s[A-Za-z]+?");
        Matcher m = namePat.matcher(name);

        if (m.matches() == false) {
            System.out.println("Вы неправильно ввели ФИО");
        }
        Pattern phonePat = Pattern.compile("^(\\+380)(93|63|73|50|66|95|99|67|68|96|97|98)[0-9]{7}");
        Matcher m2 = phonePat.matcher(phone);

        if (m2.matches() == false) {
            System.out.println("Вы неправильно ввели телефон");
        }
        Pattern emailPat = Pattern.compile("[A-Za-z0-9]*-*_*\\.*[A-Za-z0-9]*@[A-Za-z0-9]+\\.[A-Za-z0-9]+");
        Matcher m3 = emailPat.matcher(email);

        if (m3.matches() == false) {
            System.out.println("Вы неправильно ввели email");
        }
    }
}
