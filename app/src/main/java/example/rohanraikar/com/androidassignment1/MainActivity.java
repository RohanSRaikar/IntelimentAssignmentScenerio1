package example.rohanraikar.com.androidassignment1;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import example.rohanraikar.com.androidassignment1.AdapterClasses.MyPagerAdapter;


public class MainActivity extends AppCompatActivity {
    TabHost mTabHost;
    TextView tv_TabMessage;
    LinearLayout ll_btnsHolder;
    MyPagerAdapter pAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabHost=(TabHost)findViewById(R.id.tabhost);
        tv_TabMessage=(TextView)findViewById(R.id.TV_tabClickMsg);
        ll_btnsHolder=(LinearLayout)findViewById(R.id.LL_btnBackground);
        ViewPager pager=(ViewPager)findViewById(R.id.myViewPager);
        pAdapter=new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pAdapter);
        mTabHost.setup();
        //creating 5 tabs using a loop
        for(int i=1;i<=5;i++){
            setupTab(new TextView(this), "Item "+i);
        }
    }
    /* Function to setup the tab and perform the action on click */
    private void setupTab(final View textView, String s) {
        View tabView = createTabView(mTabHost.getContext(), s);
        TabHost.TabSpec setContent=mTabHost.newTabSpec(s).setIndicator(tabView).setContent(new TabHost.TabContentFactory() {
            public View createTabContent(String s)
            {return textView;}
        });
        mTabHost.addTab(setContent);
        mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                //Toast.makeText(getApplicationContext(),"Tab clicked : "+tabId,Toast.LENGTH_LONG).show();
                //Display the clicked item from the tab in the Textview
                tv_TabMessage.setText(tabId);
            }
        });
    }

    private static View createTabView(final Context context, final String text) {
        View view = LayoutInflater.from(context).inflate(R.layout.tab_background, null);
        TextView tv = (TextView) view.findViewById(R.id.tabTitle);
        tv.setText(text);
        return view;
    }

    //Function to change color of the background on click of the button
    public void changeColor(View v){
            switch(v.getId()){
                case R.id.btn_Red:
                    Toast.makeText(getApplicationContext(),"Red Button was clicked",Toast.LENGTH_SHORT).show();
                    ll_btnsHolder.setBackgroundColor(Color.parseColor("#E53935"));
                    break;
                case R.id.btn_Green:
                    Toast.makeText(getApplicationContext(),"Green Button was clicked",Toast.LENGTH_SHORT).show();
                    ll_btnsHolder.setBackgroundColor(Color.parseColor("#4CAF50"));
                    break;
                case R.id.btn_Blue:
                    Toast.makeText(getApplicationContext(),"Blue Button was clicked",Toast.LENGTH_SHORT).show();
                    ll_btnsHolder.setBackgroundColor(Color.parseColor("#039BE5"));
                    break;
                default:
                    break;
            }
    }
}
