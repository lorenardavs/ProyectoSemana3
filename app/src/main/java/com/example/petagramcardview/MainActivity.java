package com.example.petagramcardview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.petagramcardview.adapter.AdapterMascotas;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> listMascotas;
    RecyclerView recyclerMascotas;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);


        listMascotas = new ArrayList<>();
        recyclerMascotas = (RecyclerView) findViewById(R.id.recyclerid);
        recyclerMascotas.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        llenarpersonajes();

        AdapterMascotas adapter = new AdapterMascotas(listMascotas);
        recyclerMascotas.setAdapter(adapter);

    }

    private void llenarpersonajes() {
        listMascotas.add(new Mascota("Catty","5",R.drawable.img1));
        listMascotas.add(new Mascota("Lucas","7",R.drawable.img2));
        listMascotas.add(new Mascota("Susy","0",R.drawable.img1));
        listMascotas.add(new Mascota("Ron","4",R.drawable.img2));
        listMascotas.add(new Mascota("Luna","1",R.drawable.img1));
        listMascotas.add(new Mascota("Ronny","3",R.drawable.img2));
        listMascotas.add(new Mascota("Bonny","2",R.drawable.img1));
        listMascotas.add(new Mascota("Rose","4",R.drawable.img1));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_opcion2){
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}