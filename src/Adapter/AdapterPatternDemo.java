package Adapter;

public class AdapterPatternDemo {
    public static void main(String args[]){
        Employee emp1 = new Employee("Suradid", "Chao", 1, 10000.00);
        Employee emp2 = new Employee("Patrick", "Suphalawut", 2, 20000.00);
        Employee emp3 = new Employee("Taeshawit", "Suwanwigo", 3, 30000.00);
        Employee emp4 = new Employee("Monrada", "Juycharoen", 4, 40000.00);


        System.out.println("========================Records Test============================");
        RecordsBehavior records = new Records();
        System.out.println("-------Print all employee in records(Test Add Employee)-------");
        records.insert(emp1);
        records.insert(emp2);
        records.insert(emp3);
        records.printAllEmployee();
        System.out.println();

        System.out.println("-------Print all employee in records(Test Remove Employee)-------");
        records.remove(2);
        records.printAllEmployee();
        System.out.println();

        System.out.println("-------Test is employee(true)-------");
        System.out.println(records.isEmployee(1));

        System.out.println("-------Test is employee(false)-------");
        System.out.println(records.isEmployee(2));
        System.out.println();

        System.out.println("========================Database Adapter Test============================");
        RecordsBehavior databaseAdapter = new DatabaseAdapter();
        System.out.println("-------Print all employee in records(Test Add Employee)-------");
        databaseAdapter.insert(emp1);
        databaseAdapter.insert(emp2);
        databaseAdapter.insert(emp3);
        databaseAdapter.printAllEmployee();
        System.out.println();

        System.out.println("-------Print all employee in records(Test Remove Employee)-------");
        databaseAdapter.remove(3);
        databaseAdapter.printAllEmployee();
        System.out.println();

        System.out.println("-------Test is employee(true)-------");
        System.out.println(databaseAdapter.isEmployee(1));

        System.out.println("-------Test is employee(false)-------");
        System.out.println(databaseAdapter.isEmployee(3));
        System.out.println();










    }
}
