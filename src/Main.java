import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in).useLocale(Locale.US))
        {
            List<Employee> employees = new ArrayList<>();
            int numberOfEmployee = 0;
            System.out.print("Enter the number of employees: ");
            numberOfEmployee = sc.nextInt();
            sc.nextLine();
            for(int i = 0; i < numberOfEmployee; i++)
            {
                System.out.printf("Employee #%d data: \n", i+1);
                System.out.print("Outsourced (y/n)? ");
                char optionOutsourced = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String employeeName = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                sc.nextLine();
                if(optionOutsourced == 'y' || optionOutsourced == 'Y')
                {
                    System.out.print("Additional charge: ");
                    Double additionalCharge = sc.nextDouble();
                    sc.nextLine();
                    employees.add(new OutsourcedEmployee(employeeName, hours, valuePerHour, additionalCharge));
                }
                else
                {
                    employees.add(new Employee(employeeName, hours, valuePerHour));
                }
            }
            System.out.println();
            System.out.print("PAYMENTS: \n");
            for(Employee e : employees)
            {
                System.out.println(e);
            }

        }

    }
}