package com.example.petagramcardview;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.petagramcardview.adapter.AdapterMascotaFavorita;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<MascotaFavorita> listamascotasfav;
    RecyclerView recyclerMascotasfav;

        Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listamascotasfav = new ArrayList<>();
        recyclerMascotasfav = (RecyclerView) findViewById(R.id.recyclerid2);
        recyclerMascotasfav.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false));

        llenarmascotasfav();

        AdapterMascotaFavorita adapter = new AdapterMascotaFavorita(listamascotasfav);
        recyclerMascotasfav.setAdapter(adapter);


        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      getSupportActionBar().setDisplayShowHomeEnabled(true);

      toolbar.setNavigationOnClickListener(new View.OnClickListener() {
        @Override
      public void onClick(View v) {
         onBackPressed();
  }             });

   }
   private void llenarmascotasfav(){
       listamascotasfav.add(new MascotaFavorita("Catty","5",R.drawable.img1));
       listamascotasfav.add(new MascotaFavorita("Ronny","3",R.drawable.img2));
       listamascotasfav.add(new MascotaFavorita("Bonny","2",R.drawable.img1));
       listamascotasfav.add(new MascotaFavorita("Ron","4",R.drawable.img2));
       listamascotasfav.add(new MascotaFavorita("Luna","1",R.drawable.img1));

   }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_secundario, menu);
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
