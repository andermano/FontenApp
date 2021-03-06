package br.com.fontenovaimoveis.fontenapp;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Hexagono extends ActionBarActivity {
    Button Bcalcular;
    private EditText ladohexagono;
    private EditText radiohexagono;
    private EditText apotemahexagono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagono);
        Bcalcular=(Button) findViewById(R.id.buttonCalc);
        ladohexagono=(EditText) findViewById(R.id.editTextLadoHexagono);
        radiohexagono=(EditText) findViewById(R.id.editTextRadioHexagono);
        apotemahexagono=(EditText) findViewById(R.id.editTextApotemaHexagono);

        Bcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((ladohexagono.getText().toString().equals(""))||(radiohexagono.getText().toString().equals(""))||(apotemahexagono.getText().toString().equals("")))){
                    Toast t = Toast.makeText(getApplicationContext(),"Informe o valor solicitado.",Toast.LENGTH_SHORT);
                    t.show();
                }else{

                    double resultado;
                    double ladohexagono1 = Float.parseFloat(ladohexagono.getText().toString());
                    double radiohexagono1 = Float.parseFloat(radiohexagono.getText().toString());
                    double apotemahexagono1 = Float.parseFloat(apotemahexagono.getText().toString());

                   if((radiohexagono1 == 0)&&(apotemahexagono1 ==0)){
                       resultado = 1.72048 * Math.pow(ladohexagono1,2);
                       AlertDialog.Builder dialogo = new AlertDialog.Builder(Hexagono.this);
                       dialogo.setTitle("Resultado");
                       dialogo.setMessage("A Area do Hexagono e:" + String.valueOf(resultado));
                       dialogo.setNeutralButton("OK",null);

                       dialogo.show();
                   }
                  else if(apotemahexagono1 == 0){
                      apotemahexagono1= Math.sqrt(Math.pow(radiohexagono1,2)-Math.pow(ladohexagono1/2,2));
                      resultado = ((ladohexagono1*5)*apotemahexagono1)/2;
                      AlertDialog.Builder dialogo = new AlertDialog.Builder(Hexagono.this);
                      dialogo.setTitle("Resultado");
                      dialogo.setMessage("A Area do Hexagono e:" + String.valueOf(resultado));
                      dialogo.setNeutralButton("OK",null);

                      dialogo.show();
                  }
                    else if(radiohexagono1 == 0){
                      resultado = ((ladohexagono1*5)*apotemahexagono1/2);
                        AlertDialog.Builder dialogo = new AlertDialog.Builder(Hexagono.this);
                        dialogo.setTitle("Resultado");
                        dialogo.setMessage("A Area do Hexagono e:" + String.valueOf(resultado));
                        dialogo.setNeutralButton("OK",null);

                       dialogo.show();
                    }
                }
            }
        });
        overridePendingTransition(R.anim.activity_filho_entrando, R.anim.activity_pai_saindo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hexagono, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                finish();
                return true;

        //noinspection SimplifiableIfStatement
       // if (id == R.id.action_settings) {
            //return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.acitivity_pai_antrando, R.anim.activity_filho_saindo);
    }
}
