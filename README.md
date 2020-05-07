
# react-native-web-video-caster

## Getting started

este es un modulo sencillo para enviar un video o una url a la aplicacion web video caster, el cual proporciona integracion de chrome cast.

This is a simple module used for send urls video to [Web video caster](http://www.webvideocaster.com/) which provides chrome cast playback


### Install with npm

`$ npm install react-native-web-video-caster --save`

### Install with yarn

`$ yarn add react-native-web-video-caster`

### Automatic installation

`$ react-native link react-native-web-video-caster`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNWebVideoCasterPackage;` to the imports at the top of the file
  - Add `new RNWebVideoCasterPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-web-video-caster'
  	project(':react-native-web-video-caster').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-web-video-caster/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-web-video-caster')
  	```


## Import
```javascript
import RNWebVideoCaster from 'react-native-web-video-caster';
```

## Usage
```javascript
RNWebVideoCaster.play('https://media.w3.org/2010/05/sintel/trailer.mp4');
```
  