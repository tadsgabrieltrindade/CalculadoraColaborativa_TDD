package com.es4a4.calculadoraTDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.es4a4.calculadoraTDD.io.dweet.PostDweet;

public class PostTest {

	@Test
	public void testarPostSomaDweet() {
		assertEquals(true, PostDweet.post("somar", 10, 5));
	}

	@Test
	public void testarPostSubtracaoDweet() {
		assertEquals(true, PostDweet.post("subtrair", 10, 5));
	}

	@Test
	public void testarPostMultiplicacaoDweet() {
		assertEquals(true, PostDweet.post("multiplicar",10, 5));
	}

	@Test
	public void testarPostDivisaoDweet() {
		assertEquals(true, PostDweet.post("dividir", 10, 5));
	}

}
