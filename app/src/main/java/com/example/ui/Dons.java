package com.example.ui;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Dons extends Fragment{

	Button btn 		= null;
	CheckBox check = null;
	EditText edit1 = null;
	EditText edit2 = null;
	EditText edit3 = null;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView =inflater.inflate(R.layout.frag_dons,container,false);
		
		//xml and java
		btn 	= (Button)rootView.findViewById(R.id.button1);
		check 	= (CheckBox)rootView.findViewById(R.id.checkBox1);
		
		edit1 = (EditText)rootView.findViewById(R.id.editText1);
		edit2 = (EditText)rootView.findViewById(R.id.editText2);
		edit3 = (EditText)rootView.findViewById(R.id.editText3);
		
		//evenement of button
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if((edit1.toString()).length() == 0){
					AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
					builder.setMessage("Please enter your number of credit card").setTitle("ALERT").show();
				}
				else if(check.isChecked()){
					AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
					
					builder.setMessage("Thanks dor donate !!").setTitle("ALERT").show();
				}
				else{
					AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
					
					builder.setMessage("Please, Checking in the box").setTitle("ALERT").show();
				}
			}
		});
		/*a faire:coice for the associations et background*/
		return rootView;
	}

}
