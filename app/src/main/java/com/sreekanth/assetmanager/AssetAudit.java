package com.sreekanth.assetmanager;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class AssetAudit extends AppCompatActivity {


    LinearLayout found, pending, unknown;


    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_asset_audit);

        found = findViewById(R.id.layout_found);
        pending = findViewById(R.id.layout_pending);
        unknown = findViewById(R.id.layout_unknown);

        mFragmentManager = getFragmentManager();
        replaceFragment(new FoundFragment());
        found.setBackgroundColor(getResources().getColor(R.color.light_red));
        pending.setBackgroundColor(getResources().getColor(R.color.black));
        unknown.setBackgroundColor(getResources().getColor(R.color.black));


        found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                found.setBackgroundColor(getResources().getColor(R.color.light_red));
                pending.setBackgroundColor(getResources().getColor(R.color.black));
                unknown.setBackgroundColor(getResources().getColor(R.color.black));
                replaceFragment(new FoundFragment());
            }
        });

        pending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                found.setBackgroundColor(getResources().getColor(R.color.black));
                pending.setBackgroundColor(getResources().getColor(R.color.light_red));
                unknown.setBackgroundColor(getResources().getColor(R.color.black));
                replaceFragment(new PendingFragment());

            }
        });

        unknown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                found.setBackgroundColor(getResources().getColor(R.color.black));
                pending.setBackgroundColor(getResources().getColor(R.color.black));
                unknown.setBackgroundColor(getResources().getColor(R.color.light_red));
                replaceFragment(new UnknownFragment());

            }
        });


    }

    public void replaceFragment(Fragment mFragment) {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.content_frame, mFragment);
        mFragmentTransaction.commit();
    }
}
