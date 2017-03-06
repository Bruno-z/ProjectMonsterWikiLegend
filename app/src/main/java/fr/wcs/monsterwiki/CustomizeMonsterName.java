package fr.wcs.monsterwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class CustomizeMonsterName extends AppCompatActivity {

    ImageView logo;
    TextView message;
    Button button;
    EditText condition;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_monster_name);

        logo= (ImageView)findViewById(R.id.logo);
        message  = (TextView) findViewById(R.id.message);
        message.getText().toString();
        button = (Button) findViewById(R.id.button);
        condition =(EditText)findViewById(R.id.condition);


        Intent Custom1 = getIntent();
        final int element = Custom1.getIntExtra("element", 0);
        switch (element) {
            case 1:
                logo.setImageResource(R.drawable.mersnake_0);
                message.setText(getString(R.string.Eau));
                break;
            case 2:
                logo.setImageResource(R.drawable.firesaur_0);
                message.setText(getString(R.string.Feu));

                break;
            case 3:
                logo.setImageResource(R.drawable.thunder_eagle_0);
                message.setText(getString(R.string.Foudre));
                break;
            case 4:
                logo.setImageResource(R.drawable.treezard_0);
                message.setText(getString(R.string.Nature));
                break;
            case 5:
                logo.setImageResource(R.drawable.genie_0);
                message.setText(getString(R.string.Magie));
                break;
            case 6:
                logo.setImageResource(R.drawable.metalsaur_0);
                message.setText(getString(R.string.Metal));
                break;
            case 7:
                logo.setImageResource(R.drawable.tyrannoking_0);
                message.setText(getString(R.string.Mort));

                break;
            case 8:
                logo.setImageResource(R.drawable.oeuf_inconnu);
                message.setText(getString(R.string.Special));
                break;
            case 9:
                logo.setImageResource(R.drawable.light_spirit_0);
                message.setText(getString(R.string.Lumiere));
                break;
            case 10:
                logo.setImageResource(R.drawable.rockilla_0);
                message.setText(getString(R.string.Terre));
                break;



        }



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (condition.length() == 0) {
                    Toast.makeText(CustomizeMonsterName.this, getString(R.string.Toast), Toast.LENGTH_SHORT).show();
                }
                else {
                    String nom = condition.getText().toString();
                    Intent Custom2 = new Intent(CustomizeMonsterName.this, CustomizeMonsterLevel.class);
                    Custom2.putExtra("condition",nom);
                    Custom2.putExtra("element",element);
                    startActivity(Custom2);

                }
            }
        });


    }
}
