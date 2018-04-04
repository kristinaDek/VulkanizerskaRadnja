package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja vr;
	private AutoGuma a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		vr = new VulkanizerskaRadnja();
		
		a = new AutoGuma();
		a.setMarkaModel("Tigar");
		a.setPrecnik(14);
		a.setSirina(200);
		a.setVisina(50);
		
	
	}

	@After
	public void tearDown() throws Exception {
		vr = null;
		a = null;
	}

	@Test
	public void testDodajGumu() {
		vr.dodajGumu(a);
		
		assertEquals(1, vr.vratiGume().size());
		assertEquals(a, vr.vratiGume().get(0));
		
	}
	
	@Test
	public void testDodajGumu2() {
		vr.dodajGumu(a);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Pirelli");
		a2.setPrecnik(17);
		a2.setSirina(220);
		a2.setVisina(54);
		vr.dodajGumu(a2);
		
		assertEquals(2, vr.vratiGume().size());
		assertEquals(a2, vr.vratiGume().get(0));	
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuIsteGume() {
		vr.dodajGumu(a);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Tigar");
		a2.setPrecnik(14);
		a2.setSirina(200);
		a2.setVisina(50);
		
		vr.dodajGumu(a2);

	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
		vr.dodajGumu(null);
		
	}

	@Test 
	public void testPronadjiGumuKojaNePostoji() {
				
		AutoGuma a1 = new AutoGuma();
		a1.setMarkaModel("Ajaf");
		
		assertEquals(0, vr.pronadjiGumu(a1.getMarkaModel()).size());
		
	}
	
	@Test
	public void testPronadjiGumeKojePostoje() {
		
		vr.dodajGumu(a);		
		
		AutoGuma a1 = new AutoGuma();
		a1.setMarkaModel("Apollo");
		a1.setPrecnik(14);
		a1.setSirina(220);
		a1.setVisina(56);
		vr.dodajGumu(a1);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Apollo");
		a2.setPrecnik(13);
		a2.setSirina(206);
		a2.setVisina(59);
		vr.dodajGumu(a2);
		
		assertEquals(2, vr.pronadjiGumu(a1.getMarkaModel()).size());
		assertEquals(a1, vr.pronadjiGumu(a1.getMarkaModel()).get(1));
		assertEquals(a2, vr.pronadjiGumu(a1.getMarkaModel()).get(0));		
		
	}
	
	@Test 
	public void testPronadjiGumuNull() {
				
		assertEquals(null, vr.pronadjiGumu(null));
	}

}
