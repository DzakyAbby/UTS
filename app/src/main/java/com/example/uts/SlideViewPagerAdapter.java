package com.example.uts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;


public class SlideViewPagerAdapter extends PagerAdapter {

    Context ctx;

    public SlideViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_screen,container,false);

        ImageView logo = view.findViewById(R.id.logo);
        ImageView ind1 = view.findViewById(R.id.ind1);
        ImageView ind2 = view.findViewById(R.id.ind2);
        ImageView ind3 = view.findViewById(R.id.ind3);

        TextView title_slide = view.findViewById(R.id.title_slide);
        TextView content_slide = view.findViewById(R.id.content_slide);

        ImageView next = view.findViewById(R.id.next);
        ImageView back = view.findViewById(R.id.back);

        Button btn_slide = view.findViewById(R.id.btn_slide);
        btn_slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx,HomeActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK| Intent.FLAG_ACTIVITY_NEW_TASK);
                ctx.startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.example.uts.SlideActivity.viewPager.setCurrentItem(position+1);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.example.uts.SlideActivity.viewPager.setCurrentItem(position-1);
            }
        });

        switch (position){
            case 0 :
                logo.setImageResource(R.drawable.welcome);
                ind1.setImageResource(R.drawable.selected);
                ind2.setImageResource(R.drawable.selected2);
                ind3.setImageResource(R.drawable.selected2);

                title_slide.setText("HAIIII.....");
                content_slide.setText("MySelf Apps DzakyAbbyFauzanAziz");

                back.setVisibility(View.GONE);
                next.setVisibility(View.VISIBLE);
                btn_slide.setVisibility(View.GONE);
                break;

            case 1 :
                logo.setImageResource(R.drawable.questionmark);
                ind1.setImageResource(R.drawable.selected2);
                ind2.setImageResource(R.drawable.selected);
                ind3.setImageResource(R.drawable.selected2);

                title_slide.setText("ADA APA DI SINI???");
                content_slide.setText("Di sini kamu akan menemukan beberapa info dan data diri seputar sang kreator loh...");

                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);
                btn_slide.setVisibility(View.GONE);
                break;

            case 2 :
                logo.setImageResource(R.drawable.rocket);
                ind1.setImageResource(R.drawable.selected2);
                ind2.setImageResource(R.drawable.selected2);
                ind3.setImageResource(R.drawable.selected);

                title_slide.setText("YUK MULAIII");
                content_slide.setText("Tekan tombol Ayo Mulai untuk melanjutkan ke aplikasi yaaa");

                back.setVisibility(View.VISIBLE);
                next.setVisibility(View.GONE);
                btn_slide.setVisibility(View.VISIBLE);
                break;

        }

        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
