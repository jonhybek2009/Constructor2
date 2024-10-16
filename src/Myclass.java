class MyClass {
    String name;
    String surname;
    int age;
    String[] lessons;
    String favoriteFood = "Шаурма";


    MyClass(String firstName, String lastName, int age, String[] lessons) {
        this.name = firstName;
        this.surname = lastName;
        this.age = age;
        this.lessons = lessons;
    }

    void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);
        System.out.print("Уроки: ");
        for (String lesson : lessons) {
            System.out.print(lesson + " ");
        }
        System.out.println("\nЛюбимая еда: " + favoriteFood);
    }
}