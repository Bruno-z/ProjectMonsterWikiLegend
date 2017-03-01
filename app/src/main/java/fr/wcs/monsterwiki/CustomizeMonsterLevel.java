package fr.wcs.monsterwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class CustomizeMonsterLevel extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    SeekBar seekBarLifetime;
    TextView textViewLifetime;
    SeekBar seekBarForce;
    TextView textViewForce;
    SeekBar seekBarVitesse;
    TextView textViewVitesse;
    SeekBar seekBarStamina;
    TextView textViewStamina;
    TextView total;
    SeekBar seekBar;
    Button suivant;
    TextView tooMuch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_monster_level);


        seekBarLifetime = (SeekBar) findViewById(R.id.seekBarLifetime);
        textViewLifetime = (TextView) findViewById(R.id.textViewLifetime);
        seekBarForce = (SeekBar) findViewById(R.id.seekBarForce);
        textViewForce = (TextView) findViewById(R.id.textViewForce);
        seekBarVitesse = (SeekBar) findViewById(R.id.seekBarVitesse);
        textViewVitesse = (TextView) findViewById(R.id.textViewVitesse);
        seekBarStamina = (SeekBar) findViewById(R.id.seekBarStamina);
        textViewStamina = (TextView) findViewById(R.id.textViewStamina);
        total = (TextView) findViewById(R.id.total);
        suivant =(Button)findViewById(R.id.suivant);
        tooMuch = (TextView) findViewById(R.id.tooMuch);

        seekBarLifetime.setOnSeekBarChangeListener(this);
        seekBarForce.setOnSeekBarChangeListener(this);
        seekBarVitesse.setOnSeekBarChangeListener(this);
        seekBarStamina.setOnSeekBarChangeListener(this);

        suivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    /* Création Intent*/
                Intent CustomizeMonsterLevelToYourMonster= new Intent(CustomizeMonsterLevel.this, YourMonster.class);


                Integer donneeLifetime = seekBarLifetime.getProgress();
                Integer donneeForce = seekBarForce.getProgress();
                Integer donneeVitesse = seekBarVitesse.getProgress();
                Integer donneeStamina = seekBarStamina.getProgress();

                CustomizeMonsterLevelToYourMonster.putExtra("donneeLifetime",donneeLifetime);
                CustomizeMonsterLevelToYourMonster.putExtra("donneeForce",donneeForce);
                CustomizeMonsterLevelToYourMonster.putExtra("donneeVitesse",donneeVitesse);
                CustomizeMonsterLevelToYourMonster.putExtra("donneeStamina",donneeStamina);

                startActivity(CustomizeMonsterLevelToYourMonster);




            }
        });

    }




    @Override
    public void onProgressChanged (SeekBar seekBar,int progress, boolean fromUser){



        switch (seekBar.getId()) {
            case R.id.seekBarLifetime:

                textViewLifetime.setText(seekBarLifetime.getProgress() + " / " + seekBarLifetime.getMax());
                break;
            case R.id.seekBarForce:

                textViewForce.setText(seekBarForce.getProgress() + " / " + seekBarForce.getMax());
                break;
            case R.id.seekBarVitesse:

                textViewVitesse.setText(seekBarVitesse.getProgress() + " / " + seekBarVitesse.getMax());
                break;
            case R.id.seekBarStamina:

                textViewStamina.setText(seekBarStamina.getProgress() + " / " + seekBarStamina.getMax());
                break;

        }

        int seekbar1 = seekBarLifetime.getProgress();
        int seekbar2 = seekBarForce.getProgress();
        int seekbar3 = seekBarVitesse.getProgress();
        int seekbar4 = seekBarStamina.getProgress();
        int sum = seekbar1 + seekbar2 + seekbar3 + seekbar4;
        int budget = 500;

        total.setText(sum + " / " + budget);

        if (sum > budget) {

            tooMuch.setVisibility(View.VISIBLE);
            suivant.setEnabled(false);

        } else {

            tooMuch.setVisibility(View.INVISIBLE);

        }




    }

    @Override
    public void onStartTrackingTouch (SeekBar seekBar){

        tooMuch.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onStopTrackingTouch (SeekBar seekBar){

        int seekbar1 = seekBarLifetime.getProgress();
        int seekbar2 = seekBarForce.getProgress();
        int seekbar3 = seekBarVitesse.getProgress();
        int seekbar4 = seekBarStamina.getProgress();
        int sum = seekbar1 + seekbar2 + seekbar3 + seekbar4;
        int budget = 500;

        total.setText(sum + " / " + budget);




    }



}
