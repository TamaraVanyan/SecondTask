package Bany;


class Box {
    int with;
    int height;
    int depth;
}

class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        myBox.with = 10;
        myBox.height = 4;
        myBox.depth = 8;
        vol = myBox.depth * myBox.height * myBox.with;
        System.out.println(vol);
    }

}
