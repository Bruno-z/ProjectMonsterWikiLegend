package fr.wcs.monsterwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Monyonkai extends AppCompatActivity {


    TextView textViewLifetime;
    TextView textViewForce;
    TextView textViewVitesse;
    TextView textViewStamina;
    TextView message;
    ImageView Monster;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monyonkai);

        Intent Carte = getIntent();
        Monstres Mymonster = Carte.getParcelableExtra("carte");
        String Condition = Mymonster.getCondition();
        int DonneeForce = Mymonster.getDonneeForce();
        int element = Mymonster.getElement();
        int DonneeStamina = Mymonster.getDonneeStamina();
        int DonneeVitesse = Mymonster.getDonneeVitesse();
        int DonneeLifetime = Mymonster.getDonneeLifetime();

        textViewLifetime = (TextView) findViewById(R.id.textViewLifetime);
        textViewForce = (TextView) findViewById(R.id.textViewForce);
        textViewVitesse = (TextView) findViewById(R.id.textViewVitesse);
        textViewStamina = (TextView) findViewById(R.id.textViewStamina);
        Monster = (ImageView) findViewById(R.id.Monster);
        logo = (ImageView) findViewById(R.id.logo);
        message = (TextView) findViewById(R.id.textViewType);
        message.getText().toString();

        textViewLifetime.setText(Integer.toString(DonneeLifetime));
        textViewForce.setText(Integer.toString(DonneeForce));
        textViewVitesse.setText(Integer.toString(DonneeVitesse));
        textViewStamina.setText(Integer.toString(DonneeStamina));


        switch (element) {
            case 1:
                Monster.setImageResource(R.drawable.mersnake_1);
                logo.setImageResource(R.drawable.eau);
                message.setText(getString(R.string.Eau1));
                break;
            case 2:
                Monster.setImageResource(R.drawable.firesaur_1);
                logo.setImageResource(R.drawable.feu);
                message.setText(getString(R.string.Feu1));

                break;
            case 3:
                Monster.setImageResource(R.drawable.thunder_eagle_1);
                logo.setImageResource(R.drawable.foudre);
                message.setText(getString(R.string.Foudre1));
                break;
            case 4:
                Monster.setImageResource(R.drawable.treezard_1);
                logo.setImageResource(R.drawable.nature);
                message.setText(getString(R.string.Nature1));
                break;
            case 5:
                Monster.setImageResource(R.drawable.genie_1);
                logo.setImageResource(R.drawable.magie);
                message.setText(getString(R.string.Magie1));
                break;
            case 6:
                Monster.setImageResource(R.drawable.metalsaur_1);
                logo.setImageResource(R.drawable.metal);
                message.setText(getString(R.string.Metal1));
                break;
            case 7:
                Monster.setImageResource(R.drawable.tyrannoking_1);
                logo.setImageResource(R.drawable.mort);
                message.setText(getString(R.string.Mort1));

                break;
            case 8:
                Monster.setImageResource(R.drawable.oeuf_inconnu);
                logo.setImageResource(R.drawable.special);
                message.setText(getString(R.string.Special1));
                break;
            case 9:
                Monster.setImageResource(R.drawable.light_spirit_1);
                logo.setImageResource(R.drawable.lumiere);
                message.setText(getString(R.string.Lumiere1));
                break;
            case 10:
                Monster.setImageResource(R.drawable.rockilla_1);
                logo.setImageResource(R.drawable.terre);
                message.setText(getString(R.string.Terre1));
                break;
        }

    }
}
