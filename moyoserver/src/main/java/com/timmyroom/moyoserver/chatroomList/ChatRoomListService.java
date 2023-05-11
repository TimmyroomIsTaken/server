package com.timmyroom.moyoserver.chatroomList;

import com.timmyroom.moyoserver.chatroomList.dto.ChatRoomInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatRoomListService {

    public List<ChatRoomInfo> getChatRoomList() {

        // TO-DO : 서비스 메소드 호출하여 채팅방 리스트 가져오기 (Controller<->Service<->Repository<->DB)
        List<ChatRoomInfo> chatRoomInfoList = new ArrayList<ChatRoomInfo>();
        chatRoomInfoList.add(new ChatRoomInfo("채팅방1",true,4,"추감기"));
        chatRoomInfoList.add(new ChatRoomInfo("채팅방2",true,4,"파스칼"));

        return chatRoomInfoList;
    }

}
