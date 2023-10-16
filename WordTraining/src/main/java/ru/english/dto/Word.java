package ru.english.dto;

public class Word {

    private String englishName;
    private String russianName;

    public Word(String englishName, String russianName) {
        this.englishName = englishName;
        this.russianName = russianName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getRussianName() {
        return russianName;
    }
}
