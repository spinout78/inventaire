package fr.mediatheque.inventaire.model;

import junit.framework.TestCase;
import fr.uni.institute.library.business.inventory.Category;

public class CategoryTestCase extends TestCase {
	
	private Category category;
	protected void setUp() throws Exception {
		super.setUp();
		System.out.println("Init");
		category = new Category(1, "Informatique");
	}

	protected void tearDown() throws Exception {
		System.out.println("Liberation");
		super.tearDown();
	}

	public void testGetName() {
		System.out.println("TestGetName");
		assertEquals("Informatique",category.getName());
	}

}
