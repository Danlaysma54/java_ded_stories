package org.example;

import java.util.Iterator;

public class Group implements Iterable<Integer> {
    int group_id;
    int[] information;

    public Group(int group_id, int... information) {
        this.information = new int[information.length];
        System.arraycopy(information, 0, this.information, 0, information.length);
        this.group_id = group_id;
    }


    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int[] getInformation() {
        return information;
    }

    public void setInformation(int index, int information) {
        this.information[index] = information;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int CurrInd;

            @Override
            public boolean hasNext() {
                return this.CurrInd < information.length;
            }

            @Override
            public Integer next() {
                return information[this.CurrInd++];
            }
        };
    }
}
