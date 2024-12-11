package com.jsp.Overridding;

class whats_app_1{
	void send(){
		System.out.println("Single-Tick");
	}
}
class whats_app_2 extends whats_app_1{
	void send(){
		super.send();
		System.out.println("Double-Tick");
	}
	void voiceCall(){
		System.out.println("Voice-Call");
	}
}
class whats_app_3 extends whats_app_2{
	void send(){
		super.send();
		System.out.println("Double and blue-Tick");
	}
	void voiceCall(){
		super.voiceCall();
		System.out.println("HD Voice-Call");
	}
	void videoCall(){
		System.out.println("Video-Call");
	}
}
class whats_app_4 extends whats_app_3{
	
	void videoCall(){
		super.videoCall();
		System.out.println("4K Video-Call");
	}
}
public class whatsapp {

	public static void main(String[] args) {
		whats_app_4 w = new whats_app_4();
		w.send();
		w.voiceCall();
		w.videoCall();

	}

}
