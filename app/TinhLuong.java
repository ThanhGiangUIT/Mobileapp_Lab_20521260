
import android.text.Editable;
import android.util.Log;
import android.widget.EditText;

import java.text.DecimalFormat;

    public class TinhLuong {

        protected String Name;
        protected double Salary;


        public TinhLuong(String a, double b) {
            this.Name = a;
            this.Salary = b;
        }

        public String getName() {
            return Name;
        }

        public void setName(){
            this.Name = Name;
        }

        public double getSalary(){
            return Salary;
        }

        public void setSalary(){
            this.Salary = Salary;
        }



        public void calculationSalary(){
            double a, tax;
            DecimalFormat df = new DecimalFormat("#,###.#");

            a = this.Salary - this.Salary*0.105;
            tax = (this.Salary - 11000000) * 0.05;

            if (a <= 11000000){
                Log.d("TinhLuong",this.Name + ": " + df.format(a));
            }else {
                Log.d("TinhLuong",this.Name + ": " + df.format(a - tax));
            }
        }
    }
}
