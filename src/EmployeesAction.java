public class EmployeesAction {


    public static void EmployeesCout(Employee[] arr) {
        for (byte i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public  static float SumSalary(Employee[] arr){
        float sum=0f;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].getSalary();
        }
        System.out.println("Сумарная зарплата: "+sum);
        return sum;
    }

    public  static void MaxSalary(Employee[] arr){
        var max=arr[0].getSalary();
        byte k=0;
        for (byte i = 1; i < arr.length; i++) {
            {
                if (max<arr[i].getSalary()){
                        max=arr[i].getSalary();
                        k=i;

            }
            }
        }
        System.out.println("Максимальная зарплата у "+ arr[k]);
    }

    public  static void MinSalary(Employee[] arr){
        var min=arr[0].getSalary();
        byte k=0;
        for (byte i = 1; i < arr.length; i++) {
            {
                if (min>arr[i].getSalary()){
                    min=arr[i].getSalary();
                    k=i;

                }
            }
        }
        System.out.println("Минимальная зарплата у "+ arr[k]);
    }

    public  static void AvarageSalary(Employee[] arr){
        var averageSalary=EmployeesAction.SumSalary(arr)/ arr.length;
        System.out.println("Средняя зарплата: "+ averageSalary);
    }


}
