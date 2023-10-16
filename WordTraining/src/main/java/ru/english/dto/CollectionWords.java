package ru.english.dto;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionWords {

    private List<Word> wordList;

    public CollectionWords() {
        wordList = new ArrayList<>();
    }

    /**
     * Метод позволяющий получить коллекцию в перемешанном виде
     *
     * @return возвращается коллекция с элементами перемешанными случайным образом
     */
    public List<Word> getDictionaryWords() {
        Collections.shuffle(wordList);
        return wordList;
    }

    /**
     * Создает коллекцию слов
     */
    public void createDictionaryWordsBeginnerUnit1() {
        wordList.add(new Word("address", "адрес"));
        wordList.add(new Word("alphabet", "алфавит"));
        wordList.add(new Word("am", "являюсь/нахожусь"));
        wordList.add(new Word("and", "и"));
        wordList.add(new Word("are", "являешься/находишься"));
        wordList.add(new Word("be", "быть"));
        wordList.add(new Word("business", "работа"));
        wordList.add(new Word("city", "город"));
        wordList.add(new Word("country", "страна"));
        wordList.add(new Word("day", "день"));
        wordList.add(new Word("fine", "отличный"));
        wordList.add(new Word("first name", "имя"));
        wordList.add(new Word("from", "из"));
        wordList.add(new Word("good morning", "доброе утро"));
        wordList.add(new Word("good bye", "до свидание"));
        wordList.add(new Word("great", "великолепный"));
        wordList.add(new Word("hello", "привет"));
        wordList.add(new Word("here", "здесь"));
        wordList.add(new Word("hi", "привет"));
        wordList.add(new Word("holiday", "каникулы"));
        wordList.add(new Word("hotel", "гостиница"));
        wordList.add(new Word("how", "как"));
        wordList.add(new Word("I", "я"));
        wordList.add(new Word("in", "в"));
        wordList.add(new Word("introduce", "познакомить"));
        wordList.add(new Word("is", "является/находиться"));
        wordList.add(new Word("last name", "фамилия"));
        wordList.add(new Word("letter", "буква"));
        wordList.add(new Word("map", "карта"));
        wordList.add(new Word("meeting", "встреча"));
        wordList.add(new Word("name", "имя"));
        wordList.add(new Word("no", "нет"));
        wordList.add(new Word("number", "число"));
        wordList.add(new Word("number", "число"));
        wordList.add(new Word("on", "на"));
        wordList.add(new Word("on", "на"));
        wordList.add(new Word("right", "правильно"));
        wordList.add(new Word("phone number", "номер телефона"));
        wordList.add(new Word("spell", "читать по буквам"));
        wordList.add(new Word("study", "учиться"));
        wordList.add(new Word("thanks", "спасибо"));
        wordList.add(new Word("that", "тот"));
        wordList.add(new Word("too", "тоже"));
        wordList.add(new Word("what", "что"));
        wordList.add(new Word("where", "где"));
        wordList.add(new Word("yes", "да"));
        wordList.add(new Word("you", "ты"));
        wordList.add(new Word("your", "твой"));
        wordList.add(new Word("numbers", "числа"));
        wordList.add(new Word("one", "один"));
        wordList.add(new Word("two", "два"));
        wordList.add(new Word("three", "три"));
        wordList.add(new Word("four", "четыре"));
        wordList.add(new Word("five", "пять"));
        wordList.add(new Word("six", "шесть"));
        wordList.add(new Word("seven", "семь"));
        wordList.add(new Word("eight", "восемь"));
        wordList.add(new Word("nine", "девять"));
        wordList.add(new Word("ten", "десять"));
        wordList.add(new Word("countries", "страны"));
        wordList.add(new Word("Australia", "Австралия"));
        wordList.add(new Word("Brazil", "Бразилия"));
        wordList.add(new Word("China", "Китай"));
        wordList.add(new Word("Indonesia", "Индонезия"));
        wordList.add(new Word("Japan", "Япония"));
        wordList.add(new Word("Russia", "Россия"));
        wordList.add(new Word("Spain", "Испания"));
        wordList.add(new Word("Turkey", "Турция"));
        wordList.add(new Word("The UK", "Соединенное Королевство"));
        wordList.add(new Word("The USA", "Соединенные Штаты Америки"));
    }

    public void createDictionaryWordsNumbers() {
        wordList.add(new Word("numbers", "числа"));
        wordList.add(new Word("one", "один"));
        wordList.add(new Word("two", "два"));
        wordList.add(new Word("three", "три"));
        wordList.add(new Word("four", "четыре"));
        wordList.add(new Word("five", "пять"));
        wordList.add(new Word("six", "шесть"));
        wordList.add(new Word("seven", "семь"));
        wordList.add(new Word("eight", "восемь"));
        wordList.add(new Word("nine", "девять"));
        wordList.add(new Word("ten", "десять"));
    }

    public void createDictionaryWordsCountries() {
        wordList.add(new Word("countries", "страны"));
        wordList.add(new Word("Australia", "Австралия"));
        wordList.add(new Word("Brazil", "Бразилия"));
        wordList.add(new Word("China", "Китай"));
        wordList.add(new Word("Indonesia", "Индонезия"));
        wordList.add(new Word("Japan", "Япония"));
        wordList.add(new Word("Russia", "Россия"));
        wordList.add(new Word("Spain", "Испания"));
        wordList.add(new Word("Turkey", "Турция"));
        wordList.add(new Word("The UK", "Соединенное Королевство"));
        wordList.add(new Word("The USA", "Соединенные Штаты Америки"));
    }
}
