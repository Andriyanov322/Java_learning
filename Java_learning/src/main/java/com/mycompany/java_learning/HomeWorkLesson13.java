package com.mycompany.java_learning;

public class HomeWorkLesson13 {
    static void chooseMonth(int month)
    {
        switch(month)
        {
            case 1:
                System.out.println("В Январе 2022 года 31 день");
                break;
            case 2:
                System.out.println("В Феврале 2022 года 28 дней");
                break;
            case 3:
                System.out.println("В Марте 2022 года 31 день");
                break;
            case 4:
                System.out.println("В Апреле 2022 года 30 дней");
                break;
            case 5:
                System.out.println("В Мае 2022 года 31 день");
                break;
            case 6:
                System.out.println("В Июне 2022 года 30 дней");
                break;
            case 7:
                System.out.println("В Июле 2022 года 31 день");
                break;
            case 8:
                System.out.println("В Августе 2022 года 31 день");
                break;
            case 9:
                System.out.println("В Сентябре 2022 года 30 дней");
                break;
            case 10:
                System.out.println("В Октябре 2022 года 31 день");
                break;
            case 11:
                System.out.println("В Ноябре 2022 года 30 дней");
                break;
            case 12:
                System.out.println("В Декабре 2022 года 31 день");
                break;
            default:
                System.out.println("Порядкового номера такого месяца не существует");
        }
    }
    public static void main(String[] args) {
        chooseMonth(4);
        chooseMonth(7);
        chooseMonth(14);
    }
}
