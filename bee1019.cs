// 1019 - Conversão de Tempo
// https://www.beecrowd.com.br/judge/pt/problems/view/1019

using System;

class URI
{

    static void Main(string[] args)
    {

        Int64 time = Int64.Parse(System.Console.ReadLine());

        Int64 hours = time / 3600;
        Int64 minutes = time / 60;
        if (minutes > 60)
        {
            minutes = minutes % 60;
        }
        Int64 seconds = time % 60;

        System.Console.WriteLine(hours + ":" + minutes + ":" + seconds);
    }

}