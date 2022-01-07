package com.saurabh.string;
import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		sj.setEmptyValue("sj is empty");
		System.out.println(sj);
		sj.add("abc");
		sj.add("pqr");
		sj.add("xyz");
		sj.add("mno");
		System.out.println(sj);
		StringJoiner sj2 = new StringJoiner(",", "[", "]");
		sj2.add("sa");sj2.add("re");sj2.add("ga");sj2.add("ma");
		sj2.merge(sj);System.out.println(sj.merge(sj2));
		System.out.println(sj2);
	}
}
