package fr.wcs.monsterwiki;

import android.content.Intent;
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

        Intent CustomizeMonsterNameToYourMonster= getIntent();

        String departureMessage = CustomizeMonsterNameToYourMonster.getStringExtra("myDeparture");
        String destinationMessage = CustomizeMonsterNameToYourMonster.getStringExtra("myDestination");

        textViewLifetime.setText(departureMessage + " " + getString(R.string.to) + " " + destinationMessage);


    }
}
