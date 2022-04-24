package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    //Задание 5
        Scanner Name = new Scanner(System.in);
        System.out.println("Имя");
        String firstName = Name.nextLine();
        System.out.println("Отчество");
        String middleName = Name.nextLine();
        System.out.println("Фамилия");
        String lastName = Name.nextLine();

        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Фамилия сотрудника - " + fullName.substring(0, lastName.length()));
        System.out.println("Имя сотрудника - " + fullName.substring(lastName.length(), lastName.length() + firstName.length() + 1));
        System.out.println("Отчество сотрудника - " + fullName.substring(lastName.length() + firstName.length() + 1, lastName.length() + firstName.length() + middleName.length() + 2));
        // Оно работает!

        //Задание 6
        char[] fullNameArray = fullName.toCharArray();
        fullNameArray[0] = Character.toUpperCase(fullNameArray[0]);
        for (int i = 0; i < fullNameArray.length; i++) {
            if (fullNameArray[i] == ' '){
                fullNameArray[i+1] = Character.toUpperCase(fullNameArray[i+1]);
            }
        }
        String fullNameBacktoString = Arrays.toString(fullNameArray);
        fullNameBacktoString = fullNameBacktoString.replaceAll(", ", "" );
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullNameBacktoString);
        System.out.println();

        //Задание 7
        String str1 = "135";
        String str2 = "246";
        StringBuilder strSum = new StringBuilder(str1 + str2);//135246
        strSum.insert(1, str2.charAt(0));//1235246
        strSum.insert(3, str2.charAt(1));
        strSum.insert(5, str2.charAt(2));
        for (int i = 0; i <= 2; i++) {
            strSum.deleteCharAt(6);
        }
        System.out.println(strSum);
        System.out.println();

        //Задание 8
        String letters = "aabccddefgghiijjkk";
        char[] lettersToArray = letters.toCharArray();
        for (int i = 0; i < lettersToArray.length-1; i++) {
            if (lettersToArray[i] == lettersToArray[i+1]){
                System.out.print(lettersToArray[i]);
            }
        }
    }
}
