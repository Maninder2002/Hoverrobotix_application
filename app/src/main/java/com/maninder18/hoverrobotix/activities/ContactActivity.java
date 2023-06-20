package com.maninder18.hoverrobotix.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.maninder18.hoverrobotix.R;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);


//        ludhiana office -----------

        TextView phoneNumberTextView = findViewById(R.id.phone_number_textview1);
        phoneNumberTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "9888583736";
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(dialIntent);
            }
        });

        TextView phoneNumberTextView2 = findViewById(R.id.phone_number_textview2);
        phoneNumberTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "9814571232";
                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                dialIntent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(dialIntent);
            }
        });

        TextView emailTextView = findViewById(R.id.email_textview1);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "hoverRobotix@gmail.com";
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + email));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        TextView emailTextView2 = findViewById(R.id.email_textview2);
        emailTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "ceo@hoverRobotix.com";
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + email));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        TextView locationTextView = findViewById(R.id.location_textview1);
        locationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "855 Opp. Hotel Grand Marian, D-Block, Model Town Extension, Ludhiana, Punjab 141002";
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });


//        Delhi office

        TextView delhi_email = findViewById(R.id.delhi_office_mail);
        delhi_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "info@hoverRobotix.com";
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + email));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        TextView delhi_location = findViewById(R.id.delhi_office_location);
        delhi_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "Daftar Cowork Building No. 2, 3rd Floor, GT Karnal Road,State Bank Colony, Derawal Nagar,Gujranwala Town, Delhi - 110009, INDIA.";
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

//        Mumbai Office

        TextView mumbai_email = findViewById(R.id.mumbai_mail);
        mumbai_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "info@hoverRobotix.com";
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + email));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        TextView mumbai_location = findViewById(R.id.mumbai_location);
        mumbai_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "Kuber Complex, Opposite Laxmi Industrial Estate, New Link Road, Andheri West, Mumbai - 400053 (Maharashtra) INDIA.";
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        //                      Australia Office

        TextView australia_email = findViewById(R.id.australia_mail);
        australia_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "info@hoverRobotix.com";
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + email));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        TextView australia_location = findViewById(R.id.australia_location);
        australia_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = "49, Steward Drive, Oran Park-2570New South Wales, AUSTRALIA.";
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });


//        Mauritius Office

        TextView mauritius_email = findViewById(R.id.mauritius_mail);
        mauritius_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = "info@hoverRobotix.com";
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + email));
                startActivity(Intent.createChooser(emailIntent, "Send email"));
            }
        });

        TextView mauritius_location = findViewById(R.id.mauritius_location);
        mauritius_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = " Ramnath Jeetah Trust,Greenwich University Campus, Cybercity, Ebene -72201, MAURITIUS.";
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + location);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });



//        bottom nav

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.contact);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);
                    finish();
                    return true;
                case R.id.about:
                    startActivity(new Intent(getApplicationContext(),AboutActivity.class));
                    overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);
                    finish();
                    return true;

                case R.id.contact:
                    return true;
            }
            return false;
        });
    }
}