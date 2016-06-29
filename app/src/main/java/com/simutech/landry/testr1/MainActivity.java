package com.simutech.landry.testr1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivity  extends Activity implements View.OnClickListener {
private int statut = 1;
 public Button start;
    public TextView lblMsg;
    public ListView lvMsg;
    public SimpleCursorAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button)findViewById(R.id.btn);
        lblMsg = (TextView)findViewById(R.id.Text);
        changeTechno("2g");
    }
    public void changeTechno(String techno){
        while (statut == 1) {
            long start;
            start = System.nanoTime();
            long duree = System.nanoTime() - start;
            lblMsg.setText("" + duree);
        }
    }

    @Override
    public void onClick(View v) {
        if (v == start) {
            statut = 0;
        }
    }
}
