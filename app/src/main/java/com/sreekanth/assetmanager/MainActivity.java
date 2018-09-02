package com.sreekanth.assetmanager;

import android.app.AlertDialog;

import android.app.Dialog;
import android.support.v7.app.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Dialog d;
    TextView tv_header;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        d = new Dialog(this);
        d.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        d.getWindow().setBackgroundDrawableResource(R.color.transparent);
        tv_header = findViewById(R.id.tv_header);

        String text = "<font color=#156177>ASSET</font> <font color=#ffffff>VISIBILITY</font>";
        tv_header.setText(Html.fromHtml(text));
    }

    public void searchClick(View view) {
        d.setContentView(R.layout.dialog_search);
        Button asset_saerch = d.findViewById(R.id.btn_asset_search);
        Button asset_inquiry = d.findViewById(R.id.btn_asset_inquiry);

        asset_inquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        asset_saerch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AssetSearch.class));

            }
        });
        d.show();
    }

    public void transfer(View view) {
        d.setContentView(R.layout.dialog_transfer);
        Button btn_transfer_out = d.findViewById(R.id.btn_transfer_out);
        Button btn_transfer_in = d.findViewById(R.id.btn_transfer_in);

        btn_transfer_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TransferIn.class));

            }
        });
        btn_transfer_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TransferOut.class));

            }
        });

        d.show();
    }

    public void register(View view) {
        d.setContentView(R.layout.dialog_register);
        d.show();
    }

    public void settings(View view) {
        startActivity(new Intent(getApplicationContext(), Settings.class));
    }

    public void logout(View view) {
        d.setContentView(R.layout.dialog_logout);
        d.show();
    }

    public void checkout(View view) {
        d.setContentView(R.layout.dialog_checkout);
        Button check_out = d.findViewById(R.id.btn_check_out);
        Button check_in = d.findViewById(R.id.btn_check_in);

        check_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CheckOut.class));

            }
        });
        check_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), CheckIn.class));
            }
        });
        d.show();
    }

    public void audit(View view) {
        d.setContentView(R.layout.dialog_audit);
        Button locationAudit = d.findViewById(R.id.btn_location_audit);
        Button assetAudit = d.findViewById(R.id.btn_asset_audit);
        Button expressAudit = d.findViewById(R.id.btn_express_audit);

        locationAudit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LocationAudit.class));
            }
        });
        expressAudit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ExpressAudit.class));
            }
        });
        assetAudit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AssetAudit.class));
            }
        });
        d.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (d.isShowing()){
            d.dismiss();
        }
    }
}
