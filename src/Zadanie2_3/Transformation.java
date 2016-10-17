package Zadanie2_3;

/**
 * Created by Acer5740 on 16.10.2016.
 */
 public class Transformation {
    boolean sex; //род переменной: false - мужской; true - женский

    static String defineSexThousand (int a) {
        switch (((a / 1000) % 1000) % 10) {
            case 1:
                return "тысяча";
            case 2:
            case 3:
            case 4:
                return "тысячи";
            default:
                return "тысяч";
        }
    }

    static String transformate (int a, boolean serial){
        int numberThousand=(a/1000)%1000;
        return transformateThreeDigitsNunbers(numberThousand,false,false) + " " + defineSexThousand(a) + " " + transformateThreeDigitsNunbers(a%1000,true,true);
    }

    static String transformateThreeDigitsNunbers (int a, boolean serial, boolean sex) //serial - порядковость
    {//hundreds - сотни, tens - десятки, units - единицы
        int tens = (a%100)/10;
        int units = (a%10);
        boolean hundredsSerial=false;
        if (serial==true && tens==0 && units==0) hundredsSerial=true;
        if (tens==1) return  changeHundreds(a/100,hundredsSerial)+" "+ changeTens(tens, units, serial);
        return changeHundreds(a/100, hundredsSerial)+" "+changeTens(tens, units, serial) + " " + changeUnits(units, serial, sex);
    }

    static String changeHundreds(int hundreds, boolean serial){
        switch(hundreds){
            case 1:
                if (serial) return "сотый";
                return "сто";
            case 2:
                if (serial) return "двухсотый";
                return "двести";
            case 3:
                if (serial) return "трехсотый";
                return "триста";
            case 4:
                if (serial) return "четырехсотый";
                return "четыреста";
            case 5:
                if (serial) return "пятисотый";
                return "пятьсот";
            case 6:
                if (serial) return "шестисотый";
                return "шестьсот";
            case 7:
                if (serial) return "семисотый";
                return "семьсот";
            case 8:
                if (serial) return "восьмисотый";
                return "восемьсот";
            case 9:
                if (serial) return "девятисотый";
                return "девятьсот";
            default:
                return "";
        }
    }

    static String changeTens(int tens, int units, boolean serial){
        //poryadkovoct: false - нет; true - да
        switch(tens){
            case 1:
                switch (units){
                    case 1:
                        if (serial) return "одиннадцатый";
                        return "одиннадцать";
                    case 2:
                        if (serial) return "двенадцатый";
                        return "двенадцать";
                    case 3:
                        if (serial) return "тринадцатый";
                        return "тринадцать";
                    case 4:
                        if (serial) return "четырнадцатый";
                        return "четырнадцать";
                    case 5:
                        if (serial) return "пятнадцатый";
                        return "пятнадцать";
                    case 6:
                        if (serial) return "шестнадцатый";
                        return "шестнадцать";
                    case 7:
                        if (serial) return "семнадцатый";
                        return "семнадцать";
                    case 8:
                        if (serial) return "восемнадцатый";
                        return "восемнадцать";
                    case 9:
                        if (serial) return "девятнадцатый";
                        return "девятнадцать";
                    default:
                        if (serial) return "десятый";
                        return "десять";
                }
            case 2:
                if (serial && units==0) return "двадцатый";
                return "двадцать";
            case 3:
                if (serial && units==0) return "тридцатый";
                return "тридцать";
            case 4:
                if (serial && units==0) return "сороковой";
                return "сорок";
            case 5:
                if (serial && units==0) return "пятидесятый";
                return "пятьдесят";
            case 6:
                if (serial && units==0) return "шестидесятый";
                return "шестьдесят";
            case 7:
                if (serial && units==0) return "семидесятый";
                return "семьдесят";
            case 8:
                if (serial && units==0) return "восьмидесятый";
                return "восемьдесят";
            case 9:
                if (serial && units==0) return "девяностый";
                return "девяносто";
            default:
                return "";
        }
    }

    static String changeUnits(int units, boolean serial, boolean sex){
        switch(units){
            case 1:
                if (serial) return "первый";
                if (sex) return "один";
                    return "одна";
            case 2:
                if (serial) return "второй";
                if (sex) return "два";
                    return "две";
            case 3:
                if (serial) return "третий";
                return "три";
            case 4:
                if (serial) return "четвертый";
                return "четыре";
            case 5:
                if (serial) return "пятый";
                return "пять";
            case 6:
                if (serial) return "шестой";
                return "шесть";
            case 7:
                if (serial) return "седьмой";
                return "семь";
            case 8:
                if (serial) return "восьмой";
                return "восемь";
            case 9:
                if (serial) return "девятый";
                return "девять";
            default:
                return "";
        }
    }


    public static void main(String[] args) {
        int a=1861;
        System.out.println(transformate(a,true)+ " год");



    }

}
