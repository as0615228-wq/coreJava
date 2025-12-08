	package Online_Course;
	
	public class Live_course extends Course{
			int timeDuration;
	
			public Live_course(String id, String name, String subj, double price, int timeDuration) {
				super(id, name, subj, price);
				this.timeDuration = timeDuration;
			}
	
			public int getTimeDuration() {
				return timeDuration;
			}
	
			public void setTimeDuration(int timeDuration) {
				this.timeDuration = timeDuration;
			}
			
			

			@Override
				public double applyDiscount() {
					double p=getPrice()*9/200;
                  return getPrice()-p;
                 
			}
			@Override
			public void enroll(Student student) {
				
			}

			@Override
			public void showDetails() {
				System.out.println("Live Course Id :" +getId() +"| Course Name :" +getName() + "| Subject : "+getSubj()+" | Price : "+getPrice()+" | Time Duration :"  + getTimeDuration());
				
			}
	}
