package com.whatapp_chatbot.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.whatapp_chatbot.dto.ChatbotRequest;

@Service
public class ChatbotService {
	public Map<String, String> messageService(ChatbotRequest msg) {
		System.out.println("User : " +msg.msg());
		String message = msg.msg().toLowerCase();
		String res = getMessage(message);
		System.out.println("Chatbot : " + res);
		return Map.of("reply",res);
	}
	private String getMessage(String msg) {
		if(msg.equals("hi")) {
			return "Hello";
		}
		if(msg.equals("bye")) {
			return "Goodbye";
		}
		return "Sorry , I can't respond to your message";
	}
}
