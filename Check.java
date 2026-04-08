import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class Check {
    public static void main(String[] args) throws Exception {
        System.out.println("----- Constructors -----");
        for (Constructor<?> c : DaoAuthenticationProvider.class.getConstructors()) {
            System.out.println(c.toString());
        }
        System.out.println("----- Methods -----");
        for (Method m : DaoAuthenticationProvider.class.getMethods()) {
            if (m.getName().toLowerCase().contains("user")) {
                System.out.println(m.toString());
            }
        }
    }
}
