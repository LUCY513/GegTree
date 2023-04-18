public class Human {
    // Создаем приватные поля, что бы их нельзя было изменить из вне
    private String name;                // Имя
    private String surname;             // Фамилия
    private String age;                 // Возраст

    public Human(String name, String surname, String age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
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

    // Переопреоделяем метод toString для вывода связей
    @Override
    public String toString() {
        return "Human {" + "name = " + name + '\'' + ", surname = " + surname + '\'' + '}';
    }
}
