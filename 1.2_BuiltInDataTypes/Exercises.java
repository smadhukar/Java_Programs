import Math;
public class Exercises
{
    public static void main(String[] args)
    {
        double Theta = args[0];
        double cosine = Math.cos(Theta);
        double sine = Math.sin(Theta);
        double sum = Math.pow(cosine, 2) + Math.pow(sine,2);
        System.out.println(sum);
    }
}