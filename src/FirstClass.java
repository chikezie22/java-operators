public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello Chike");
//        boolean isAlien = false;
//                if(isAlien == true){
//                    System.out.println("Its is not an alien");
//                }else {
//                    System.out.print("Its an alien");
//                }

        double firstDouble = 20.00;
        double secondDouble = 80.00;
        double result = (firstDouble + secondDouble) * 100.00;
        double remainder = result % 40.00;
        boolean isZero = (remainder == 0.00) ? true : false;
        System.out.println(isZero);
        if(!isZero) System.out.println("got some remainder");
    }
}
