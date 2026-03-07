package Queue;

import javafx.print.Printer;

public class Printers<T> {
    T data;
    Printers(T data){
        this.data=data;
    }
    void printvalue(){
        System.out.println("date:"+data);
    }

    public static void main(String[] args) {
            Printers<Integer>integerPrinter=new Printers<>(1);
            Printers<String>stringPrinter=new Printers<>("java");
            Printers<Boolean>booleanPrinter=new Printers<>(true);
            Printers<Double>doublePrinter=new Printers<>(12.3);
            Printers<Float>floatPrinter=new Printers<>(1.2f);
            integerPrinter.printvalue();
            stringPrinter.printvalue();
            booleanPrinter.printvalue();
            doublePrinter.printvalue();
            floatPrinter.printvalue();
        }
    }



