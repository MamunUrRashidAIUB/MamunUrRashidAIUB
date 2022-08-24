
public class Alarm 
{
    private String alarmName;
    private int hour;
    private int minute;
	public Alarm()
	{
	}	
    public Alarm(String aName, int hr, int mt) 
	{
        alarmName = aName;
        hour = hr;
        minute = mt;
    }
    public Alarm(int hour, int minute) throws Exception 
	{
        if(hour<0 || hour >24 || minute<0 || minute>60)
        throw new Exception("Input data is not valid.");
        this.hour = hour;
        this.minute = minute;
    }
    public String getAlarmName() 
	{
        return alarmName;
    }
    public void setAlarmName(String aName)
	{
        this.alarmName = aName;
    }
    public int getHour()
	{
        return hour;
    }
    public void setHour(int hour) throws Exception 
	{
        if(hour<0 || hour >24)
            throw new Exception("hour is not valid.");
        this.hour = hour;
    }
    public int getMinute() 
	{
        return minute;
    }
    public void setMinute(int minute) throws Exception 
	{
        if(minute<0 || minute >60)
            throw new Exception("minute is not valid.");
        this.minute = minute;
    }
}