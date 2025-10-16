package lista_1;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new List<>();

        System.out.println(list);

        list.addAtStart(21);
        list.addAtStart(60);
        list.addAtStart(80);
        list.addAtStart(90);

        System.out.println(list);

        list.addAtEnd(150);

        System.out.println(list);

        list.addAtIndex(50, 2);

        System.out.println(list);

        System.out.println(list.existValue(150));
        System.out.println(list.getIndex(21));

        System.out.println(list.getElementByIndex(8));

        System.out.println(list);

        System.out.println(list.removeAtStart());

        System.out.println(list);

        System.out.println(list.removeAtEnd());

        System.out.println(list);

        System.out.println(list.removeAtIndex(0));

        System.out.println(list);
    }
}
