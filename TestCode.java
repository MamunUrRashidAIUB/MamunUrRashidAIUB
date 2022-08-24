public class TestCode 
{
    public static void main(String[] args) {

        // Declaration of alarmObject1 as type of Alarm
       Alarm alarmObject1=new Alarm();

		AlarmManagement aMgtObject=new AlarmManagement();
		
        aMgtObject.addAlarm(alarmObject1);
		
        aMgtObject.displayAlarmView();
        System.out.println(" Add an Alarm from View.");
        aMgtObject.addAlarmFromView();
        aMgtObject.displayAlarmView();
      //Display statement

        System.out.println("Alarm index 1 =  "+aMgtObject.getAlarmAt(1));

    
		}
}