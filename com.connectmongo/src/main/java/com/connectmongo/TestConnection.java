package com.connectmongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TestConnection {

	public static void main(String[] args) {
		MongoClient client = new MongoClient("localhost",27017);
		MongoDatabase database = client.getDatabase("SSINet");
		MongoCollection collection = database.getCollection("RAW_INGREDIENT");
		Document doc = new Document();
		doc.put("name", "Joydeep");
		collection.insertOne(doc);
		
	}

}
