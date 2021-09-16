//Five Bikers Compete in a race such that they drive at
//a constant speed which may or may not be the same as
//the other. To qualify the race, the speed of a racer must
//be more than the average speed of all 5 racers. Write a
//Java program to take as input the speed of each racer
//and print back the speed of qualifying racers.

class Bikers{
    public static void main(String[] args)
    {
        float r1=120,r2=200,r3=100,r4=240,r5=230;
        float avg;
        avg=(r1+r2+r3+r4+r5)/5;

        System.out.println("avg is="+avg);
        if(r1>avg)
            System.out.println("r1 is qualified");
        if(r2>avg)
            System.out.println("r2 is qualified");
        if(r3>avg)
            System.out.println("r3 is qualified");
        if(r4>avg)
            System.out.println("r4 is qualified");
        if(r5>avg)
            System.out.println("r5 is qualified");

    }
}