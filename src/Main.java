import bridge.abstraction.*;
import bridge.implementation.*;

//Паттерн Bridge (Мост) — структурный шаблон проектирования. То есть, его основная задача
//— создание полноценной структуры из классов и объектов. Bridge решает эту задачу путем
//разделения одного или нескольких классов на отдельные иерархии — абстракцию и реализацию.
//Изменение функционала в одной иерархии не влечет за собой изменения в другой.
public class Main {
    public static void main(String[] args) {

     System.out.println("Добро пожаловать в мой маленький книжный магазин");


        //Реализация паттерна Bridge
        Product product = new PrintBook(new Novel());
        //Открыть список книг
        product.open();
        //Выбрать книгу
        product.choice(3);

        //Таким образом мы отделили абстракцию и реализацию и можем их изменять по отдельности
        System.out.println("-----------------------------------------------");

        Product product1 = new AudioBook(new Psychology());
        product1.open();
        product1.choice(4);


    }
}












