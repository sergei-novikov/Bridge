package bridge.abstraction;

import bridge.implementation.Genre;

//"Продукт" определяет интерфейс абстракции и хранит ссылку на объект "Жанр"
public abstract class Product {
    Genre genre;

    public Product(Genre genre) {
        this.genre = genre;
    }

     public abstract void open();

     public abstract void choice(int a);
}
