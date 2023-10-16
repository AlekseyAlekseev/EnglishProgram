package ru.english.dto;

import java.util.Iterator;
import java.util.Scanner;

public class DictionaryWords {

    CollectionWords collectionWords = new CollectionWords();

    public DictionaryWords() {
    }


    /**
     * Метод запускает тест
     */
    public void startTest() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nЭта программа позволяет тренироваться в следующих направлениях:" +
                "\n\n1. Правописание слов на английском языке" +
                "\n1.1 Правописание чисел на английском языке" +
                "\n1.2 Правописание стран на английском языке" +
                "\n2. Перевод английских слов на русский язык" +
                "\n2.1 Перевод чисел на русский язык" +
                "\n2.2 Перевод стран на русский язык" +
                "\n3. Выйти из программы");
        System.out.println("\n\nВыберите чем хотите заняться и введите номер пункта в консоль:");
        System.out.print("\nПоле ввода: ");
        String choiceUser = scanner.nextLine();

            switch (choiceUser) {
                case "1" -> startSpellingTest(choiceUser);
                case "1.1" -> startSpellingTest(choiceUser);
                case "1.2" -> startSpellingTest(choiceUser);
                case "2" -> startTranslateTest(choiceUser);
                case "2.1" -> startTranslateTest(choiceUser);
                case "2.2" -> startTranslateTest(choiceUser);
                case "3" -> System.out.println("Вы вышли из программы.");
                default -> System.out.println("Выберите корректный пункт из меню");
            }
            scanner.close();
        }

    /**
     * Метод запускает тест по правописанию на английском языке
     */
    private void startSpellingTest(String choiceUser) {

        Scanner scanner = new Scanner(System.in);

        if (choiceUser.equals("1")) {
            collectionWords.createDictionaryWordsBeginnerUnit1();
        }
        if (choiceUser.equals("1.1")) {
            collectionWords.createDictionaryWordsNumbers();
        }
        if (choiceUser.equals("1.2")) {
            collectionWords.createDictionaryWordsCountries();
        }

        while (!collectionWords.getDictionaryWords().isEmpty()) {

            Iterator<Word> iterator = collectionWords.getDictionaryWords().iterator();

            while (iterator.hasNext()) {
                Word word = iterator.next();
                System.out.print("\nВведите на англ языке слово: " + word.getRussianName());
                System.out.print("\nПоле ввода: ");
                String inputUser = scanner.nextLine().toLowerCase();

                if (inputUser.equals(word.getEnglishName().toLowerCase())) {
                    System.out.println("\nВы правильно ввели слово: " + word.getEnglishName() + ". Поздравляем!");
                    iterator.remove();
                } else {
                    System.out.println("\nВы допустили ошибку! " +
                            "Слово " + word.getRussianName() + " по англ пишется: " + word.getEnglishName());
                }
            }
        }
        System.out.println("\n\nПоздравляем, вы разобрали все слова из теста!");
        scanner.close();
    }

    /**
     * Метод запускает тест по переводу слов с английского на русский
     */
    private void startTranslateTest(String choiceUser) {

        Scanner scanner = new Scanner(System.in);

        if (choiceUser.equals("2")) {
            collectionWords.createDictionaryWordsBeginnerUnit1();
        }
        if (choiceUser.equals("2.1")) {
            collectionWords.createDictionaryWordsNumbers();
        }
        if (choiceUser.equals("2.2")) {
            collectionWords.createDictionaryWordsCountries();
        }

        while (!collectionWords.getDictionaryWords().isEmpty()) {

            Iterator<Word> iterator = collectionWords.getDictionaryWords().iterator();

            while (iterator.hasNext()) {
                Word word = iterator.next();
                System.out.print("\nВведите перевод английского слова: " + word.getEnglishName());
                System.out.print("\nПоле ввода: ");
                String inputUser = scanner.nextLine().toLowerCase();

                if (inputUser.equals(word.getRussianName().toLowerCase())) {
                    System.out.println("\nВы правильно ввели перевод слова: " + word.getEnglishName() + ". Поздравляем!");
                    iterator.remove();
                } else {
                    System.out.println("\nВы допустили ошибку! " +
                            "Слово " + word.getEnglishName() + " по русски будет: " + word.getRussianName());
                }
            }
        }
        System.out.println("\n\nПоздравляем, вы разобрали все слова из теста!");
        scanner.close();
    }
}

