package world.thelema.bookofthelaw;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

public class Comment extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comment);
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
			onDestroy();
			break;
		case R.id.mComment:
			setContentView(R.layout.activity_comment);
			break;
		case R.id.mChapOne:
			setContentView(R.layout.chapter_one);
			break;
		case R.id.mChapTwo:
			setContentView(R.layout.chapter_two);
			break;
		case R.id.mChapThree:
			setContentView(R.layout.chapter_three);
			break;
		}
		return true;
	}
}