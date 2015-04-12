package com.exemple.ui.data;

import android.provider.BaseColumns;

public class DataContract {
	
public static final class PaysEntry implements BaseColumns{
		
		public static final String NOM_TABLE = "Pays";
		public static final String COLUMN_NOM_PAYS = "nom_pays";
	}


	
	public static final class InformationEntry implements BaseColumns{
		
		public static final String NOM_TABLE = "Information";
		public static final String COLUMN_ANNEE = "annee";
		public static final String COLUMN_POPULATION = "population";
		public static final String COLUMN_SURFACE_AGRICOLE = "surface_agricole";
		public static final String COLUMN_CLIMAT = "climat";
		public static final String COLUMN_CROISSANCE = "croissance";
		public static final String COLUMN_PRODUCTION = "production";
		public static final String COLUMN_PIB = "pib";
		public static final String COLUMN_ID_PAYS = "id_pays";
	}

}
