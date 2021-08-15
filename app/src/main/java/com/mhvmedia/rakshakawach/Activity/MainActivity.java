package com.mhvmedia.rakshakawach.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;
import com.mhvmedia.rakshakawach.Adapter.BottomNavViewPagerAdapter;
import com.mhvmedia.rakshakawach.Fragment.Main.Controller;
import com.mhvmedia.rakshakawach.Fragment.Main.Home;
import com.mhvmedia.rakshakawach.Fragment.Main.Information;
import com.mhvmedia.rakshakawach.Fragment.Main.Settings;
import com.mhvmedia.rakshakawach.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setFragmentsToViewPager();

        binding.profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), UserProfile.class);
                startActivity(intent);
            }
        });
    }
    private void setFragmentsToViewPager() {
        // set fragments to view pager
        BottomNavViewPagerAdapter adapter = new BottomNavViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new Home(), "");
        adapter.addFrag(new Controller(), "");
        adapter.addFrag(new Settings(), "");
        adapter.addFrag(new Information(), "");
        binding.viewPager.setAdapter(adapter);

        //page swipe and click handling
        binding.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override
            public void onPageSelected(int i) {
                binding.bubbleNavigationLinearView.setCurrentActiveItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        //page swipe and click handling
        binding.bubbleNavigationLinearView.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                binding.viewPager.setCurrentItem(position, true);
            }
        });
    }

}