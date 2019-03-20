package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {

    private FileWriter fileWriter;


    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);

    }


    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }


    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }


    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }


    public FileConsoleWriter(FileDescriptor fd) {
        this.fileWriter = new FileWriter(fd);
    }

    public static void main(String[] args) throws IOException {
        FileConsoleWriter fileConsoleWriter = new FileConsoleWriter("data.txt");
        // char[] list = "mama coace piine".toCharArray();
        fileConsoleWriter.write("mama coace piine", 1, 5);
        fileConsoleWriter.close();

    }

    public void write(int c) throws IOException {
        this.fileWriter.write(c);
        System.out.println(c);
    }


    public void write(String str) throws IOException {
        this.fileWriter.write(str);
        System.out.println(str);
    }


    public void write(char[] cbuf, int off, int len) throws IOException {
        this.fileWriter.write(cbuf, off, len);
        for (int i = 0; i < len; i++) {
            System.out.print(cbuf[off + i]);
        }
    }

    //todo public void write(String str, int off, int len)
    public void write(String str, int off, int len) throws IOException {
        this.fileWriter.write(str, off, len);
        char[] text = str.toCharArray();
        for (int i = 0; i < len; i++) {
            System.out.print(text[off + i]);
        }


       //  System.out.print(str.substring(off, len + 1));
    }


    public void write(char[] cbuf) throws IOException {
        this.fileWriter.write(cbuf);
        for (int i = 0; i < cbuf.length; i++) {
            System.out.print(cbuf[i]);
        }
    }

    public void close() throws IOException {
        fileWriter.close();
    }
}
