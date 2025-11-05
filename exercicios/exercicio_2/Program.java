package exercicio_2;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new List<>();

        System.out.println(list);

        list.addAtStart(21);
        list.addAtStart(60);
        list.addAtStart(80);
        list.addAtStart(90);

        System.out.println(list);

        list.addAtEnd(50);

        System.out.println(list);
    }
}
