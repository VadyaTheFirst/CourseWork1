public class Main {



    public static void main(String[] args) {


        Employee[] Employees = new Employee[10];
        Employees[0]=new Employee("Василий","Андреевич","ХХХ",1200,5);
        Employees[1]=new Employee("Александр","Андреевич","УУУ",1000,1);
        Employees[2]=new Employee("Сергей","Федорович","ЗЗЗ",12000,4);
        Employees[3]=new Employee("Василий","Андреевич","ХХХ",200,5);
        Employees[4]=new Employee("Александр","Андреевич","УУУ",1000,1);
        Employees[5]=new Employee("Алеся","Николаевна","ЗаЗ",15000,4);
        Employees[6]=new Employee("Кирилл","Андреевич","ХХу",1200,5);
        Employees[7]=new Employee("Александр","Андреевич","УУУ",1000,1);
        Employees[8]=new Employee("Колян","Федорович","ЗЗЗ",12000,4);
        Employees[9]=new Employee("Виктор","Андреевич","АХХА",1200,5);



        EmployeesAction.employeesCout(Employees);
        EmployeesAction.sumSalary(Employees);
        EmployeesAction.maxSalary(Employees);
        EmployeesAction.minSalary(Employees);
        EmployeesAction.avarageSalary(Employees);


        Employees[2].setSalary(50000f);
        Employees[2].setDepartement(2);
        Employees[0].setFirstName("Владимир");
        Employees[2].setLastName("Олигарх");

        EmployeesAction.employeesCout(Employees);
        EmployeesAction.sumSalary(Employees);
        EmployeesAction.maxSalary(Employees);
        EmployeesAction.minSalary(Employees);
        EmployeesAction.avarageSalary(Employees);

        //Повышеннаяя сложность
        float percent=0.5f;
        EmployeesAction.allPercentSalary(Employees,percent);
        byte number=5;

        EmployeesAction.departmentPeople(Employees,number);
        EmployeesAction.departmentSalarySum(Employees,number);
        EmployeesAction.departmentMaxSalary(Employees,number);
        EmployeesAction.departmentMinSalary(Employees,number);
        EmployeesAction.departmentAvarageSalary(Employees,number);
        percent=0.2f;
        EmployeesAction.departmentAddPercentSalary(Employees,number,percent);
        float highSalary=20_000f;
        EmployeesAction.compareHigherSalary(Employees,highSalary);
        float lowSalary=10_000f;
        EmployeesAction.compareLowerSalary(Employees,lowSalary);

    }

}