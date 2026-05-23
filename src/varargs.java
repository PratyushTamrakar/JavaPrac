public class varargs {
    public static void main(String[] args){
        System.out.println(add(5,6));
        System.out.println(add(4,6,3,6));
    }
    public static float add(int... numbers){
        int sum=0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
}
