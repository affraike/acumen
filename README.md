# Setup

Follow these steps to get started:

1. Git-clone this repository.

   `https://github.com/affraike/acumen`

2. Change directory into your clone:

   `cd my-project`

3. Start the application:

   `sbt reload`

   `sbt fastOptJS`

4. Open the Web UI:

   Just open the html file with your browser

## Heroku (Not implemented yet)

1. `heroku create my-project`

2. `heroku buildpacks:set heroku/nodejs`

3. `heroku buildpacks:add heroku/scala`

4. `git push heroku master`

5. `heroku open`

Note: The order you add the buildpacks is important. NodeJS buildpack must be added first.

## Other useful info

* See [Angular CLI docs](https://github.com/angular/angular-cli/wiki) for adding more components etc.
* If you update the name in [build.sbt](build.sbt) then you must also update the file name of the target in [Procfile](Procfile) to match
* [build.sbt](build.sbt) adds a dependency to the Compile task which is responsible for building the Angular application.
* Basic Specs2 tests included. Execute with `sbt test`
* Currently working with Angular 9 for the frontend
