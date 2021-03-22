package Ch1;

public class MainAPP {

    public static void main(String[] args) {

        Double data1[] = {3.0, 5.0, 1.0, 2.0, 4.0};
        show(data1);

        Person persons[] = {
            new student("Ahmed", "SE", 88.9),
            new Employee("Ali", "Sales", 999.8),
            new student("Huda", "CS", 79.6)    
        };
        
        show(persons);
        
    }

    public static <T> void show(T data[]) {

        for (T d : data) {
            System.out.println(d);
        }

    }

}
