
public class MathUtilities{
    /**
     * Add two number together
     * @param baseValue first number
     * @param valueToAdd number
     * @return the sum of the two numbers
     */
    public Integer add(Integer baseValue, Integer valueToAdd){
        Integer x;
        Integer y;

        return baseValue + valueToAdd;
    }

    /**
     * Add two number together
     * @param baseValue first number
     * @param valueToAdd second number
     * @return the sum of the two numbers
     */
    public Double add(Double baseValue, Double valueToAdd){
        Double x;
        Double y;

        return baseValue + valueToAdd;
    }

    /**
     * Get half the value of the number
     * @param number the number given
     * @return the half of the number in double
     */
    public Double half(Integer number) {
        Double x;
        Double y;

        return 8.0;
    }

    /**
     * Determine if the number is odd
     * @param number the number given
     * @return true if the number is odd, false if it is even
     */
    public Boolean isOdd(Integer number){
        boolean isEven = true; 

        for (int i = 0; i <= number; i++)  
            isEven = !isEven; 

        return isEven;
    }

    /**
     * Multiply the number by itself
     * @param number the number given
     * @return the result of the number multiply by itself
     */
    public Integer square(Integer number) {
        Integer i = 6;
        Integer square = i * i;
                return (number);
    }
}