import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld2 = (HelloWorld)  applicationContext.getBean("helloworld");

        System.out.println(cat1==cat2);
        System.out.println(helloWorld1==helloWorld2);
    }
}