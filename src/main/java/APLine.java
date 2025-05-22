public class APLine
{
   private int A,B,C;
   public APLine(int a, int b, int c){   
      int A = a;
      int B = b;
      int C = c;
   } 
   public double getSlope(){
      return -(double)A/B;
   }
   public boolean isOnLine(int a, int b, int c){
      return (a*x+b*y+c == 0);
   }
}
