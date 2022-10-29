public class EmployeesAction {

    public static byte lengthCount(Employee[]arr) {
        byte k=0;
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] !=null) {
                k++;
            }
        }
        return k;
    }
//Возможно, понадобиться узнать какие сотрудники имеют пустые поля (сотрудник уволился,или не был внесен, а идентификатор остался
    public  static void nullCout(Employee[] arr){
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] ==null) {
               throw  new NullPointerException("Нет данных о сотруднике с идентификаторром "+i);
            }
        }
    }


    public static void employeesCout(Employee[] arr) {
        for (byte i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public  static float sumSalary(Employee[] arr){
        float sum=0f;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]!=null) {
                sum += arr[i].getSalary();
            }
        }
        System.out.println("Сумарная зарплата: "+sum);
        return sum;
    }

    public  static void maxSalary(Employee[] arr){
        float max=0f;
        byte k=0;
        for (byte i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()) {
                    max = arr[i].getSalary();
                    k = i;
                }
            }
        }
        System.out.println("Максимальная зарплата у "+ arr[k]);
    }

    public  static void minSalary(Employee[] arr){
        float min=0f;
        byte k=0;
        for (byte i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
            {
                if (min>arr[i].getSalary()){
                    min=arr[i].getSalary();
                    k=i;
                }
                }
            }
        }
        System.out.println("Минимальная зарплата у "+ arr[k]);
    }

    public  static void avarageSalary(Employee[] arr){
        var l=lengthCount(arr);
        var averageSalary=EmployeesAction.sumSalary(arr)/ l;
        System.out.println("Средняя зарплата: "+ averageSalary);
    }

}
