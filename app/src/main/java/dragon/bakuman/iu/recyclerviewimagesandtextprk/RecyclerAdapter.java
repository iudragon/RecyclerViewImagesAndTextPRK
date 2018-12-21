package dragon.bakuman.iu.recyclerviewimagesandtextprk;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {

    private int[] images;

    public RecyclerAdapter(int[] images) {

        this.images = images;
    }


    public static class ImageViewHolder extends RecyclerView.ViewHolder {


        ImageView mAlbum;
        TextView mAlbumTitle;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);

            mAlbum = itemView.findViewById(R.id.album);
            mAlbumTitle = itemView.findViewById(R.id.album_title);

        }
    }

    //in order to create each item on the recyclerView, the layout manager will call this method onCreateViewHolder

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.album_layout, viewGroup, false);

        ImageViewHolder imageViewHolder = new ImageViewHolder(view);


        return imageViewHolder;
    }

    //for binding appropriate imageview and textview in the recycler view, the layout manager will call onBindViewHolder
    //to place data on the view components

    @Override
    public void onBindViewHolder(ImageViewHolder viewHolder, int i) {

        int imageId = images[i];

        //setting image on the imageView
        viewHolder.mAlbum.setImageResource(imageId);
        viewHolder.mAlbumTitle.setText("Image: " + i);


    }

    @Override
    public int getItemCount() {
        return images.length;
    }
}
