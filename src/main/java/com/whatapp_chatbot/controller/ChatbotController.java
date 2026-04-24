package com.whatapp_chatbot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.whatapp_chatbot.dto.ChatbotRequest;
import com.whatapp_chatbot.service.ChatbotService;

@RestController
public class ChatbotController {
	@Autowired
	private ChatbotService chatbotService;
	
	@PostMapping("/webhook")
	public Map<String, String> messageController(@RequestBody ChatbotRequest msg) {
		return chatbotService.messageService(msg);
	}
}
