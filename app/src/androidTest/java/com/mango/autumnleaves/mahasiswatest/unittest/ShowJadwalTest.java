package com.mango.autumnleaves.mahasiswatest.unittest;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.mango.autumnleaves.R;
import com.mango.autumnleaves.ui.activity.login.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class ShowJadwalTest {

    private ViewAssertion myIsDisplayed() {
        return (view, noViewFoundException) -> isDisplayed();
    }

    @Rule
    public ActivityTestRule<LoginActivity> activityTestRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void showJadwal() throws InterruptedException {

        Espresso.onView(ViewMatchers.withId(R.id.jadwal)).perform(click());
        Thread.sleep(5000);
        Espresso.onView(withId(R.id.tvJadwalHariIni)).check(myIsDisplayed());
        pressBack();

    }
}
