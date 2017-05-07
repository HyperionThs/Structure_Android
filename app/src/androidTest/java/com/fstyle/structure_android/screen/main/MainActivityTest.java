package com.fstyle.structure_android.screen.main;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.fstyle.structure_android.R;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.espresso.action.ViewActions;
import org.junit.runner.RunWith;

/**
 * Created by Sun on 5/7/2017.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {

    }

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