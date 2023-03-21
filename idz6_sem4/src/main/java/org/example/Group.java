package org.example;

public class Group {
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
}
