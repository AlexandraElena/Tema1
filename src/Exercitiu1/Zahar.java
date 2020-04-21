package Exercitiu1;

public class Zahar extends  Ingrediente {

    //ai nevoie de un singur tip care la runtime poate fi zaharAlb sau ZaharBrun
    private String tip1;
    private String tip2;

    public String getTip1() {
        return tip1;
    }

    public void setTip1(String tip1) {
        this.tip1 = tip1;
    }

    public String getTip2() {
        return tip2;
    }

    public void setTip2(String tip2) {
        this.tip2 = tip2;
    }
}
