public class Company {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee.imie = "Wojtek";
        employee.nazwisko = "Brozynski";
        employee.rokuUrodzenia = 1994;
        employee.stazPracy = 2.7;

        System.out.println(employee.imie);
        System.out.println(employee.nazwisko);
        System.out.println(employee.rokuUrodzenia);
        System.out.println(employee.stazPracy);

        employee1.imie = "Jan";
        employee1.nazwisko = "Bart";
        employee1.rokuUrodzenia = 1995;
        employee1.stazPracy = 1.1;

        System.out.println(employee1.imie);
        System.out.println(employee1.nazwisko);
        System.out.println(employee1.rokuUrodzenia);
        System.out.println(employee1.stazPracy);

        employee2.imie = "Pawe";
        employee2.nazwisko = "Marek";
        employee2.rokuUrodzenia = 1993;
        employee2.stazPracy = 4.7;

        System.out.println(employee2.imie);
        System.out.println(employee2.nazwisko);
        System.out.println(employee2.rokuUrodzenia);
        System.out.println(employee2.stazPracy);

    }

}
