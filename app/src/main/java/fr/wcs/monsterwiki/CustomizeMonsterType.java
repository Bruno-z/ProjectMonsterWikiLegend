package fr.wcs.monsterwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CustomizeMonsterType extends AppCompatActivity implements View.OnClickListener {

    Button buttonEau;
    Button buttonFeu;
    Button buttonFoudre;
    Button buttonNature;
    Button buttonMagie;
    Button buttonMort;
    Button buttonSpecial;
    Button buttonTerre;
    Button buttonLumiere;
    Button buttonMetal;
    int element;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_monster_type);

         buttonEau = (Button) findViewById(R.id.buttonEau);
         buttonEau.setOnClickListener(this);
         buttonFeu = (Button) findViewById(R.id.buttonFeu);
         buttonFeu.setOnClickListener(this);
         buttonFoudre = (Button) findViewById(R.id.buttonFoudre);
         buttonFoudre.setOnClickListener(this);
         buttonNature = (Button) findViewById(R.id.buttonNature);
         buttonNature.setOnClickListener(this);
         buttonMagie = (Button) findViewById(R.id.buttonMagie);
         buttonMagie.setOnClickListener(this);
         buttonMort = (Button) findViewById(R.id.buttonMort);
         buttonMort.setOnClickListener(this);
         buttonSpecial = (Button) findViewById(R.id.buttonSpecial);
         buttonSpecial.setOnClickListener(this);
         buttonTerre = (Button) findViewById(R.id.buttonTerre);
         buttonTerre.setOnClickListener(this);
         buttonLumiere = (Button) findViewById(R.id.buttonLumiere);
         buttonLumiere.setOnClickListener(this);
         buttonMetal = (Button) findViewById(R.id.buttonMetal);
         buttonMetal.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonEau:
                element = 1;
                setContentView(R.layout.activity_customize_monster_type);

                break;
            case R.id.buttonFeu:
                 element = 2;
                setContentView(R.layout.activity_customize_monster_type);
                break;
            case R.id.buttonFoudre:
                 element = 3;
                setContentView(R.layout.activity_customize_monster_type);
                break;
            case R.id.buttonNature:
                 element = 4;
                setContentView(R.layout.activity_customize_monster_type);
                break;
            case R.id.buttonMagie:
                 element = 5;
                setContentView(R.layout.activity_customize_monster_type);
                break;
            case R.id.buttonMetal:
                 element = 6;
                setContentView(R.layout.activity_customize_monster_type);
                break;
            case R.id.buttonMort:
                 element = 7;
                setContentView(R.layout.activity_customize_monster_type);
                break;
            case R.id.buttonSpecial:
                element = 8;
                setContentView(R.layout.activity_customize_monster_type);
                break;
            case R.id.buttonLumiere:
                 element = 9;
                setContentView(R.layout.activity_customize_monster_type);
                break;
            case R.id.buttonTerre:
                 element = 10;
                setContentView(R.layout.activity_customize_monster_type);
                break;


        }

        Intent Custom1 = new Intent(CustomizeMonsterType.this,CustomizeMonsterName.class);
        Custom1.putExtra("element",element);
        startActivity(Custom1);


    }
}

