package event;

import Charactor.*;

public class Event {
			public static boolean checkHit(boy Boy,Wave wave,int dogSize,int waveHeight){
							if(Boy.x+dogSize>wave.x&&Boy.x<wave.x) {
								if(Boy.y+dogSize>=wave.y-waveHeight) {
									return true;
								}
							}
							return false;
			}
			
			public static void gameStop(Wave[] wave,Environment[] env) {

			}

}