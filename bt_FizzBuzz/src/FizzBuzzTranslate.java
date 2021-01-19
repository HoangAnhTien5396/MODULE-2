public class FizzBuzzTranslate {
    public static String translate(int a) {
        String typeFizzBuzz = null;
        String b = Integer.toString(a);
        if (b.contains("3")){
            typeFizzBuzz = "Fizz";
        }else if ( b.contains("5")){
            typeFizzBuzz = "Buzz";
        }else {
            if (a % 5 == 0 && a % 3 == 0) {
                typeFizzBuzz = "FizzBuzz";
            } else {
                if (a % 5 == 0) {
                    typeFizzBuzz = "Buzz";
                } else if (a % 3 == 0) {
                    typeFizzBuzz = "Fizz";
                } else {
                    typeFizzBuzz = a + "";
                }
            }
        }
        return typeFizzBuzz;
    }
}
