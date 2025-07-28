package com.ChatApp.ChatApp.Controller;

import com.ChatApp.ChatApp.Module.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    // Handles messages sent from the client to /app/sendMessage
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }

    // Serves the chat HTML page
    @GetMapping("/chat")
    public String chat() {
        return "chat"; // Assumes you have chat.html in src/main/resources/templates/
    }
}
