package ClassInheritance;

public class Main {

    public static void main(String[] args) {

        // Using only Human Class
        Human peter = new Human("white", 36);
        System.out.println("\nPeter's age is: " + peter.get_age());
        System.out.println("Peter's IQ is the default global average: " + peter.get_IQ());
        System.out.println("Peter's body temp is the default average: " + peter.get_body_temperature());
        System.out.println("Peter's testosterone level is the average: " + peter.get_testosterone());

        // Using Human + Gender class
        Human.Female Susan = new Human.Female("Asian", 42);
        Human.Male Rick = new Human.Male("Hispanic", 26);
        System.out.println("\nSusan's body temp is: " + Susan.get_body_temperature());
        System.out.println("Susan's testosterone level is: " + Susan.get_testosterone());
        System.out.println("Rick's body temp is: " + Rick.get_body_temperature());
        System.out.println("Rick's testosterone level is: " + Rick.get_testosterone());

        // Using Career class with Mathematician
        Career.Mathematician Makaela = new Career.Mathematician("Russian", 28);
        System.out.println("\nMakaela's age is: " + Makaela.get_age());
        System.out.println("Makaela's IQ as a Mathematician is: " + Makaela.get_IQ());
        System.out.println("Makaela performing large calculation: " + Makaela.large_calculation());

        // Using Career class with Linguist
        Career.Linguist Ricardo = new Career.Linguist("Indian", 33);
        System.out.println("\nRicardo's IQ as a Linguist is: " + Ricardo.get_IQ());
        System.out.println("Ricardo speaking German: " + Ricardo.speak_german());
    }
}