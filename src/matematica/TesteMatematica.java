package matematica;

import org.junit.Assert;
import org.junit.Test;

public class TesteMatematica {
	
	@Test
	public void TesteNegativo(){
		
		Matematica m = new Matematica();
		
		try {
			m.fatoria(-1);
			Assert.fail();			
		} catch (NotValidNumberExepcion e) {
			System.out.println(e.getMessage());
		}
	}
	
}
