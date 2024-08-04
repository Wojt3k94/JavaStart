package metody;

public class ComputerStore {

    public static void main(String[] args) {
//        ComputerFactory factory = new ComputerFactory();
//        Computer computer1 = factory.computer("Intel I3", 4048);


        Computer computer1 = new Computer("Intel I5");
//        computer1.procesor = "Intel I5";
//        computer1.memory = 2024;
//            Computer computer2 = factory.computer("AMD", 16_424);
        Computer computer2 = new Computer( "AMD");
        computer2.memory = 16_384;

//        System.out.println(computer1.memory);
//        System.out.println(computer1.procesor);
//        System.out.println(computer2.procesor);
//        System.out.println(computer2.memory);
//        computer1.printInfo();
//        computer2.printInfo();
        computer1.printInfo();
        computer2.printInfo();
        ComputerUpgrade computerUpgrade = new ComputerUpgrade();
        computerUpgrade.addMemory(computer1, 2000);
        computer1.printInfo();

    }

}
