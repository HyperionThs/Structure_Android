package com.fstyle.structure_android.screen.main;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import com.fstyle.structure_android.R;
import cucumber.api.CucumberOptions;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by Sun on 5/7/2017.
 */
@CucumberOptions(features = "features")
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mTestRule = new ActivityTestRule<>(MainActivity.class);

//    @Test
//    public void onSearchError() throws Exception {
//
//    }
//
//    @Test
//    public void onSearchUsersSuccess() throws Exception {
//
//    }
//
//    @Test
//    public void onInvalidKeyWord() throws Exception {
//
//    }
//
//    @Test
//    public void onInvalidLimitNumber() throws Exception {
//
//    }

    @Test
    public void onSearchButtonClicked() throws Exception {
        Espresso.onView(ViewMatchers.withId(R.id.edtKeyword))
                .perform(ViewActions.typeText("shit"));

    }
}