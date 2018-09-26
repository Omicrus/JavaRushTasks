package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
Параметр конструктора - название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
          books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public static class MarkTwainBook extends Book {
        private String title;
      /*.
3. В классе MarkTwainBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
4. Конструктор класса MarkTwainBook должен вызывать конструктор класса предка (Book) с параметром "Mark Twain".
5. Метод getBook в классе MarkTwainBook должен иметь тип возвращаемого значения MarkTwainBook и возвращать текущий объект.*/

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static class AgathaChristieBook extends Book {
        private String title;
      /*.
3. В классе MarkTwainBook должен быть корректно реализован конструктор с одним параметром типа String (название книги).
4. Конструктор класса MarkTwainBook должен вызывать конструктор класса предка (Book) с параметром "Mark Twain".
5. Метод getBook в классе MarkTwainBook должен иметь тип возвращаемого значения MarkTwainBook и возвращать текущий объект.*/

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "output";
            //Add your code here
            if (getBook() instanceof MarkTwainBook) {
                output = markTwainOutput;
            } else if (getBook() instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            }
            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
