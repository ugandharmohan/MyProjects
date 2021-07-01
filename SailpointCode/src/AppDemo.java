import java.security.Identity;

public class AppDemo {

	public static void main(String[] args) {
		SpringStarter starter = new SpringStarter("iiqBeans"); 
		  starter.start();
		  SailPointContext context = SailPointFactory.createContext();
		  Identity identity = context.getObject(Identity.class, "spadmin");
		  String displayName=identity.getDisplayName();
		       System.out.println("Identity Details " + identity.getFirstname() + identity.getLastname());
		       starter.close();


	}

}
