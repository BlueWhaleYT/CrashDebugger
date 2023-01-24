# Crash Debugger

Crash Debugger is a simple debugger for application crashes. It is useful when there are error messages occurred in your application, while you are currently unable to inspect the Logcat on Android Studio.

## Get Started

You are required to follow the instruction if you want to use this library in your project.

### Add JitPack Repository

Add the JitPack repository to your root `build.gradle` or `build.gradle (Project: xxx)` inside Gradle Scripts.

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

However, if you’re using Android Studio Bumblebee, the method describes above is not working in this version. Instead, you need to add JitPack repository in your `settings.gradle`.

```gradle
pluginManagement {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

### Add Dependency

Add the dependency in your app `build.gradle` or `build.gradle (Module: xxx.app)` inside Gradle Scripts.

The `$version` can be found in Releases.- 

```gradle
dependencies {
    implementation 'com.github.BlueWhaleYT:CrashDebugger:$version'
}
```

## Usage

It's easy, simply add one code in your activity.

```java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // add this code
        CrashDebugger.init(this);
        setContentView(R.layout.activity_main);
        ...
    }
}
```