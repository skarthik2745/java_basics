class Box {
    int length;
    int breadth;
    int height;

    void setDim(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    int volume() {
        return length * breadth * height;
    }

    boolean isEqual(Box b) {
        if (length == b.length && breadth == b.breadth && height == b.height)
            return true;
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Box blackBox = new Box();
        blackBox.setDim(6, 4, 3);

        Box woodBox = new Box();
        woodBox.setDim(30, 20, 30);

        Box b1 = blackBox;

        System.out.println("vol of black box is " + blackBox.volume());
        System.out.println("vol of wood box is " + woodBox.volume());
        System.out.println("blackBox == b1 " + blackBox.isEqual(b1));
        System.out.println("blackBox == woodBox " + blackBox.isEqual(woodBox));
    }
}