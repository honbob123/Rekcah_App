package com.example.last_make;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        Button btnColor = (Button)findViewById(R.id.image1);
        btnColor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Color_Therapy.class);
                startActivity(intent);
            }
        }); // 버튼 누르면 페이지 넘기는 코드 지금 설정은 왼쪽 상단 버튼
        Button btnAroma = (Button)findViewById(R.id.image2);
        btnAroma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Aromatherapy.class);
                startActivity(intent);
            }
        });
        Button btnLibrary = (Button)findViewById(R.id.image3);
        btnLibrary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, therapylib.class);
                startActivity(intent);
            }
        });
        Button btnMarket = (Button)findViewById(R.id.image4);
        btnLibrary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, therapylib.class);
                startActivity(intent);
            }
        });
        /*
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.logo);
        actionBar.setBackgroundDrawable(new ColorDrawable(0x00000000));
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        */
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.top_action, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.search:
            Toast.makeText(getApplicationContext(),"검색버튼",Toast.LENGTH_SHORT).show();
            return(true);

    }
        return(super.onOptionsItemSelected(item));
    }
}
