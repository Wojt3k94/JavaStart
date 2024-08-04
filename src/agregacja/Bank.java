package agregacja;

public class Bank {

    public static void main(String[] args) {


        Person person1 = new Person(); // tworzymy obiekt osoby
        Adress adress1residence = new Adress();
        Adress adress1checIn = new Adress();

        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "987676543";
        person1.residence = adress1residence;
        person1.residence.street = "Pyszna";
        person1.residence.city = "Wrocław";
        person1.checkIn = adress1residence;

        Person person2 = new Person();
        Adress adress2residence = new Adress();
        Adress adress2checkIn = new Adress();

        person2.firstName = "Maciek";
        person2.lastName = "Teraz";
        person2.pesel = "987676543";
        person2.residence = adress2residence;
        person2.residence.street = "Pyszna";
        person2.residence.city = "Wrocław";
        person2.checkIn = adress2checkIn;
        person2.checkIn.street = "Szarych";
        person2.checkIn.city ="Opole";


//        person1.aptNumber = 30;
//        person1.city = "Wrocław";

        BankAccount account1 = new BankAccount();

        account1.owner = person1;
        account1.balance = 2115;

        Credit credit1 = new Credit();

        credit1.borrower = person1;
        credit1.cashBorrowed = 111;
        credit1.cashReturned = 11;
        credit1.interestRate = 0.10;
        credit1.termMonth = 12;

        System.out.println("Person1");
        System.out.println(person1.firstName);
        System.out.println(person1.lastName);
        System.out.println("Adres zamieszkania: ");
        System.out.println(person1.residence.street);
        System.out.println(person1.residence.city);
        System.out.println("Adres zameldowania: ");
        System.out.println(person1.checkIn.street);
        System.out.println(person1.checkIn.city);
        System.out.println("Kowta konta bankowego:");
        System.out.println(account1.balance);
        System.out.println("Kowta pożyczki: ");
        System.out.println(credit1.cashBorrowed);

        System.out.println("Person2");
        System.out.println(person2.firstName);
        System.out.println(person2.lastName);
        System.out.println("Adres zamieszkania: ");
        System.out.println(person2.residence.street);
        System.out.println(person2.residence.city);
        System.out.println("Adres zameldowania: ");
        System.out.println(person2.checkIn.street);
        System.out.println(person2.checkIn.city);
        System.out.println("Kowta konta bankowego:");
        System.out.println(account1.balance);
        System.out.println("Kowta pożyczki: ");
        System.out.println(credit1.cashBorrowed);

    }

}
