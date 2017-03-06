package fr.wcs.monsterwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class ListeMonstres extends AppCompatActivity {

    Button recommencer;
    private String condition;

    int element;
    private int donneeForce;
    private int donneeLifetime;
    private int donneeStamnia;
    private int donneeVitesse;


    private static List<Monstres> mMonstres = null;
    private ListView mMonstreList = null;
    private ArrayAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_monstres);

        recommencer = (Button) findViewById(R.id.recommencer);

        Intent retour = getIntent();
        donneeForce = retour.getIntExtra("donneeForce", 0);
        donneeLifetime = retour.getIntExtra("donneeLifetime", 0);
        donneeStamnia = retour.getIntExtra("donneeStamina", 0);
        donneeVitesse = retour.getIntExtra("donneeVitesse", 0);
        condition = retour.getStringExtra("condition");
        element = retour.getIntExtra("element", 0);

        if(mMonstres == null){
            mMonstres = new ArrayList<>();
        }


        Monstres m =new Monstres(condition, element, donneeLifetime, donneeForce, donneeVitesse, donneeStamnia);




        this.mMonstres.add(m);
        this.mAdapter=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,mMonstres);
        mMonstreList = (ListView)findViewById(R.id.listMonstres);
        this.mMonstreList.setAdapter(this.mAdapter);

        recommencer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ListeMonstres.this, CustomizeMonsterType.class);
                startActivity(intent);
            }
        });

        mMonstreList.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent Monyonkai =new Intent(ListeMonstres.this,Monyonkai.class);
                Monstres CarteMonstre = (Monstres) mAdapter.getItem(position);

                Monyonkai.putExtra("carte",CarteMonstre);
                startActivity(Monyonkai);
                ;           }
            });

            }


    }
