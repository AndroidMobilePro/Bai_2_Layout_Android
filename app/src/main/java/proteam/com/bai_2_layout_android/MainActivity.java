package proteam.com.bai_2_layout_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton btnFrame;
    AppCompatButton btnLinear;
    AppCompatButton btnRelative;
    AppCompatButton btnTable;
    AppCompatButton btnAbsolute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFrame = (AppCompatButton) findViewById(R.id.btnFrame);
        btnLinear = (AppCompatButton) findViewById(R.id.btnLinear);
        btnRelative = (AppCompatButton) findViewById(R.id.btnRelative);
        btnTable = (AppCompatButton) findViewById(R.id.btnTable);
        btnAbsolute = (AppCompatButton) findViewById(R.id.btnAbsolute);

        // set click event for button
        btnFrame.setOnClickListener(this);
        btnLinear.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnTable.setOnClickListener(this);
        btnAbsolute.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnFrame:
                startActivity(new Intent(MainActivity.this, FrameLayoutActivity.class));
                break;
            case R.id.btnLinear:
                startActivity(new Intent(MainActivity.this, LinearLayoutActivity.class));
                break;
            case R.id.btnRelative:
                startActivity(new Intent(MainActivity.this, RelativeLayoutActivity.class));
                break;
            case R.id.btnTable:
                startActivity(new Intent(MainActivity.this, TableLayoutActivity.class));
                break;
            case R.id.btnAbsolute:
                startActivity(new Intent(MainActivity.this, AbsoluteLayoutActivity.class));
                break;
        }
    }
}
