import java.util.ArrayList;
import java.util.List;

public class Printer {
    public static void main(String[] args) {

    }
    class Number{

    }
    class copy extends Number{

    }
    class rub extends Number{

    }

    class print<T extends Number>{
        List<T> purchase=new ArrayList<>();
        public void add(T price){
            purchase.add(price);
        }

        public void show(){
            for(T item : purchase){

            }
        }
    }
}

