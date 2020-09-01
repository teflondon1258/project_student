import java.util.Objects;

public class Student extends Person implements Staff {
    public String name;
    public String surname;
    public int age;

    public int group;
    public int completedTasks;
    public int completedModules;
    public boolean experienced;
    public String goal;
    public static int taskCountForAll;


    public Student(String name, String surname, int age, int group, int completedTasks, int completedModules, boolean experienced, String goal) {
        super(name, surname, age);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.completedTasks = completedTasks;
        this.completedModules = completedModules;
        this.experienced = experienced;
        this.goal = goal;
        taskCountForAll++;
    }

    public Student(String name, String surname, int age) {
        this(name, surname, age,
                0,
                0,
                0,
                false,
                "wanna be the coolest developer on planet!");

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void solveTask() {
        System.out.println("The task is solved!");
        taskCountForAll++;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(int completedTasks) {
        this.completedTasks = completedTasks;
    }

    public int getCompletedModules() {
        return completedModules;
    }

    public void setCompletedModules(int completedModules) {
        this.completedModules = completedModules;
    }

    public boolean isExperienced() {
        return experienced;
    }

    public void setExperienced(boolean experienced) {
        this.experienced = experienced;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public static int getTaskCountForAll() {
        return taskCountForAll;
    }

    public static void setTaskCountForAll(int taskCountForAll) {
        Student.taskCountForAll = taskCountForAll;
    }

    public static final int MAX_MODULE_COUNT = 20;

    public void passModule() {
        if (completedModules < MAX_MODULE_COUNT) {
            completedModules++; //поле хранит информацию о том, сколько модулей прошёл студент      System.out.println("Модуль пройден");
        } else {
            System.out.println("Все модули пройдены!");
        }
    }

    @Override
    public void helpStudent() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                group == student.group &&
                name.equals(student.name) &&
                surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, group);
    }
}
