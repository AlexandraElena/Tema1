package Exercitiu1;

public class Cafea extends Ingrediente {

    public static void main(String[]args){
        Cafea cafea=new Cafea();
        cafea.setNume("Starbucks");

Zahar zahar1 = new Zahar();
Zahar zahar2=new Zahar();
zahar1.setTip1("brun");
zahar2.setTip2("alb");
Lapte procentaj=new Lapte();
Lapte unitati=new Lapte();
procentaj.setProcentajGrasime(1.5);
Ingrediente cantitateZahAlb=new Ingrediente();
Ingrediente cantitateZahBrun=new Ingrediente();
cantitateZahAlb.setCantitate(1);
cantitateZahBrun.setCantitate(2);
unitati.setCantitate(3);

        System.out.println("Aceasta cafea de tip " + cafea.getNume()+ " are: " + cantitateZahBrun.getCantitate() + " unitati de zahar " +zahar1.getTip1()+"," +
        cantitateZahAlb.getCantitate()+ " unitate de zahar "+ zahar2.getTip2()+ " , " + unitati.getCantitate() + " unitati de lapte cu " + procentaj.getProcentajGrasime()+"%"+ " procentaj");


    }
}
