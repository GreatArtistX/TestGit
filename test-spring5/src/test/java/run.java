import com.me.entity.EmpEntity;
import com.me.entity.StuEntity;
import com.me.entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class run {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //new UserEntity().addUser();
        //加载spring配置
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        EmpEntity empEntity = (EmpEntity) classPathXmlApplicationContext.getBean("empEntity");
//        System.out.println(empEntity);

//        UserEntity userEntity = (UserEntity) classPathXmlApplicationContext.getBean("userEntity");
//        System.out.println(userEntity);
        //根据bean的id获取对象
//        UserEntity userEntity = classPathXmlApplicationContext.getBean("userEntity", UserEntity.class);
//        System.out.println(userEntity);
        //userEntity.addUser();
        //UserService a = new UserService();
        //a.addUser();
        /**
         *
         */
        //Class<?> aClass = Class.forName("com.me.entity.entity.UserEntity");
        //UserEntity userEntity = (UserEntity) aClass.newInstance();
        //System.out.println(userEntity);
        //userEntity.addUser();
        StuEntity stuEntity = (StuEntity) classPathXmlApplicationContext.getBean("stuEntity");
        System.out.println(stuEntity);
    }
}
