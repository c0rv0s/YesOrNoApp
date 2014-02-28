package com.example.yesorno;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yesorno.MessageContent.MessageItem;

public class SubmitActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        // Show the Up button in the action bar.
        setupActionBar();
    }

    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void setupActionBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
        getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

	@Override
	  public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.submit, menu);
	    return true;
	  }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // This ID represents the Home or Up button. In the case of this
                // activity, the Up button is shown. Use NavUtils to allow users
                // to navigate up one level in the application structure. For
                // more details, see the Navigation pattern on Android Design:
                //
                // http://developer.android.com/design/patterns/navigation.html#up-vs-back
                //
                NavUtils.navigateUpFromSameTask(this);
                return true;
                
            case R.id.action_send_now:
            	Context context = getApplicationContext();
            	CharSequence text = "Your Question has been submitted";
            	int duration = Toast.LENGTH_SHORT;
            	
            	Toast toast = Toast.makeText(context, text, duration);
            	toast.show();
            	
            	NavUtils.navigateUpFromSameTask(this);
      	      break;
        }
        return super.onOptionsItemSelected(item);
    }
    
/*    public void submitQuestion(View view) {
        // Do something in response to button
    	EditText editText = (EditText) findViewById(R.id.question_entry);
        String content = editText.getText().toString();
        String title = content.substring(0, 30);
    	
    	MessageItem d = new MessageItem(title, content);
    }*/

}
