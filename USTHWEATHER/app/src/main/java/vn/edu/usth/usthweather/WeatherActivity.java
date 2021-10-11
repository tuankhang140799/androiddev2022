package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Weather","vao on Resume");
        ForecastFragment ff = ForecastFragment.newInstance(",");
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, ff).commit();

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather","vao on Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather","vao on Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather","vao on Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather","vao on Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather","vao on Destroy");
    }
}