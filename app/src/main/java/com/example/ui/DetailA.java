package com.example.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailA extends Activity {
	
	private TextView nomPays_TV;
	private TextView population_TV;
	private TextView surfaceAgricole_TV;
	private TextView climat_TV;
	private TextView croissance_TV;
	private TextView pib_TV;
	private TextView production_TV;
	private TextView annee_TV;
	
	//String pour le formatage de l'application
	private String nomPays;
	private String population;
	private String surfaceAgricole;
	private String climat;
	private String croissance;
	private String pib;
	private String production;
	private String annee;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		
		nomPays_TV 			= (TextView) findViewById(R.id.text_name_pays);
		population_TV 		= (TextView) findViewById(R.id.text_population);
		surfaceAgricole_TV	= (TextView) findViewById(R.id.text_surface_agricole);
		climat_TV 			= (TextView) findViewById(R.id.text_climat);
		croissance_TV 		= (TextView) findViewById(R.id.text_croissance);
		pib_TV 				= (TextView) findViewById(R.id.text_pib);
		production_TV		= (TextView) findViewById(R.id.text_production);
		annee_TV			= (TextView) findViewById(R.id.text_annee);
		
		//récupération des intents
		
		Intent intent = getIntent();
		
		nomPays 		= intent.getStringExtra("id_pays");
		population 		= intent.getStringExtra("id_population");
		surfaceAgricole = intent.getStringExtra("id_surfaceAgricole");
		climat 			= intent.getStringExtra("id_climat");
		croissance 		= intent.getStringExtra("id_croissance");
		pib 			= intent.getStringExtra("id_pib");
		production 		= intent.getStringExtra("id_production");
		annee 			= intent.getStringExtra("id_annee");
		
		nomPays_TV.setText("Name : "+nomPays);
		population_TV.setText("Population : "+population);
		surfaceAgricole_TV.setText("Surface Agricole : "+surfaceAgricole+" Hectars");
		climat_TV.setText("Climat : "+climat);
		croissance_TV.setText("Growth : "+croissance);
		pib_TV.setText("BIP : "+pib+" Mds");
		annee_TV.setText("Year : "+annee);
		production_TV.setText("Production : "+production+" Tonnes");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
