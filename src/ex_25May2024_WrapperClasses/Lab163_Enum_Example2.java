package ex_25May2024_WrapperClasses;

enum APIENDPOINTS{
	HOME("https://app.vwo.com/", "homePage"),
	LOGIN("https://app.vwo.com/login", "loginPage"),
	DASHBOARD("https://app.vwo.com/dashboard", "dashPage");
	
	private String url;
	private String page;
	
	APIENDPOINTS(String url, String page){
		this.url = url;
		this.page = page;
	}
	
	String getUrl() {
		return url;
	}
	void setUrl(String url) {
		this.url = url;
	}
	String getPage() {
		return page;
	}
	void setPage(String page) {
		this.page = page;
	}
}