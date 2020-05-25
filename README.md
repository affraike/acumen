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

