package Unidad01.Actividad04.PasoPorReferencia;

public class Main {
    public static void ChangeBox(Box newBox){
        newBox.Size = 20;
    }
    public static void main(String[] args) {
        Box box = new Box (50);
        System.out.println(box.Size);
        ChangeBox(box);
        System.out.println(box.Size);
    }
}
