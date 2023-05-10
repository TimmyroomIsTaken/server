package com.timmyroom.moyoserver.chatroomList.controller;

import com.timmyroom.moyoserver.chatroomList.dto.ChatroomInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChatroomListController {

    private static final Logger logger = LoggerFactory.getLogger(ChatroomListController.class);

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/chatRoomList", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ChatroomInfo> chatRoomList() {
        // TO-DO : 서비스 메소드 호출하여 채팅방 리스트 가져오기 (Controller<->Service<->Repository<->DB)
        List<ChatroomInfo> chatroomInfoList = new ArrayList<ChatroomInfo>();
        chatroomInfoList.add(new ChatroomInfo("채팅방1",true,4,"추감기"));
        chatroomInfoList.add(new ChatroomInfo("채팅방2",true,4,"파스칼"));

        return chatroomInfoList;
    }
}
