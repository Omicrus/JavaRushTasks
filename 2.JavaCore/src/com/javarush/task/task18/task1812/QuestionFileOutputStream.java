package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream variable;


    public QuestionFileOutputStream() {

    }

    public QuestionFileOutputStream(AmigoOutputStream name) {
        this.variable = name;
    }

    public static void main(String[] args) throws IOException {
        QuestionFileOutputStream bb = new QuestionFileOutputStream();
        bb.close();
    }

    @Override
    public void flush() throws IOException {
        variable.flush();

    }

    @Override
    public void write(int b) throws IOException {
        variable.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        variable.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        variable.write(b, off, len);
    }

    @Override
    public void close() throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st;
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");

        st = br.readLine();
        if (st.equals("Д")) {
            //br.close();
            variable.close();
        }
        if (st.equals("Н")) {

        }


    }
}

