package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
UnsupportedFileName
Измени класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt).
Например, first.txt или name.1.part3.txt.
Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать исключение UnsupportedFileNameException.
Подумай, что еще нужно сделать, в случае выброшенного исключения.
*/


public class TxtInputStream extends FileInputStream {
    static String fileName = "data.txt.exe";
    private FileInputStream fileInputStream;

    public TxtInputStream(FileInputStream fileInputStream) throws FileNotFoundException {
        super(fileName);
        this.fileInputStream = fileInputStream;

    }

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (fileName.endsWith(".txt")) {
            TxtInputStream.fileName = fileName;
        } else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        FileInputStream fileInputStream = new TxtInputStream(fileName);
    }
}

