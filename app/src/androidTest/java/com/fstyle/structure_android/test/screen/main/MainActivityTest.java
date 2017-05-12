package com.fstyle.structure_android.test.screen.main;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.fstyle.structure_android.R;
import com.fstyle.structure_android.screen.main.MainActivity;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Rule;
import org.junit.runner.RunWith;

/**
 * Created by Sun on 5/7/2017.
 */
@CucumberOptions(features = "features/result.feature")
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Given("^I have a MainActivity")
    public void I_have_a_MainActivity() {
        mActivityRule.launchActivity(null);
    }

    @When("^I input keyword (\\S+)$")
    public void I_input_keyword(final String keyword) {
        Espresso.onView(ViewMatchers.withId(R.id.edtKeyword))
                .perform(ViewActions.typeText(keyword));
    }

    @When("^I input limit number (\\S+)$")
    public void I_input_limit_number(final String limit) {
        Espresso.onView(ViewMatchers.withId(R.id.edtNumberLimit))
                .perform(ViewActions.typeText(limit));
    }

    @Then("^I should see error on the (\\S+)$")
    public void i_should_see_error_on_the_keyword(final String view) {
        // Write code here that turns the phrase above into concrete actions
        //        Espresso.onView(ViewMatchers.withId(R.id.edtKeyword)).perform(ViewActions
        // .typeText(view));
    }

    @Then("^I should (true|false) Result Screen")
    public void i_should_true_result_screen(final boolean shouldSeeError) {
    }
}