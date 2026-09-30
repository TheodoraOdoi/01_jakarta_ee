package demo.jndi;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless(mappedName = "Upper")
@LocalBean
public class UpperCase implements UpperCaseLocal
{

    public UpperCase(){}
    
    @Override
    public StringBuffer sayHello()
    {
        String greeting = "hello from jndi";
        
        StringBuffer updatesString = new StringBuffer(greeting);
        
        // Iterate through the greeting and capitalise it if in lowercase
        // or convert to lowercase it it's uppercase
        for(int n = 0; n < greeting.length(); n++)
        {
            if(Character.isLowerCase(greeting.charAt(n)))
            {
                updatesString.setCharAt(n,
                        Character.toUpperCase(greeting.charAt(n)));
            }
            else if(Character.isUpperCase(greeting.charAt(n)))
            {
                updatesString.setCharAt(n,
                        Character.toUpperCase(greeting.charAt(n)));
            }
        }
        System.out.println("String: " + updatesString);
        return updatesString;
    }
    
}
