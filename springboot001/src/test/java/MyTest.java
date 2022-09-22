import com.zhezhi.config.SpringConfig;
import com.zhezhi.vo.Cat;
import com.zhezhi.vo.Student;
import com.zhezhi.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Program: SpringBoot
 * @ClassName: myTest
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-22 16:02
 **/

public class MyTest {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
    @Test
    public void test02() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ac.getBean("createStudent");
        System.out.println(student);
        Student student1 = (Student) ac.getBean("stu");
        System.out.println(student1);
    }
    @Test
    public void test03() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) ac.getBean("cat");
        System.out.println(cat);
    }
    @Test
    public void test04() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) ac.getBean("tiger");
        System.out.println(tiger);
    }
}
