package com.example.homeautomation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageFragment extends Fragment{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.imagefragment_layout,
				container, false);
		ImageView imageView = (ImageView)rootView.findViewById(R.id.imageView1);
		imageView.setImageResource(R.drawable.ic_launcher);
		return rootView;
	}

}
