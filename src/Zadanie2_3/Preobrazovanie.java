package Zadanie2_3;

/**
 * Created by Acer5740 on 16.10.2016.
 */
 public class Preobrazovanie {
    boolean sex; //род переменной: false - мужской; true - женский

    static String rodTisyach (int a) {
        if ((((a / 1000) % 1000) % 100)/10==1) return "тысяч";
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

    static String preobrazovanie (int a, boolean poryadkovost){
        int chicloTisyach=(a/1000)%1000;
        return preobrazovanieThehZnachnihChisel(chicloTisyach,false,false) + " " + rodTisyach(a) + " " + preobrazovanieThehZnachnihChisel(a%1000,true,true);
    }

    static String preobrazovanieThehZnachnihChisel (int a, boolean poryadkovost, boolean sex)
    {
        int decyatki = (a%100)/10;
        int edinici = (a%10);
        boolean sotniPoryadkovii=false;
        if (poryadkovost==true && decyatki==0 && edinici==0) sotniPoryadkovii=true;
        if (decyatki==1) return  changeSotni(a/100,sotniPoryadkovii)+" "+ changeDesyatki(decyatki, edinici, poryadkovost);
        return changeSotni(a/100, sotniPoryadkovii)+" "+changeDesyatki(decyatki, edinici, poryadkovost) + " " + changeEdinici(edinici, poryadkovost, sex);
    }

    static String changeSotni(int sotni, boolean poryadkovoct){
        switch(sotni){
            case 1:
                if (poryadkovoct) return "сотый";
                return "сто";
            case 2:
                if (poryadkovoct) return "двухсотый";
                return "двести";
            case 3:
                if (poryadkovoct) return "трехсотый";
                return "триста";
            case 4:
                if (poryadkovoct) return "четырехсотый";
                return "четыреста";
            case 5:
                if (poryadkovoct) return "пятисотый";
                return "пятьсот";
            case 6:
                if (poryadkovoct) return "шестисотый";
                return "шестьсот";
            case 7:
                if (poryadkovoct) return "семисотый";
                return "семьсот";
            case 8:
                if (poryadkovoct) return "восьмисотый";
                return "восемьсот";
            case 9:
                if (poryadkovoct) return "девятисотый";
                return "девятьсот";
            default:
                return "";
        }
    }

    static String changeDesyatki(int desyatki, int edinici, boolean poryadkovost){
        //poryadkovoct: false - нет; true - да
        switch(desyatki){
            case 1:
                switch (edinici){
                    case 1:
                        if (poryadkovost) return "одиннадцатый";
                        return "одиннадцать";
                    case 2:
                        if (poryadkovost) return "двенадцатый";
                        return "двенадцать";
                    case 3:
                        if (poryadkovost) return "тринадцатый";
                        return "тринадцать";
                    case 4:
                        if (poryadkovost) return "четырнадцатый";
                        return "четырнадцать";
                    case 5:
                        if (poryadkovost) return "пятнадцатый";
                        return "пятнадцать";
                    case 6:
                        if (poryadkovost) return "шестнадцатый";
                        return "шестнадцать";
                    case 7:
                        if (poryadkovost) return "семнадцатый";
                        return "семнадцать";
                    case 8:
                        if (poryadkovost) return "восемнадцатый";
                        return "восемнадцать";
                    case 9:
                        if (poryadkovost) return "девятнадцатый";
                        return "девятнадцать";
                    default:
                        if (poryadkovost) return "десятый";
                        return "десять";
                }
            case 2:
                if (poryadkovost && edinici==0) return "двадцатый";
                return "двадцать";
            case 3:
                if (poryadkovost && edinici==0) return "тридцатый";
                return "тридцать";
            case 4:
                if (poryadkovost && edinici==0) return "сороковой";
                return "сорок";
            case 5:
                if (poryadkovost && edinici==0) return "пятидесятый";
                return "пятьдесят";
            case 6:
                if (poryadkovost && edinici==0) return "шестидесятый";
                return "шестьдесят";
            case 7:
                if (poryadkovost && edinici==0) return "семидесятый";
                return "семьдесят";
            case 8:
                if (poryadkovost && edinici==0) return "восьмидесятый";
                return "восемьдесят";
            case 9:
                if (poryadkovost && edinici==0) return "девяностый";
                return "девяносто";
            default:
                return "";
        }
    }

    static String changeEdinici(int edinici, boolean poryadkovost, boolean sex){
        switch(edinici){
            case 1:
                if (poryadkovost) return "первый";
                if (sex) return "один";
                    return "одна";
            case 2:
                if (poryadkovost) return "второй";
                if (sex) return "два";
                    return "две";
            case 3:
                if (poryadkovost) return "третий";
                return "три";
            case 4:
                if (poryadkovost) return "четвертый";
                return "четыре";
            case 5:
                if (poryadkovost) return "пятый";
                return "пять";
            case 6:
                if (poryadkovost) return "шестой";
                return "шесть";
            case 7:
                if (poryadkovost) return "седьмой";
                return "семь";
            case 8:
                if (poryadkovost) return "восьмой";
                return "восемь";
            case 9:
                if (poryadkovost) return "девятый";
                return "девять";
            default:
                return "";
        }
    }


    public static void main(String[] args) {
        int a=714_215;
        System.out.println(preobrazovanie(a,true)+ " год");



    }

}
