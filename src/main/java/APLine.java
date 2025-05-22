public class APLine
{
   private int A1,B1,C1;
   public APLine(int a, int b, int c){   
      int A1 = a;
      int B1 = b;
      int C1 = c;
   } 
   public double getSlope(){
      return -(double)A1/B1;
   }
   public boolean isOnLine(int x, int y){
      return (A1*x+B1*y+C1 == 0);
   }
}
