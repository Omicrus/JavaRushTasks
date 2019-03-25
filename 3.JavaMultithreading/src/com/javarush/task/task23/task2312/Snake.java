package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

/*Надо:
        а) Передать в конструктор координаты головы змеи (x и y).
        б) создать в нем первый "кусочек змеи" (голову) и добавить его в коллекцию sections (ArrayList).
        в) isAlive выставить в true.
        г) не забудь в конструкторе инициализировать переменную sections. В null не много-то и добавишь!
        д) создать и реализовать метод int getX(). Метод должен вернуть координату Х головы змеи.
        е) создать и реализовать метод int getY(). Метод должен вернуть координату Y головы змеи.
        ж) еще добавить классу метод move()- он нам пригодится попозже.
        з) созданный конструктор должен быть публичным.*/

public class Snake {
    private List<SnakeSection> sections;
    private SnakeDirection direction;
    private boolean isAlive;

    public Snake(int x, int y) {
        sections = new ArrayList<>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;
    }

    public void move() {
        if ()
    }
    public void move(int x, int y){

    }


    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    //return health snake status
    public boolean isAlive() {
        return isAlive;
    }

    //return snake section , minimum 1 element {head}
    public List<SnakeSection> getSections() {
        return sections;
    }

    // return snake direction {UP,DOWN,LEFT,RIGHT}
    public SnakeDirection getDirection() {
        return direction;
    }

    //set direction of head snake
    public void setDirection(SnakeDirection sd) {
        this.direction = sd;
    }
}
