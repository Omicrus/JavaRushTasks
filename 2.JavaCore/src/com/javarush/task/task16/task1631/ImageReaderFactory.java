package com.javarush.task.task16.task1631;


import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    /* Метод getImageReader должен создавать и возвращать подходящий Reader.
7. Метод getImageReader должен кидать исключение IllegalArgumentException, если передан неправильный параметр.
4.2. Если передан неправильный параметр, то выбрасывать исключение IllegalArgumentException("Неизвестный тип картинки").*/
    public static ImageReader getImageReader(ImageTypes name) {

        if (name != null){
            if (name.equals(ImageTypes.BMP)) {
                //  System.out.println("bmp");
                return new BmpReader();
            }
            if (name.equals(ImageTypes.JPG)) {
                //     System.out.println("jpg");
                return new JpgReader();
            }
            if (name.equals(ImageTypes.PNG)) {
                //    System.out.println("png");
                return new PngReader();
            }
        } else throw new IllegalArgumentException("Неизвестный тип картинки");

        return null;
    }
}
