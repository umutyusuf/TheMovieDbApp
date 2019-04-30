# TheMovieDbApp
Sample Android App that consumes themoviedb api

# Multi Layer Architecture

This application is build with multi layer architecture using MVVM. Features are seperated to different modules.
Every module has its layer as seperate modules to demonstrate __clean architecture__.

Feature module design is

```
${featureName}/
- ui
- domain
- data
```

Every feature should utilize common functionalities. So they are provided in __core module__. 

Core module consist of following modules
```
- ui
- domain
- data
- common
```

Project Tech Stack
```
- Modularization
- MVVM
- RxJava
- Dagger2
- Retrofit
- Architecture Components
- Lifecycle Aware Components
- Unit Testing
- Mockito
```
