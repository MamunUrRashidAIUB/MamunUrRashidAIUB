import java.util.*;
public class AlarmView extends Alarm
{
    public AlarmView()
	{
    }
    public Alarm userCreateAnAlarm()
	{
        Scanner scObject=new Scanner(System.in);
        System.out.print("Enter Message: ");
        String alarmMessage = scObject.nextLine();
        System.out.print("Enter Hour: ");
        int hour=scObject.nextInt();
        System.out.print("Enter Minute: ");
        int minute=scObject.nextInt();
        Alarm alObject=new Alarm(alarmMessage, hour, minute);
        return alObject;
    }
}