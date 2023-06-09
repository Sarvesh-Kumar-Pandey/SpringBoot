package in.nit.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InputReadRunner implements CommandLineRunner {

	

		@Value("${server.port}")
		private int serverport;
		
		@Value("${my.app.name-info}")
		private String appName;
		
		@Value("${my.app.version-data}")
		private double appVer;
		
		@Value("${my.app.status_enable}")
		private boolean appStatus;

		@Override
		public void run(String... args) throws Exception {
			//on printing reference variable internally it call toString method
			System.out.println(this);
			//System.out.println(this.toString());
			
		}

		@Override
		public String toString() {
			return "InputReadRunner [serverport=" + serverport + ", appName=" + appName + ", appVer=" + appVer
					+ ", appStatus=" + appStatus + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}

		// Source Menu > Generate toString > Generate button
		//alt+shift+S, S >OK
		/*@Override
		public String toString() {
			return "InputReadRunner [appId=" + appId + ", appName=" + appName + ", appVer=" + appVer + ", appStatus="
					+ appStatus + "]";
					} */

}


