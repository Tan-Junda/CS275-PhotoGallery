package jtan5.example.photogallery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.fragment.app.Fragment;

public class PhotoPageActivity extends SingleFragmentActivity {
    public static Intent newIntent (Context context, Uri photoPageUri){
        Intent i = new Intent(context, PhotoPageActivity.class);
        return i;
    }
    @Override
    protected Fragment createFragment() {
        return PhotoPageFragment.newInstance(getIntent().getData());

    }
}
