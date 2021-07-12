package sequality;

public class Calculate
{
  public int sum (int x, int y)
  {
    return x + y;
  }

  public float sumAve (int x, int y)
  {
    return (float)(x + y) / 2;
  }

  public int total (int x, int y)
  {
    int total = 0;
    for (int i = x; i <= y; i++)
      total += i;
    return total;
  }

  public float totalAve (int x, int y)
  {
    int total = 0;
    for (int i = x; i <= y; i++)
      total += i;
    return (float)(total-y)/2;
  }

  public int totalOdd (int x, int y)
  {
    int total = 0;
    for (int i = x; i <= y; i++)
      if (i % 2 == 1)
        total += i;
    return total;
  }

  public int totalEven (int x, int y)
  {
    int total = 0;
    for (int i = x; i <= y; i++)
      if (i % 2 == 0)
        total += i;
    return total;
  }
}
