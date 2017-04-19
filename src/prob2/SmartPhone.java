package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		// TODO Auto-generated method stub
		if(function.equals("앱"))
		{
			playApp();
			return;
		}
		super.execute(function);
	}

	private void playApp() {
		// TODO Auto-generated method stub
		System.out.println("앱실행");
		
	}

	@Override
	protected void playMusic() {
		// TODO Auto-generated method stub
		System.out.println("다운로드해서 음악재생");
	}
	
	
	
	
}
