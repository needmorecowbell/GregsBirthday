package musciano.adam.birthday;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;




public class Driver {
	public static void main(String []args){
		String date,day,time;
		String []songs= {"song1","song2","song3","song4",
						  "song5","song6","song7"};
		MakeSound m= new MakeSound();
		int x;
		while(true){
			date= ZonedDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
			day= date.substring(date.length()-2);
			time= ZonedDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME).substring(3,5);
			
			if(day.equals("26")&&(Integer.parseInt(time)%30==0)){
				x=(int)(Math.random()*(songs.length));
				System.out.println("Playing song"+x+", time to celebrate!");
				m.playSound("src/musciano/adam/birthday/"+songs[x]+".wav");
			}
		}
		

		
		
	}
}