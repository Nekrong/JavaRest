package org.donstu.domain;

import java.io.Serializable;

public class Computer implements Serializable {
    private String room;
    private int row;
    private int computer;

    public Computer() {
    }

    public Computer(String room, int row, int computer) {
        this.room = room;
        this.row = row;
        this.computer = computer;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = this.room;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "computer{" +
                "room='" + room + '\'' +
                ", row=" + row +
                ", computer=" + computer +
                '}';
    }
}
