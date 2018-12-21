package dragon.bakuman.iu.recyclerviewimagesandtextprk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplayActivity extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        mImageView = findViewById(R.id.albumDisplay);
            mImageView.setImageResource(getIntent().getIntExtra("imageId", 0));

    }
}
