// 1005 - Média 1
// https://www.beecrowd.com.br/judge/pt/problems/view/1005

using System;
using System.Globalization;

class bee1005
{

    static void Main(string[] args)
    {
        string textA = Console.ReadLine();
        string textB = Console.ReadLine();

        double A = double.Parse(textA, CultureInfo.InvariantCulture);
        double B = double.Parse(textB, CultureInfo.InvariantCulture);

        double MEDIA = ((A * 3.5D) + (B * 7.5D)) / 11D;

        if (MEDIA == 10)
        {
            Console.WriteLine("MEDIA = 10.00000");
        }
        else if (MEDIA == 0)
        {
            Console.WriteLine("MEDIA = 0.00000");
        }
        else
        {
            Console.WriteLine("MEDIA = " + Convert.ToString(Math.Round(MEDIA, 5)).Replace(',', '.'));
        }
    }
}