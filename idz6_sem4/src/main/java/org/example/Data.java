package org.example;

import java.util.Iterator;

public class Data implements Iterable<Integer> {
    String name;
    Group[] bunch_of_groups;

    public Data(String name, Group... bunch_of_groups) {
        this.bunch_of_groups = new Group[bunch_of_groups.length];
        System.arraycopy(bunch_of_groups, 0, this.bunch_of_groups, 0, bunch_of_groups.length);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Group[] getBunch_of_groups() {
        return bunch_of_groups;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBunch_of_groups(Group group, int index) {
        this.bunch_of_groups[index] = group;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int currIndexData;
            private int CurrIndexGroup;

            @Override
            public Integer next() {
                if (bunch_of_groups[this.currIndexData].information.length > CurrIndexGroup && bunch_of_groups[this.currIndexData].information.length > 0) {
                    return bunch_of_groups[this.currIndexData].information[this.CurrIndexGroup++];
                } else {
                    this.CurrIndexGroup = 0;
                    return bunch_of_groups[++this.currIndexData].information[this.CurrIndexGroup++];
                }
            }

            @Override
            public boolean hasNext() {
                return currIndexData + 1 < bunch_of_groups.length || CurrIndexGroup < bunch_of_groups[currIndexData].information.length;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException(
                        "Cannot remove an item from immutable collection");
            }
        };
    }
}
