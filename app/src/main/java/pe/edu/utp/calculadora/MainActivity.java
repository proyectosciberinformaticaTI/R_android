package pe.edu.utp.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private double valora, valorb;
    private EditText oper1,oper2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        oper1=(EditText)findViewById(R.id.num1);

        oper2=(EditText)findViewById(R.id.num2);
         resultado=(TextView)findViewById(R.id.resultado);
    }
   public void cSumar(View view){
        if(this.oper1.getText().toString().length()>0 && this.oper2.getText().toString().length()>0){
            this.valora=Double.parseDouble(oper1.getText().toString());
            this.valorb=Double.parseDouble(oper2.getText().toString());
            this.resultado.setText(Double.toString((this.valora + valorb)));
        }
   }


    public void cRestar(View view){
        if(this.oper1.getText().toString().length()>0 && this.oper2.getText().toString().length()>0){
            this.valora=Double.parseDouble(oper1.getText().toString());
            this.valorb=Double.parseDouble(oper2.getText().toString());
            this.resultado.setText(Double.toString((this.valora - valorb)));
        }
    }

    public void cMultiplicar(View view){
        if(this.oper1.getText().toString().length()>0 && this.oper2.getText().toString().length()>0){
            this.valora=Double.parseDouble(oper1.getText().toString());
            this.valorb=Double.parseDouble(oper2.getText().toString());
            this.resultado.setText(Double.toString((this.valora * valorb)));
        }
    }

    public void cDividir(View view){
        if(this.oper1.getText().toString().length()>0 && this.oper2.getText().toString().length()>0){
            this.valora=Double.parseDouble(oper1.getText().toString());
            this.valorb=Double.parseDouble(oper2.getText().toString());
            this.resultado.setText(Double.toString((this.valora / valorb)));
        }
    }

}