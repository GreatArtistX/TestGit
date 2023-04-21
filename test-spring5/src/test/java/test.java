import com.me.entity.EmpEntity;
import com.me.entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring1.xml");
//        EmpEntity empEntity = (EmpEntity) classPathXmlApplicationContext.getBean("empEntity");
//        System.out.println(empEntity);

        Class<?> aClass = Class.forName("com.me.entity.UserEntity");
        UserEntity userEntity = (UserEntity) aClass.newInstance();
        System.out.println(userEntity);

        Constructor<?> constructor = aClass.getConstructor(int.class, String.class);
        UserEntity u1 = (UserEntity) constructor.newInstance(1, "张a三");
        System.out.println(u1);

//        获取class成员属性
        Field[] fields = aClass.getDeclaredFields();
        for(int i = 0;i < fields.length; i++){
            System.out.println(fields[i]);
        }
        Field nameField = aClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(userEntity,"刘备a");
        System.out.println(userEntity.getName());
//获取所有公用方法a
        Method[] methods = aClass.getMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i]);
        }
//        调用私有方法test
        Method testMethod = aClass.getDeclaredMethod("test", String.class, int.class);
        UserEntity userEntity1 = (UserEntity) aClass.newInstance();
        testMethod.setAccessible(true);
        String result = (String) testMethod.invoke(userEntity1,"海月",66);
        System.out.println(result);
    }
}
