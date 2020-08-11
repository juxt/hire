# JUXT Tech Test

## Test instructions

This repository contains a boilerplate ClojureScript app, based on the leiningen figwheel template.

Your task is to follow the steps below to build a simple weather component and submit a private repository forked from this one.

Your repo should contain:

- The codebase itself
- A test suite (whatever seems appropriate)
- A description of what you could have done better given more time
- A screenshot of your app

Try to treat this as you would a professional project with multiple people on the team (e.g keep code clean, use good commit messages etc). This is more important than actually finishing all the tasks.

We don’t expect the application to be production level quality. However, we’re interested in your thinking process, and are looking for you to identify decisions you make which would be different if you were given the time to build this in a more complete way.

Try to limit yourself to no more than 3 hours, as in the real world, there is more work to be done here than time available, so part of the test is how you manage your time.

## Tasks

The tasks are split in to different parts to make it easier to discuss during the review. Each part builds on top of the last.

### Part 1

Your task is to build a weather component like the one in the screenshot below.

![example-screenshot](https://user-images.githubusercontent.com/9809256/89180436-aee99180-d589-11ea-878a-b2263faf9371.png)

The screenshot above is purely an example, the important parts are the features and overall structure.

You can find the icons used here [https://erikflowers.github.io/weather-icons/](https://erikflowers.github.io/weather-icons/) although you do not need to use icons, you can have text labels if you want, as long as the result is clearly readable and has feature parity.

For this task you can hardcode all of the data to the values used in the screenshot, but try and keep in mind that the data will eventually come from an external source.

### Part 2

You should now have a nice looking weather component, but it isn't much use as it doesn't give the right information!

Using a location of your choice (somewhere in the UK) and the darksky API, fetch the data required when the page is loaded, and when the refresh icon is clicked. Have a look at this jsfiddle for an example of using the darksky api (you may use the url here to save you needing to register for an account) [http://jsfiddle.net/wsfx0gdL](http://jsfiddle.net/wsfx0gdL)

### Part 3

In this task we will expand our app to check the weather in a range of locations. Using the data available from [this URL](https://raw.githubusercontent.com/lutangar/cities.json/master/cities.json), give the end user a way to search for a location and select it. Once selected, the weather data for that location should be displayed in the card.

Example:

[http://g.recordit.co/66Vxm6ht9e.gif](http://g.recordit.co/66Vxm6ht9e.gif)

## Setting up the project

The existing code is based off a lein figwheel template with the cljs-ajax dependency added for making http requests.
You shouldn't need to add any new dependencies to complete the tasks, though you can if you feel it is beneficial to do so.

To get an interactive development environment run:

    npm install
    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein do clean, cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL. 

## License

Copyright © 2020 JUXT

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
