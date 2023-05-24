package com.codizer.iterator.example5;

import java.util.Iterator;

public class Backpack implements Iterable<String> {

    private String space1;
    private String space2;
    private String space3;
    private String space4;
    private int position = 0;
    private int counter = 0;

    public Backpack() { }

    public String getSpace1() {
        return space1;
    }

    public void setSpace1(String space1) {
        this.space1 = space1;
        this.counter++;
    }

    public String getSpace2() {
        return space2;
    }

    public void setSpace2(String space2) {
        this.space2 = space2;
        this.counter++;
    }

    public String getSpace3() {
        return space3;
    }

    public void setSpace3(String space3) {
        this.space3 = space3;
        this.counter++;
    }

    public String getSpace4() {
        return space4;
    }

    public void setSpace4(String space4) {
        this.space4 = space4;
        this.counter++;
    }

    @Override
    public Iterator<String> iterator() {

        return new Iterator() {

            @Override
            public boolean hasNext() {
                if (Backpack.this.position >= 4) {
                    position = 0;
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public Object next() {

                if (Backpack.this.counter != 0) {

                    if (Backpack.this.position == 0 && Backpack.this.space1 != null) {
                        Backpack.this.position++;
                        return space1;
                    }

                    if (Backpack.this.position == 1 && Backpack.this.space2 != null) {
                        Backpack.this.position++;
                        return space2;
                    }

                    if (Backpack.this.position == 2 && Backpack.this.space3 != null) {
                        Backpack.this.position++;
                        return space3;
                    }

                    if (Backpack.this.position == 3 && Backpack.this.space4 != null) {
                        Backpack.this.position++;
                        return space4;
                    }

                }

                throw new IndexOutOfBoundsException();
            }
        };
    }
}
