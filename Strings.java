public class Strings  {
    public static void main(String[] args) {
        String message = "Hello \"World\" + !!";
        // c:\Windows\....
        String message2 = "c:\\Windows\\...";
        System.out.println(message.length());
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!","*"));
        System.out.println(message);
        // In Java, you can't change the string type
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        System.out.println(message2);
    }
}
