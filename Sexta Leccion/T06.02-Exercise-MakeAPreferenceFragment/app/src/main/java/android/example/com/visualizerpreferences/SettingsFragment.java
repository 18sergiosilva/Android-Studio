package android.example.com.visualizerpreferences;

import android.os.Bundle;

/**
 * Created by elizabeth on 03/07/2017.
 */

public class SettingsFragment extends PreferenceFragmentCompat {


    @Override
    public void onCreatePreferences(Bundle bundle, String s) {

        addPreferencesFromResource(R.xml.pref_visualizer);
    }

}
