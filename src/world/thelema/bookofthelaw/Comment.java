package world.thelema.bookofthelaw;

import world.thelema.bookofthelaw.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Comment extends Activity {

	Button bChap1, bChap2, bChap3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comment);

		bChap1 = (Button) findViewById(R.id.bChap1);
		bChap2 = (Button) findViewById(R.id.bChap2);
		bChap3 = (Button) findViewById(R.id.bChap3);

		bChap1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Comment.this, ChapterOne.class));
			}

		});
		bChap2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Comment.this, ChapterTwo.class));
			}

		});
		bChap3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Comment.this, ChapterThree.class));
			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	
	   @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	        case R.id.mCredits:
	        	setContentView(R.layout.credits);
	        	break;
	        case R.id.mExit:
	        	finish();
	        	break;
	        }
			return true;
	   }
	   }
