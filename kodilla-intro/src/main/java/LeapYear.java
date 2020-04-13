public class LeapYear {

    int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean getLeap() {
        if (this.year % 4 > 0) {
            return false;
        } else if (this.year % 400 == 0) {
            return true;
        } else if ((this.year % 400 == 0) && (this.year % 100) == 0) {
            return true;
        } else if(this.year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

}