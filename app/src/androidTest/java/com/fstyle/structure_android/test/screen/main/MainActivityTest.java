package com.fstyle.structure_android.test.screen.main;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;
import com.fstyle.structure_android.R;
import com.fstyle.structure_android.screen.main.MainActivity;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/**
 * Created by Sun on 5/7/2017.
 */
@CucumberOptions(features = "features")
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    //    @Rule
    //    public ActivityTestRule<MainActivity> mTestRule = new ActivityTestRule<>(MainActivity
    // .class);

    public MainActivityTest(MainActivity activityClass) {
        super(MainActivity.class);
    }

    @Given("^I have a MainActivity")
    public void I_have_a_MainActivity() {
        Assert.assertNotNull(getActivity());
    }

    @When("^I input keyword \"(S+)\"$")
    public void I_input_keyword(String keyword) {
        Espresso.onView(ViewMatchers.withId(R.id.edtKeyword))
                .perform(ViewActions.typeText(keyword));
    }
}