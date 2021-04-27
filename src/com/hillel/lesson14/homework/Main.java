package com.hillel.lesson14.homework;

import java.io.FileNotFoundException;

public class Main {
    /*Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3
    разные “проверяемые”(checked) ошибки. Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);

    Создайте еще один класс, у которого будет также три промежуточных метода, которые просто
    будут вызывать по одному методу первого класса.  Эти методы не должны обрабатывать возможные  ошибки,
    а просто пробрасывают  полученную  ошибку  выше;

    Используя методы второго класса(промежуточного), в классе Main реализуйте методы использования следующих конструкций
    обработки ошибок:
    а) try-catch-finally;
    б) try-catch-catch-finally;
    в) try-catch-catch-catch-finally;
    г) try(with resources)-catch-finally;
    д) try-finally (в каждой конструкции try должны быть
    вызовы 3х методов промежуточного класса с разными ошибками).*/

    public static void main(String[] args) throws FileNotFoundException {
        ExceptionClass exceptionClass = new ExceptionClass();
//        exceptionClass.exception_3();
        exceptionClass.exception_1();

    }
}
