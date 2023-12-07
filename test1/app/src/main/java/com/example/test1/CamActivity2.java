package com.example.test1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CamActivity2 extends AppCompatActivity {
    private Button buttoncam;
    private ImageView imgview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam2);
        buttoncam = findViewById(R.id.buttoncam1);
        imgview = findViewById(R.id.imageView);

    }
public void opencamapp (View view){
    Intent camint = new  Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(camint, 10);
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 10 && resultCode == RESULT_OK ){
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imgview.setImageBitmap(photo);
        }else{
            Toast.makeText(this,"Canceled", Toast.LENGTH_SHORT).show();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
