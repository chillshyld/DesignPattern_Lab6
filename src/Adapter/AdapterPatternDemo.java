package Adapter;

public class AdapterPatternDemo {
    public static void main(String args[]){
        Employee emp1 = new Employee("Suradid", "Chao", 1, 10000.00);
        Employee emp2 = new Employee("Patrick", "Suphalawut", 2, 20000.00);
        Employee emp3 = new Employee("Taeshawit", "Suwanwigo", 4, 40000.00);


        RecordsBehavior records = new Records();
        records.insert(emp1);
        records.insert(emp2);
        records.insert(emp3);
        records.printAllEmployee();





    }
}
