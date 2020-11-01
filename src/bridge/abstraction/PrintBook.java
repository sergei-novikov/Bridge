package bridge.abstraction;

import bridge.implementation.Genre;

//"Печатная книга" явлеется подклассом основной абстракции и расширяет интерфейс определенной
//абстрации "Продукт"
public class PrintBook  extends Product{

    public PrintBook(Genre genre) {
        super(genre);
    }

    @Override
     public void open() {
        genre.openFile();
    }

    @Override
    public void choice(int a) {
        genre.choiceUser(a);
    }

}
