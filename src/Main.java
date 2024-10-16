public class Main {
    public static void main(String[] args) {
        String[] lessons1 = {"SoftSkill", "English", "Session"};
        MyClass student1 = new MyClass("Жыргалбек", "Амангулов", 15, lessons1);

        String[] lessons2 = {"Он даже в Пиксофт хаусe не учится"};
        MyClass student2 = new MyClass("Ринат", "Канатов", 16, lessons2);

        System.out.println(" студент1:");
        student1.printInfo();

        System.out.println("\nстудент2:");
        student2.printInfo();
    }
}