package src.Analisis;

public class MainEmployee {
    public static void main(String[] args) { 
    Manager boss = new Manager("Steven", 80000, 1987, 12, 15);

    // Manager manager = new Manager("Isri");
    // System.out.println("Manager name : " + manager.getName());

    boss.setBonus(5000);
    Employee staff = new Employee("Donni", 50000, 1989, 10, 1);
    System.out.println("nama boss : "+boss.getName()+", salary = "+boss.getSalary());
    System.out.println("nama staff : "+staff.getName()+", salary = "+staff.getSalary());
    }
}
