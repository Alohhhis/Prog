@Company
public class CustomAnnotatedEmployee {
    //рандом поля у класса
    private int id;
    private String name;
//конструктор

    /**
     * TODO my comment
     */
    public CustomAnnotatedEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //функция вывода инфы
    public void getEmployeeDetails(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
    }
}
//передаёт инфу о компании
