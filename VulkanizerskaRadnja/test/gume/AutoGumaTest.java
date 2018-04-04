package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {
	
	
	private AutoGuma a;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}



	@Test 
	public void testSetMarkaModel() {
		a.setMarkaModel("Tigar");
		
		assertEquals("Tigar", a.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelDuzinaJeManja() {
		a.setMarkaModel("Tr");
	}
	
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(14);
		
		assertEquals(14, a.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikJeManjiOd13() {
		a.setPrecnik(12);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikJeVeciod22() {
		a.setPrecnik(23);
	}

	@Test
	public void testSetSirina() {
		a.setSirina(138);
		
		assertEquals(138, a.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaJeManjaOd135() {
		a.setSirina(134);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaJeVecaod355() {
		a.setSirina(356);
	}

	@Test
	public void testSetVisina() {
		a.setVisina(28);
		
		assertEquals(28, a.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaJeManjaOd25() {
		a.setVisina(24);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaJeVecaod95() {
		a.setVisina(96);
	}
	
	@Test
	public void testToString() {
		a.setMarkaModel("Tigar");
		a.setPrecnik(14);
		a.setSirina(150);
		a.setVisina(28);
		
		assertEquals("AutoGuma [markaModel=Tigar, precnik=14, sirina=150, visina=28]", a.toString());
	}

	@Test
	public void testEqualsObject() {
		
		a.setMarkaModel("Tigar");
		a.setPrecnik(18);
		a.setSirina(151);
		a.setVisina(30);
		
		AutoGuma a1 = new AutoGuma();
		a1.setMarkaModel("Tigar");
		a1.setPrecnik(18);
		a1.setSirina(151);
		a1.setVisina(30);
		
		assertTrue( a.equals(a1) );
	}
	
	@Test
	public void testEqualsObjectFalse() {
		
		a.setMarkaModel("Tigar");
		a.setPrecnik(18);
		a.setSirina(151);
		a.setVisina(30);
		
		AutoGuma a1 = new AutoGuma();
		a1.setMarkaModel("Tig");
		a1.setPrecnik(20);
		a1.setSirina(161);
		a1.setVisina(37);
		
		assertFalse( a.equals(a1) );
	}

}
