package com.ChatApp.ChatApp.Module;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ChatMessage {
    private Long id ;
     private String sender;
     private String content;

}
