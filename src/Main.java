public class Main
{
    public static void main(String[] args)
    {
        double springCost = 120.50;
        double summerCost = 234.75;
        double fallCost = 116.15;
        double winterCost = 287.65;
        double yearCost = 0.00;

        yearCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("You said spring cost was $120.50, summer cost $234.75, fall cost $116.75, and winter costs $287.65. Your yearly cost is $" + yearCost + ".");
    }
}