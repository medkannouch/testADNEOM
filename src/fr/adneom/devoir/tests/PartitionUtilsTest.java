package fr.adneom.devoir.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import fr.adneom.devoir.utils.PartitionUtils;

public class PartitionUtilsTest {

	private static List<Integer> listeOriginale;
	
	@BeforeClass
	public static void setUp() {
		listeOriginale = Arrays.asList(1,2,3,4,5,6,7);
	}
	
	
	@Test
	public void testPartition() {
		
		// on vérifie si la taille retournée égale à 3
		assertEquals(3, PartitionUtils.partition(listeOriginale, 3).size()); 
		
		// on vérifie si la taille de chaque partition retournée égale à 2
		List<Integer> sousList = PartitionUtils.partition(listeOriginale, 2).get(0);
		assertEquals(2, sousList.size()); 
		
	}

	
	
	@Test
	public void testPartition_tailleSupTailleOriginale() {
		int tailleListeOriginale = listeOriginale.size();
		assertEquals(tailleListeOriginale,PartitionUtils.partition(listeOriginale,10).get(0).size());
	}
}
