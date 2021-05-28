package com.javaex.nosql;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class MongodbTest {
	static String MONGODB_IP = "127.0.0.1"; // localhost ip
	static int MONGODB_PORT = 27027;
	static String DB_NAME = "javamongo";
	static String COLL_NAME = "testCollection";
	
	public static void main(String[] args) {
//		connect();
//		getCollection(DB_NAME, COLL_NAME);
//		testInsert();
//		testInsertMany();
//		testFindFirst();
//		testFindAll();
		testFindFilter();
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
	
	private static void testInsert() {
		// 삽입 문서 생성
		// Bson -> Document
		// {name : "둘리", species: "공룡", gender: "MALE"}
		Document doc = new Document("name", "둘리").append("species", "공룡").append("gender", "MALE");
		System.out.println("DOC:" + doc);
		System.out.println("JSON:" + doc.toJson());
		// DB 접속 -> 컬렉션 -> insert
		MongoCollection<Document> coll = getCollection(DB_NAME, COLL_NAME);
		// 1개의 문서 insert
		coll.insertOne(doc); // db.testCollection.insert({})
	}
	
	private static void testInsertMany() {
		/*
		 db.javaMongo.insertMany([
		 	{ 문서 }, { 문서 }
		 	]);
		*/
		List<Document> docs = new ArrayList<>(); // List 생성
		Document doc = new Document("name", "고길동")
				.append("species", "인간")
				.append("gender", "MALE");
		// 리스트에 추가
		docs.add(doc);
		
		doc = new Document("name", "또치")
				.append("species",  "조류")
				.append("gender",  "FEMALE");
		docs.add(doc);
		
		doc = new Document("name", "도우너")
				.append("species", "외계인")
				.append("gender", "MALE");
		docs.add(doc);
		
		doc = new Document("name", "영희")
				.append("species", "인간")
				.append("gender", "FEMALE");
		docs.add(doc);
		System.out.println("DOCUMENTS:" + docs);
		
		// 여러 문서 INSERT
		MongoCollection<Document> coll = getCollection(DB_NAME, COLL_NAME);
		// db.javaMongo.insertMany([ 문서의 배열 ])
		coll.insertMany(docs); // 리스트 전달
	}
	
	// 문서 1개 가져오기 : findOne
	private static void testFindFirst() {
		MongoCollection<Document> coll = getCollection(DB_NAME, COLL_NAME);
		
		Document doc = coll.find().first();
		System.out.println("DOC: " + doc);
		System.out.println("JSON: " + doc.toJson());
		
		// 필드값 가져오기 .get
		System.out.printf("%s, %s, %s, %s\n", doc.get("_id"), doc.get("name"), doc.get("species"), doc.get("gender"));
	}
	
	// 전체 문서 가져오기
	private static void testFindAll() {
		// db.javaMongo.find()
		MongoCollection<Document> coll = getCollection(DB_NAME, COLL_NAME);
		
		MongoCursor<Document> cursor = coll.find().iterator();
		// loop
		while(cursor.hasNext()) { // 뒤에 남아있는 문서가 더 있는가? -> (cursur : 문서를 가르카는 화살표)
			Document doc = cursor.next();
			System.out.println(doc.toJson());
			
		}
		cursor.close();
	}
	
	// 조건에 만족하는 문서 가져오기
	private static void testFindFilter() {
		// species가 인간이고 gender가 FEMALE인 문서
		// db.javamongo.find({ &and: [{"species": "인간"}, {"gender": "FEMALE"}]})
		// 조건 Bson 생성
//		Bson bsonFilter = Filters.and(Filters.eq("species", "인간"), Filters.eq("gender", "FEMALE"));
		// species == 인간 or gender == FEMALE 인 문서들
		Bson bsonFilter = Filters.or(Filters.eq("species", "인간"), Filters.eq("gender", "FEMALE"));
		System.out.println("Filter: " + bsonFilter);
		
		MongoCollection<Document> coll = getCollection(DB_NAME, COLL_NAME);
		// 조건 검색
		MongoCursor<Document> cursor = coll.find(bsonFilter).iterator();
		
		while (cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println("DOC: " + doc);
		}
		cursor.close();
	}
}