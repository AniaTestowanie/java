public class MathTeacher extends Person {

    /*
    Analogicznie jak dla Footballer'a MathTeacher również jest osobą z charakterystycznymi cechami.
    */

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void teachMath() {
        System.out.println("I'm teaching math in " + school);
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age);
    }

}
