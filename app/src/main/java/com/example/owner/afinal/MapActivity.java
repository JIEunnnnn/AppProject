package com.example.owner.afinal;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;

public class MapActivity extends Activity implements OnMapReadyCallback {

    Button btnReturn;
    GoogleMap gMap;
    MapFragment mapFrag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        menu.add(0, 1, 0, "위성지도");
        menu.add(0, 2, 0, "일반지도");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         super.onOptionsItemSelected(item);
         switch (item.getItemId()){

             case 1:
                 gMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                 return true;
             case 2:
                 gMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                 return true;

        }

         return false;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
