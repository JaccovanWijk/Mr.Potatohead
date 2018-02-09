package com.example.jacco.mr_potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");

        CheckBox checkbox = (CheckBox) v;
        String name = checkbox.getText().toString();
        boolean checked = checkbox.isChecked();

        ImageView Arms = (ImageView) findViewById(R.id.Arms);
        ImageView Shoes = (ImageView) findViewById(R.id.Shoes);
        ImageView Eyes = (ImageView) findViewById(R.id.Eyes);
        ImageView Eyebrow = (ImageView) findViewById(R.id.Eyebrow);
        ImageView Glasses = (ImageView) findViewById(R.id.Glasses);
        ImageView Hat = (ImageView) findViewById(R.id.Hat);
        ImageView Nose = (ImageView) findViewById(R.id.Nose);
        ImageView Moustache = (ImageView) findViewById(R.id.Moustache);
        ImageView Mouth = (ImageView) findViewById(R.id.Mouth);
        ImageView Ears = (ImageView) findViewById(R.id.Ears);

        ImageView[] Photos = {Arms,Shoes,Eyes,Eyebrow,Glasses,Hat,Nose,Moustache,Mouth,Ears};

        //Check if checkbox is checked, if so make visible

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
