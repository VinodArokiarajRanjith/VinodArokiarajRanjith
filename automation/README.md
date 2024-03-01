# **Automation Framework setup document**

# **System Requirements**

-   Java 11 or above

-   Maven

-   MacOS / Windows / Linux

# [Installation Steps For Mac]{.underline}

### Step 1 : Install Java Development Kit (JDK) and Maven

1.  Download JDK- 17 and Maven

```{=html}
<!-- -->
```
2.  Install the JDK

3.  Extract Maven.zip file

### Step 2 : Setup Java Environment Variable Path

1.  Open terminal and type the following command to open the
    .bash_profile file

\> nano \~/.bash_profile

2.  Type the following

> export JAVA_HOME=\$(/usr/libexec/java_home)
>
> export MAVEN_HOME="Maven file path"

3.  Press Ctrl+X to exit the bash profile

4.  Press Y to save the changes and press Enter

### Step 3 : Install Android Studio

1.  Download the latesr version of Android studio

```{=html}
<!-- -->
```
2.  Install Android studio and move to the Applications

### Step 4 : Setup Android Environment Variables

1.  Open terminal and type the following command to open the
    .bash_profile file

\> nano \~/.bash_profile

2.  Type the following in the next line

> export ANDROID_HOME=/Users/\$USER/Library/Android/sdk
>
> export
> PATH=\${PATH}:\$ANDROID_HOME/platform-tools:\$ANDROID_HOME/emulator:\$ANDROID_HOME/tools/bin:ANDROID_HOME/tools

3.  Press Ctrl+X to exit the bash profile

4.  Press Y to save the changes and press Enter

### Step 5 : Download and install Appium Desktop Client 

1.  Download the stable appium desktop for mac (.dmg file) from

[https://github.com/appium/appium-desktop/releases]{.underline}

2.  Install appium desktop client and move the appium to the
    applications folder

### Step 6 : Download and Install XCode

1.  Download Xcode

2.  Provide the apple id and password

3.  Download the stable version of xcode and install it and move it to
    Applications

4.  Download XCode Command Line Tools from
    [https://developer.apple.com/download/more/]{.underline}

5.  The command line tools should be the same version of xcode or the
    lower version of xcode

If xcode version is 9.3.3 and command line tools can be of 9.3.2

6.  Install XCode Command Line Tools

### Step 7 : Install Node JS

1.  Prerequisite

    a.  Before install Node, you should need to install Homebrew

> Homebrew is a package manager for the Mac --- it makes installing most
> open source software (like Node) as simple

b.  Open the Terminal app and type

> \> ruby -e \"\$(curl -fsSL
> https://raw.githubusercontent.com/Homebrew/install/master/install)\"
> \< /dev/null 2\> /dev/null

2.  Open the Terminal app and type

> \> brew install node

3.  To make sure you have Node and NPM installed, run two simple
    commands to see what version of each is installed

\> node -v

### Step 8 : Install the following dependencies

1.  Open the Terminal app and install the following by giving these
    commands.

2.  These dependencies are needed for Appium

\> brew install carthage

\> brew install \--HEAD usbmuxd

\> brew install \--HEAD libimobiledevice

\> brew install ---HEAD ideviceinstaller

\> brew install \--HEAD ios-webkit-debug-proxy

\> npm install -g ios-deploy

\> npm install remotedebug-ios-webkit-adapter -g

# [Installation Steps For Windows]{.underline}

### Step 1 : Download JDK and Set environment variables

Set JAVA_Home in environment variables\
JAVA_HOME : C:\\Program Files\\Java\\jdk1.8.0_101 → New path have to
create\
PATH : C:\\Program Files\\Java\\jdk1.8.0_101\\bin → Need to add in
existing path

### Step 2 : Install Android Studio

1.  Download the Android studio

```{=html}
<!-- -->
```
2.  Install Android studio and move to the Applications

### Step 3 : Set up Android Environment Variable

Step 1: Setting the ANDROID_HOME Variable\
'ANDROID_HOME' - C:\\Users\\jayasathya_n\\AppData\\Local\\Android\\sdk\
Step 2: Setting PATH Variables for Android SDK\
'PATH' -
';%ANDROID_HOME%\\platform-tools;%ANDROID_HOME%\\emulator;%ANDROID_HOME%\\tools\\bin;%ANDROID_HOME%\\tools'

### Step 4 : Download and Install NodeJs

To run the Appium Server from the project itself.

### Step 5 : Download and install Appium Desktop Client 

1.  Download the stable appium desktop for windows from

[https://github.com/appium/appium-desktop/releases]{.underline}

# [Steps to Follow to Run Tests in iOS Real Device]{.underline}

Step 1:

1.  Go to
    /Applications/Appium.app/Contents/Resources/app/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent

2.  Open **WebDriverAgent**.xcodeproj in xcode

3.  Set the scheme as **WebDriverAgentLib** and assign target device to
    connected iphone

Step 2:

1.  Select the target as **WebDriverAgentLib**

2.  Goto general and click automatically manage signing and select the
    team, if team is not present go to
    **[https://developer.apple.com/]{.underline} -\> Account** -\> Sign
    in with your existing apple ID or create an apple id and sign in.

3.  Go to team and click add an account and add the apple id and
    password.

4.  Select the team as your apple id

Step 3:

1.  Select the target as **WebDriverAgentRunner**

2.  Goto general and click automatically manage signing and select the
    team as your apple id.

3.  If error occurs under signing goto build settings tab under
    packaging -\> change the product bundle identifier to something like
    "**com.phtn.WebDriverAgentRunner787**"

4.  Check general tab to ensure the error is cleared under signing

Step 4:

1.  Select target as **IntegrationApp**

2.  Goto general and click automatically manage signing and select the
    team as your apple id.

3.  If the error occurs under signing goto build settings tab under
    packaging -\> change the product bundle identifier from
    "com.facebook.IntegrationApp" to something like
    "**com.phtn.IntegrationApp123**"

4.  Check general tab to ensure the error is cleared under signing

Step 5:

1.  Now unlock the iphone which you connected and build and run the
    **WebDriverAgentLib** scheme

2.  Once the build succeeds change the scheme to the **IntegrationApp**
    and again build and run the project

3.  Once the build succeeds the **IntegrationApp** will the installed in
    the iphone and it will throw an error (could not launch
    **IntegrationApp** ) in xcode

4.  In iPhone go to settings -\> general-\> device management -\> click
    your apple id that displayed and then click "trust ur apple id" and
    select the **trust** in popup in iphone

5.  Now build and run the **IntegrationApp**

6.  The **IntegrationApp** will be opened in iPhone

7.  Stop the build in xcode and run the appium test

Note: Should connect the device with above setup.

# [Finding iOS Device UDID]{.underline}

### Method 1 : Using Terminal

**\> instruments -s**

This command will display all the devices attached to the machine

Find the required device UDID with respect to device name

### Method 2 : Using XCode

1)  Launch XCode Goto Windows -\> Devices and Simulators

2)  Select the required device and the "Identifier" is the UDID

# [Start iOS Simulator / Android Emulator]{.underline}

### Start iOS Simulator

\> open -Fn
/Applications/Xcode.app/Contents/Developer/Applications/Simulator.app
\--args -CurrentDeviceUDID CE785A6F-EA77-42CC-8B52-AFA12AFFF882
-ConnectHardwareKeyboard 0

### Start Android Emulator

\> emulator \@Nexus_5X_API_23 -gpu host

**[Test Execution Command:]{.underline}**

Enter the following command in terminal,

1.  cd "give the path of the project"

2.  mvn test

> ** **