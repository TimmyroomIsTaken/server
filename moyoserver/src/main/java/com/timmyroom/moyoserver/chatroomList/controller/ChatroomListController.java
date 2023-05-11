package com.timmyroom.moyoserver.chatroomList.controller;

import com.timmyroom.moyoserver.chatroomList.ChatRoomListService;
import com.timmyroom.moyoserver.chatroomList.dto.ChatroomInfo;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ChatroomListController {

    private static final Logger logger = LoggerFactory.getLogger(ChatroomListController.class);
    private final ChatRoomListService chatRoomListService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/chatRoomList", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ChatroomInfo> chatRoomList() {
        return chatRoomListService.getChatRoomList();
    }
}
