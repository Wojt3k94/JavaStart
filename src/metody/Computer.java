package metody;

public class Computer {

    String procesor;
    int memory;

    Computer(String proc) {
        procesor = proc;

    }

    void printInfo() {
        System.out.println(procesor + " " + memory);
    }

//    String getInfo(){
//        String description = procesor + " " + memory;
//        return description;
//    }

}
