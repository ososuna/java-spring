import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.Address;
import classes.Person;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person1 = (Person)context.getBean("person");
        Person person2 = (Person)context.getBean("person");
        
        person1.speak();

        Address address = (Address)context.getBean("address");
        System.out.println(address);

        System.out.println(person2);

        ((ClassPathXmlApplicationContext)context).close();
    };

}
