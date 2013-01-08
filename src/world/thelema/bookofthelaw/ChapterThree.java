package world.thelema.bookofthelaw;

import world.thelema.bookofthelaw.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ChapterThree extends Activity {

	Button bChap1, bChap2, bChap3, bComm;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chapter_three);
		bComm = (Button) findViewById(R.id.bComm);
		bChap1 = (Button) findViewById(R.id.bChap1);
		bChap2 = (Button) findViewById(R.id.bChap2);

		bComm.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(ChapterThree.this, Comment.class));
			}

		});
		bChap1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(ChapterThree.this, ChapterOne.class));
			}

		});
		bChap2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(ChapterThree.this, ChapterTwo.class));
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