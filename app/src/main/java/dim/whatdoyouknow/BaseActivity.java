package dim.whatdoyouknow;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
/**
 * Created by Jack on 14/03/2017.
 */
public class BaseActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    private String[] mTitles;
    public MediaPlayer player;
    static AudioManager audioManager;
    /*@Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        onCreateDrawer();
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        //setVolumeControlStream(AudioManager.STREAM_MUSIC);
        super.onCreate(savedInstanceState);
        mTitle = mDrawerTitle = getTitle();
        mTitles = getResources().getStringArray(R.array.titleArray);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // set a custom shadow that overlays the main content when the drawer opens
        /*mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);*/
        // set up the drawer's list view with items and click listener
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mTitles));
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        // enable ActionBar app icon to behave as action to toggle nav drawer
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // ActionBarDrawerToggle ties together the the proper interactions
        // between the sliding drawer and the action bar app icon
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                R.string.drawer_open,  /* "open drawer" description for accessibility */
                R.string.drawer_close  /* "close drawer" description for accessibility */
        ) {
            public void onDrawerClosed(View view) {
                getSupportActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
            public void onDrawerOpened(View drawerView) {
                getSupportActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });
    }
    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        if (intent != null) {
            super.startActivityForResult(intent, requestCode);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
    /* The click listener for ListView in the navigation drawer */
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }
    private void selectItem(int position) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, MainActivity.class);
                if(player != null){
                    player.stop();
                }
                break;
            case 1:
                intent = new Intent(this, actJap.class);
                if(player != null){
                    player.stop();
                }
                break;
            case 2:
                intent = new Intent(this, actCreature.class);
                if(player != null){
                    player.stop();
                }
                break;
            case 3:
                intent = new Intent(this, actPeople.class);
                if(player != null){
                    player.stop();
                }
                break;
            case 4:
                intent = new Intent(this, actTest.class);
                if(player != null){
                    player.stop();
                }
                break;
            case 5:
                audioManager.adjustStreamVolume(AudioManager.STREAM_MUSIC,AudioManager.ADJUST_TOGGLE_MUTE,AudioManager.FLAG_SHOW_UI);
            /*default:
                intent = new Intent(this, MainActivity.class);
                if(player != null){
                    player.stop();
                }
                // Activity_0 as default
                break;*/
        }
        startActivity(intent);
        mDrawerList.setItemChecked(position, true);
        setTitle(mTitles[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
    }
    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getSupportActionBar().setTitle(mTitle);
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }
    /* When using the ActionBarDrawerToggle, you must call it during
    * onPostCreate() and onConfigurationChanged()...
    */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggles
        mDrawerToggle.onConfigurationChanged(newConfig);
    }
/*Jap Navigation*/
    public void goHome(View view) {
        startActivity(new Intent(this, MainActivity.class));
        if(player!= null) player.stop();
        }
public void onBackPressed(){
        if(player != null) player.stop();
        finish();
        }
        }
