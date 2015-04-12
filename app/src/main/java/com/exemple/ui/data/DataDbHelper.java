package com.exemple.ui.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.exemple.ui.data.DataContract.InformationEntry;
import com.exemple.ui.data.DataContract.PaysEntry;

public class DataDbHelper extends SQLiteOpenHelper{
	
	
	
	private final static int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "data.db";
  
	
	public DataDbHelper (Context c){
		 super(c,DATABASE_NAME, null, DATABASE_VERSION);
	
	}

	
	
	

	public void onCreate(SQLiteDatabase db) {
		
		final String SQL_CREATE_PAYS_TABLE = 
				"CREATE TABLE "+PaysEntry.NOM_TABLE+" ("+
				PaysEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT , "+
				PaysEntry.COLUMN_NOM_PAYS+" TEXT NOT NULL"+
				");";
		final String SQL_CREATE_INFORMATION_TABLE = 
				"CREATE TABLE "+InformationEntry.NOM_TABLE+" ("+
				InformationEntry._ID+" INTEGER PRIMARY KEY AUTOINCREMENT , "+
				InformationEntry.COLUMN_ID_PAYS+" INTEGER NOT NULL, "+
				InformationEntry.COLUMN_ANNEE+" INTEGER NOT NULL, "+
				InformationEntry.COLUMN_POPULATION+" INTEGER NOT NULL, "+
				InformationEntry.COLUMN_SURFACE_AGRICOLE+" INTEGER NOT NULL, "+
				InformationEntry.COLUMN_CLIMAT+" TINYINT NOT NULL, "+
				InformationEntry.COLUMN_CROISSANCE+" REAL NOT NULL, "+
				InformationEntry.COLUMN_PRODUCTION+" REAL NOT NULL, "+
				InformationEntry.COLUMN_PIB+" REAL NOT NULL, "+
				
				
				"FOREIGN KEY ("+ InformationEntry.COLUMN_ID_PAYS +" ) REFERENCES "+
				PaysEntry.NOM_TABLE+" ("+PaysEntry._ID+" )"+
				");";
		
		//Creation des base de données
		db.execSQL(SQL_CREATE_PAYS_TABLE);
		db.execSQL(SQL_CREATE_INFORMATION_TABLE);

	}

	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS "+PaysEntry.NOM_TABLE);
		db.execSQL("DROP TABLE IF EXISTS "+InformationEntry.NOM_TABLE);
		onCreate(db);

	}


}
