package ru.geekbrains.lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task01 {

    static List<String> words = new ArrayList<>(Arrays.asList(
            "Профессорская дача на берегу Финского залива в отсутствие хозяина друга моего отца нашей семье позволялось" +
                    " там жить даже спустя десятилетия помню как после утомительной дороги из города меня обволакивала " +
                    "прохлада деревянного дома как собирала растрясшееся распавшееся в экипаже тело эта прохлада не была " +
                    "связана со свежестью скорее как ни странно с упоительной затхлостью в которой слились ароматы старых " +
                    "книг и многочисленных океанских трофеев непонятно как доставшихся профессору-юристу распространяя солоноватый " +
                    "запах на полках лежали засушенные морские звёзды перламутровые раковины резные маски пробковый шлем и даже игла " +
                    "рыбы-иглы аккуратно отодвигая дары моря я доставал с полок книги садился по-турецки в кресло с самшитовыми подлокотниками " +
                    "и читал листал страницы правой рукой а левая сжимала кусок хлеба с маслом и сахаром откусывал задумчиво и читал и " +
                    "сахар скрипел на моих зубах это были жюль-верновские романы или журнальные переплетённые в кожу описания экзотических " +
                    "стран — мир неведомый недоступный и от юриспруденции бесконечно далёкий на своей даче профессор собрал очевидно то о " +
                    "чём ему мечталось с детства что не предусматривалось его нынешним положением и не регулировалось «Сводом законов Российской " +
                    "империи» в милых его сердцу странах законов подозреваю не было вообще"
    ));

    public static void main(String[] args) {

        String str = words.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> word.length()>5)
                .collect(Collectors.joining(" "));
        System.out.println("<Список слов длиннее 5 символов>: " + str);
    }
}
