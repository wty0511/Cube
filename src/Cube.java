public class Cube {
    int length;
    String color;

    Cube(int length, String color) {
        this.length = length;
        this.color = color;
    }
    void show(){
        System.out.println("length="+length);
        System.out.println("color="+color);
    }

    public static void main(String[] args) {
        Cube cube1=new Cube(3,"Green");
        cube1.show();

    }

}
