package Online_Course;

public abstract class Course implements Enrollable {
		private String Id;
		private String name;
		private String subj;
		private double price;
		
		
		public Course(String id, String name, String subj, double price) {
		
			Id = id;
			this.name = name;
			this.subj = subj;
			this.price = price;
		}


		public String getId() {
			return Id;
		}


		public void setId(String id) {
			Id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getSubj() {
			return subj;
		}


		public void setSubj(String subj) {
			this.subj = subj;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		@Override
		public String toString() {
			return "Course [Id=" + Id + ", name=" + name + ", subj=" + subj + ", price=" + price + "]";
		}
		
		public abstract void showDetails();
		public abstract double applyDiscount();
		public abstract void enroll(Student student);
		

}
