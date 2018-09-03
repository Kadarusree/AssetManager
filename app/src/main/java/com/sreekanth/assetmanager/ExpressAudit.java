package com.sreekanth.assetmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ExpressAudit extends AppCompatActivity {


    Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_express_audit);
      /*  mSpinner = findViewById(R.id.spinner1);
        String[] years = {"Al-Rajhi Investment", "In Transit", "Pin Makkah"};
        ArrayAdapter<CharSequence> langAdapter = new ArrayAdapter<CharSequence>(this, R.layout.spinner_drop, years);
        mSpinner.setAdapter(langAdapter);*/
    }
}
