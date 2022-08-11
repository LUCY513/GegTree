public class Human {
    // Создаем приватные поля, что бы их нельзя дыло изменить из вне
    private String name;                // Имя
    private String surname;             // Фамилия
    private String age;                 // Возраст

    // Методы get позволяющие получить информацию полей
    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getAge(){
        return age;
    }

    public Human(String name, String surname, String age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Переопреоделяем метод toString для вывода связей
    @Override
    public String toString() {
        return "Human {" + "name = " + name + '\'' + ", surname = " + surname + '\'' + '}';
    }
}
