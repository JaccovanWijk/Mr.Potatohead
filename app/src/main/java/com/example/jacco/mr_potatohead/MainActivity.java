package com.example.jacco.mr_potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int imageId[] = new int[]{R.id.Arms, R.id.Shoes, R.id.Eyes, R.id.Eyebrow, R.id.Glasses, R.id.Hat,
                              R.id.Nose, R.id.Moustache, R.id.Mouth, R.id.Ears};
    String[] Names = {"Arms","Shoes","Eyes","Eyebrow","Glasses","Hat","Nose","Moustache","Mouth","Ears"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            for (int i = 0; i < Names.length; i++) {
                ImageView image = findViewById(imageId[i]);
                if (image != null) {
                    image.setVisibility(savedInstanceState.getInt(Names[i]));
                }
            }
        }
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for (int i = 0; i < Names.length; i++) {
            ImageView image = findViewById(imageId[i]);
            outState.putInt(Names[i], image.getVisibility());
        }
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");

        CheckBox checkbox = (CheckBox) v;
        String name = checkbox.getText().toString();
        boolean checked = checkbox.isChecked();

        int Length = Names.length;
        for (int i = 0; i < Length; i++) {

            ImageView image = findViewById(imageId[i]);

            if (name.equals(Names[i])) {
                if (checked) {
                    image.setVisibility(View.VISIBLE);
                } else {
                    image.setVisibility(View.INVISIBLE);
                }
            }
        }
    }
}
