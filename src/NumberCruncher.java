public class NumberCruncher {

    public int addNumbers(int num1, int num2){
        return num1+num2;
    }

    public int addNumbers(int num1, int num2,int num3){
        return num1+num2+num3;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public int multiply(int num1, int num2,int num3){
        return (num1 * num2) * num3;
    }

    public double divNumbers(double num1, double num2){
        return num1 / num2;
    }

    public int divideNumbers(int num1, int num2) throws Exception {
        if(num2 == 0) {
            throw new Exception();
        } else {
            return num1 / num2;
        }
    }

    public int[] doubleUp(int seed, int number) {

        int[] nums = new int[number];
        nums[0] = seed;

        for(int i = 1; i < number; i++){
            nums[i] = nums[i - 1] * seed;
        }

        return nums;
    }
}
