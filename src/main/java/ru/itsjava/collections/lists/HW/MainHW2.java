package ru.itsjava.collections.lists.HW;

import java.util.ArrayList;
import java.util.List;

public class MainHW2 {
    public static void main(String[] args) {

        Book thinkingFastAndSlow = new Book("Thinking, Fast And Slow", "Daniel Kahneman", 499);
        Book mindsetTheNewPsychologyOfSuccess = new Book("Mindset: The New Psychology of Success", "Carol Dweck", 320);
        Book shoeDogMemoirByTheCreatorOfNike = new Book("Shoe dog: Memoir by the Creator of Nike", "Phil Knight", 386);
        Book zeroToOneNotesOnStartupsOrHowToBuildTheFuture = new Book("Zero to One: Notes on Startups, or How to Build the Future", "Peter Thiel", 100);
        Book hitMakersTheScienceOfPopularityInAnAgeOfDistraction = new Book("Hit Makers: The Science of Popularity in an Age of Distraction", "Derek Thompson", 352);
        Book java1 = new Book("Java", "Adam Alter", 368);
        Book java2 = new Book("Java", "Chip Heath, Dan Heath", 320);
        Book java3 = new Book("Java", "Jim Collins", 400);
        Book java4 = new Book("Java", "Tony Hsieh", 272);

        List<Book> bookList = new ArrayList<>();

        bookList.add(thinkingFastAndSlow);
        bookList.add(mindsetTheNewPsychologyOfSuccess);
        bookList.add(shoeDogMemoirByTheCreatorOfNike);
        bookList.add(zeroToOneNotesOnStartupsOrHowToBuildTheFuture);
        bookList.add(hitMakersTheScienceOfPopularityInAnAgeOfDistraction);

        //Хаотично в список добавить 4 книги с названием "Java"
        bookList.add(0, java1);
        bookList.add(1, java2);
        bookList.add(3, java3);
        bookList.add(4, java4);

        System.out.println("Коллекция bookList состоит из:");
        int index1 = 0;
        for (Book bookElement : bookList) {
            System.out.print(index1 + ". ");
            System.out.println(bookElement);
            index1++;
        }

        System.out.println();

        //Отфильтровать список вернуть записи по некоторому условию: индекс делится на 3
        System.out.println("Отфильтровать список вернуть записи по некоторому условию: индекс делится на 3:");
        int index2 = 0;
        for (Book bookElement : bookList) {
            if (index2 % 3 == 0) {
                System.out.print(index2 + ". ");
                System.out.println(bookElement);
                index2++;
            } else {
                index2++;
            }
        }

        System.out.println();

        //Отфильтровать список вернуть записи по некоторому условию: вернуть количество книг, которые равны "Java"
        System.out.println("Отфильтровать список вернуть записи по некоторому условию: вернуть количество книг, которые равны Java:");
        int javaBookCount = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName() == "Java") {
                javaBookCount++;
            }
        }
        System.out.println("Книг с названием Java = " + javaBookCount);

        System.out.println();

        //Пропустить первые 3 книги в списке
        System.out.println("Пропустить первые 3 книги в списке:");
        int index3 = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (index3 < 3) {
                index3++;
            } else {
                System.out.print(index3 + ". ");
                System.out.println(bookList.get(index3));
                index3++;
            }
        }

        System.out.println();

        //Пропустить первые 2 книги, которые равные "Java"
        System.out.println("Пропустить первые 2 книги, которые равные Java:");
        int index4 = 0;
        int javaBookCount2 = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (javaBookCount2 < 2 && bookList.get(index4).getName() == "Java") {
                index4++;
                javaBookCount2++;
            } else {
                System.out.print(index4 + ". ");
                System.out.println(bookList.get(index4));
                index4++;
            }
        }

        System.out.println();

        //Возвратить первую книгу, длина автора которого делится на 3
        System.out.println("Возвратить первую книгу, длина автора которого делится на 3:");
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println("Первая книга, длина автора которого делится на 3: " + bookList.get(i) + ", длина автора = " + bookList.get(i).getAuthor().length());
                break;
            }
        }

        System.out.println();

        //Возвратить все книги, длина автора которых делится на 3
        System.out.println("Возвратить все книги, длина автора которых делится на 3:");
        int index5 = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().length() % 3 == 0) {
                System.out.print(index5 + ". ");
                System.out.println(bookList.get(index5) + ", длина автора = " + bookList.get(i).getAuthor().length());
                index5++;
            } else {
                index5++;
            }
        }

    }

}

