package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName) {
		
		System.out.println("Browser Launched Successfully");
		return browserName;
	}

	public void loadurl() {
		System.out.println("URL Loaded Succseefully");
	}
	public static void main(String[] args) {
		
		Browser chrome = new Browser();
		chrome.launchBrowser("Firefox");
		chrome.loadurl();
	
}
}
