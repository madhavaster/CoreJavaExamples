package daterelated;

import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String []args) {
		TimeZone tz =TimeZone.getDefault();
		System.out.println("default tz is:"+tz);
		//default tz is:sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null]

	}
}
