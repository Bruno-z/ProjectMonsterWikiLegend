package fr.wcs.monsterwiki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class YourMonster extends AppCompatActivity {

    TextView textViewLifetime;
    TextView textViewForce;
    TextView textViewVitesse;
    TextView textViewStamina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_monster);

        textViewLifetime = (TextView) findViewById(R.id.textViewLifetime);
        textViewForce = (TextView) findViewById(R.id.textViewForce);
        textViewVitesse = (TextView) findViewById(R.id.textViewVitesse);
        textViewStamina = (TextView) findViewById(R.id.textViewStamina);


    }
}
