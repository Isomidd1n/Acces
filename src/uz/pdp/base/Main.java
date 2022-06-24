package uz.pdp.base;

import uz.pdp.online.model.User;

import java.util.Arrays;
import java.util.Scanner;

//1-vazifaga qo'shimcha tarzda base package ichida Main classini va unda main methodini yarating.
// 5 ta userdan  iborat User toifasidagi massiv yarating va massiv elementlarini ekranga chiqazing.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        user.setUsername(String.valueOf((Arrays.toString(new String[]{"user1", "user2", "user3", "user4", "user5"}))));
        while (true) {
            System.out.print("Parol kiriting: ");
            int num = scanner.nextInt();
            if (num == 12345) {
                System.out.print("Yangi parol kiriting: ");
                num = scanner.nextInt();
                user.setPassword(num);
                System.out.println("Qabul qilindi.");
                System.out.println("Userlar ro'yxati: " + user.getUsername());
            } else {
                System.out.println("error");
            }
        }
    }
}
