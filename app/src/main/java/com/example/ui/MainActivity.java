package com.example.ui;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener{

	private ViewPager viewpager;
	private TabsAdapter tabadapter;
	private ActionBar actionbar;
	
	private Drawable mIconOpenSearch;// - icon that shows when the search bar is closed (magnifier)
	private Drawable mIconCloseSearch; //- icon that shows when the search bar is opened (x sign)
	private EditText mSearchEt; //- search bar text field
	private MenuItem mSearchAction;// - search bar action button
	private boolean mSearchOpened; //- keeps track if the search bar is opened
	
	/*a faire :résoudre le clavier si la recherche n'est pas ouverte*/
	/*chnger la couleur des menues*/
	@Override
	protected void onSaveInstanceState(Bundle outState) {
	    super.onSaveInstanceState(outState);
	   
	    outState.putBoolean(SEARCH_SERVICE, mSearchOpened);
	  
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//début du travail sur la recherche 
		   // Getting the list of movies to fill the list view.
	    if (savedInstanceState == null) {
	       
	        mSearchOpened = false;
	     
	    } else {
	       
	        
	        mSearchOpened = savedInstanceState.getBoolean(SEARCH_SERVICE);
	      
	    }
		 // Getting the icons.
	    mIconOpenSearch = getResources()
	        .getDrawable(R.drawable.ic_action_search);
	    mIconCloseSearch = getResources()
	        .getDrawable(R.drawable.ic_action_cancel);
		
		
		
		// fin
		viewpager = (ViewPager)findViewById(R.id.Vpager);
		actionbar = getActionBar();	
		android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
		tabadapter = new TabsAdapter(fm);
		
		viewpager.setAdapter(tabadapter);
		actionbar.setHomeButtonEnabled(false);
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		for(String tabName: tabadapter.getTabnames()){
			ActionBar.Tab aTab = actionbar.newTab().setText(tabName).setTabListener(this);
			actionbar.addTab(aTab);
		}
		
		viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				// TODO Auto-generated method stub
				actionbar.setSelectedNavigationItem(arg0);
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	} 
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
	    mSearchAction = menu.findItem(R.id.action_search);
	    return super.onPrepareOptionsMenu(menu);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
		    AlertDialog.Builder builder = new AlertDialog.Builder(this);
		    builder.setTitle("Credits");
		    builder.setMessage("Belhakem Mohammed Ryad\n"
		    		+"Benchehida Chawki\n"
		    		+"Hammadi Ilyes\n"
		    		+"Benzaoui Khaled Walid\n"+
		    		"Benabbou Aissa\n"+
		    		"Morsli Abdel Hafid").show();
			return true;
			}
			
			if(id == R.id.action_search){
			
				 if (mSearchOpened) {
			            closeSearchBar();
			        } else {
			            openSearchBar();
			        }
			                   
				   return true;
					}
		
		return super.onOptionsItemSelected(item);
	}
	
	
	private void openSearchBar() {

	    // Set custom view on action bar.
	    ActionBar actionBar = getActionBar();
	    actionBar.setDisplayShowCustomEnabled(true);
	    actionBar.setCustomView(R.layout.search);

	    // Search edit text field setup.
	    mSearchEt = (EditText) actionBar.getCustomView()
	        .findViewById(R.id.etSearch);
	    mSearchEt.requestFocus();

	    // Change search icon accordingly.
	    mSearchAction.setIcon(mIconCloseSearch);
	    mSearchOpened = true;

	}

	private void closeSearchBar() {

	    // Remove custom view.
	    getActionBar().setDisplayShowCustomEnabled(false);

	    // Change search icon accordingly.
	    mSearchAction.setIcon(mIconOpenSearch);
	    mSearchOpened = false;

	}

	

	/**
	 * Responsible for handling changes in search edit text.
	 */
	

	

    
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		viewpager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
}
