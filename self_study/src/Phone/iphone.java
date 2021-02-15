package Phone;

public class iphone implements phoneInterface,listenMusic{

	@Override
	public void callSend() {
		System.out.println("통화를 할 수 있습니다");
	}

	@Override
	public void canPhoto() {
		System.out.println("사진을 찍을 수 있습니다");
	}

	@Override
	public void watchYoutube() {
		System.out.println("Youtube 시청이 가능합니다");
	}

	@Override
	public void listenMusic() {
		System.out.println("음악을 들을 수 있습니다");
	}

}
