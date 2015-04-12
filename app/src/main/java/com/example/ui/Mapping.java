package com.example.ui;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;

import com.exemple.ui.data.DataContract;
import com.exemple.ui.data.DataContract.InformationEntry;
import com.exemple.ui.data.DataContract.PaysEntry;
import com.exemple.ui.data.DataDbHelper;

public class Mapping extends Fragment{

	SQLiteDatabase db;
	boolean etat = true;
	boolean etat2 = true;
	boolean etat3 = true;

	//arrayList pour le récupération des champs
	private ArrayList<String> id_pays = new ArrayList<String>();
	private ArrayList<Double> id_population = new ArrayList<Double>();
	private ArrayList<Double> id_surfaceAgricole = new ArrayList<Double>();
	private ArrayList<Integer> id_climat = new ArrayList<Integer>();
	private ArrayList<Double> id_croissance = new ArrayList<Double>();
	private ArrayList<Double> id_pib = new ArrayList<Double>();
	private ArrayList<Double> id_production = new ArrayList<Double>();
	private ArrayList<Integer> id_annee = new ArrayList<Integer>();

	private ArrayList<String> nomPays = new ArrayList<String>();


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView =inflater.inflate(R.layout.frag_mapping,container,false);
	/*	String[] fakedata={
				"je ",
				"n'abondnne",
				"jamais",
				"avant ",
				"d'avoir",
				"gagner"

		};  dummy data*/

		//ouverture de la base de données
		DataDbHelper dbHelper = new DataDbHelper(getActivity());

		db = dbHelper.getWritableDatabase();

		//Insertion de plusieurs données
		ContentValues values1 = new ContentValues();
		values1.put(PaysEntry.COLUMN_NOM_PAYS, "Algérie");

		ContentValues values2 = new ContentValues();
		values2.put(PaysEntry.COLUMN_NOM_PAYS, "Égypte");

		ContentValues values3 = new ContentValues();
		values3.put(PaysEntry.COLUMN_NOM_PAYS, "Libye");

		ContentValues values4 = new ContentValues();
		values4.put(PaysEntry.COLUMN_NOM_PAYS, "Maroc");

		ContentValues values5 = new ContentValues();
		values5.put(PaysEntry.COLUMN_NOM_PAYS, "Mauritanie");

		ContentValues values6 = new ContentValues();
		values6.put(PaysEntry.COLUMN_NOM_PAYS, "Rwenda");

		ContentValues values7 = new ContentValues();
		values7.put(PaysEntry.COLUMN_NOM_PAYS, "Ethipie");

		ContentValues values8 = new ContentValues();
		values8.put(PaysEntry.COLUMN_NOM_PAYS, "RDC");

		ContentValues values9 = new ContentValues();
		values9.put(PaysEntry.COLUMN_NOM_PAYS, "Niger");

		ContentValues values10 = new ContentValues();
		values10.put(PaysEntry.COLUMN_NOM_PAYS, "Liberia");

		ContentValues values11 = new ContentValues();
		values11.put(PaysEntry.COLUMN_NOM_PAYS, "Eritheria");

		ContentValues values12 = new ContentValues();
		values12.put(PaysEntry.COLUMN_NOM_PAYS, "Guinea");

		ContentValues values13 = new ContentValues();
		values13.put(PaysEntry.COLUMN_NOM_PAYS, "Oganda");

		ContentValues values14 = new ContentValues();
		values14.put(PaysEntry.COLUMN_NOM_PAYS, "Mali");

		ContentValues values15 = new ContentValues();
		values15.put(PaysEntry.COLUMN_NOM_PAYS, "Togo");

		ContentValues values16 = new ContentValues();
		values16.put(PaysEntry.COLUMN_NOM_PAYS, "Bénin");

		ContentValues values17 = new ContentValues();
		values17.put(PaysEntry.COLUMN_NOM_PAYS, "Sierra Leone");

		ContentValues values18 = new ContentValues();
		values18.put(PaysEntry.COLUMN_NOM_PAYS, "Mozambique");

		ContentValues values19 = new ContentValues();
		values19.put(PaysEntry.COLUMN_NOM_PAYS, "Guinée-Bissau");

		ContentValues values20 = new ContentValues();
		values20.put(PaysEntry.COLUMN_NOM_PAYS, "Comores");

		ContentValues values21 = new ContentValues();
		values21.put(PaysEntry.COLUMN_NOM_PAYS, "Tanzanie");

		ContentValues values22 = new ContentValues();
		values22.put(PaysEntry.COLUMN_NOM_PAYS, "Gambie");

		ContentValues values23 = new ContentValues();
		values23.put(PaysEntry.COLUMN_NOM_PAYS, "Cote d’ivoire");

		ContentValues values24 = new ContentValues();
		values24.put(PaysEntry.COLUMN_NOM_PAYS, "Tunisie");

		ContentValues values25 = new ContentValues();
		values25.put(PaysEntry.COLUMN_NOM_PAYS, "soudan");

		ContentValues values26 = new ContentValues();
		values26.put(PaysEntry.COLUMN_NOM_PAYS, "Mauritanie");

		ContentValues values27 = new ContentValues();
		values27.put(PaysEntry.COLUMN_NOM_PAYS, "Angola");

		ContentValues values28 = new ContentValues();
		values28.put(PaysEntry.COLUMN_NOM_PAYS, "Afrique du Sud");

		ContentValues values29 = new ContentValues();
		values29.put(PaysEntry.COLUMN_NOM_PAYS, "Botswana");

		ContentValues values30 = new ContentValues();
		values30.put(PaysEntry.COLUMN_NOM_PAYS, "Libye");


		db.insert(PaysEntry.NOM_TABLE, null, values1);
		db.insert(PaysEntry.NOM_TABLE, null, values2);
		db.insert(PaysEntry.NOM_TABLE, null, values3);
		db.insert(PaysEntry.NOM_TABLE, null, values4);
		db.insert(PaysEntry.NOM_TABLE, null, values5);
		db.insert(PaysEntry.NOM_TABLE, null, values6);
		db.insert(PaysEntry.NOM_TABLE, null, values7);
		db.insert(PaysEntry.NOM_TABLE, null, values8);
		db.insert(PaysEntry.NOM_TABLE, null, values9);
		db.insert(PaysEntry.NOM_TABLE, null, values10);
		db.insert(PaysEntry.NOM_TABLE, null, values11);
		db.insert(PaysEntry.NOM_TABLE, null, values12);
		db.insert(PaysEntry.NOM_TABLE, null, values13);
		db.insert(PaysEntry.NOM_TABLE, null, values14);
		db.insert(PaysEntry.NOM_TABLE, null, values15);
		db.insert(PaysEntry.NOM_TABLE, null, values16);
		db.insert(PaysEntry.NOM_TABLE, null, values17);
		db.insert(PaysEntry.NOM_TABLE, null, values18);
		db.insert(PaysEntry.NOM_TABLE, null, values19);
		db.insert(PaysEntry.NOM_TABLE, null, values20);
		db.insert(PaysEntry.NOM_TABLE, null, values21);
		db.insert(PaysEntry.NOM_TABLE, null, values22);
		db.insert(PaysEntry.NOM_TABLE, null, values23);
		db.insert(PaysEntry.NOM_TABLE, null, values24);
		db.insert(PaysEntry.NOM_TABLE, null, values25);
		db.insert(PaysEntry.NOM_TABLE, null, values26);
		db.insert(PaysEntry.NOM_TABLE, null, values27);
		db.insert(PaysEntry.NOM_TABLE, null, values28);
		db.insert(PaysEntry.NOM_TABLE, null, values29);
		db.insert(PaysEntry.NOM_TABLE, null, values30);




		String[] projection = {PaysEntry._ID, PaysEntry.COLUMN_NOM_PAYS};

		Cursor c = db.query(
				PaysEntry.NOM_TABLE,
				projection,
				null,
				null,
				null,
				null,
				null);

		c.moveToFirst();
		while(etat3){
			nomPays.add(c.getString(c.getColumnIndexOrThrow(DataContract.PaysEntry.COLUMN_NOM_PAYS)));

			if(!c.moveToNext()){
				etat3 = false;
			}
		}





		//Teste et insertion de la 2eme table
		ContentValues values111 = new ContentValues();
		values111.put(InformationEntry.COLUMN_ID_PAYS, 6);
		values111.put(InformationEntry.COLUMN_ANNEE, 2003);
		values111.put(InformationEntry.COLUMN_POPULATION, 12012589);
		values111.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 1428033);
		values111.put(InformationEntry.COLUMN_CLIMAT, 0);
		values111.put(InformationEntry.COLUMN_CROISSANCE, 0.08);
		values111.put(InformationEntry.COLUMN_PIB, 7.52);
		values111.put(InformationEntry.COLUMN_PRODUCTION, 6808608);

		ContentValues values112 = new ContentValues();
		values112.put(InformationEntry.COLUMN_ID_PAYS, 7);
		values112.put(InformationEntry.COLUMN_ANNEE, 2011);
		values112.put(InformationEntry.COLUMN_POPULATION, 90873379);
		values112.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 1832200);
		values112.put(InformationEntry.COLUMN_CLIMAT, 1);
		values112.put(InformationEntry.COLUMN_CROISSANCE, 0.07);
		values112.put(InformationEntry.COLUMN_PIB, 40.05);
		values112.put(InformationEntry.COLUMN_PRODUCTION, 17817208);

		ContentValues values113 = new ContentValues();
		values113.put(InformationEntry.COLUMN_ID_PAYS, 8);
		values113.put(InformationEntry.COLUMN_ANNEE, 2013);
		values113.put(InformationEntry.COLUMN_POPULATION, 77433744);
		values113.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 2345100);
		values113.put(InformationEntry.COLUMN_CLIMAT, 0);
		values113.put(InformationEntry.COLUMN_CROISSANCE, 0.064);
		values113.put(InformationEntry.COLUMN_PIB, 30.629);
		values113.put(InformationEntry.COLUMN_PRODUCTION, 599750);

		ContentValues values114 = new ContentValues();
		values114.put(InformationEntry.COLUMN_ID_PAYS, 9);
		values114.put(InformationEntry.COLUMN_ANNEE, 2009);
		values114.put(InformationEntry.COLUMN_POPULATION, 17129076);
		values114.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 72559);
		values114.put(InformationEntry.COLUMN_CLIMAT, 1);
		values114.put(InformationEntry.COLUMN_CROISSANCE, 0.02);
		values114.put(InformationEntry.COLUMN_PIB, 10.45);
		values114.put(InformationEntry.COLUMN_PRODUCTION, 789793);

		ContentValues values115 = new ContentValues();
		values115.put(InformationEntry.COLUMN_ID_PAYS, 10);
		values115.put(InformationEntry.COLUMN_ANNEE, 2010);
		values115.put(InformationEntry.COLUMN_POPULATION, 388788);
		values115.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 17557);
		values115.put(InformationEntry.COLUMN_CLIMAT, 1);
		values115.put(InformationEntry.COLUMN_CROISSANCE, 0.073);
		values115.put(InformationEntry.COLUMN_PIB, 0.977);
		values115.put(InformationEntry.COLUMN_PRODUCTION, 112000);

		ContentValues values116 = new ContentValues();
		values116.put(InformationEntry.COLUMN_ID_PAYS, 11);
		values116.put(InformationEntry.COLUMN_ANNEE, 2011);
		values116.put(InformationEntry.COLUMN_POPULATION, 6233682);
		values116.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 15000);
		values116.put(InformationEntry.COLUMN_CLIMAT, 0);
		values116.put(InformationEntry.COLUMN_CROISSANCE, 0.087);
		values116.put(InformationEntry.COLUMN_PIB, 5.037);
		values116.put(InformationEntry.COLUMN_PRODUCTION, 55000);

		ContentValues values117 = new ContentValues();
		values117.put(InformationEntry.COLUMN_ID_PAYS, 12);
		values117.put(InformationEntry.COLUMN_ANNEE, 2010);
		values117.put(InformationEntry.COLUMN_POPULATION, 11176026);
		values117.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 194280);
		values117.put(InformationEntry.COLUMN_CLIMAT, 0);
		values117.put(InformationEntry.COLUMN_CROISSANCE, 0.029);
		values117.put(InformationEntry.COLUMN_PIB, 10.44);
		values117.put(InformationEntry.COLUMN_PRODUCTION, 537900);

		ContentValues values118 = new ContentValues();
		values118.put(InformationEntry.COLUMN_ID_PAYS, 13);
		values118.put(InformationEntry.COLUMN_ANNEE, 2013);
		values118.put(InformationEntry.COLUMN_POPULATION, 37873253);
		values118.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 204000);
		values118.put(InformationEntry.COLUMN_CLIMAT, 1);
		values118.put(InformationEntry.COLUMN_CROISSANCE, 0.056);
		values118.put(InformationEntry.COLUMN_PIB, 50.49);
		values118.put(InformationEntry.COLUMN_PRODUCTION, 1125000);

		ContentValues values119 = new ContentValues();
		values119.put(InformationEntry.COLUMN_ID_PAYS, 14);
		values119.put(InformationEntry.COLUMN_ANNEE, 2011);
		values119.put(InformationEntry.COLUMN_POPULATION, 14528662);
		values119.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 86880);
		values119.put(InformationEntry.COLUMN_CLIMAT, 1);
		values119.put(InformationEntry.COLUMN_CROISSANCE, 0.042);
		values119.put(InformationEntry.COLUMN_PIB, 14.48);
		values119.put(InformationEntry.COLUMN_PRODUCTION, 906350);

		ContentValues values120 = new ContentValues();
		values120.put(InformationEntry.COLUMN_ID_PAYS, 15);
		values120.put(InformationEntry.COLUMN_ANNEE, 2009);
		values120.put(InformationEntry.COLUMN_POPULATION, 6191155);
		values120.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 28965);
		values120.put(InformationEntry.COLUMN_CLIMAT, 0);
		values120.put(InformationEntry.COLUMN_CROISSANCE, 0.018);
		values120.put(InformationEntry.COLUMN_PIB, 5.202);
		values120.put(InformationEntry.COLUMN_PRODUCTION, 151425);

		ContentValues values121 = new ContentValues();
		values121.put(InformationEntry.COLUMN_ID_PAYS, 16);
		values121.put(InformationEntry.COLUMN_ANNEE, 2013);
		values121.put(InformationEntry.COLUMN_POPULATION, 9983884);
		values121.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 464708);
		values121.put(InformationEntry.COLUMN_CLIMAT, 0);
		values121.put(InformationEntry.COLUMN_CROISSANCE, 0.035);
		values121.put(InformationEntry.COLUMN_PIB, 7.54);
		values121.put(InformationEntry.COLUMN_PRODUCTION, 90525);

		ContentValues values122 = new ContentValues();
		values122.put(InformationEntry.COLUMN_ID_PAYS, 17);
		values122.put(InformationEntry.COLUMN_ANNEE, 2013);
		values122.put(InformationEntry.COLUMN_POPULATION, 6190280);
		values122.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 343500);
		values122.put(InformationEntry.COLUMN_CLIMAT, 0);
		values122.put(InformationEntry.COLUMN_CROISSANCE, 0.06);
		values122.put(InformationEntry.COLUMN_PIB, 2.084);
		values122.put(InformationEntry.COLUMN_PRODUCTION, 45800);

		ContentValues values123 = new ContentValues();
		values123.put(InformationEntry.COLUMN_ID_PAYS, 18);
		values123.put(InformationEntry.COLUMN_ANNEE, 2012);
		values123.put(InformationEntry.COLUMN_POPULATION, 25900000);
		values123.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 106100);
		values123.put(InformationEntry.COLUMN_CLIMAT, 0);
		values123.put(InformationEntry.COLUMN_CROISSANCE, 0.07);
		values123.put(InformationEntry.COLUMN_PIB, 15.63);
		values123.put(InformationEntry.COLUMN_PRODUCTION, 546200);

		ContentValues values124 = new ContentValues();
		values124.put(InformationEntry.COLUMN_ID_PAYS, 19);
		values124.put(InformationEntry.COLUMN_ANNEE, 2009);
		values124.put(InformationEntry.COLUMN_POPULATION, 1704000);
		values124.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 5800);
		values124.put(InformationEntry.COLUMN_CLIMAT, 1);
		values124.put(InformationEntry.COLUMN_CROISSANCE, 0.064);
		values124.put(InformationEntry.COLUMN_PIB, 1.084);
		values124.put(InformationEntry.COLUMN_PRODUCTION, 35500);

		ContentValues values125 = new ContentValues();
		values125.put(InformationEntry.COLUMN_ID_PAYS, 20);
		values125.put(InformationEntry.COLUMN_ANNEE, 2010);
		values125.put(InformationEntry.COLUMN_POPULATION, 79800);
		values125.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 847);
		values125.put(InformationEntry.COLUMN_CLIMAT, 0);
		values125.put(InformationEntry.COLUMN_CROISSANCE, 0.025);
		values125.put(InformationEntry.COLUMN_PIB, 0.655);
		values125.put(InformationEntry.COLUMN_PRODUCTION, 7100);

		ContentValues values126 = new ContentValues();
		values126.put(InformationEntry.COLUMN_ID_PAYS, 21);
		values126.put(InformationEntry.COLUMN_ANNEE, 2010);
		values126.put(InformationEntry.COLUMN_POPULATION, 44928923);
		values126.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 353760);
		values126.put(InformationEntry.COLUMN_CLIMAT, 1);
		values126.put(InformationEntry.COLUMN_CROISSANCE, 0.07);
		values126.put(InformationEntry.COLUMN_PIB, 43.8);
		values126.put(InformationEntry.COLUMN_PRODUCTION, 2174900);

		ContentValues values127 = new ContentValues();
		values127.put(InformationEntry.COLUMN_ID_PAYS, 22);
		values127.put(InformationEntry.COLUMN_ANNEE, 2010);
		values127.put(InformationEntry.COLUMN_POPULATION, 188305);
		values127.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 2000);
		values127.put(InformationEntry.COLUMN_CLIMAT, 1);
		values127.put(InformationEntry.COLUMN_CROISSANCE, 0.055);
		values127.put(InformationEntry.COLUMN_PIB, 3.024);
		values127.put(InformationEntry.COLUMN_PRODUCTION, 12500);

		ContentValues values128 = new ContentValues();
		values128.put(InformationEntry.COLUMN_ID_PAYS, 23);
		values128.put(InformationEntry.COLUMN_ANNEE, 2013);
		values128.put(InformationEntry.COLUMN_POPULATION, 25232905);
		values128.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 166885);
		values128.put(InformationEntry.COLUMN_CLIMAT, 1);
		values128.put(InformationEntry.COLUMN_CROISSANCE, 0.023);
		values128.put(InformationEntry.COLUMN_PIB, 30.048);
		values128.put(InformationEntry.COLUMN_PRODUCTION, 685256);

		ContentValues values129 = new ContentValues();
		values129.put(InformationEntry.COLUMN_ID_PAYS, 24);
		values129.put(InformationEntry.COLUMN_ANNEE, 2012);
		values129.put(InformationEntry.COLUMN_POPULATION, 10982754);
		values129.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 138448);
		values129.put(InformationEntry.COLUMN_CLIMAT, 0);
		values129.put(InformationEntry.COLUMN_CROISSANCE, 0.036);
		values129.put(InformationEntry.COLUMN_PIB, 45.61);
		values129.put(InformationEntry.COLUMN_PRODUCTION, 2852943);

		ContentValues values130 = new ContentValues();
		values130.put(InformationEntry.COLUMN_ID_PAYS, 25);
		values130.put(InformationEntry.COLUMN_ANNEE, 2012);
		values130.put(InformationEntry.COLUMN_POPULATION, 2530397);
		values130.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 23673);
		values130.put(InformationEntry.COLUMN_CLIMAT, 1);
		values130.put(InformationEntry.COLUMN_CROISSANCE, 0.064);
		values130.put(InformationEntry.COLUMN_PIB, 23);
		values130.put(InformationEntry.COLUMN_PRODUCTION, 3041976);

		ContentValues values131 = new ContentValues();
		values131.put(InformationEntry.COLUMN_ID_PAYS, 26);
		values131.put(InformationEntry.COLUMN_ANNEE, 2012);
		values131.put(InformationEntry.COLUMN_POPULATION, 3359185);
		values131.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 1560);
		values131.put(InformationEntry.COLUMN_CLIMAT, 1);
		values131.put(InformationEntry.COLUMN_CROISSANCE, 0.064);
		values131.put(InformationEntry.COLUMN_PIB, 7.824);
		values131.put(InformationEntry.COLUMN_PRODUCTION, 4860);

		ContentValues values132 = new ContentValues();
		values132.put(InformationEntry.COLUMN_ID_PAYS, 27);
		values132.put(InformationEntry.COLUMN_ANNEE, 2012);
		values132.put(InformationEntry.COLUMN_POPULATION, 24383301);
		values132.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 76350);
		values132.put(InformationEntry.COLUMN_CLIMAT, 1);
		values132.put(InformationEntry.COLUMN_CROISSANCE, 0.132);
		values132.put(InformationEntry.COLUMN_PIB, 110.3);
		values132.put(InformationEntry.COLUMN_PRODUCTION, 402000);

		ContentValues values133 = new ContentValues();
		values133.put(InformationEntry.COLUMN_ID_PAYS, 28);
		values133.put(InformationEntry.COLUMN_ANNEE, 2011);
		values133.put(InformationEntry.COLUMN_POPULATION, 51770560);
		values133.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 156100);
		values133.put(InformationEntry.COLUMN_CLIMAT, 1);
		values133.put(InformationEntry.COLUMN_CROISSANCE, 0.026);
		values133.put(InformationEntry.COLUMN_PIB, 712);
		values133.put(InformationEntry.COLUMN_PRODUCTION, 2746823);

		ContentValues values134 = new ContentValues();
		values134.put(InformationEntry.COLUMN_ID_PAYS, 29);
		values134.put(InformationEntry.COLUMN_ANNEE, 2008);
		values134.put(InformationEntry.COLUMN_POPULATION, 2098018);
		values134.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 3732);
		values134.put(InformationEntry.COLUMN_CLIMAT, 0);
		values134.put(InformationEntry.COLUMN_CROISSANCE, 0.032);
		values134.put(InformationEntry.COLUMN_PIB, 26.04);
		values134.put(InformationEntry.COLUMN_PRODUCTION, 40680);

		ContentValues values135 = new ContentValues();
		values135.put(InformationEntry.COLUMN_ID_PAYS, 30);
		values135.put(InformationEntry.COLUMN_ANNEE, 2012);
		values135.put(InformationEntry.COLUMN_POPULATION, 6244174);
		values135.put(InformationEntry.COLUMN_SURFACE_AGRICOLE, 66200);
		values135.put(InformationEntry.COLUMN_CLIMAT, 1);
		values135.put(InformationEntry.COLUMN_CROISSANCE, 0.085);
		values135.put(InformationEntry.COLUMN_PIB, 98.1);
		values135.put(InformationEntry.COLUMN_PRODUCTION, 1000350);

		db.insert(InformationEntry.NOM_TABLE, null, values111);
		db.insert(InformationEntry.NOM_TABLE, null, values112);
		db.insert(InformationEntry.NOM_TABLE, null, values113);
		db.insert(InformationEntry.NOM_TABLE, null, values114);
		db.insert(InformationEntry.NOM_TABLE, null, values115);
		db.insert(InformationEntry.NOM_TABLE, null, values116);
		db.insert(InformationEntry.NOM_TABLE, null, values117);
		db.insert(InformationEntry.NOM_TABLE, null, values118);
		db.insert(InformationEntry.NOM_TABLE, null, values119);
		db.insert(InformationEntry.NOM_TABLE, null, values120);
		db.insert(InformationEntry.NOM_TABLE, null, values121);
		db.insert(InformationEntry.NOM_TABLE, null, values122);
		db.insert(InformationEntry.NOM_TABLE, null, values123);
		db.insert(InformationEntry.NOM_TABLE, null, values124);
		db.insert(InformationEntry.NOM_TABLE, null, values125);
		db.insert(InformationEntry.NOM_TABLE, null, values126);
		db.insert(InformationEntry.NOM_TABLE, null, values128);
		db.insert(InformationEntry.NOM_TABLE, null, values129);
		db.insert(InformationEntry.NOM_TABLE, null, values130);
		db.insert(InformationEntry.NOM_TABLE, null, values131);
		db.insert(InformationEntry.NOM_TABLE, null, values132);
		db.insert(InformationEntry.NOM_TABLE, null, values133);
		db.insert(InformationEntry.NOM_TABLE, null, values134);
		db.insert(InformationEntry.NOM_TABLE, null, values135);

		//affichage de l'info
		String[] projection2 = {InformationEntry._ID,InformationEntry.COLUMN_ID_PAYS,InformationEntry.COLUMN_ANNEE,
				InformationEntry.COLUMN_POPULATION ,InformationEntry.COLUMN_SURFACE_AGRICOLE,
				InformationEntry.COLUMN_CLIMAT,InformationEntry.COLUMN_CROISSANCE,
				InformationEntry.COLUMN_PRODUCTION,InformationEntry.COLUMN_PIB};

		Cursor c1 = db.query(InformationEntry.NOM_TABLE,
				projection2,
				null,
				null,
				null,
				null,
				null);


		c1.moveToFirst();
		while(etat2){

			id_pays.add(c1.getString(c1.getColumnIndexOrThrow(InformationEntry.COLUMN_ID_PAYS)));

			id_population.add(c1.getDouble(c1.getColumnIndexOrThrow(InformationEntry.COLUMN_POPULATION)));

			id_surfaceAgricole.add(c1.getDouble(c1.getColumnIndexOrThrow(InformationEntry.COLUMN_SURFACE_AGRICOLE)));
			id_climat.add(c1.getInt(c1.getColumnIndexOrThrow(InformationEntry.COLUMN_CLIMAT)));
			id_croissance.add(c1.getDouble(c1.getColumnIndexOrThrow(InformationEntry.COLUMN_CROISSANCE)));
			id_pib.add(c1.getDouble(c1.getColumnIndexOrThrow(InformationEntry.COLUMN_PIB)));
			id_annee.add(c1.getInt(c1.getColumnIndexOrThrow(InformationEntry.COLUMN_ANNEE)));
			id_production.add(c1.getDouble(c1.getColumnIndexOrThrow(InformationEntry.COLUMN_PRODUCTION)));
			if(!c1.moveToNext()){
				etat2 = false;

			}

		}
		//   Log.e("hors de boucle", ""+c1.getDouble(c1.getColumnIndexOrThrow(InformationEntry.COLUMN_SURFACE_AGRICOLE)));	

		//List<String> fort=new ArrayList<String>(Arrays.asList(fakedata));


		ArrayAdapter<String> fortbezzaf =new ArrayAdapter<String>(getActivity()	,
				R.layout.list_item_forecast,
				R.id.list_item_forecast_textview,
				nomPays);

		ListView listview =(ListView)rootView.findViewById(R.id.listview_forecast);
		listview.setAdapter(fortbezzaf);
		listview.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() 
		{

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				Intent intent = new Intent(getActivity(), DetailA.class);

				

				startActivity(intent);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}
		});

		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Log.e("onitem","oui c clické");
				Intent intent = new Intent(getActivity(),DetailA.class);
				
				intent.putExtra("id_pays", id_pays.get(position));
				Log.e("DATA",""+ String.valueOf(id_population.get(position)));
				intent.putExtra("id_population", String.valueOf(id_population.get(position)));
				intent.putExtra("id_surfaceAgricole", String.valueOf(id_surfaceAgricole.get(position)));
				intent.putExtra("id_climat", String.valueOf(id_climat.get(position)));
				intent.putExtra("id_croissance", String.valueOf(id_croissance.get(position)));
				intent.putExtra("id_pib", String.valueOf(id_pib.get(position)));
				intent.putExtra("id_production", String.valueOf(id_production.get(position)));
				intent.putExtra("id_annee", String.valueOf(id_annee.get(position)));
				
				
				startActivity(intent);

			}

		});
       final ImageView Map ;
       Map =(ImageView) rootView.findViewById(R.id.Imap);
		
     

       Map.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
                   Map.setScaleType(ScaleType.FIT_XY);
                  Log.e("click", "view clické");
                  /*a faire : mettre l'image en plein écran*/
               }
           
       });

   
       
       return rootView;
	}


}
