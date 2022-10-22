public class Casting {

    public static void main(String[] arg){
//        Implicit Casting: The data type is automatically converted to a greater data type
//        byte (--->) short (--->) int (--->) long (--->) float (--->) double
//        short x = 1;
//        int y = x + 2;
        String x = "1.1";
//        Integer.parseInt() ;// int // Takes a string and return an Integer
//        Short.parseShort();// Takes a string and returns a short
        Double y = Double.parseDouble(x) + 2;

        System.out.println(y);
    }
}
