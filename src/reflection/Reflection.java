package reflection;

import java.lang.reflect.Field;

public class Reflection {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        Message message=new Message();


        System.out.println(message instanceof Message);
        Field f= message.getClass().getField("content");

        System.out.println(f);
    }
}
