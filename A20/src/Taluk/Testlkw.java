package Taluk;

import org.junit.*;
import weiser.GewichtException;
import weiser.LKW;
import weiser.PersonenException;

/**
 * GIT: 
 * @author emretaluk
 *
 */

public class Testlkw {
	
	
	@Test(expected=PersonenException.class)
	public void personenExceptionTest(){
		LKW l1 = new LKW("aB 546",2000 , 1000 , 20);
		for(int i = 0 ; i < l1.getHoechstZulaessigePersonenZahl()+10 ; i++){
			l1.einsteigen();
		}
	}
	
	
	@Test(expected=GewichtException.class)
	public void gewichtExceptionTest(){
		LKW l2 = new LKW("aB 536",4000 , 2000, 10);
		l2.aufladen(l2.getHoechstZulaessigesGesamtGewicht()+10);
	}
	
	
	@Test(expected=PersonenException.class)
	public void personenExceptionTest2(){
		LKW l1 = new LKW("aB 546",3700 , 1000 , 3);
		for(int i = 0 ; i < l1.getPersonenZahl()+10 ; i++){
			l1.aussteigen();
		}
	}
	
	
	@Test(expected=GewichtException.class)
	public void gewichtExceptionTest2(){
		LKW l2 = new LKW("aB 536",4000 , 2000, 2);
		l2.entladen(l2.getNutzLast()+10);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void Kontruktortest(){
		LKW l2 = new LKW("aB 546",4000 , 2000, 10);
	}
}

