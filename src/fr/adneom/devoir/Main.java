package fr.adneom.devoir;

import java.util.Arrays;
import java.util.List;

import fr.adneom.devoir.utils.PartitionUtils;

public class Main {

	public static void main(String[] args) {
		
		
		final List<Integer> listeOriginale = Arrays.asList(1,2,3,4,5,6,7);

		System.out.println("La liste originale: "+ listeOriginale);
		System.out.println("Partition de la liste en sous liste de 3 elements: " +PartitionUtils.partition(listeOriginale, 3));
		System.out.println("Partition de la liste en sous liste de 2 elements: " +PartitionUtils.partition(listeOriginale, 2));

	}

}
