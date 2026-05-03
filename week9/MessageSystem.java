interface Messenger{
	void sendMessage(String msg);
}


public class MessageSystem 
{
	static class StaticMessenger implements Messenger
	{
		public void sendMessage(String msg)
		{
			System.out.println(msg);
		}
	}
	
	//내부 클래스
	class InnerMessenger implements Messenger
	{
		public void sendMessage(String msg)
		{
			System.out.println(msg);
		}
	}
	
	void runLocalMessenger(String msg)
	{
	
		class LocalMessenger implements Messenger
		{
			public void sendMessage(String msg)
			{
				System.out.println(msg);	
			}
		}
		LocalMessenger obj = new LocalMessenger();
		obj.sendMessage(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSystem system = new MessageSystem();
		Messenger[] msg = new Messenger[3];
		//비정적 내부 클래스
		msg[0] = system.new InnerMessenger();
		msg[0].sendMessage("Hi, Inner class! ");
		
		// 정적 중첩 클래스
		msg[1] = new MessageSystem.StaticMessenger();
		msg[1].sendMessage("Hi, Static inner class! ");
		
		// 지역 클래스를 포함한 함수 호출
		system.runLocalMessenger("Hi, Local class! ");
		//익명 클래스 정의//
		msg[2] = new Messenger() {
			public void sendMessage(String msg) {
				System.out.println(msg);
			}
		};
		// 익명 클래스를 포함한 함수 호출
		msg[2].sendMessage("Hi, Anonymous class! ");}

}

