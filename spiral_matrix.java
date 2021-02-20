/*
Input   ->  3 3
            4 5 6
            7 8 9
            10 11 12
            
Output  ->  4
            5
            6
            9
            12
            11
            10
            7
            8
*/




class Result
{
  static void printSpiral(int a[][], int r, int c)
  {
	int x=0,y=0,i;//x=starting of row ; y=starting of column
    while(x<r && y<c)
    {
      for(i=y;i<c;i++)
        System.out.println(a[x][i]);
      x++;
      for(i=x;i<r;i++)
        System.out.println(a[i][c-1]);
      c--;
      if(x<r)
      {
        for(i=c-1;i>=y;i--)
          System.out.println(a[r-1][i]);
        r--;
      }
      if(y<c)
      {
        for(i=r-1;i>=x;i--)
          System.out.println(a[i][y]);
        y++;
      }
    }
  }
}