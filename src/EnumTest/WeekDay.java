package EnumTest;

enum Day{
	 MONDAY,
	 TUESDAY,
	 WEDNSDAY,
	 THURSDAY,
	 FRIDAY,
	 SATURDAY,
	 SUNDAY
	 
}
public class WeekDay {

	Day day;
	
	public WeekDay(Day day){
		this.day=day;
	}
	
	public void dayIsLike(){
		switch(day){
		
		case MONDAY: 
			System.out.println("MONDAY are bad");
			break;
			
		case WEDNSDAY:
			System.out.println("WEDNSDAY are better");
			break;
			
		case FRIDAY:
			System.out.println("FRIDAY is end of work day");
			break;
			
		case SUNDAY:
			System.out.println("SUNDAY is WeekEnd");
			break;
			
		 default:
			 System.out.println("Mid-Week days are so-so");
			 break;
		}
	}
	public static void main(String[] args) {
		  String str="THURSDAY";
		  WeekDay obj=new WeekDay(Day.valueOf(str));
		  obj.dayIsLike();
	}
}
