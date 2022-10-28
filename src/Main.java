public class Main {



    public static void main(String[] args) {


        Employee[] Employees = new Employee[3];
        Employees[0]=new Employee("Василий","Андреевич","ХХХ",1200,5);
        Employees[1]=new Employee("Александр","Андреевич","УУУ",1000,1);
        Employees[2]=new Employee("Сергей","Федорович","ЗЗЗ",12000,4);
        EmployeesAction.EmployeesCout(Employees);
        EmployeesAction.SumSalary(Employees);
        EmployeesAction.MaxSalary(Employees);
        EmployeesAction.MinSalary(Employees);
        EmployeesAction.AvarageSalary(Employees);


        Employees[2].setSalary(50000f);
        Employees[2].setDepartement(2);
        Employees[0].setFirstName("Владимир");
        Employees[2].setLastName("Олигарх");

        EmployeesAction.EmployeesCout(Employees);
        EmployeesAction.SumSalary(Employees);
        EmployeesAction.MaxSalary(Employees);
        EmployeesAction.MinSalary(Employees);
        EmployeesAction.AvarageSalary(Employees);
    }

}