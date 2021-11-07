package com.es4a4.calculadoraTDD;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.es4a4.calculadoraTDD.io.dweet.GetDweet;

public class GetTest {
	
	@Test
	public void testarGetSomaDweet() {
		List<String> list = new ArrayList<>();
		list.add("somar");
		list.add("10");
		list.add("5");
		assertEquals(list, GetDweet.get("es4a4-fgmtem"));
	}

	
	@Test
	public void testarGetSubtracaoDweet() {
		List<String> list = new ArrayList<>();
		list.add("subtrair");
		list.add("10");
		list.add("5");
		assertEquals(list, GetDweet.get("es4a4-fgmtem"));
	}
	
	@Test
	public void testarGetMultiplicarDweet() {
		List<String> list = new ArrayList<>();
		list.add("multiplicar");
		list.add("10");
		list.add("5");
		assertEquals(list, GetDweet.get("es4a4-fgmtem"));
	}
	
	@Test
	public void testarGetDividirDweet() {
		List<String> list = new ArrayList<>();
		list.add("dividir");
		list.add("10");
		list.add("5");
		assertEquals(list, GetDweet.get("es4a4-fgmtem"));
	}
}

