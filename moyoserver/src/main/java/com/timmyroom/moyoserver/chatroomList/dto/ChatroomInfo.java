package com.timmyroom.moyoserver.chatroomList.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatroomInfo {
    private String name;
    private boolean isActivated;
    private int participant;
    private String hostName;

    public ChatroomInfo(String name, boolean isActivated, int participant, String hostName) {
        this.name = name;
        this.isActivated = isActivated;
        this.participant = participant;
        this.hostName = hostName;
    }
}
