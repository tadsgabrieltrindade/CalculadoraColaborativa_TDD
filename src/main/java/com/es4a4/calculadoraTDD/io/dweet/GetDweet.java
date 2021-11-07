package com.es4a4.calculadoraTDD.io.dweet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//Dar um get na url:https://dweet.io/get/latest/dweet/for/es4a4-fgmtem
//Exemplo de um post: http://dweet.io/dweet/for/es4a4-fgmtem?operacao=soma&num1=1000&num2=500

public class GetDweet {

	public static List<String> get(String myThing) {
		try {
			// armazena um objeto do formato JSON conforme o retorno da URL
			JSONObject json = ReadJSON("https://dweet.io/get/latest/dweet/for/" + myThing);

			// Pega o conteúdo da propriedade com o nome "with" e coloco em um array
			JSONArray jArray = json.getJSONArray("with");

			// É pego o conteúdo do array na posição 0 que é um json
			JSONObject conteudo = jArray.getJSONObject(0);

			// nesse json, elemento da posição 0, tem uma propriedade "content" que tem os
			// valores referentes a operação, num1 e num2
			JSONObject p = conteudo.getJSONObject("content");

			// Pega os valores e coloca na lista para retornar
			List<String> list = new ArrayList<>();
			list.add(p.getString("operacao"));
			list.add(Integer.toString(p.getInt("num1")));
			list.add(Integer.toString(p.getInt("num2")));
			return list;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// Retorna null caso ocorra algo
		return null;
	}

	public static JSONObject ReadJSON(String url) throws IOException, JSONException {
		try (InputStream inputStream = new URL(url).openStream()) {
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			StringBuilder jsonBody = new StringBuilder();
			int singleChar;
			while ((singleChar = bufferedReader.read()) != -1) {
				jsonBody.append((char) singleChar);
			}
			JSONObject json = new JSONObject(jsonBody.toString());
			return json;
		}
	}

}