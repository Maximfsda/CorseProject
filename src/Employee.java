public class Employee {
    private String name,surname,patronymic;
    private int division;
    private int salary;
    private static int idCounter = 0;
    private int id;

    public Employee(String name, String surname, String patronymic, int division, int salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.division = division;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Employee.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name +" "+ surname +" "+ patronymic + "\n" +
                "Отдел-№" + division +"\n"+
                "ЗП-" + salary;
    }
}
