package com.jslhrd.stack;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	String command;
	String to;
	
	Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		Queue<Message> msg = new LinkedList<>();
		msg.offer(new Message("sendMail", "김학생"));
		msg.offer(new Message("sendSMS", "박학생"));
		msg.offer(new Message("sendTalk", "장학생"));
		
		while(!msg.isEmpty()) {
			Message m = msg.poll();
			switch(m.command) {
			case "sendMail":
				System.out.println(m.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(m.to + "님에게 SMS를 보냅니다.");
				break;
			case "sendTalk":
				System.out.println(m.to + "님에게 카톡을 보냅니다.");
				break;
			}
		}
	}
}
