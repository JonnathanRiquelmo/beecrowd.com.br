// 1006 - Média 2
// https://www.beecrowd.com.br/judge/pt/problems/view/1006

using System;
using System.Globalization;

class bee1006
{
    static void Main(string[] args)
    {
        double A = double.Parse(Console.ReadLine());
        double B = double.Parse(Console.ReadLine());
        double C = double.Parse(Console.ReadLine());

        A *= 2D;
        B *= 3D;
        C *= 5D;

        double MEDIA = (A + B + C) / 10D;

        Console.WriteLine("MEDIA = " + MEDIA.ToString("F1", CultureInfo.InvariantCulture));
    }
}