package day1;

public class GetBeets {
	
	int beet1=200;//12
	int beets;
    public int getBeets() {
    	return beet1;//12
    }
    public void setBeets(int beet1) {
    	beets = beet1;//12
    	
    }
	
	public static void main(String[] args) {
		GetBeets c1 = new GetBeets();
		c1.setBeets(56);
		System.out.println(c1.getBeets());

	}
}
