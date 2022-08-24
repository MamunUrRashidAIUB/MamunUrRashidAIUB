import java.util.*;
public class AlarmManagement 
{
    private ArrayList<Alarm> alarms;
    private AlarmView view;
    public AlarmManagement()
	{
        alarms = new ArrayList<>();
        view=new AlarmView();
    }
    public void addAlarm(Alarm a)
	{
        alarms.add(a);
    }
    public Alarm getAlarmAt(int idx)
	{
        return alarms.get(idx);
    }
    public void addAlarmFromView()
	{
        Alarm alObject=view.userCreateAnAlarm();
        alarms.add(alObject);
    }
    public void displayAlarmView()
	{
        for(Alarm eachAlarm:alarms)
            view.displayAlarm(eachAlarm.getAlarmName());
    }
}