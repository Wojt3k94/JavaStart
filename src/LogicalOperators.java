public class LogicalOperators {

    public static void main(String[] args) {
        int x = -5;
        int y = 10;

        System.out.println("Czy x jest mniejsze od zera lub Y jest większe od zera");
        System.out.println(x < 0);
        System.out.println(y > 0);
        //Alternatywa || lub jedenn z warunkow musi być true
        System.out.println(x < 0 || y > 0);
        // koniunkcja && oby dwa warunki muszą być prawdą
        System.out.println(x < 0 && y > 0);
    }

}
