package game2048.xiaolian;

import android.support.v7.app.ActionBarActivity;
import android.R.integer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	
	private TextView 	tvScore;
	private static MainActivity mainActivity=null;
	private int score=0;
	
	public static MainActivity getMainActivity(){
		return mainActivity;
	}
	
	public MainActivity(){
		mainActivity=this;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvScore=(TextView) findViewById(R.id.tvScore);
	}

	public void clearScore(){
		score=0;
		showScore();
	}
	public void showScore(){
		tvScore.setText(score+"");
	}
	public void addScore(int s){
		score+=s;
		showScore();
	}
	
}
