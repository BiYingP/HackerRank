Time Conversion

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Example

s = '12:01:00PM'

Return '12:01:00'

s = '12:01:00AM'

Return '00:01:00'


    public static String timeConversion(String s) {
    // Write your code here
    int hour = Integer.parseInt(s.substring(0, 2)) % 12;
    
    if (s.contains("PM")){
        hour += 12;
    }
    return String.format("%02d", hour) + s.substring(2,8);
    }
