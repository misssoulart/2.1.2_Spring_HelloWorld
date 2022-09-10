import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());


        // код здесь
        // В классе App, по аналогии, вызовите еще раз бин HelloWorld
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        // затем 2 раза вызовите бин cat

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getSay());

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getSay());

        // Сравните 2 пары бинов по ссылке и выведите результат в консоль

        System.out.println(bean == bean1);
        System.out.println(cat == cat1);
    }
}