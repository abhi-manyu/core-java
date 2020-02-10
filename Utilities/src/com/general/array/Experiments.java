package com.general.array;

import java.util.ArrayList;
import java.util.List;

public class Experiments
{
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>(3);
		names.add("thor");
		names.add("Loki");
		names.add("Oddin");
		System.out.println(names.size());
		names.add(4,"Thanos");
		System.out.println(names.size());
}
}
