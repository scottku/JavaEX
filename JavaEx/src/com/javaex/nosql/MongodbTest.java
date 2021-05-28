package com.javaex.nosql;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongodbTest {
	static String MONGODB_IP = "127.0.0.1"; // localhost ip
	static int MONGODB_PORT = 27027;
	static String DB_NAME = "javamongo";
	static String COLL_NAME = "testCollection";
	
	public static void main(String[] args) {
//		connect();
		getCollection(DB_NAME, COLL_NAME);
	}
	
	private static MongoClient connect() {
		// Mongo DB 접속
		MongoClient client = MongoClients.create();
		
		System.out.println(client);
		return client;
	}
	
	private static MongoCollection<Document> getCollection(String databaseName, String collectionName) {
		// 접속
		MongoClient client = connect();
		// use DB
		MongoDatabase db = client.getDatabase(databaseName);
		System.out.println("DATABASE:" + db);
		// 컬렉션 접속
		MongoCollection<Document> coll = db.getCollection(collectionName);
		System.out.println("COLLECTION:" + coll);
		return coll;
				
		
	}
}
