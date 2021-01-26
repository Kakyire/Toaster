# Toaster


## Installation

**Step 1.** Add the JitPack repository to your build file

Add it in your root `build.gradle` at the end of repositories:

```gradle
allprojects {
	repositories {
		...
	maven { url 'https://jitpack.io' }
	}
}
  ```

Step 2. Add the dependency to your app level `build.gradle`

```gradle
dependencies {
	implementation 'com.github.kakyire:toaster:0.0.2'
}
  ``` 
  
  
  
## Implementation
In your `activity` or `fragment` add one of these codes

For short duration use this
```kotlin
  //this implement SHORT_LENGTH toast like the regular toast
  Toaster.shortToast(context,message)
```
For long duration use this
```kotlin
  //this implement LONG_LENGTH toast like the regular toast
  Toaster.longToast(context,message)
  ```
