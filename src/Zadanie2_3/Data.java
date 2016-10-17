package Zadanie2_3;


import java.util.Scanner;

/**
 * Created by Acer5740 on 15.10.2016.
 */
public class Data {

    public Data (long day, long month, long year){
        this.day = day;
        this.month = month;
        this.year = year;
        hour = minute = second = milisecond =0;
    }

   public String getTime () {
       return Long.toString(this.hour) + ":" + Long.toString(this.minute);
   }

    public String getDate (){
        String day = Long.toString(this.day);
        String year = Transformation.transformate((int)this.year,true);
        String month = "";
        switch ((int)this.month){
            case 1:
                month="января";
                break;
            case 2:
                month= "февраля";
                break;
            case 3:
                month= "марта";
                break;
            case 4:
                month= "апреля";
                break;
            case 5:
                month= "мая";
                break;
            case 6:
                month= "июня";
                break;
            case 7:
                month= "июля";
                break;
            case 8:
                month= "августа";
                break;
            case 9:
                month= "сентября";
                break;
            case 10:
                month= "октября";
                break;
            case 11:
                month= "ноября";
                break;
            case 12:
                month= "декабря";
                break;
        }
        return day+ " " + month + " " + year;


    }

    public void addYear(long year){
        this.year+=year;
    }

    public void addMonth(long month){
        this.month+=month;
        addYear((this.month-1)/12);
        this.month%=12;
        if(this.month == 0)
            this.month = 12;
    }

    public void addDay (long day){
        long fourYearsRange=365*4+1;
        long newYears=day/fourYearsRange*4;
        addYear(newYears);
        long ostatokDay=day%fourYearsRange;
        for (long i=0; i < ostatokDay; i++)
            addOneDay();

    }

    private void addOneDay() {
        if(day <=27) ++day;
        else
            if (day==31) {
                day = 1;
                addMonth(1);
            }
            else
                if (day<30)
                    if (month!=2) ++day;
                    else
                        if(day==29 || year%4!=0) {
                        day = 1;
                        addMonth(1);
                    }
                        else ++day;
                else
                    switch ((int)month){
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            ++day;
                            break;
                        default:
                            day=1;
                            addMonth(1);
                }

    }

    public void addHour(long hour){
        this.hour+=hour;
        addDay(this.hour/24);
        this.hour%=24;
    }

    public void addMinute(long minute){
        this.minute+=minute;
        addHour(this.minute/60);
        this.minute%=60;
    }

    public void addSecond(long second){
        this.second+=second;
        addMinute(this.second/60);
        this.second%=60;
    }

    public void addMilisecond(long milisecond){
        this.milisecond+=milisecond;
        addSecond(this.milisecond/1000);
        this.milisecond%=1000;
    }

    long year;
    long month;
    long day;
    long hour;
    long minute;
    long second;
    long milisecond;

    public static void main(String[] args) {
        Data start = new Data (1, 1, 1970);
        System.out.println(start.getDate()+ " " + start.getTime());
        System.out.println("Введите милисекунды milisec = ");
        Scanner input = new Scanner(System.in);
        long milisec = input.nextLong();
        start.addMilisecond(milisec);
        System.out.println(start.getDate()+ " " + start.getTime());


    }

}
