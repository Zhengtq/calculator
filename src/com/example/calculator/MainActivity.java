package com.example.calculator;

//heiheihei hahahaha


import android.support.v7.app.ActionBarActivity;
import android.util.TypedValue;
import android.R.layout;
import android.R.string;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;

@SuppressLint("NewApi")
public class MainActivity extends ActionBarActivity {

	public int[] cnum = new int[]{0,1,2,3,4,5,6,7,8,9};
	public String calnum = "";
	private TextView mynum;
	public double finalnum = 0;
	public double num1 = 0;
	public char[] charas = new char[30];
	public double[] nums = new double[30];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mynum = (TextView) findViewById(R.id.textView1);
		
		
		Button b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "1";
				    mynum.setText(calnum);
			}
		});
		

		
		
		Button b2 = (Button)findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "2";
				    mynum.setText(calnum);
			}
		});
		
		Button b3 = (Button)findViewById(R.id.button3);
		b3.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "3";
				    mynum.setText(calnum);
			}
		});
		
		
		Button b4 = (Button)findViewById(R.id.button4);
		b4.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "4";
				    mynum.setText(calnum);
			}
		});
		
		
		Button b5 = (Button)findViewById(R.id.button5);
		b5.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "5";
				    mynum.setText(calnum);
			}
		});
		
		Button b6 = (Button)findViewById(R.id.button6);
		b6.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "6";
				    mynum.setText(calnum);
			}
		});
		
		Button b7 = (Button)findViewById(R.id.button7);
		b7.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "7";
				    mynum.setText(calnum);
			}
		});
		
		Button b8 = (Button)findViewById(R.id.button8);
		b8.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "8";
				    mynum.setText(calnum);
			}
		});
		
		Button b9 = (Button)findViewById(R.id.button9);
		b9.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "9";
				    mynum.setText(calnum);
			}
		});
		
		Button b10 = (Button)findViewById(R.id.button10);
		b10.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "0";
				    mynum.setText(calnum);
			}
		});
		
		Button b11 = (Button)findViewById(R.id.button11);
		b11.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + ".";
				    mynum.setText(calnum);
			}
		});
		
		Button b13 = (Button)findViewById(R.id.button13);
		b13.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "+";
				    mynum.setText(calnum);
			}
		});
		
		Button b14 = (Button)findViewById(R.id.button14);
		b14.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "-";
				    mynum.setText(calnum);
			}
		});
		
		Button b15 = (Button)findViewById(R.id.button15);
		b15.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "X";
				    mynum.setText(calnum);
			}
		});
		
		Button b16 = (Button)findViewById(R.id.button16);
		b16.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = calnum + "/";
				    mynum.setText(calnum);
			}
		});
		
		Button b17 = (Button)findViewById(R.id.button17);
		b17.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				calnum = "";
				    mynum.setText("ÔÆÄÏ£¬ÄãÃÃ°¡£¬³òÄãÕ¦µØ");
				    Arrays.fill(nums,0);
			}
		});
		
		Button b18 = (Button)findViewById(R.id.button18);
		b18.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(calnum.length() != 0)
				calnum =  calnum.substring(0,calnum.length()-1);
				    mynum.setText(calnum);
			}
		});
		
		Button b19 = (Button)findViewById(R.id.button19);
		b19.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				    mynum.setText("¿¼ÑéÄãµÄÊ±ºòµ½À²,cosÖµÄã×Ô¼ºËã°É");
			}
		});
		
		Button b20 = (Button)findViewById(R.id.button20);
		b20.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				    mynum.setText("Ê²Ã´£¿ÎÒ²»¶®Ê²Ã´½Ğsin£¬¹ş¹ş¹ş");
			}
		});
		
		
		Button b12 = (Button)findViewById(R.id.button12);
		b12.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				int index = 0;
				int cf = 0;
				
				for(int i=calnum.length()-1 ; i>=0 ;i--)
				{
					if(calnum.charAt(i) == '+' || calnum.charAt(i) == '-' || calnum.charAt(i) == 'X' ||calnum.charAt(i) == '/')
					{
						nums[index] = num1;
						charas[index] = calnum.charAt(i);
						num1 = 0;
						index++;
						i--;
						cf = 0;
					}
					num1 = Integer.parseInt(String.valueOf(calnum.charAt(i))) * Math.pow(10, cf) + num1;
					if(i == 0)
						{
						nums[index] = num1;
						num1 = 0;
						}
					cf++;
				}
												
				int[] nums1 = new int[30];
				Arrays.fill(nums1,-1);
				int ac = 0;
				for(int j = index - 1; j>=0; j--)
				{
					
					if(charas[j] == 'X')
						nums[j] = nums[j + 1] * nums[j];
					if(charas[j] == '/')
						nums[j] = nums[j + 1] / nums[j];
					if(charas[j] == '+')
						{
						nums1[ac] = j;
						ac++;
						}
					if(charas[j] == '-')
						{
						nums1[ac] = j;
						ac++;
						}
				}
				double finaln = nums[nums1[0] + 1];
				if(ac != 0)
				{
				for(int k = 0; k < ac - 1; k++)
				{
					if(charas[nums1[k]] == '+')
						finaln = finaln + nums[nums1[k + 1] + 1];
					else
						finaln = finaln - nums[nums1[k + 1] + 1];
				}
				
				if(charas[nums1[ac - 1]] == '+')
					finaln = finaln + nums[0];
				else
					finaln = finaln - nums[0];
				}

					
				
				String s = String.valueOf( finaln); 
				finaln = 0;
				mynum.setText(s);
				calnum = "";
				Arrays.fill(nums,0);
			}
		});
			
		
		
		
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
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
