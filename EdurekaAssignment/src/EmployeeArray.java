import java.util.Scanner;

public class EmployeeArray {
    public static void main(String[] args) {
        int x;

        Scanner input1 = new Scanner(System.in);
        System.out.println("enter the number of records that you want to insert:");
        x = input1.nextInt();
        int[] employee_id = new int[x];
        String[] employee_name = new String[x];
        int[] employee_salary = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("\nEnter the employee ID");
            employee_id[i] = input1.nextInt();
            System.out.println("\nEnter the employee name");
            employee_name[i] = input1.next();
            System.out.println("\nEnter the employee salary");
            employee_salary[i] = input1.nextInt();

        }

        display(employee_id,employee_name, x);

    }

    private static void display(int[] employee_id, String[] employee_name, int[] employee_salary, int x) {
        for(int i=0; i<x; i++)
        {
            System.out.println("\n"+ "Employee ID"+ "Employee Name"+ "Employee Salary");
            System.out.println("\n" +"00"+ employee_id[i] +" "+ employee_name[i]+" "+ employee_salary[i]);
        }
    }
    private static void display(int[] employee_id, String[] employee_name, int x) {
        for(int i=0; i<x; i++)
        {
            System.out.println("\n"+ "Employee ID"+ "Employee Name");
            System.out.println("\n" +"00"+ employee_id[i] +" "+ employee_name[i]+" ");
        }
    }
}
