package com.durgaSoft.section6.lecture29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Example1 {

	public static void main(String[] args) {

		// To Check if the String length is greater than 5
		Predicate<String> lengthGreaterThan5 = string -> string.length() > 5;
		System.out.println(lengthGreaterThan5.test("JavaTest"));
		System.out.println(lengthGreaterThan5.test("abc"));

		// To check if the collectio is empty or not:
		Predicate<Collection> collectionEmptyCheck = collection -> collection.isEmpty();

		ArrayList<String> arrayList1 = new ArrayList();
		arrayList1.add("a");
		System.out.println(collectionEmptyCheck.test(arrayList1));

		ArrayList<String> arrayList2 = new ArrayList();
		System.out.println(collectionEmptyCheck.test(arrayList2));

	}

}
