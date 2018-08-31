package com.sreekanth.assetmanager;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog d ;
    TextView tv_header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        d = new Dialog(this);
        tv_header= findViewById(R.id.tv_header);

        String text = "<font color=#156177>ASSET</font> <font color=#ffffff>VISIBILITY</font>";
        tv_header.setText(Html.fromHtml(text));
    }

    public void searchClick(View view) {
        d.setContentView(R.layout.dialog_search);
        d.show();
    }

    public void transfer(View view) {
        d.setContentView(R.layout.dialog_transfer);
        d.show();
    }

    public void register(View view) {
        d.setContentView(R.layout.dialog_register);
        d.show();
    }
}
