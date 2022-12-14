import java.lang.annotation.Annotation;

public class Main{

    public static void main(String[] args) {

        CustomAnnotatedEmployee employee = new CustomAnnotatedEmployee(1, "John Doe");
        employee.getEmployeeDetails();//объявление нового объекта и получение инфы о нём
        CustomAnnotatedEmployee employee2= new CustomAnnotatedEmployee(2, "Taco Bell");
        employee2.getEmployeeDetails();
        Annotation companyAnnotation = employee
                .getClass()//получение имени класса
                .getAnnotation(Company.class);//получение информации о навешенных аннотациях
        Company company = (Company)companyAnnotation;

        System.out.println("Company Name: " + company.name());
        for (int i=0;i<=10;i+=6){
            System.out.print(i--);
        }
        public int method(){
            int j=5;
        }
        public static void main()
    }
}