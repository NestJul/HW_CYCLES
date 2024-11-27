package ru.netology.javaqa.javaqamvn.services;

public class RestCalculateService {
    public int calculate(int income, int expenses, int threshold ) {
        int restMonthCount = 0; //инициализация переменной количества месяцев отдыха
        int money = 0; //начальное состояние денег
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                restMonthCount++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return restMonthCount;
    }
}