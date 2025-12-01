package Online_Course;

public class Video_course extends Course {
	private int totalHours;

	public Video_course(String id, String name, String subj, double price, int totalHours) {
		super(id, name, subj, price);
		this.totalHours = totalHours;
	}

	public int getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(int totalHours) {
		this.totalHours = totalHours;
	}
	
	@Override
	public void showDetails() {
		System.out.println(Video Course Id : " +getId()" +| Course Name :"+getName()+" | Subject : "+getsubject()+" | Price : "+getprice()+" | Total Hours :  + gettotalHours());
	}
		@Override
		public double applyDiscount() {
			double q=getPrice()*10/100;
			return getPrice()-q
		}
	@override
	public void enroll(Student student) {
		
	}
}
