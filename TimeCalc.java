public class TimeCalc {
    public static void main(String[] args) {
       String time = args[0];
       int minutesToAdd = Integer.parseInt(args[1]);
       int hours = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
       int minutes = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
       hours += minutesToAdd / 60;
       minutes += minutesToAdd % 60;
       if (minutes >= 60) {
            hours++;
            minutes -= 60;
       }
       hours = hours % 24;
       String space1 = "", space2 = "";
       if(hours < 10)
            space1 = "0";
       if(minutes < 10)
            space2 = "0";
       System.out.println(space1 + hours + ":" + space2 + minutes);
    }
}