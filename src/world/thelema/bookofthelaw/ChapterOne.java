package world.thelema.bookofthelaw;

import world.thelema.bookofthelaw.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ChapterOne extends Activity {

	Button bChap1, bChap2, bChap3, bComm;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chapter_one);
		bComm = (Button) findViewById(R.id.bComm);
		bChap2 = (Button) findViewById(R.id.bChap2);
		bChap3 = (Button) findViewById(R.id.bChap3);

		bComm.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(ChapterOne.this, Comment.class));
			}

		});
		bChap2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(ChapterOne.this, ChapterTwo.class));
			}

		});
		bChap3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(ChapterOne.this, ChapterThree.class));
			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
}