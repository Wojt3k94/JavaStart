public class Person {
    private static int peopleNumber = 0;
    private int peopleInstanceNumber = 0;

    Person(){
        peopleNumber++;
        peopleInstanceNumber++;
    }


    public static void main(String[] args) {
        var person1 = new Person();
        var person2 = new Person();
        var person3 = new Person();


        System.out.println(person1.peopleNumber);
        System.out.println(person2.peopleNumber);
        System.out.println(person1.peopleInstanceNumber);
        System.out.println(person2.peopleInstanceNumber);


    }

}
