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


public class TrianguloR extends ActionBarActivity {
Button Bcalcular;
private EditText cateto1;
private EditText cateto2;
private EditText cateto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo_r);

        Bcalcular = (Button) findViewById(R.id.buttonCalc);
        cateto1 = (EditText) findViewById(R.id.editTextCateto1TriangloR);
        cateto2 = (EditText) findViewById(R.id.editTextCateto2TriangloR);
        cateto3 = (EditText) findViewById(R.id.editTextCateto3TriangloR);

        Bcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((cateto1.getText().toString().equals(""))||(cateto2.getText().toString().equals(""))||(cateto3.getText().toString().equals("")))){
                    Toast t = Toast.makeText(getApplicationContext(),"Informe o valor solicitado.",Toast.LENGTH_SHORT);
                    t.show();
                }else{
                    double resultado;
                    double cat1 = Float.parseFloat(cateto1.getText().toString());
                    double cat2 = Float.parseFloat(cateto2.getText().toString());
                    double cat3 = Float.parseFloat(cateto3.getText().toString());

                    if (cat1 == 0){

                        resultado = Math.pow( Math.pow(cat2,2)+ Math.pow(cat3,2),1);

                        AlertDialog.Builder dialogo = new AlertDialog.Builder(TrianguloR.this);
                        dialogo.setTitle("Resultado");
                        dialogo.setMessage("A hipotenusa e:" + String.valueOf(resultado));
                        dialogo.setNeutralButton("OK",null);

                        dialogo.show();

                    }
                    else if(cat2 == 0){

                        resultado = Math.pow(Math.pow(cat1,2)+ Math.pow(cat3,2),1);

                        AlertDialog.Builder dialogo = new AlertDialog.Builder(TrianguloR.this);
                        dialogo.setTitle("Resultado");
                        dialogo.setMessage("A hipotenusa e:" + String.valueOf(resultado));
                        dialogo.setNeutralButton("OK",null);

                        dialogo.show();
                    }

                    else if(cat3 == 0){

                        resultado = Math.pow(Math.pow(cat1,2)+ Math.pow(cat2,2),1);

                        AlertDialog.Builder dialogo = new AlertDialog.Builder(TrianguloR.this);
                        dialogo.setTitle("Resultado");
                        dialogo.setMessage("A hipotenusa e:" + String.valueOf(resultado));
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
        getMenuInflater().inflate(R.menu.menu_triangulo_r, menu);
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

            //if (id == R.id.action_settings) {
            //    return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.acitivity_pai_antrando,R.anim.activity_filho_saindo);
    }
}
