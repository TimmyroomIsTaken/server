package com.timmyroom.moyoserver;

import com.mongodb.client.MongoDatabase;
import com.timmyroom.moyoserver.chatroomList.dto.ChatRoomInfo;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MoyoserverApplication {

	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args) {

		// 테스트용 데이터를 DB에 insert! (Controller<->Service<->Repository<->DB)
//		List<ChatRoomInfo> chatRoomInfoList = new ArrayList<ChatRoomInfo>();
//		chatRoomInfoList.add(new ChatRoomInfo("채팅방1",true,4,"추감기"));
//		chatRoomInfoList.add(new ChatRoomInfo("채팅방2",true,4,"파스칼"));
//		mongoTemplate.insertAll(chatRoomInfoList);

		SpringApplication.run(MoyoserverApplication.class, args);
	}

	// 서버 실행시 동작하는 로직 작성 부분
	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> {

			// mongo 템플릿 접근 방법1
//			MongoDatabase db = mongoTemplate.getDb();
//			db.createCollection("chat_room_info");
//
//			db.getCollection("chat_room_info").insertOne(
//					new Document()
//							.append("name", "채팅방1")
//							.append("isActivated", true)
//							.append("participant", 4)
//							.append("hostName", "추감기")
//			);

			// mongo 템플릿 접근 방법2
//			ChatRoomInfo chatRoomInfo1 = ChatRoomInfo.builder()
//					.name("채팅방1").isActivated(true).participant(4).hostName("추감기").build();
//
//			mongoTemplate.insert(chatRoomInfo1);
		};
	}

}
