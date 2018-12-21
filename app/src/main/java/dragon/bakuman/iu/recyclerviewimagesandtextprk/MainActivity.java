package dragon.bakuman.iu.recyclerviewimagesandtextprk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    //Handler for recyclerView


    private RecyclerView mRecyclerView;

    private int[] mImages =


            {
                    R.drawable.pic1,
                    R.drawable.pic2,
                    R.drawable.pic3,
                    R.drawable.pic4,
                    R.drawable.pic5,
                    R.drawable.pic6


            };


    private RecyclerAdapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize the handler
        mRecyclerView = findViewById(R.id.recyclerView);

        mLayoutManager = new GridLayoutManager(this, 2);

        mRecyclerView.setHasFixedSize(true);

        mRecyclerView.setLayoutManager(mLayoutManager);


        //pass the int array
        mAdapter = new RecyclerAdapter(mImages);

        mRecyclerView.setAdapter(mAdapter);


    }
}













