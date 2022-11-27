package printer;

public class Printer {

    public Printer() {
    }

    public void print(String value) {
        System.out.println("value: " + value);
    }

    public static void main(String[] args) {
        Printer obj1 = new SubClass1();
        System.out.println("SubClass1:");
        obj1.print("Red Message");              // повідомлення похідного класу 1 червоним кольором
        Printer obj2 = new SubClass2();
        System.out.println("SubClass2:");       // повідомлення похідного класу 2 бірюзовим кольором
        obj2.print("Turquoise Message");
/*        SubClass1 subClass1 = new SubClass1();
        subClass1.print("dfjkdjf");*/
    }
}

class SubClass1 extends Printer {
    @Override
    public void print(String value) {
        System.out.println((char) 27 + "[31m" + value + (char) 27 + "[38m");
    }
}

class SubClass2 extends Printer {
    @Override
    public void print(String value) {
        System.out.println((char) 27 + "[36m" + value + (char) 27 + "[38m");
    }
}



