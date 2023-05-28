package com.timmyroom.moyoserver.chatroomList.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@NoArgsConstructor
@Document(collection = "chat_room_info")
public class ChatRoomInfo {
    @Id
    private String name;
    private boolean isActivated;
    private int participant;
    private String hostName;

    @Builder
    public ChatRoomInfo(String name, boolean isActivated, int participant, String hostName) {
        this.name = name;
        this.isActivated = isActivated;
        this.participant = participant;
        this.hostName = hostName;
    }
}
