package bridge.implementation;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//Класс "Психология" определяет конкретную реализацию интрефейса "Жанр"
public class Psychology implements Genre {
    private Scanner file;
    private String[] array;
    private String buy;

    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public void openFile() {
        try {
            file = new Scanner(new File("psychology"));
        }
        catch (Exception e){
            System.out.println("Файл не найден");
        }

        while (file.hasNextLine()) {
            arrayList.add(file.nextLine());
        }

        array = arrayList.toArray(new String[0]);

        for (String i : array) {
            System.out.println(i);
        }

        file.close();
    }

    @Override
    public void choiceUser(int a) {
        this.buy = array[a];
        System.out.println("\nВы выбрали " + buy);
    }
}
