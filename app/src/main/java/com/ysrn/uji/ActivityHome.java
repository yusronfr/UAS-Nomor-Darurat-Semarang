package com.ysrn.uji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnimage = findViewById(R.id.btn_image);
        btnimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ImageIntent = new Intent(ActivityHome.this, ActivityImage.class);
                startActivity(ImageIntent);
            }
        });
    
        Button btninfo = findViewById(R.id.btn_info);
        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InfoIntent = new Intent(ActivityHome.this, ActivityInfo.class);
                startActivity(InfoIntent);
            }
        });

        Button btnprofile = findViewById(R.id.btn_profile);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ProfileIntent = new Intent(ActivityHome.this, ActivityProfile.class);
                startActivity(ProfileIntent);
            }
        });

        ImageButton btn_image1 = findViewById(R.id.btn_imageButton1);
        btn_image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1500132"));
                startActivity(var);

            }
        });

        ImageButton btn_image2 = findViewById(R.id.btn_imageButton2);
        btn_image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:118"));
                startActivity(var);

            }
        });

        ImageButton btn_image3 = findViewById(R.id.btn_imageButton3);
        btn_image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:113"));
                startActivity(var);

            }
        });

        ImageButton btn_image4 = findViewById(R.id.btn_imageButton4);
        btn_image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7608735"));
                startActivity(var);

            }
        });

        ImageButton btn_image5 = findViewById(R.id.btn_imageButton5);
        btn_image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8315514"));
                startActivity(var);

            }
        });

        ImageButton btn_image6 = findViewById(R.id.btn_imageButton6);
        btn_image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:117"));
                startActivity(var);

            }
        });

        ImageButton btn_image7 = findViewById(R.id.btn_imageButton7);
        btn_image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:290123"));
                startActivity(var);

            }
        });

        ImageButton btn_image8 = findViewById(R.id.btn_imageButton8);
        btn_image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3541237"));
                startActivity(var);

            }
        });

        ImageButton btn_image9 = findViewById(R.id.btn_imageButton9);
        btn_image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8413476"));
                startActivity(var);

            }
        });

        ImageButton btn_image10 = findViewById(R.id.btn_imageButton10);
        btn_image10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3580027"));
                startActivity(var);

            }
        });

        ImageButton btn_image11 = findViewById(R.id.btn_imageButton11);
        btn_image11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3544544"));
                startActivity(var);

            }
        });

        ImageButton btn_image12 = findViewById(R.id.btn_imageButton12);
        btn_image12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6581924"));
                startActivity(var);

            }
        });

        ImageButton btn_image13 = findViewById(R.id.btn_imageButton13);
        btn_image13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6724169"));
                startActivity(var);

            }
        });

        ImageButton btn_image131 = findViewById(R.id.btn_imageButton131);
        btn_image131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3566320"));
                startActivity(var);

            }
        });

        ImageButton btn_image132 = findViewById(R.id.btn_imageButton132);
        btn_image132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7479197"));
                startActivity(var);

            }
        });

        ImageButton btn_image14 = findViewById(R.id.btn_imageButton14);
        btn_image14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3515451"));
                startActivity(var);

            }
        });

        ImageButton btn_image15 = findViewById(R.id.btn_imageButton15);
        btn_image15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7604153"));
                startActivity(var);

            }
        });

        ImageButton btn_image16 = findViewById(R.id.btn_imageButton16);
        btn_image16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8315123"));
                startActivity(var);

            }
        });

        ImageButton btn_image17 = findViewById(R.id.btn_imageButton17);
        btn_image17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3545175"));
                startActivity(var);

            }
        });

        ImageButton btn_image18 = findViewById(R.id.btn_imageButton18);
        btn_image18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6716191"));
                startActivity(var);

            }
        });

        ImageButton btn_image19 = findViewById(R.id.btn_imageButton19);
        btn_image19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:3545162"));
                startActivity(var);

            }
        });
        ImageButton btn_image20 = findViewById(R.id.btn_imageButton20);
        btn_image20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent var = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8444444"));
                startActivity(var);

            }
        });


    }
}