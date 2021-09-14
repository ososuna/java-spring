import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.Person;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person)context.getBean("person");
        person.speak();

        ((ClassPathXmlApplicationContext)context).close();
    };

}
