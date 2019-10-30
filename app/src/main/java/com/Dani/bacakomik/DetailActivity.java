package com.Dani.bacakomik;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_KOMIK_NAME = "extra_komik_name";
    public static final String EXTRA_KOMIK_DETAIL = "extra_komik_detail";
    public static final String EXTRA_KOMIK_GENRE = "extra_komik_genre";
    public static final String EXTRA_KOMIK_IMAGE = "extra_komik_image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView ivKomikImage;
        TextView tvKomikName, tvKomikDetail, tvKomikGenre;

        ivKomikImage = findViewById(R.id.img_komik_photo);
        tvKomikName = findViewById(R.id.tv_komik_name);
        tvKomikGenre = findViewById(R.id.tv_komik_genre);
        tvKomikDetail = findViewById(R.id.tv_komik_detail);

        int image = getIntent().getIntExtra(EXTRA_KOMIK_IMAGE, 0);
        String name = getIntent().getStringExtra(EXTRA_KOMIK_NAME),
                genre = getIntent().getStringExtra(EXTRA_KOMIK_GENRE),
                detail = getIntent().getStringExtra(EXTRA_KOMIK_DETAIL);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), image);
        ivKomikImage.setImageBitmap(bitmap);
        tvKomikName.setText(name);
        tvKomikGenre.setText(genre);
        tvKomikDetail.setText(detail);
    }
}
