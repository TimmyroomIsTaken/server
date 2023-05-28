package com.timmyroom.moyoserver.chatroomList;

import com.timmyroom.moyoserver.chatroomList.dto.ChatRoomInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatRoomListService {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<ChatRoomInfo> getChatRoomList() {
        // 서비스 메소드 호출하여 채팅방 리스트 가져오기 (Controller<->Service<->Repository<->DB)

        List<ChatRoomInfo> chatRoomInfoList = mongoTemplate.findAll(ChatRoomInfo.class, "chat_room_info");

        return chatRoomInfoList;
    }

}
