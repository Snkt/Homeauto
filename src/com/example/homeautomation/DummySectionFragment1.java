package com.example.homeautomation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class DummySectionFragment1 extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";

	public DummySectionFragment1() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.sectionfrgmnt1_layout,
				container, false);
		GridView gridview = (GridView) rootView.findViewById(R.id.gridView1);
	    gridview.setAdapter(new com.example.imageadapter.ImageAdaptr(getActivity()));

	    gridview.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	        	getFragmentManager().beginTransaction().replace(R.id.pager, new ImageFragment()).commit();
	        }
	    });
	    GridView gridview1 = (GridView) rootView.findViewById(R.id.gridView2);
	    gridview1.setAdapter(new com.example.imageadapter.ImageAdaptr(getActivity()));

	    gridview1.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	        	
	        }
	    });
		return rootView;
	}
}