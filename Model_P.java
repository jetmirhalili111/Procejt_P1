public class Model_P {
   protected double d,sh,k;
   protected int t=1;
   boolean ok;
   
   public double distance(double Vo, double a) {
      d = Vo*t + (1.0/2)*a*Math.pow(t,2);
      t++;
      return d;
   }
   public double s_to_i(String s) {
      sh=Double.parseDouble(s);
      return sh;
   }
   public boolean wrong(String c){
      ok=true;
      for (int x=1;x<3;x++){
         try {
            k=s_to_i(c);
            if (k<0) {
               c=c+"a";
               }
         }
         catch (Exception e) {
          ok=false;
         }
      }
      return ok;
   }
   
}