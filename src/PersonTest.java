public class PersonTest {

    public static void main(String[] args) {

        MathTeacher teacher = new MathTeacher("Tom", 29, "highschool");
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();


        Footballer footballer = new Footballer("Mike", 26, "Boca Juniors");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();
    }

}
