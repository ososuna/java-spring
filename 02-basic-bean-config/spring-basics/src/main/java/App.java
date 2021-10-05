import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import classes.Address;
import classes.FruitBasket;
import classes.Person;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person = (Person)context.getBean("person");
        
        person.speak();

        Address address = (Address)context.getBean("address");
        System.out.println(address);

        System.out.println(person);

        Address address2 = (Address)context.getBean("address2");
        System.out.println(address2);

        FruitBasket fb = (FruitBasket)context.getBean("basket");
        System.out.println(fb);

        ((ClassPathXmlApplicationContext)context).close();
    };

}
