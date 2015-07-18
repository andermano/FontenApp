package br.com.fontenovaimoveis.fontenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
    public void runApp1(View v) {
        Intent it = new Intent(MainActivity.this, Circulo.class);

        startActivity(it);
    }

    public void runApp2(View v) {
        Intent it2 = new Intent(MainActivity.this, Cubo.class);

        startActivity(it2);
    }

    public void runApp3(View v) {
        Intent it3 = new Intent(MainActivity.this, Quadradro.class);

        startActivity(it3);
    }
    public void runApp4(View v) {
        Intent it4 = new Intent(MainActivity.this, Retangulo.class);

        startActivity(it4);
    }

    public void runApp5(View v) {
        Intent it5 = new Intent(MainActivity.this, TrianguloI.class);

        startActivity(it5);
    }
    public void runApp6(View v) {
        Intent it6 = new Intent(MainActivity.this, TrianguloR.class);

        startActivity(it6);
    }
    public void runApp7(View v) {
        Intent it7 = new Intent(MainActivity.this, Baskara.class);

        startActivity(it7);
    }
    public void runApp8(View v) {
        Intent it8 = new Intent(MainActivity.this, Pitagoras.class);

        startActivity(it8);
    }
    public void runApp9(View v) {
        Intent it9 = new Intent(MainActivity.this, Losangulo.class);

        startActivity(it9);
    }
    public void runApp10(View v) {
        Intent it10 = new Intent(MainActivity.this, Trapezio.class);

        startActivity(it10);
    }
    public void runApp11(View v) {
        Intent it11 = new Intent(MainActivity.this, Hexagono.class);

        startActivity(it11);
    }
    public void runApp12(View v) {
        Intent it12 = new Intent(MainActivity.this, Paralelogramo.class);

        startActivity(it12);
    }

}
