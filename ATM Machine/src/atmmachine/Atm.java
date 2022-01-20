package atmmachine;
import java.io.IOException;

public class Atm extends AtmMenu{
	
	public static void main(String[] args) throws IOException{
		AtmMenu atmOptionMenu = new AtmMenu();
		
		atmOptionMenu.retrieveLogin();
	}
}
