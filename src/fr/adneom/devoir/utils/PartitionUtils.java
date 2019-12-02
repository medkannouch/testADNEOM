package fr.adneom.devoir.utils;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class PartitionUtils<T> extends AbstractList<List<T>> {

	private final List<T> liste;
	private final int taille;

	public PartitionUtils(List<T> list, int taille) {
		this.liste = list;
		this.taille = taille;
	}

	public static <T> PartitionUtils<T> partition(List<T> list, int taille) {
		return new PartitionUtils<>(list, taille);
	}

	@Override
	public List<T> get(int index) {

		int debut = index * taille;
		// int fin = (debut + taille < liste.size()) ? (debut + taille) : liste.size();
		int fin = Math.min((debut + taille), liste.size());
		if (debut > fin) {

			throw new ArrayIndexOutOfBoundsException("l'index de début est supérieur à la taille de la liste: index: "
					+ debut + " taille de la liste: " + liste.size());
		}
		return new ArrayList<>(liste.subList(debut, fin));
	}

	@Override
	public int size() {

		return (int) Math.ceil((double) liste.size() / (double) taille);
		// return liste.size()/numSubLists; (Math.ceil() plus performante)

	}

}
