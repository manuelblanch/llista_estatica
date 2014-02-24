package com.iesebre.DAM2.llista_estatica;

import java.util.ArrayList;
import java.util.List;

import com.iesebre.DAM2.examenuf1_segon.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Adaptadores2Activity extends ListActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segon_layout); 
        ArrayList<VersionesUbuntu> versiones =
           new ArrayList<VersionesUbuntu>();
        
        Toast toast = Toast.makeText(getApplicationContext(),"Benvinguts a la llista de gats per probar", Toast.LENGTH_SHORT);
  	  	toast.show();
   
        versiones.add(
              new VersionesUbuntu("gato1 Ernesto", "", R.drawable.gatonum1));
        	  
        versiones.add(
              new VersionesUbuntu("gato2 refeto", "", R.drawable.gatonum2));
        
        versiones.add(
              new VersionesUbuntu("gato3 eusebio", "", R.drawable.gatonum3));
        
        versiones.add(
              new VersionesUbuntu("gato4 europeo", "", R.drawable.gatonum4));
        
        versiones.add(
        	  new VersionesUbuntu("gato5 asesino", "", R.drawable.persa));
        
        VersionesUbuntuAdapter adaptador = new VersionesUbuntuAdapter(
              Adaptadores2Activity.this, versiones);
        setListAdapter(adaptador);
    }
}