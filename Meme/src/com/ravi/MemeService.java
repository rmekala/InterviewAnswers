package com.ravi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ravi.model.Meme;

public class MemeService {

	private void sort(List<Meme> memes){
		Collections.sort(memes);
		System.out.println(memes);
	}

	public void sort(){

		List<Meme> memes = readFromJson();
		sort(memes);
		
	}

	private List<Meme> readFromJson() {
		
		List<Meme> memes = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/memes.json"));

			//convert the json string back to object
			Gson gson = new Gson();
			Type collectionType = new TypeToken<List<Meme>>(){}.getType();
			memes = gson.fromJson(br, collectionType);
			

		} catch (IOException e) {
			System.out.println("unable to parse json file");
		}
		return memes;
	}
	
	public static void main(String[] args) {
		MemeService ms = new MemeService();
		ms.sort();
		
		ms.updateScore();
	}

	public void updateScore() {
		List<Meme> memes = readFromJson();
		
		populateRandomLulz(memes);
		
		writeToJson(memes);
		
	}

	private void populateRandomLulz(List<Meme> memes) {
		Random r = new Random();
		for (Meme meme : memes) {
			meme.setLulz(r.nextInt(10) + 1);
		}
	}

	private void writeToJson(List<Meme> memes) {
		Gson gson = new Gson();

		// convert java object to JSON format,
		// and returned as JSON formatted string
		String json = gson.toJson(memes);

		try {
			//write converted json data to a file named "CountryGSON.json"
			FileWriter writer = new FileWriter("src/memes.json");
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			System.out.println("unable to write to json file");
		}
	}

}
