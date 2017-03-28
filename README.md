# Smash Brothers
Second Project for Udacity's Android Basics Program

## Description

Smash Brothers is a simple score counter app, based on the video game series, Smash Brothers.

## Prerequisites

* Android SDK v24

## Screenshots

![Score counter](https://github.com/trobbierob/smashbrothers/blob/master/screenshots/screenshot.png)

## Specifications

* The chosen game has either multiple amounts of points that can be scored, as in american football, or multiple important metrics to track, such as fouls, outs, and innings in baseball.

* App is divided into two columns
  * Each column contains a large TextView to keep track of the current score for that team
  * Each column contains multiple buttons
  
* Layout contains a 'reset' button
  * The reset button resets the scores on both of the score TextViews

## Sample Code
~~~
 spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Player 2 is " +
                        parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        }); // second player character select
~~~

## Special Thanks

HAL Laboratory, Inc. [_Super Smash Bros. Melee_](https://www.ssbwiki.com/Super_Smash_Bros._Melee). Nintendo, 2001. GameCube.
