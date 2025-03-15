package ClassInheritance;

public class Career{

    public static class Mathematician extends Human {
        public Mathematician(String ethnicity, int age) {
            super(ethnicity, age);
            this.intellectual_qoutient = 165; // Default IQ (108) is re-assigned to 165.
        }
        public String large_calculation() {
            return "Three thousand two hundred and eleven, divided by seventy-three, is forty-three point nine eight three zero.";
        }
    }

    public static class Linguist extends Human {
        public Linguist(String ethnicity, int age) {
            super(ethnicity, age);
            this.intellectual_qoutient = 145; //  Default IQ (108) is re-assigned to 145.
        }
        public String speak_german() {
            return "Es gibt eine Zahl, die ganz ist und weder positiv noch negativ ist. Diese Zahl ist null.";
        }
    }
}