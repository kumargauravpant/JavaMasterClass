package academy.learnprogramming;

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    public Object value;

    public ListItem(ListItem rightLink, ListItem leftLink, Object value) {
        this.rightLink = rightLink;
        this.leftLink = leftLink;
        this.value = value;
    }

    public void setLeftLink(ListItem leftLink) {
        this.leftLink = leftLink;
    }

    /*public void setValue(Object value) {
        this.value = value;
    }*/

    public abstract void moverRight();
    public abstract void moveLeft();
    public abstract int compareTo(ListItem listItem);

}
