package fr.wcs.monsterwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class YourMonster extends AppCompatActivity {

    TextView textViewLifetime;
    TextView textViewForce;
    TextView textViewVitesse;
    TextView textViewStamina;
    TextView message;
    ImageView Monster;
    ImageView logo;
    Button suivant;
    Button recommencer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_monster);

        textViewLifetime = (TextView) findViewById(R.id.textViewLifetime);
        textViewForce = (TextView) findViewById(R.id.textViewForce);
        textViewVitesse = (TextView) findViewById(R.id.textViewVitesse);
        textViewStamina = (TextView) findViewById(R.id.textViewStamina);
        message = (TextView) findViewById(R.id.textViewType);
        message.getText().toString();
        Monster = (ImageView) findViewById(R.id.Monster);
        logo = (ImageView) findViewById(R.id.logo);
        suivant = (Button) findViewById(R.id.suivant);
        recommencer = (Button) findViewById(R.id.recommencer);

         /* Intent caractéristiques du monstre */
        Intent intent2 = getIntent();

        final int donneeLifetime = intent2.getIntExtra("donneeLifetime", 0);
        final int donneeForce = intent2.getIntExtra("donneeForce", 0);
        final int donneeVitesse = intent2.getIntExtra("donneeVitesse", 0);
        final int donneeStamina = intent2.getIntExtra("donneeStamina", 0);

                /* Intent nom du monstre */


        Intent condition = getIntent();
        final String nomz = condition.getStringExtra("condition");
        setTitle(condition.getStringExtra("condition"));
        /*Intent type de Monstre + logo du type + image du monstre*/
        Intent Custom1 = getIntent();
        final Integer bruno = Custom1.getIntExtra("element",0);
        int element = Custom1.getIntExtra("element", 0);


        textViewLifetime.setText(Integer.toString(donneeLifetime));
        textViewForce.setText(Integer.toString(donneeForce));
        textViewVitesse.setText(Integer.toString(donneeVitesse));
        textViewStamina.setText(Integer.toString(donneeStamina));

        suivant.setOnClickListener(new View.OnClickListener() {


            /* Fonction lorsque clic boutton Rechercher*/
            public void onClick(View v) {

                /*Creation Intent pour envoi dans la liste monstre*/
                Intent intent = new Intent(YourMonster.this, ListeMonstres.class);
                intent.putExtra("condition", nomz);
                intent.putExtra("element", bruno);


                intent.putExtra("donneeLifetime", donneeLifetime);
                intent.putExtra("donneeForce", donneeForce);
                intent.putExtra("donneeVitesse", donneeVitesse);
                intent.putExtra("donneeStamina", donneeStamina);

                startActivity(intent);


            }
        });

        recommencer.setOnClickListener(new View.OnClickListener() {


            /* Fonction lorsque clic boutton Rechercher*/
            public void onClick(View v) {

                /*Creation Intent pour envoi dans la liste monstre*/
                Intent retry = new Intent(YourMonster.this, CustomizeMonsterType.class);




                startActivity(retry);


            }
        });

         /*Intent type de Monstre + logo du type + image du monstre*/



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

































