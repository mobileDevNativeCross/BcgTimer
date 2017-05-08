
# react-native-bcg-timer

## Getting started

`$ npm install react-native-bcg-timer --save`

### Mostly automatic installation

`$ react-native link react-native-bcg-timer`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-bcg-timer` and add `RNBcgTimer.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNBcgTimer.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNBcgTimerPackage;` to the imports at the top of the file
  - Add `new RNBcgTimerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-bcg-timer'
  	project(':react-native-bcg-timer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-bcg-timer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-bcg-timer')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNBcgTimer.sln` in `node_modules/react-native-bcg-timer/windows/RNBcgTimer.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Com.Reactlibrary.RNBcgTimer;` to the usings at the top of the file
  - Add `new RNBcgTimerPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNBcgTimer from 'react-native-bcg-timer';

// TODO: What to do with the module?
RNBcgTimer;
```
  