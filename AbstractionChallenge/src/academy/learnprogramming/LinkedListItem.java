package academy.learnprogramming;

import java.util.LinkedList;
import java.util.List;

public class LinkedListItem extends ListItem{

    private int size;
    private ListItem first;
    private ListItem last;

    public LinkedListItem(ListItem rightLink, ListItem leftLink, Object value, int size) {
        super(rightLink, leftLink, value);
        this.size = size;
    }

    //    public LinkedListItem() {
//        this.size = 0;
//        this.first = null;
//        this.last = null;
//    }

    /*public boolean add(Object value) {
        if (size == 0) {
            //ListItem newItem = new ListItem();
            super.value = this.currentValue;
            return true;
        }
        this.currentValue = value;
        super.value = this.currentValue;
        super.
    }*/


    @Override
    public void moverRight() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public int compareTo(ListItem listItem) {
        return 0;
    }

    public void addItem(Object item) {
        value = item;
        moverRight();
    }
}
