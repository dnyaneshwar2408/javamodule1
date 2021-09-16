//Implement a java program to calculate gross salary &
//net salary taking the following data.
//Input: empno, empname, basic
//Process:
//DA=70% of basic
//HRA=30% of basic
//CCA=Rs240/-
//PF=10% of basic
//PT= Rs100/-


class Salary2 {
    public static void main(String[] args)
    {
        float basic=25000;
        float DA,HRA,CCA,PF,PT;
        float gross,net;

        DA= (float) (0.7*basic);
        HRA= (float) (0.3*basic);
        CCA= 240;
        PF= (float) (0.1*basic);
        PT=100;

        gross=DA+HRA+CCA+basic;
        net=gross-PF-PT;
        System.out.println("gross= "+gross);
        System.out.println("net= "+net);
    }
}