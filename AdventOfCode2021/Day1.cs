using System.IO;

namespace AdventOfCode
{
    public class Day1Part1
    {
        public int CountLargerMeasurements(string filepath)
        {
            var input = File.ReadAllLines(filepath);
            var intArray = Array.ConvertAll(input, int.Parse);

            var increases = 0;

            for (int i = 1; i < intArray.Length; i++)
            {
                if (intArray[i] > intArray[i - 1])
                {
                    increases++;
                }
            }

            return increases;
        }
    }
}