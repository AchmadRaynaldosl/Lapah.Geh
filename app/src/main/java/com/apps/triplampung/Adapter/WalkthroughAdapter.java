package com.apps.triplampung.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.apps.triplampung.R;
import com.apps.triplampung.model.WalkthroughModel;

import java.util.List;

public class WalkthroughAdapter extends PagerAdapter {

    private Context context;
    private List<WalkthroughModel> walkthroughModels;

    public WalkthroughAdapter(Context context, List<WalkthroughModel> walkthroughModels) {
        this.context = context;
        this.walkthroughModels = walkthroughModels;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutView = layoutInflater.inflate(R.layout.walkthrough_item, null);

        ImageView imageView = layoutView.findViewById(R.id.image);
        TextView title = layoutView.findViewById(R.id.walkthrough_title);
        TextView description = layoutView.findViewById(R.id.description);

        imageView.setImageResource(walkthroughModels.get(position).getImage());
        title.setText(walkthroughModels.get(position).getTitle());
        description.setText(walkthroughModels.get(position).getDescription());

        container.addView(layoutView);

        return layoutView;
    }

    @Override
    public int getCount() {
        return walkthroughModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
