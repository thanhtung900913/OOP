package lab5.ex1_5;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public final  String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    public final  String[] DAYS = {"Sun","Mon","Tue","Wen","Thu","Fri","Sat"};
    public final int[] DAYS_IN_MONTH ={31,28,31,30,31,30,31,31,30,31,30,31};

    public boolean isLeapYear(){
        if(this.year %4 ==0 && this.year %100 != 0){
            return true;
        }
        return false;
    }
    public boolean isValidDate(){
        if(this.year >= 0 && this.month <= 12 && this.month >=1 && this.day <= 31 && this.day >= 1){
            return true;
        }
        return false;
    }
    public int getDayOfWeek(){
        int y = this.year;
        int m = this.month;
        int d = this.day;
        if (this.month < 3) {
            m += 12;
            y -= 1;
        }

        int century = y / 100;
        y = y % 100;

        int dayOfWeek = (d + ((13 * (m + 1)) / 5) + y + (y / 4) + (century / 4) + (5 * century)) % 7;

        // Trả về giá trị từ 0 (Saturday) đến 6 (Friday)
        return dayOfWeek+1;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public String toString(){
        return DAYS[getDayOfWeek()]+" "+this.day+" "+this.month+" "+this.year;
    }

    public MyDate nextDay() {
        day++;


        if (day > DAYS_IN_MONTH[month - 1]) {
            day = 1;
            month++;

            if (month > 12) {
                month = 1;
                year++;
            }
        }

        return this;
    }

    public MyDate nextMonth() {
            month++;
            if (month > 12) {
                month = 1;
                year++;

            }

        return this;
    }

    public MyDate nextYear() {
            year++;

        return this;
    }


    public MyDate previousDay() {
        day--;
        if (day == 0) {
            day = DAYS_IN_MONTH[month-1];
            month--;
            if (month == 0) {
                month = 12;
                year--;
            }
        }

        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month == 0) {
            month = 12;
            year--;
        }

        return this;
    }

    public MyDate previousYear() {
            year--;

        return this;
    }
}
