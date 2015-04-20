package com.example.buttonnewfragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if(savedInstanceState==null){
			getSupportFragmentManager()
			.beginTransaction()
			.add(R.id.container,new MyFragment4())
			.commit();
		}
	}
	public void ButtonClicked(View v) {
		Toast.makeText(getApplicationContext(), "Button clicked", Toast.LENGTH_SHORT).show();
		removePreviousFragments();
		getSupportFragmentManager()
		.beginTransaction()
		.add(R.id.container,new MyFragment1())
		.commit();



	}
	public void ButtonClicked1(View v) {
		Toast.makeText(getApplicationContext(), "Button clicked", Toast.LENGTH_SHORT).show();
		removePreviousFragments();
		getSupportFragmentManager()
		.beginTransaction()
		.add(R.id.container,new MyFragment2())
		.commit();


	}
	public void ButtonClicked2(View v) {
		Toast.makeText(getApplicationContext(), "Button clicked", Toast.LENGTH_SHORT).show();
		removePreviousFragments();
		getSupportFragmentManager().beginTransaction()
		.add(R.id.container,new MyFragment3())
		.commit();


	}
	public static class MyFragment1 extends Fragment
	{
		public MyFragment1()
		{

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View rootView=inflater.inflate(R.layout.fragment_1,container,false);
			return rootView;
		}

	}
	public static class MyFragment2 extends Fragment
	{
		public MyFragment2()
		{

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View rootView=inflater.inflate(R.layout.fragment_2,container,false);
			return rootView;
		}

	}
	public static class MyFragment3 extends Fragment
	{
		public MyFragment3()
		{
			
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View rootView=inflater.inflate(R.layout.fragment_3,container,false);
			return rootView;
		}

	}
	public static class MyFragment4 extends Fragment
	{
		public MyFragment4()
		{

		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			View rootView=inflater.inflate(R.layout.fragment_4,container,false);
			return rootView;
		}

	}


	private void removePreviousFragments() {
		// TODO Auto-generated method stub
		ArrayList<Fragment> al=new ArrayList<Fragment>(getSupportFragmentManager().getFragments());
		if(al==null)
		{

		}
		for(Fragment frag:al)
		{
			getSupportFragmentManager().beginTransaction().remove(frag).commit();
		}
	}
}
