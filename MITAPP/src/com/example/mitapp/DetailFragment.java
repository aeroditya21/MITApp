package com.example.mitapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		return inflater.inflate(R.layout.detail_view,container,false);
		
	}

	@Override
	public void onStart() {
		super.onStart();
		TextView fragtv = (TextView) getActivity().findViewById(R.id.detail_view);
		fragtv.setText("Fragment here!");
	}
	
	
	 
}
