
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import com.Riad.Entitie.Adress;

public class TestAdress {

	 Adress adress;
	
   @Test
	 public void test() {
	 adress= new Adress("App 31","LACHLAW","TUNIS",9150,"SIDIBOU");
	  assertEquals("App 31",adress.getNomResidence());
	  assertEquals("LACHLAW",adress.getNomRue());
	  assertEquals("TUNIS",adress.getQuartier());
	  assertEquals(9150,adress.getCodePostal());
	  assertEquals("SIDIBOU",adress.getProvince());
	  
	  assertEquals("Adress [nomResidence=App 31, nomRue=LACHLAW, quartier=TUNIS, codePostal=9150, province=SIDIBOU]",adress.toString());
	
	   }
   
   
}
