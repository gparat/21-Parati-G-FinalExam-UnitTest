public class StringCalculator {
    public static int add(final String numbers) throws IllegalArgumentException{
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|\n");
        for (String number : numbersArray) {
            if (!number.trim().isEmpty()) {
                int num=Integer.parseInt(number.trim());
                if(num<0){
                    throw new IllegalArgumentException("Negatives not allowed");
                }
                returnValue += num;
            }
        }
        return returnValue;
    }
}