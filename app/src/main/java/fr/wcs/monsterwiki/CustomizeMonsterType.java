package fr.wcs.monsterwiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CustomizeMonsterType extends AppCompatActivity {

    ListView listType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_monster_type);

        listType = (ListView) findViewById(R.id.listType);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(CustomizeMonsterType.this,android.R.layout.)

        listType.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /* Création Intent entre Type et Name*/
                Intent typeToName = new Intent(CustomizeMonsterType.this,CustomizeMonsterName.class);
                typeToName.putExtra("typeChoice", listType.getItemAtPosition(position).toString());
                startActivity(typeToName);
            }
        });
    }
}
