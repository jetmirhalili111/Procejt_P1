import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Controller_P implements ActionListener  {
   private View_P obj_v;
   private Model_P obj_m;
   private String s;
   private int t;
   private double Vo_a,Vo,a,d;
   private JButton b;
   private JPanel p;
   
   public Controller_P(View_P obj_v, Model_P obj_m) {
      this.obj_v = obj_v;
      this.obj_m = obj_m;
   }
   public double s_wrong(String ms, String title, int i, String ms_g, int k) {
      s=obj_v.input(ms,title,i);
      while (obj_m.wrong(s)==false) {
        Vo_a=s_wrong(ms_g,title,k,ms_g,k);
      }
      Vo_a=obj_m.s_to_i(s);
      return Vo_a;
   }
   public double distance1(double Vo, double a) {
      this.Vo=Vo;
      this.a=a;
      d=obj_m.distance(Vo,a);
      t=obj_m.t-1;
      return d;
   }
    
   public void fundi(double d) {
      b=obj_v.b;
      b.addActionListener(this); 
      p = obj_v.output_p(d,t,Vo,a);
      obj_v.output_f(p);
   }
   public void actionPerformed (ActionEvent e) {
      d=distance1(Vo,a);
      p=obj_v.output_p(d,t,Vo,a);
   }
}
