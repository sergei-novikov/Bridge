package bridge.abstraction;

import bridge.implementation.Genre;

//"Аудиокнига явлеется подклассом основной абстракции и расширяет интерфейс определенной
//абстрации "Продукт"
public class AudioBook extends Product{

    public AudioBook(Genre genre) {
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
