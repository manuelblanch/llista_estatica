package com.iesebre.DAM2.llista_estatica;

import com.iesebre.DAM2.examenuf1_segon.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	
	private ControlLogin ctlLogin;

		@Override
		public void onCreate(Bundle savedInstanceState)
		{
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.activity_main);
		 
		    ctlLogin = (ControlLogin)findViewById(R.id.CtlLogin);
		 
		    ctlLogin.setOnLoginListener(new OnLoginListener()
		    {
		    @Override
		    public void onLogin(String usuario, String password)
		    {
		       
		        if (usuario.equals("1234") && password.equals("1234")) {
		            ctlLogin.setMensaje("Login correcto!");
		            Intent i = new Intent(MainActivity.this, Adaptadores2Activity.class);
                    startActivity(i);
		        }
		        else
		            ctlLogin.setMensaje("Vuelva a intentarlo.");
		    }
		    });
		
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
