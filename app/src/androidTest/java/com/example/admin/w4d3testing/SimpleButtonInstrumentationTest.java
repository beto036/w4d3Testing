package com.example.admin.w4d3testing;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by admin on 11/9/2016.
 */
@RunWith(AndroidJUnit4.class)
public class SimpleButtonInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void checkButton(){
        onView(withId(R.id.aMainBtn))
                .perform(click());

        onView(withId(R.id.aResultTxt))
                .check(matches(withText("SimpleRecyclerView")));
    }
}
