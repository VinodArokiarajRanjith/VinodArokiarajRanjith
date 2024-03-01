browserstack_parallel: 
			make -j bs_ANDROID1 bs_ANDROID2 bs_ANDROID3

bs_ANDROID1: 
	mvn clean test  -DosVersion=13.0 -DdeviceName=SamsungGalaxyS23Ultra -Dplatform=BS_ANDROID

bs_ANDROID2: 
	mvn clean test  -DosVersion=12.0 -DdeviceName=SamsungGalaxyS22 -Dplatform=BS_ANDROID
	
bs_ANDROID3: 
	mvn clean test  -DosVersion=13.0 -DdeviceName=GooglePixel7Pro -Dplatform=BS_ANDROID	
	